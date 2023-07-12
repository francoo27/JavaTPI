package entity;

import java.util.ArrayList;

public class Sala extends BaseEntity {

	private int numero;
	private ArrayList<Formato> formatos;
	private ArrayList<Asiento> asientos;

	public Sala() {
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ArrayList<Asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(ArrayList<Asiento> asientos) {
		this.asientos = asientos;
		System.out.println(asientos.isEmpty());
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

}
