package entity;

public class Ticket extends BaseEntity {
	private int idPrecio;
	private int idAsiento;

	public Ticket(int idAsiento, int idPrecio) {
		this.idAsiento = idAsiento;
		this.idPrecio = idPrecio;
	}

	public int getIdPrecio() {
		return idPrecio;
	}

	public void setIdPrecio(int idPrecio) {
		this.idPrecio = idPrecio;
	}

	public int getIdAsiento() {
		return idAsiento;
	}

	public void setIdAsiento(int idAsiento) {
		this.idAsiento = idAsiento;
	}
}
