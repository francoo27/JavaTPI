package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import entity.Pelicula;

public class PeliculaRepository {
	
	SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
	ClasificacionRepository clasificacionRepository = new ClasificacionRepository();
	PaisRepository paisRepository = new PaisRepository();
	GeneroRepository generoRepository = new GeneroRepository();
	
	public Pelicula getById(int id) throws Exception{

		PreparedStatement stmt = null;
		ResultSet rs=null;
		Pelicula pelicula = new Pelicula();
		String query = String.format("SELECT * FROM pelicula WHERE ID = ?");  
		try{			
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(query);
			stmt.setInt(1, id);
			stmt.execute();
			rs = stmt.getResultSet();
			if(rs!=null){
				while(rs.next()){
					pelicula.setId(rs.getInt("id"));
					pelicula.setFechaCreacion(dateFormatter.parse(rs.getString("fecha_creacion")));
					pelicula.setFechaModificacion(dateFormatter.parse(rs.getString("fecha_modificacion")));
					
					pelicula.setClasificacion(clasificacionRepository.getById(rs.getInt("id_clasificacion")));
					pelicula.setPais(paisRepository.getById(rs.getInt("id_pais")));
					pelicula.setGenero(generoRepository.getById(rs.getInt("id_genero")));	
					
					pelicula.setTituloOriginal(rs.getString("titulo_original"));
					pelicula.setTituloPais(rs.getString("titulo_pais"));
					pelicula.setFechaEstreno(dateFormatter.parse(rs.getString("fecha_estreno")));
					pelicula.setDuracion(rs.getInt("duracion"));
					pelicula.setSinopsis(rs.getString("sinopsis"));
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

		return pelicula;
	}


	public ArrayList<Pelicula> getAll() throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Pelicula> peliculaList = new ArrayList<Pelicula>();

		try {
			stmt = FactoryConection.getInstancia().getConn().createStatement();
			String query = String.format("SELECT * FROM pelicula");  
			rs = stmt.executeQuery(query);
			if (rs != null) {
				while (rs.next()) {
					Pelicula pelicula = new Pelicula();

					pelicula.setId(rs.getInt("id"));
					pelicula.setFechaCreacion(dateFormatter.parse(rs.getString("fecha_creacion")));
					pelicula.setFechaModificacion(dateFormatter.parse(rs.getString("fecha_modificacion")));
					
					pelicula.setClasificacion(clasificacionRepository.getById(rs.getInt("id_clasificacion")));
					pelicula.setPais(paisRepository.getById(rs.getInt("id_pais")));
					pelicula.setGenero(generoRepository.getById(rs.getInt("id_genero")));	
					
					pelicula.setTituloOriginal(rs.getString("titulo_original"));
					pelicula.setTituloPais(rs.getString("titulo_pais"));
					pelicula.setFechaEstreno(dateFormatter.parse(rs.getString("fecha_estreno")));
					pelicula.setDuracion(rs.getInt("duracion"));
					pelicula.setSinopsis(rs.getString("sinopsis"));
					
					peliculaList.add(pelicula);

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

		return peliculaList;
	}
	
	
	public int save(Pelicula pelicula) throws Exception {
		PreparedStatement stmt = null;
		int peliculaId = 0;
		String insertQuery = String.format(
				"INSERT INTO pelicula (`fecha_creacion`, `fecha_modificacion`, `titulo_original`, `titulo_pais`, `fecha_estreno`, `duracion`, `sinopsis`, `id_clasificacion`, `id_pais`, `id_genero`) VALUES"
				+ "(?,?,?,?,?,?,?,?,?,?)");  
		String updateQuery = String.format("UPDATE pelicula SET `fecha_modificacion`= ?, `titulo_original` = ?, `titulo_pais` = ?, `fecha_estreno`= ?, `duracion` = ?, `sinopsis` = ?, `id_clasificacion` = ?, `id_pais` = ?, `id_genero` = ? WHERE id = ?");  
		try {
			if(pelicula.getId() == 0 ) {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(insertQuery, new String[] {"id"});
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setTimestamp(2, date);
				stmt.setString(3, pelicula.getTituloOriginal());
				stmt.setString(4, pelicula.getTituloPais());
				stmt.setString(5, dateFormatter.format(pelicula.getFechaEstreno()));
				stmt.setInt(6, pelicula.getDuracion());
				stmt.setString(7, pelicula.getSinopsis());
				stmt.setInt(8, pelicula.getClasificacion().getId());
				stmt.setInt(9, pelicula.getPais().getId());
				stmt.setInt(10, pelicula.getGenero().getId());
			} else {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(updateQuery, new String[] {"id"});
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setString(2, pelicula.getTituloOriginal());
				stmt.setString(3, pelicula.getTituloPais());
				stmt.setString(4, dateFormatter.format(pelicula.getFechaEstreno()));
				stmt.setInt(5, pelicula.getDuracion());
				stmt.setString(6, pelicula.getSinopsis());
				stmt.setInt(7, pelicula.getClasificacion().getId());
				stmt.setInt(8, pelicula.getPais().getId());
				stmt.setInt(9, pelicula.getGenero().getId());
				stmt.setInt(10, pelicula.getId());
			}
			
			stmt.executeUpdate();

			// now get the ID:
			ResultSet rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				peliculaId = rs.getInt(1);
			}

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
		System.out.println("Peliculaid"+peliculaId);
		return peliculaId;
	}
	
	public void delete(int id ) throws Exception {
		PreparedStatement stmt = null;
		String deleteQuery = String.format("DELETE FROM java_tpi.pelicula WHERE id = ?");  
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
