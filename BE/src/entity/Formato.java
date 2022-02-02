package entity;

public class Formato extends BaseEntity {
	
	private String nombre;
	private Audio audio;
	private TecnologiaProyeccion tecnologiaProyeccion;
	
	public Formato() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre() {
		this.nombre = this.tecnologiaProyeccion.getNombre() + " " +  this.audio.getNombre();
	}

	public Audio getAudio() {
		return audio;
	}

	public void setAudio(Audio audio) {
		this.audio = audio;
	}

	public TecnologiaProyeccion getTecnologiaProyeccion() {
		return tecnologiaProyeccion;
	}

	public void setTecnologiaProyeccion(TecnologiaProyeccion tecnologiaProyeccion) {
		this.tecnologiaProyeccion = tecnologiaProyeccion;
	}
	
	// https://stackoverflow.com/questions/11260628/how-to-find-the-differences-between-two-array-lists-based-on-a-property/11260849
    @Override
    public boolean equals(Object obj) {
    	Formato formato = (Formato)obj;
        if ( this.getId() == formato.getId()){
            return true;
        }
        return false;
    }

}
