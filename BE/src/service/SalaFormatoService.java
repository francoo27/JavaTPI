package service;

import java.util.ArrayList;
import data.SalaFormatoRepository;
import entity.Formato;

public class SalaFormatoService {

	SalaFormatoRepository salaFormatoRepository = new SalaFormatoRepository();

	public ArrayList<Formato> getAllBySala(int salaId) throws Exception {
		return salaFormatoRepository.getAllBySala(salaId);
	}

}