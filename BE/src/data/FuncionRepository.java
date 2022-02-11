package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import entity.Funcion;

public class FuncionRepository {

	PeliculaRepository peliculaRepository = new PeliculaRepository();
	FormatoRepository formatoRepository = new FormatoRepository();
	SalaRepository salaRepository = new SalaRepository();
	
	public Funcion getById(int id) throws Exception{

		PreparedStatement stmt = null;
		ResultSet rs=null;
		Funcion funcion = new Funcion();
		String query = String.format("SELECT * FROM funcion WHERE ID = ?");  
		try{			
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(query);
			stmt.setInt(1, id);
			stmt.execute();
			rs = stmt.getResultSet();
			if(rs!=null){
				while(rs.next()){
					funcion.setId(rs.getInt("id"));
					funcion.setPelicula(peliculaRepository.getById(rs.getInt("id_pelicula")));
					funcion.setFormato(formatoRepository.getById(rs.getInt("id_formato")));
					funcion.setSala(salaRepository.getById(rs.getInt("id_sala")));
					funcion.setNombre(rs.getString("nombre"));
					funcion.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					funcion.setFechaModificacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
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

		return funcion;
	}


	public ArrayList<Funcion> getAll(int peliculaId,int idFormato) throws Exception {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Funcion> funcionList = new ArrayList<Funcion>();

		try {

			String query = String.format("SELECT * FROM java_tpi.funcion WHERE (0 = ?) OR (id_pelicula = ?) AND (0 = ?) OR (id_formato = ?);");

			stmt = FactoryConection.getInstancia().getConn().prepareStatement(query);
			stmt.setInt(1,peliculaId);
			stmt.setInt(2,peliculaId);
			stmt.setInt(3,idFormato);
			stmt.setInt(4,idFormato);
			stmt.execute();
			rs = stmt.getResultSet();
			if (rs != null) {
				while (rs.next()) {
					Funcion funcion = new Funcion();

					funcion.setId(rs.getInt("id"));
					funcion.setPelicula(peliculaRepository.getById(rs.getInt("id_pelicula")));
					funcion.setFormato(formatoRepository.getById(rs.getInt("id_formato")));
					funcion.setSala(salaRepository.getById(rs.getInt("id_sala")));
					funcion.setNombre(rs.getString("nombre"));
					funcion.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					funcion.setFechaModificacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
					funcionList.add(funcion);

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

		return funcionList;
	}
	
	
	public void save(Funcion funcion) throws Exception {
		PreparedStatement stmt = null;
		String insertQuery = String.format("INSERT INTO funcion (`fecha_creacion`,`fecha_modificacion`,`numero`) VALUES"
				+ "(?,?,?)");  
		String updateQuery = String.format("UPDATE funcion SET `fecha_modificacion`= ?, `nombre` = ? WHERE id = ?");  

		try {
			if(funcion.getId() == 0 ) {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(insertQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setTimestamp(2, date);
				//stmt.setInt(3, funcion.getNumero());
			} else {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(updateQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				//stmt.setInt(2, funcion.getNumero());

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
		String deleteQuery = String.format("DELETE FROM java_tpi.funcion WHERE id = ?");  
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
