package service;

import java.util.ArrayList;

import data.TecnologiaProyeccion;
import entity.TecnologiaProyeccion;

public class TecnologiaProyeccionService {
	
	TecnologiaProyeccion tecnologiaProyeccion = new TecnologiaProyeccion();
	
	public TecnologiaProyeccion getById(int id) throws Exception {
		return tecnologiaProyeccion.getById(id);
	}

	public ArrayList<TecnologiaProyeccion> getAll() throws Exception {
		return tecnologiaProyeccion.getAll();
	}
	
	public void save(TecnologiaProyeccion genero) throws Exception {
		tecnologiaProyeccion.save(genero);
	}
	
	public void delete(int id) throws Exception {
		tecnologiaProyeccion.delete(id);
	}

}
