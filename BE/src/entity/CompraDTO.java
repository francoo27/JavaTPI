package entity;

import java.util.ArrayList;

public class CompraDTO extends BaseEntity {
	
	private String nombre;
	private String email;
	private Funcion funcion;
	private ArrayList<int[]> asientos;
	private ArrayList<PrecioCantidad> precioCantidades;
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public CompraDTO() {
		// TODO Auto-generated constructor stub
	}
	public Funcion getFuncion() {
		return funcion;
	}
	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
