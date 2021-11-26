package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import entity.Clasificacion;

public class ClasificacionRepository {

	public Clasificacion getById(int id) throws Exception{

		Statement stmt=null;
		ResultSet rs=null;
		Clasificacion clasificacion = new Clasificacion();

		try{
			stmt = FactoryConection.getInstancia()
					.getConn().createStatement();
			String query = String.format("SELECT * FROM clasificacion WHERE ID = %s",id);  
			rs = stmt.executeQuery(query);
			if(rs!=null){
				while(rs.next()){
					clasificacion.setId(rs.getInt("id"));
					clasificacion.setIdentificador(rs.getString("identificador"));
					clasificacion.setEdadMinima(rs.getString("edad_minima"));
					clasificacion.setRecomendacion(rs.getString("recomendacion"));
					clasificacion.setDefinicion(rs.getString("definicion"));
					clasificacion.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					clasificacion.setFechaModificacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
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

		return clasificacion;
	}


	public ArrayList<Clasificacion> getAll() throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Clasificacion> clasificacionList = new ArrayList<Clasificacion>();

		try {
			stmt = FactoryConection.getInstancia().getConn().createStatement();
			String query = String.format("SELECT * FROM clasificacion");  
			rs = stmt.executeQuery(query);
			if (rs != null) {
				while (rs.next()) {
					Clasificacion clasificacion = new Clasificacion();

					clasificacion.setId(rs.getInt("id"));
					clasificacion.setIdentificador(rs.getString("identificador"));
					clasificacion.setEdadMinima(rs.getString("edad_minima"));
					clasificacion.setRecomendacion(rs.getString("recomendacion"));
					clasificacion.setDefinicion(rs.getString("definicion"));
					clasificacion.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_creacion")));
					clasificacion.setFechaModificacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fecha_modificacion")));
					clasificacionList.add(clasificacion);

				}
			}
		} catch (Exception e) {
			System.out.println("Error getAll TipoHabitacion");
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

		return clasificacionList;
	}
	
	
	public void save(Clasificacion clasificacion) throws Exception {
		PreparedStatement stmt = null;
		String insertQuery = String.format("INSERT INTO clasificacion (`fecha_creacion`,`fecha_modificacion`,`identificador`,`edad_minima`,`recomendacion`,`definicion`) VALUES"
				+ "(?,?,?,?,?,?)");  
		String updateQuery = String.format("SELECT * FROM clasificacion");  

		try {
			if(clasificacion.getId() == 0 ) {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(insertQuery);
				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				stmt.setTimestamp(1, date);
				stmt.setTimestamp(2, date);
				stmt.setString(3, clasificacion.getIdentificador());
				stmt.setString(4, clasificacion.getEdadMinima());
				stmt.setString(5, clasificacion.getRecomendacion());
				stmt.setString(6, clasificacion.getDefinicion());
			} else {
				stmt = FactoryConection.getInstancia().getConn().prepareStatement(updateQuery);
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


}
