package service;

import java.util.ArrayList;

import data.ClasificacionRepository;
import entity.Clasificacion;

public class ClasificacionService {

	ClasificacionRepository clasificacionRepository = new ClasificacionRepository();

	public Clasificacion getById(int id) throws Exception {
		return clasificacionRepository.getById(id);
	}

	public ArrayList<Clasificacion> getAll() throws Exception {
		return clasificacionRepository.getAll();
	}

	public void save(Clasificacion clasificacion) throws Exception {
		clasificacionRepository.save(clasificacion);
	}

	public void delete(int id) throws Exception {
		clasificacionRepository.delete(id);
	}

}
