package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import entity.Formato;

public class FormatoRepository {

	public Formato getById(int id) throws Exception {

		PreparedStatement stmt = null;
		ResultSet rs = null;
		Formato formato = new Formato();
		AudioRepository audioRepository = new AudioRepository();
		TecnologiaProyeccionRepository tecnologiaProyeccionRepository = new TecnologiaProyeccionRepository();
		String query = String.format("SELECT * FROM formato WHERE ID = ?");
		try {
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(query);
			stmt.setInt(1, id);
			stmt.execute();
			rs = stmt.getResultSet();
			if (rs != null) {
				while (rs.next()) {
					formato.setId(rs.getInt("id"));
					formato.setAudio(audioRepository.getById(rs.getInt("id_audio")));
					formato.setTecnologiaProyeccion(
							tecnologiaProyeccionRepository.getById(rs.getInt("id_tecnologia_proyeccion")));
					formato.setNombre();
					formato.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					formato.setFechaModificacion(
							new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
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

		return formato;
	}

	public ArrayList<Formato> getAll() throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Formato> formatoList = new ArrayList<Formato>();

		try {
			stmt = FactoryConection.getInstancia().getConn().createStatement();
			String query = String.format("SELECT * FROM formato");
			rs = stmt.executeQuery(query);
			AudioRepository audioRepository = new AudioRepository();
			TecnologiaProyeccionRepository tecnologiaProyeccionRepository = new TecnologiaProyeccionRepository();
			if (rs != null) {
				while (rs.next()) {
					Formato formato = new Formato();

					formato.setId(rs.getInt("id"));
					formato.setAudio(audioRepository.getById(rs.getInt("id_audio")));
					formato.setTecnologiaProyeccion(
							tecnologiaProyeccionRepository.getById(rs.getInt("id_tecnologia_proyeccion")));
					formato.setNombre();
					formato.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					formato.setFechaModificacion(
							new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
					formatoList.add(formato);

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

	public void save(Formato formato) throws Exception {
		PreparedStatement stmt = null;
		String insertQuery = String.format(
				"INSERT INTO formato (`fecha_creacion`,`fecha_modificacion`,`nombre`,`id_audio`,`id_tecnologia_proyeccion`) VALUES"
						+ "(?,?,?,?,?)");
		String updateQuery = String.format(
				"UPDATE formato SET `fecha_modificacion`= ?, `nombre` = ?, `id_audio` = ?, `id_tecnologia_proyeccion` = ? WHERE id = ?");

		try {
			if (formato.getId() == 0) {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(insertQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setTimestamp(2, date);
				stmt.setString(3, formato.getNombre());
				stmt.setInt(4, formato.getAudio().getId());
				stmt.setInt(5, formato.getTecnologiaProyeccion().getId());
			} else {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(updateQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setString(2, formato.getNombre());
				stmt.setInt(3, formato.getId());
				stmt.setInt(4, formato.getAudio().getId());
				stmt.setInt(5, formato.getTecnologiaProyeccion().getId());
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

	public void delete(int id) throws Exception {
		PreparedStatement stmt = null;
		String deleteQuery = String.format("DELETE FROM java_tpi.formato WHERE id = ?");
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
