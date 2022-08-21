package service;

import java.util.ArrayList;
import data.CompraRepository;
import entity.Compra;

public class CompraService {
	
	CompraRepository compraRepository = new CompraRepository();
	
	public int comprar(Compra compra) throws Exception {
		return compraRepository.comprar(compra);
	}

}
