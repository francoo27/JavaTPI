package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import entity.Sala;

public class SalaRepository {
	AsientoRepository asientoRepository = new AsientoRepository();

	public Sala getById(int id) throws Exception {

		PreparedStatement stmt = null;
		ResultSet rs = null;
		Sala sala = new Sala();
		String query = String.format("SELECT * FROM sala WHERE ID = ?");
		try {
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(query);
			stmt.setInt(1, id);
			stmt.execute();
			rs = stmt.getResultSet();
			if (rs != null) {
				while (rs.next()) {
					sala.setId(rs.getInt("id"));
					sala.setNumero(rs.getInt("numero"));
					sala.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					sala.setFechaModificacion(
							new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
					sala.setAsientos(asientoRepository.getAllBySala(sala.getId()));
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

		return sala;
	}

	public ArrayList<Sala> getAll(int complejoId) throws Exception {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Sala> salaList = new ArrayList<Sala>();

		try {

			String query = String.format("SELECT * FROM sala");
			if (complejoId != 0) {
				query = String.format("SELECT * FROM sala WHERE id_complejo = ?");
			}

			stmt = FactoryConection.getInstancia().getConn().prepareStatement(query);
			if (complejoId != 0) {
				stmt.setInt(1, complejoId);
			}
			stmt.execute();
			rs = stmt.getResultSet();
			if (rs != null) {
				while (rs.next()) {
					Sala sala = new Sala();

					sala.setId(rs.getInt("id"));
					sala.setNumero(rs.getInt("numero"));
					sala.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					sala.setFechaModificacion(
							new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
					salaList.add(sala);

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

		return salaList;
	}

	public void save(Sala sala) throws Exception {
		PreparedStatement stmt = null;
		String insertQuery = String
				.format("INSERT INTO sala (`fecha_creacion`,`fecha_modificacion`,`numero`) VALUES" + "(?,?,?)");
		String updateQuery = String.format("UPDATE sala SET `fecha_modificacion`= ?, `nombre` = ? WHERE id = ?");

		try {
			if (sala.getId() == 0) {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(insertQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setTimestamp(2, date);
				stmt.setInt(3, sala.getNumero());
			} else {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(updateQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setInt(2, sala.getNumero());

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
		String deleteQuery = String.format("DELETE FROM java_tpi.sala WHERE id = ?");
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
