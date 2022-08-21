package service;

import java.util.ArrayList;
import data.CompraRepository;
import entity.Compra;

public class CompraService {
	
	CompraRepository compraRepository = new CompraRepository();
	
	public void comprar(Compra compra) throws Exception {
		compraRepository.comprar(compra);
	}

}
