package service;

import java.util.ArrayList;

import data.GeneroRepository;
import entity.Genero;

public class GeneroService {

	GeneroRepository generoRepository = new GeneroRepository();

	public Genero getById(int id) throws Exception {
		return generoRepository.getById(id);
	}

	public ArrayList<Genero> getAll() throws Exception {
		return generoRepository.getAll();
	}

	public void save(Genero genero) throws Exception {
		generoRepository.save(genero);
	}

	public void delete(int id) throws Exception {
		generoRepository.delete(id);
	}

}
