package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import entity.Asiento;

public class AsientoRepository {

	public ArrayList<Asiento> getAllBySala(int idSala) throws Exception {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Asiento> asientoList = new ArrayList<Asiento>();

		try {
			String query = String.format("SELECT * FROM asiento INNER JOIN sala_asiento ON asiento.id = sala_asiento.id_asiento WHERE id_sala = ?");
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(query);
			stmt.setInt(1, idSala);
			stmt.execute();
			rs = stmt.getResultSet();
			if (rs != null) {
				while (rs.next()) {
					Asiento asiento = new Asiento();

					asiento.setId(rs.getInt("id"));
					asiento.setNombre(rs.getString("nombre"));
					asiento.setFila(rs.getInt("fila"));
					asiento.setColumna(rs.getInt("columna"));
					asiento.setNumero(rs.getInt("numero"));
					asiento.setAdaptado(rs.getInt("adaptado"));
					asiento.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					asiento.setFechaModificacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
					asientoList.add(asiento);

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

		return asientoList;
	}
	
	
	public ArrayList<Asiento> getAllByFuncion(int idFuncion) throws Exception {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Asiento> asientoList = new ArrayList<Asiento>();

		try {
			String query  = String.format("SELECT asiento.* FROM asiento"
					+ "INNER JOIN ticket ON ticket.id_asiento = asiento.id"
					+ "INNER JOIN compra_ticket ON compra_ticket.id_ticket = ticket.id"
					+ "INNER JOIN compra ON compra.id = compra_ticket.id_compra"
					+ "WHERE compra.id_funcion = ?;");
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(query);
			stmt.setInt(1, idFuncion);
	
			rs = stmt.getResultSet();
			if (rs != null) {
				while (rs.next()) {
					Asiento asiento = new Asiento();

					asiento.setId(rs.getInt("id"));
					asiento.setNombre(rs.getString("nombre"));
					asiento.setFila(rs.getInt("fila"));
					asiento.setColumna(rs.getInt("columna"));
					asiento.setNumero(rs.getInt("numero"));
					asiento.setAdaptado(rs.getInt("adaptado"));
					asiento.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					asiento.setFechaModificacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
					asientoList.add(asiento);

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

		return asientoList;
	}
	

}
