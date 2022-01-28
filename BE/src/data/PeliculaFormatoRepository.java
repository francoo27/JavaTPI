package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import entity.Formato;

public class PeliculaFormatoRepository {

	public ArrayList<Formato> getAllByPelicula(int peliculaId) throws Exception {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Formato> formatoList = new ArrayList<Formato>();

		try {
			String query = String.format("SELECT * FROM pelicula_formato WHERE id_pelicula = ?"); 
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(query);
			stmt.setInt(1, peliculaId);
			rs = stmt.executeQuery(query);
			FormatoRepository formatoRepository = new FormatoRepository();
			if (rs != null) {
				while (rs.next()) {
					formatoList.add(formatoRepository.getById(rs.getInt("id_pelicula")));
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

		return formatoList;
	}
	
	
	public void save(int idPelicula, Formato formato) throws Exception {
		PreparedStatement stmt = null;
		String insertQuery = String.format("INSERT INTO pelicula_formato (`fecha_creacion`,`fecha_modificacion`,`id_pelicula`,`id_formato`) VALUES"
				+ "(?,?,?,?,?)");  
		try {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(insertQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setTimestamp(2, date);
				stmt.setInt(3, idPelicula);
				stmt.setInt(4, formato.getId());
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
	
	public void delete(int idPelicula, Formato formato) throws Exception {
		PreparedStatement stmt = null;
		String deleteQuery = String.format("DELETE FROM java_tpi.pelicula_formato WHERE  id_pelicula = ? AND id_formato = ?");  
		try {
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(deleteQuery);
			stmt.setInt(1, idPelicula);
			stmt.setInt(2, formato.getId());
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
