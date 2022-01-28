package service;

import java.util.ArrayList;

import data.FormatoRepository;
import entity.Formato;

public class FormatoService {
	
	FormatoRepository formatoRepository = new FormatoRepository();
	
	public Formato getById(int id) throws Exception {
		return formatoRepository.getById(id);
	}

	public ArrayList<Formato> getAll() throws Exception {
		return formatoRepository.getAll();
	}
	
	public void save(Formato genero) throws Exception {
		formatoRepository.save(genero);
	}
	
	public void delete(int id) throws Exception {
		formatoRepository.delete(id);
	}

}
