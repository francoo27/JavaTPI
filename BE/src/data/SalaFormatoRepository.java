package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.Formato;

public class SalaFormatoRepository {

	public ArrayList<Formato> getAllBySala(int salaId) throws Exception {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Formato> formatoList = new ArrayList<Formato>();

		try {
			String query = String.format("SELECT * FROM sala_formato WHERE id_sala = ?");
			stmt = FactoryConection.getInstancia().getConn().prepareStatement(query);
			stmt.setInt(1, salaId);
			rs = stmt.executeQuery();
			FormatoRepository formatoRepository = new FormatoRepository();
			if (rs != null) {
				while (rs.next()) {
					formatoList.add(formatoRepository.getById(rs.getInt("id_formato")));
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

}
