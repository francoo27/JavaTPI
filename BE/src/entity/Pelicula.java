package entity;

import java.util.ArrayList;
import java.util.Date;

public class Pelicula extends BaseEntity {

	private String nombre;
	private String tituloOriginal;
	private String tituloPais;
	private int duracion;
	private String sinopsis;
	private Date fechaEstreno;
	private Pais pais;
	private Genero genero;
	private Clasificacion clasificacion;
	private ArrayList<Formato> formatos;

	public Pelicula() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Clasificacion getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public String getTituloPais() {
		return tituloPais;
	}

	public void setTituloPais(String tituloPais) {
		this.tituloPais = tituloPais;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public ArrayList<Formato> getFormatos() {
		return formatos;
	}

	public void setFormatos(ArrayList<Formato> formatos) {
		this.formatos = formatos;
	}

	public void addFormato(ArrayList<Formato> formatos) {
		formatos.forEach(x -> this.addFormato(x));
	}

	public void addFormato(Formato formato) {
		Formato formatoToAdd = this.getFormato(formato.getId());
		if (formatoToAdd == null) {
			this.formatos.add(formato);
		}
	}

	public void removeFormato(ArrayList<Formato> formatos) {
		formatos.forEach(x -> this.addFormato(x));
	}

	public void removeFormato(Formato formato) {
		Formato formatoToRemove = this.getFormato(formato.getId());
		if (formatoToRemove != null) {
			this.formatos.remove(formato);
		}
	}

	private Formato getFormato(int id) {
		for (Formato formato : this.formatos) {
			if (formato.getId() == id) {
				return formato;
			}
		}
		return null;
	}

	public Date getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

}
