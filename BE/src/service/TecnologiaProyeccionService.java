package service;

import java.util.ArrayList;

import data.TecnologiaProyeccionRepository;
import entity.TecnologiaProyeccion;

public class TecnologiaProyeccionService {
	
	TecnologiaProyeccionRepository tecnologiaProyeccionRepository = new TecnologiaProyeccionRepository();
	
	public TecnologiaProyeccion getById(int id) throws Exception {
		return tecnologiaProyeccionRepository.getById(id);
	}

	public ArrayList<TecnologiaProyeccion> getAll() throws Exception {
		return tecnologiaProyeccionRepository.getAll();
	}
	
	public void save(TecnologiaProyeccion genero) throws Exception {
		tecnologiaProyeccionRepository.save(genero);
	}
	
	public void delete(int id) throws Exception {
		tecnologiaProyeccionRepository.delete(id);
	}

}
