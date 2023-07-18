package entity;

import java.util.ArrayList;

public class CompraDTO extends BaseEntity {

	private String nombre;
	private String email;
	private Funcion funcion;
	private ArrayList<Integer> asientoIdSelected;
	private ArrayList<PrecioIdQuantity> precioIdQuantitySelected;
	private ArrayList<Asiento> asientos;

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

	public ArrayList<Integer> getAsientoIdSelected() {
		return asientoIdSelected;
	}

	public void setAsientoIdSelected(ArrayList<Integer> asientoIdSelected) {
		this.asientoIdSelected = asientoIdSelected;
	}

	public ArrayList<PrecioIdQuantity> getPrecioIdQuantitySelected() {
		return precioIdQuantitySelected;
	}

	public void setAsientos(ArrayList<Asiento> asientos) {
		this.asientos = asientos;
	}

	public ArrayList<Asiento> getAsientos() {
		return this.asientos;
	}

	public void setPrecioIdQuantitySelected(ArrayList<PrecioIdQuantity> precioIdQuantitySelected) {
		this.precioIdQuantitySelected = precioIdQuantitySelected;
	}

	public class PrecioIdQuantity {
		private int precioId;
		private int quantity;

		public int getPrecioId() {
			return precioId;
		}

		public void setPrecioId(int precioId) {
			this.precioId = precioId;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	}
}
