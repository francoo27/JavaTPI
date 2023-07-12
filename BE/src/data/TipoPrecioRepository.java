package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import entity.TipoPrecio;

public class TipoPrecioRepository {

	public TipoPrecio getById(int id) throws Exception {

		PreparedStatement stmt = null;
		ResultSet rs = null;
		TipoPrecio tipoPrecio = new TipoPrecio();
		String query = String.format("SELECT * FROM tipo_precio WHERE ID = ?");
		try {
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(query);
			stmt.setInt(1, id);
			stmt.execute();
			rs = stmt.getResultSet();
			if (rs != null) {
				while (rs.next()) {
					tipoPrecio.setId(rs.getInt("id"));
					tipoPrecio.setNombre(rs.getString("nombre"));
					tipoPrecio
							.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					tipoPrecio.setFechaModificacion(
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

		return tipoPrecio;
	}

	public ArrayList<TipoPrecio> getAll() throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<TipoPrecio> tipoPrecioList = new ArrayList<TipoPrecio>();

		try {
			stmt = FactoryConection.getInstancia().getConn().createStatement();
			String query = String.format("SELECT * FROM tipo_precio");
			rs = stmt.executeQuery(query);
			if (rs != null) {
				while (rs.next()) {
					TipoPrecio tipoPrecio = new TipoPrecio();

					tipoPrecio.setId(rs.getInt("id"));
					tipoPrecio.setNombre(rs.getString("nombre"));
					tipoPrecio
							.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					tipoPrecio.setFechaModificacion(
							new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
					tipoPrecioList.add(tipoPrecio);

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

		return tipoPrecioList;
	}

	public void save(TipoPrecio tipoPrecio) throws Exception {
		PreparedStatement stmt = null;
		String insertQuery = String
				.format("INSERT INTO tipo_precio (`fecha_creacion`,`fecha_modificacion`,`nombre`) VALUES" + "(?,?,?)");
		String updateQuery = String.format("UPDATE tipo_precio SET `fecha_modificacion`= ?, `nombre` = ? WHERE id = ?");

		try {
			if (tipoPrecio.getId() == 0) {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(insertQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setTimestamp(2, date);
				stmt.setString(3, tipoPrecio.getNombre());
			} else {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(updateQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setString(2, tipoPrecio.getNombre());
				stmt.setInt(3, tipoPrecio.getId());

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
		String deleteQuery = String.format("DELETE FROM java_tpi.tipo_precio WHERE id = ?");
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
