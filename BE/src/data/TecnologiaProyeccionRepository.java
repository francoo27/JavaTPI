package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import entity.TecnologiaProyeccion;

public class TecnologiaProyeccionRepository {

	public TecnologiaProyeccion getById(int id) throws Exception{

		PreparedStatement stmt = null;
		ResultSet rs=null;
		TecnologiaProyeccion tecnologiaProyeccion = new TecnologiaProyeccion();
		String query = String.format("SELECT * FROM tecnologia_proyeccion WHERE ID = ?");  
		System.out.println(id);
		try{			
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(query);
			stmt.setInt(1, id);
			stmt.execute();
			rs = stmt.getResultSet();
			if(rs!=null){
				while(rs.next()){
					tecnologiaProyeccion.setId(rs.getInt("id"));
					tecnologiaProyeccion.setNombre(rs.getString("nombre"));
					tecnologiaProyeccion.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					tecnologiaProyeccion.setFechaModificacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
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

		return tecnologiaProyeccion;
	}


	public ArrayList<TecnologiaProyeccion> getAll() throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<TecnologiaProyeccion> tecnologiaProyeccionList = new ArrayList<TecnologiaProyeccion>();

		try {
			stmt = FactoryConection.getInstancia().getConn().createStatement();
			String query = String.format("SELECT * FROM tecnologia_proyeccion");  
			rs = stmt.executeQuery(query);
			if (rs != null) {
				while (rs.next()) {
					TecnologiaProyeccion tecnologiaProyeccion = new TecnologiaProyeccion();

					tecnologiaProyeccion.setId(rs.getInt("id"));
					tecnologiaProyeccion.setNombre(rs.getString("nombre"));
					tecnologiaProyeccion.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					tecnologiaProyeccion.setFechaModificacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
					tecnologiaProyeccionList.add(tecnologiaProyeccion);

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

		return tecnologiaProyeccionList;
	}
	
	
	public void save(TecnologiaProyeccion tecnologiaProyeccion) throws Exception {
		PreparedStatement stmt = null;
		String insertQuery = String.format("INSERT INTO tecnologia_proyeccion (`fecha_creacion`,`fecha_modificacion`,`nombre`) VALUES"
				+ "(?,?,?)");  
		String updateQuery = String.format("UPDATE tecnologia_proyeccion SET `fecha_modificacion`= ?, `nombre` = ? WHERE id = ?");  

		try {
			if(tecnologiaProyeccion.getId() == 0 ) {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(insertQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setTimestamp(2, date);
				stmt.setString(3, tecnologiaProyeccion.getNombre());
			} else {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(updateQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setString(2, tecnologiaProyeccion.getNombre());
				stmt.setInt(3, tecnologiaProyeccion.getId());

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
		String deleteQuery = String.format("DELETE FROM java_tpi.tecnologia_proyeccion WHERE id = ?");  
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
