package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import entity.Audio;

public class AudioRepository {

	public Audio getById(int id) throws Exception{

		PreparedStatement stmt = null;
		ResultSet rs=null;
		Audio audio = new Audio();
		String query = String.format("SELECT * FROM audio WHERE ID = ?");  
		System.out.println(id);
		try{			
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(query);
			stmt.setInt(1, id);
			stmt.execute();
			rs = stmt.getResultSet();
			if(rs!=null){
				while(rs.next()){
					audio.setId(rs.getInt("id"));
					audio.setNombre(rs.getString("nombre"));
					audio.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					audio.setFechaModificacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
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

		return audio;
	}


	public ArrayList<Audio> getAll() throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Audio> audioList = new ArrayList<Audio>();

		try {
			stmt = FactoryConection.getInstancia().getConn().createStatement();
			String query = String.format("SELECT * FROM audio");  
			rs = stmt.executeQuery(query);
			if (rs != null) {
				while (rs.next()) {
					Audio audio = new Audio();

					audio.setId(rs.getInt("id"));
					audio.setNombre(rs.getString("nombre"));
					audio.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					audio.setFechaModificacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
					audioList.add(audio);

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

		return audioList;
	}
	
	
	public void save(Audio audio) throws Exception {
		PreparedStatement stmt = null;
		String insertQuery = String.format("INSERT INTO audio (`fecha_creacion`,`fecha_modificacion`,`nombre`) VALUES"
				+ "(?,?,?)");  
		String updateQuery = String.format("UPDATE audio SET `fecha_modificacion`= ?, `nombre` = ? WHERE id = ?");  

		try {
			if(audio.getId() == 0 ) {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(insertQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setTimestamp(2, date);
				stmt.setString(3, audio.getNombre());
			} else {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(updateQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setString(2, audio.getNombre());
				stmt.setInt(3, audio.getId());

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
		String deleteQuery = String.format("DELETE FROM java_tpi.audio WHERE id = ?");  
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
