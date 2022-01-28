package service;

import java.util.ArrayList;

import data.PeliculaRepository;
import entity.Pelicula;

public class PeliculaService {
	
	PeliculaRepository peliculaRepository = new PeliculaRepository();
	
	public Pelicula getById(int id) throws Exception {
		return peliculaRepository.getById(id);
	}

	public ArrayList<Pelicula> getAll() throws Exception {
		return peliculaRepository.getAll();
	}
	
	public void save(Pelicula genero) throws Exception {
		peliculaRepository.save(genero);
	}
	
	public void delete(int id) throws Exception {
		peliculaRepository.delete(id);
	}

}
