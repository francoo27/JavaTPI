package service;

import java.util.ArrayList;

import data.PrecioRepository;
import entity.Precio;

public class PrecioService {
	
	PrecioRepository precioRepository = new PrecioRepository();
	
	public Precio getById(int id) throws Exception {
		return precioRepository.getById(id);
	}

	public ArrayList<Precio> getAll() throws Exception {
		return precioRepository.getAll();
	}
	
	public void save(Precio precio) throws Exception {
		precioRepository.save(precio);
	}
	
	public void delete(int id) throws Exception {
		precioRepository.delete(id);
	}

}
