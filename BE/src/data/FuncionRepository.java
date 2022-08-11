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
					funcion.setCancelada(rs.getBoolean("cancelada"));
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
					funcion.setFechaInicio(rs.getString("fechaInicio"));
					funcion.setHoraInicio(rs.getString("horaInicio"));
					funcion.setCancelada(rs.getBoolean("cancelada"));
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
		String insertQuery = String.format("INSERT INTO funcion (`fecha_creacion`,`fecha_modificacion`,`nombre`,"
				+ "`fechaInicio`, `horaInicio`, `id_pelicula`, `id_formato`, `id_sala`) VALUES"
				+ "(?,?,?,?,?,?,?,?)");  
		String updateQuery = String.format("UPDATE funcion SET `fecha_modificacion`= ? , `nombre` = ?, `fechaInicio`= ? , `horaInicio` = ? , `id_pelicula`= ? , `id_formato` = ? , `id_sala` = ? , `cancelada` = ? WHERE id = ?");  
		try {
			if(funcion.getId() == 0 ) {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(insertQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setTimestamp(2, date);
				stmt.setString(3, funcion.getNombre());
				stmt.setString(4, funcion.getFechaInicio());
				stmt.setString(5, funcion.getHoraInicio());
				stmt.setInt(6, funcion.getPelicula().getId());
				stmt.setInt(7, funcion.getFormato().getId());
				stmt.setInt(8, funcion.getSala().getId());
			} else {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(updateQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setString(2, funcion.getNombre());
				stmt.setString(3, funcion.getFechaInicio());
				stmt.setString(4, funcion.getHoraInicio());
				stmt.setInt(5, funcion.getPelicula().getId());
				stmt.setInt(6, funcion.getFormato().getId());
				stmt.setInt(7, funcion.getSala().getId());
				stmt.setBoolean(8, funcion.getCancelada());
				stmt.setInt(9, funcion.getId());
			}
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
