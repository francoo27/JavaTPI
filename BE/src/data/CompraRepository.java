package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import entity.Compra;

public class CompraRepository {

	public ArrayList<Compra> getAll() throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Compra> compraList = new ArrayList<Compra>();

		try {
			stmt = FactoryConection.getInstancia().getConn().createStatement();
			String query = String.format("SELECT * FROM compra");  
			rs = stmt.executeQuery(query);
			if (rs != null) {
				while (rs.next()) {
					Compra compra = new Compra();

					compra.setId(rs.getInt("id"));
					compra.setNombre(rs.getString("nombre"));
					compra.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					compra.setFechaModificacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
					compraList.add(compra);

				}
			}
		} catch (Exception e) {
			throw e;
		}

		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			FactoryConection.getInstancia().releaseConn();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return compraList;
	}
	
	
	public void comprar(Compra compra) throws Exception {
		PreparedStatement stmt = null;
		String insertQuery = String.format("INSERT INTO compra (`fecha_creacion`,`fecha_modificacion`,`id_funcion`,`nombre`,`email`) VALUES"
				+ "(?,?,?,?,?)");   

		try {
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(insertQuery);
			java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
			stmt.setTimestamp(1, date);
			stmt.setTimestamp(2, date);
			stmt.setInt(3, compra.getFuncion().getId());
			stmt.setString(4, compra.getNombre());
			stmt.setString(5, compra.getEmail());
			System.out.println(stmt);
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
