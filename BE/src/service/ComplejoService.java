package service;

import java.util.ArrayList;

import data.ComplejoRepository;
import entity.Complejo;

public class ComplejoService {
	
	ComplejoRepository complejoRepository = new ComplejoRepository();
	
	public Complejo getById(int id) throws Exception {
		return complejoRepository.getById(id);
	}

	public ArrayList<Complejo> getAll() throws Exception {
		return complejoRepository.getAll();
	}
	
	public void save(Complejo complejo) throws Exception {
		complejoRepository.save(complejo);
	}
	
	public void delete(int id) throws Exception {
		complejoRepository.delete(id);
	}

}
