package service;

import java.util.ArrayList;
import data.PeliculaRepository;
import entity.Formato;
import entity.Pelicula;

public class PeliculaService {
	
	PeliculaRepository peliculaRepository = new PeliculaRepository();
	PeliculaFormatoService peliculaFormatoService = new PeliculaFormatoService();
	
	public Pelicula getById(int id) throws Exception {
		return peliculaRepository.getById(id);
	}

	public ArrayList<Pelicula> getAll() throws Exception {
		return peliculaRepository.getAll();
	}
	
	public void save(Pelicula pelicula) throws Exception {
		int peliculaId = peliculaRepository.save(pelicula);
		var newList = pelicula.getFormatos();
		System.out.println("ACA");
		var currentList = peliculaFormatoService.getAllByPelicula(peliculaId);
		System.out.println("ACA");
		ArrayList<Formato> toAdd = new ArrayList<Formato>();
		ArrayList<Formato> toDelete = new ArrayList<Formato>();
		
	    for(Formato f:currentList) {
	        if (!newList.contains(f)) {
	        	toDelete.add(f);
	        }
	     }
	    if (newList != null) {
		    for(Formato f:newList) {
		        if (!currentList.contains(f)) {
		        	toAdd.add(f);
		        }
		     }
	    }

		peliculaFormatoService.save(peliculaId, toAdd);
		peliculaFormatoService.delete(peliculaId, toDelete);
	}
	
	public void delete(int id) throws Exception {
		peliculaRepository.delete(id);
	}
	
}
