package service;

import java.util.ArrayList;

import data.TicketRepository;
import entity.Ticket;

public class TicketService {

	TicketRepository ticketRepository = new TicketRepository();

	public ArrayList<Integer> save(ArrayList<Ticket> tickets) throws Exception {
		ArrayList<Integer> ids = new ArrayList<Integer>();
		tickets.forEach(t -> {
			try {
				ids.add(ticketRepository.save(t));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		return ids;
	}

	public int save(Ticket ticket) throws Exception {
		return ticketRepository.save(ticket);
	}

}
