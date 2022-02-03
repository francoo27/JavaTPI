package service;

import java.util.ArrayList;
import data.PeliculaRepository;
import entity.Formato;
import entity.Pelicula;

public class PeliculaService {
	
	PeliculaRepository peliculaRepository = new PeliculaRepository();
	PeliculaFormatoService peliculaFormatoService = new PeliculaFormatoService();
	
	public Pelicula getById(int id) throws Exception {
		Pelicula pelicula = peliculaRepository.getById(id);
		pelicula.setFormatos(peliculaFormatoService.getAllByPelicula(pelicula.getId()));
		return pelicula;
	}

	public ArrayList<Pelicula> getAll() throws Exception {
		ArrayList<Pelicula> peliculaList = peliculaRepository.getAll();
	    if (peliculaList != null) {
		    for(Pelicula p:peliculaList) {
		        p.setFormatos(peliculaFormatoService.getAllByPelicula(p.getId()));
		     }
	    }
	    return peliculaList;
	}
	
	public void save(Pelicula pelicula) throws Exception {
		int peliculaId = peliculaRepository.save(pelicula);
		ArrayList<Formato> newList = pelicula.getFormatos();
		ArrayList<Formato> currentList = peliculaFormatoService.getAllByPelicula(peliculaId);;
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
