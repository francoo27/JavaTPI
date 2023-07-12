package entity;

import java.util.Date;

public class BaseEntity {

	private int id;
	private Date fechaCreacion;
	private Date fechaModificacion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = (Date) fechaCreacion.clone();
	}

	public Date getFechaCreacion() {
		return (Date) this.fechaCreacion.clone();
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = (Date) fechaModificacion.clone();
	}

	public Date getFechaModificacion() {
		return (Date) this.fechaModificacion.clone();
	}

}
