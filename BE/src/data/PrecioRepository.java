package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import entity.Precio;

public class PrecioRepository {

	TipoPrecioRepository tipoPrecioRepository = new TipoPrecioRepository();

	public Precio getById(int id) throws Exception {

		PreparedStatement stmt = null;
		ResultSet rs = null;
		Precio precio = new Precio();
		String query = String.format("SELECT * FROM precio WHERE ID = ?");
		try {
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(query);
			stmt.setInt(1, id);
			stmt.execute();
			rs = stmt.getResultSet();
			if (rs != null) {
				while (rs.next()) {
					precio.setId(rs.getInt("id"));
					precio.setNombre(rs.getString("nombre"));
					precio.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					precio.setFechaModificacion(
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

		return precio;
	}

	public ArrayList<Precio> getAll() throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Precio> precioList = new ArrayList<Precio>();

		try {
			stmt = FactoryConection.getInstancia().getConn().createStatement();
			String query = String.format("SELECT * FROM precio");
			rs = stmt.executeQuery(query);
			if (rs != null) {
				while (rs.next()) {
					Precio precio = new Precio();

					precio.setId(rs.getInt("id"));
					precio.setNombre(rs.getString("nombre"));
					precio.setCodigo(rs.getString("codigo"));
					precio.setValor(rs.getDouble("valor"));
					precio.setActivo(rs.getBoolean("activo"));
					precio.setTipoPrecio(tipoPrecioRepository.getById(rs.getInt("id_tipoPrecio")));
					precio.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					precio.setFechaModificacion(
							new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
					precioList.add(precio);

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

		return precioList;
	}

	public void save(Precio precio) throws Exception {
		PreparedStatement stmt = null;
		String insertQuery = String
				.format("INSERT INTO precio (`fecha_creacion`,`fecha_modificacion`,`nombre`) VALUES" + "(?,?,?)");
		String updateQuery = String.format("UPDATE precio SET `fecha_modificacion`= ?, `nombre` = ? WHERE id = ?");

		try {
			if (precio.getId() == 0) {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(insertQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setTimestamp(2, date);
				stmt.setString(3, precio.getNombre());
			} else {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(updateQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setString(2, precio.getNombre());
				stmt.setInt(3, precio.getId());

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
		String deleteQuery = String.format("DELETE FROM java_tpi.precio WHERE id = ?");
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
