package service;

import java.util.ArrayList;

import data.FuncionRepository;
import entity.Funcion;

public class FuncionService {

	FuncionRepository funcionRepository = new FuncionRepository();

	public Funcion getById(int id) throws Exception {
		return funcionRepository.getById(id);
	}

	public ArrayList<Funcion> getAll(int idPelicula, int idFormato, int cancelada, int expirada) throws Exception {
		return funcionRepository.getAll(idPelicula, idFormato, cancelada, expirada);
	}

	public void save(Funcion funcion) throws Exception {
		funcionRepository.save(funcion);
	}

	public void delete(int id) throws Exception {
		funcionRepository.delete(id);
	}

}
