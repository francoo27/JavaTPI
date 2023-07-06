package service;

import data.CompraTicketRepository;
import entity.CompraTicket;

public class CompraTicketService {
	
	CompraTicketRepository compraTicketRepository = new CompraTicketRepository();
	
	/*public CompraTicket getById(int id) throws Exception {
		return compraTicketRepository.getById(id);
	}

	public ArrayList<CompraTicket> getAll() throws Exception {
		return compraTicketRepository.getAll();
	}*/
	
	public void save(CompraTicket compraTicket) throws Exception {
		compraTicketRepository.save(compraTicket);
	}

}
