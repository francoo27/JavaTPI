package entity;

public class Asiento extends BaseEntity {

	private String nombre;
	private int fila;
	private int columna;
	private int numero;
	private int adaptado;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Asiento() {
		// TODO Auto-generated constructor stub
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAdaptado() {
		return adaptado;
	}

	public void setAdaptado(int adaptado) {
		this.adaptado = adaptado;
	}

}
