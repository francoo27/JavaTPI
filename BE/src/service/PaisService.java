package service;

import java.util.ArrayList;

import data.PaisRepository;
import entity.Pais;

public class PaisService {

	PaisRepository paisRepository = new PaisRepository();

	public Pais getById(int id) throws Exception {
		return paisRepository.getById(id);
	}

	public ArrayList<Pais> getAll() throws Exception {
		return paisRepository.getAll();
	}

	public void save(Pais pais) throws Exception {
		paisRepository.save(pais);
	}

	public void delete(int id) throws Exception {
		paisRepository.delete(id);
	}

}
