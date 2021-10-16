package entity;

import java.util.ArrayList;

public class Clasificacion extends BaseEntity {
	
	private String identificador;
	private String recomendacion;
	private String edadMinima;
	private String definicion;

	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getRecomendacion() {
		return recomendacion;
	}
	public void setRecomendacion(String recomendacion) {
		this.recomendacion = recomendacion;
	}

	public String getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(String edadMinima) {
		this.edadMinima = edadMinima;
	}
	
	public String getDefinicion() {
		return definicion;
	}
	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}
	
	public Clasificacion() {
		// TODO Auto-generated constructor stub
	}
	
	public static String buildEntityArrayAsJson(ArrayList<Clasificacion> clasificacionList) {
		String json = "\"[";
		int lastId = clasificacionList.get(clasificacionList.size() - 1).getId();
		for (Clasificacion c : clasificacionList) 
		{ 
			json = json.concat(String.format("{'id':'%s','identificador':'%s','edadMinima':'%s','recomendacion':'%s','definicion':'%s'}",
					c.getId(),c.getIdentificador(),c.getEdadMinima(),c.getRecomendacion(),c.getDefinicion()));
			if (c.getId() != lastId) {
				json = json.concat(",");
			} 
		}
		json = json.concat("]\"");
		return json;
	}
	public static String buildEntityAsJson(Clasificacion clasificacion) {
		return String.format("{'id':'%s','identificador':'%s','edadMinima':'%s','recomendacion':'%s','definicion':'%s'}",
				clasificacion.getId(),clasificacion.getIdentificador(),clasificacion.getEdadMinima(),clasificacion.getRecomendacion(),clasificacion.getDefinicion());
	}

}
