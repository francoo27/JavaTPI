package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entity.Ticket;

public class TicketRepository {

	public int save(Ticket ticket) throws Exception {
		int id = 0;
		PreparedStatement stmt = null;
		String insertQuery = String.format("INSERT INTO ticket (`fecha_creacion`,`fecha_modificacion`,`id_asiento`,`id_precio`) VALUES"
				+ "(?,?,?,?)");   

		try {
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
			java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
			stmt.setTimestamp(1, date);
			stmt.setTimestamp(2, date);
			stmt.setInt(3, ticket.getIdAsiento());
			stmt.setInt(4, ticket.getIdPrecio());
			stmt.execute();

		} catch (Exception e) {
			throw e;
		}


        try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
            if (generatedKeys.next()) {
            	id = generatedKeys.getInt(1);
            }
            else {
                throw new SQLException("Creating Compra failed, no ID obtained.");
            }
        }
		try {
			if (stmt != null)
				stmt.close();
			FactoryConection.getInstancia().releaseConn();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return id;
	}
	

}
