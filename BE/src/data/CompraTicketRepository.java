package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import entity.CompraTicket;

public class CompraTicketRepository {

	public void save(CompraTicket compraTicket) throws Exception {
		PreparedStatement stmt = null;
		String insertQuery = String.format("INSERT INTO compra_ticket (`id_compra`,`id_ticket`) VALUES" + "(?,?)");

		try {
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(insertQuery);
			stmt.setInt(1, compraTicket.getIdCompra());
			stmt.setInt(2, compraTicket.getIdTicket());
			stmt.execute();

		} catch (Exception e) {
			throw e;
		}

		try {
			if (stmt != null)
				stmt.close();
			FactoryConection.getInstancia().releaseConn();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
