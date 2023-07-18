package service;

import java.util.ArrayList;

import data.AsientoRepository;
import entity.Asiento;

public class AsientoService {

	AsientoRepository asientoRepository = new AsientoRepository();

	public ArrayList<Asiento> getAllByFuncion(int idFuncion) throws Exception {
		return asientoRepository.getAllByFuncion(idFuncion);
	}

	public ArrayList<Asiento> getAllBySala(int idSala) throws Exception {
		return asientoRepository.getAllBySala(idSala);
	}
	
	public ArrayList<Asiento> getAsientosByIds(ArrayList<Integer> asientoIds) throws Exception {
		return asientoRepository.getAsientosByIds(asientoIds);
	}
}
