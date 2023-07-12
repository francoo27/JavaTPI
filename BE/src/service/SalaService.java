package service;

import java.util.ArrayList;

import data.SalaRepository;
import entity.Sala;

public class SalaService {

	SalaRepository salaRepository = new SalaRepository();

	SalaFormatoService salaFormatoService = new SalaFormatoService();

	public Sala getById(int id) throws Exception {
		Sala sala = salaRepository.getById(id);
		sala.setFormatos(salaFormatoService.getAllBySala(sala.getId()));
		return sala;
	}

	public ArrayList<Sala> getAll(int complejoId) throws Exception {
		ArrayList<Sala> salaList = salaRepository.getAll(complejoId);
		if (salaList != null) {
			for (Sala s : salaList) {
				s.setFormatos(salaFormatoService.getAllBySala(s.getId()));
			}
		}
		return salaList;
	}

	public void save(Sala sala) throws Exception {
		salaRepository.save(sala);
	}

	public void delete(int id) throws Exception {
		salaRepository.delete(id);
	}

}
