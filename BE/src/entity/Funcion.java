package entity;

public class Funcion extends BaseEntity {

	private String nombre;
	private String fechaInicio;
	private String horaInicio;
	private Pelicula pelicula;
	private Formato formato;
	private Sala sala;
	private boolean cancelada = false;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Funcion() {
		// TODO Auto-generated constructor stub
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public void cancelar() {
		this.setCancelada(true);
	}

	public boolean getCancelada() {
		return cancelada;
	}

	public void setCancelada(boolean cancelada) {
		this.cancelada = cancelada;
	}
}
