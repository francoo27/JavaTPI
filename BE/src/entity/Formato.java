package entity;

public class Formato extends BaseEntity {
	
	private String nombre;
	private Audio audio;
	private TecnologiaProyeccion tecnologiaProyeccion;
	
	public Formato() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre() {
		this.nombre = this.tecnologiaProyeccion.getNombre() + " " +  this.audio.getNombre();
	}

	public Audio getAudio() {
		return audio;
	}

	public void setAudio(Audio audio) {
		this.audio = audio;
	}

	public TecnologiaProyeccion getTecnologiaProyeccion() {
		return tecnologiaProyeccion;
	}

	public void setTecnologiaProyeccion(TecnologiaProyeccion tecnologiaProyeccion) {
		this.tecnologiaProyeccion = tecnologiaProyeccion;
	}

}
