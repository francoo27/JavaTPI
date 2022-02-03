package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import entity.Complejo;

public class ComplejoRepository {

	public Complejo getById(int id) throws Exception{

		PreparedStatement stmt = null;
		ResultSet rs=null;
		Complejo complejo = new Complejo();
		String query = String.format("SELECT * FROM complejo WHERE ID = ?");  
		try{			
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(query);
			stmt.setInt(1, id);
			stmt.execute();
			rs = stmt.getResultSet();
			if(rs!=null){
				while(rs.next()){
					complejo.setId(rs.getInt("id"));
					complejo.setNombre(rs.getString("nombre"));
					complejo.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					complejo.setFechaModificacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
				}
			}
		} catch (Exception e){
			throw e;
		}

		try {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			FactoryConection.getInstancia().releaseConn();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return complejo;
	}


	public ArrayList<Complejo> getAll() throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Complejo> complejoList = new ArrayList<Complejo>();

		try {
			stmt = FactoryConection.getInstancia().getConn().createStatement();
			String query = String.format("SELECT * FROM complejo");  
			rs = stmt.executeQuery(query);
			if (rs != null) {
				while (rs.next()) {
					Complejo complejo = new Complejo();

					complejo.setId(rs.getInt("id"));
					complejo.setNombre(rs.getString("nombre"));
					complejo.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					complejo.setFechaModificacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
					complejoList.add(complejo);

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

		return complejoList;
	}
	
	
	public void save(Complejo complejo) throws Exception {
		PreparedStatement stmt = null;
		String insertQuery = String.format("INSERT INTO complejo (`fecha_creacion`,`fecha_modificacion`,`nombre`) VALUES"
				+ "(?,?,?)");  
		String updateQuery = String.format("UPDATE complejo SET `fecha_modificacion`= ?, `nombre` = ? WHERE id = ?");  

		try {
			if(complejo.getId() == 0 ) {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(insertQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setTimestamp(2, date);
				stmt.setString(3, complejo.getNombre());
			} else {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(updateQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setString(2, complejo.getNombre());
				stmt.setInt(3, complejo.getId());

			}
			
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
	
	public void delete(int id ) throws Exception {
		PreparedStatement stmt = null;
		String deleteQuery = String.format("DELETE FROM java_tpi.complejo WHERE id = ?");  
		try {
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(deleteQuery);
			stmt.setInt(1, id);
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
