package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import entity.Pais;

public class PaisRepository {

	public Pais getById(int id) throws Exception{

		PreparedStatement stmt = null;
		ResultSet rs = null;
		Pais pais = new Pais();
		String query = String.format("SELECT * FROM pais WHERE ID = ?");  
		System.out.println(id);
		try{			
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(query);
			stmt.setInt(1, id);
			stmt.execute();
			rs = stmt.getResultSet();
			if(rs != null){
				while(rs.next()){
					pais.setId(rs.getInt("id"));
					pais.setNombre(rs.getString("nombre"));
					pais.setCodigo(rs.getString("codigo"));
					pais.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					pais.setFechaModificacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
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

		return pais;
	}


	public ArrayList<Pais> getAll() throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Pais> paisList = new ArrayList<Pais>();

		try {
			stmt = FactoryConection.getInstancia().getConn().createStatement();
			String query = String.format("SELECT * FROM pais");  
			rs = stmt.executeQuery(query);
			if (rs != null) {
				while (rs.next()) {
					Pais pais = new Pais();

					pais.setId(rs.getInt("id"));
					pais.setNombre(rs.getString("nombre"));
					pais.setCodigo(rs.getString("codigo"));
					pais.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					pais.setFechaModificacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
					paisList.add(pais);

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

		return paisList;
	}
	
	
	public void save(Pais pais) throws Exception {
		PreparedStatement stmt = null;
		String insertQuery = String.format("INSERT INTO pais (`fecha_creacion`,`fecha_modificacion`,`nombre`, `codigo`) VALUES"
				+ "(?,?,?,?)");  
		String updateQuery = String.format("UPDATE pais SET `fecha_modificacion`= ? , `nombre` = ? , `codigo` = ? WHERE id = ?");  

		try {
			if(pais.getId() == 0 ) {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(insertQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setTimestamp(2, date);
				stmt.setString(3, pais.getNombre());
				stmt.setString(4, pais.getCodigo());
			} else {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(updateQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setString(2, pais.getNombre());
				stmt.setString(3, pais.getCodigo());
				stmt.setInt(4, pais.getId());

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
		String deleteQuery = String.format("DELETE FROM java_tpi.pais WHERE id = ?");  
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
