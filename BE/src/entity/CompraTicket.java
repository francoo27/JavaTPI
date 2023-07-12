package entity;

public class CompraTicket extends BaseEntity {
	private int idCompra;
	private int idTicket;

	public CompraTicket(int idCompra, int idTicket) {
		this.idCompra = idCompra;
		this.idTicket = idTicket;
	}

	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public int getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

}
