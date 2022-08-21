package entity;

import java.util.ArrayList;

public class Compra extends BaseEntity {
	
	private String nombre;
	private String email;
	private Funcion funcion;
	private ArrayList<Ticket> tickets;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Compra() {
		// TODO Auto-generated constructor stub
	}
	public Compra(Funcion funcion, String nombre, String email) {
		this.funcion = funcion;
		this.nombre = nombre;
		this.email = email;
	}
	public Funcion getFuncion() {
		return funcion;
	}
	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}
	public ArrayList<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
