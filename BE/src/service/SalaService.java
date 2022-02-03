package service;

import java.util.ArrayList;

import data.SalaRepository;
import entity.Sala;

public class SalaService {
	
	SalaRepository salaRepository = new SalaRepository();
	
	public Sala getById(int id) throws Exception {
		return salaRepository.getById(id);
	}

	public ArrayList<Sala> getAll(int complejoId) throws Exception {
		return salaRepository.getAll(complejoId);
	}
	
	public void save(Sala sala) throws Exception {
		salaRepository.save(sala);
	}
	
	public void delete(int id) throws Exception {
		salaRepository.delete(id);
	}

}
