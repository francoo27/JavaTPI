package service;

import java.util.ArrayList;

import data.PeliculaFormatoRepository;
import entity.Formato;

public class PeliculaFormatoService {

	PeliculaFormatoRepository peliculaFormatoRepository = new PeliculaFormatoRepository();

	public ArrayList<Formato> getAllByPelicula(int peliculaId) throws Exception {
		return peliculaFormatoRepository.getAllByPelicula(peliculaId);
	}

	public void save(int peliculaId, ArrayList<Formato> formatoList) throws Exception {
		formatoList.forEach(x -> {
			try {
				this.save(peliculaId, x);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

	public void delete(int peliculaId, ArrayList<Formato> formatoList) throws Exception {
		formatoList.forEach(x -> {
			try {
				this.delete(peliculaId, x);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

	public void save(int peliculaId, Formato formato) throws Exception {
		peliculaFormatoRepository.save(peliculaId, formato);
	}

	public void delete(int peliculaId, Formato formato) throws Exception {
		peliculaFormatoRepository.delete(peliculaId, formato);
	}

}