package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.Compra;
import entity.CompraDTO;
import entity.Genero;
import entity.Ticket;
import entity.CompraDTO.PrecioIdQuantity;
import entity.CompraTicket;
import service.CompraService;
import service.CompraTicketService;
import service.GeneroService;
import service.TicketService;


/**
 * Servlet implementation class CompraServlet
 */
@WebServlet("/compra")
public class CompraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompraServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestData = request.getReader().lines().collect(Collectors.joining());
	    Gson gson = new Gson();
	    
	    CompraDTO compraDTO = gson.fromJson(requestData, CompraDTO.class);
	    CompraService compraService = new CompraService();
	    CompraTicketService compraTicketService = new CompraTicketService();
	    TicketService TicketService = new TicketService();
	    ArrayList<Ticket> tickets = mapTickets(compraDTO.getPrecioIdQuantitySelected(),compraDTO.getAsientoIdSelected());
	    try {
	    	int compraId = compraService.comprar(mapCompra(compraDTO));
	    	ArrayList<Integer> ticketsId = TicketService.save(tickets);
	    	ticketsId.forEach(t -> {
	    		CompraTicket ct = new CompraTicket(compraId,t);
	    		try {
					compraTicketService.save(ct);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		});
	    	
		} catch (Exception e) {
			e.printStackTrace();
		}
        response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	}
	private ArrayList<Ticket> mapTickets (ArrayList<PrecioIdQuantity> precioIdQuantitySelected, ArrayList<Integer> asientoIdSelected) {
		
		ArrayList<Ticket> tickets = new ArrayList<Ticket>();

		precioIdQuantitySelected.forEach((x) ->  {
			for (int i = 0; i < x.getQuantity(); i++) {
				tickets.add(new Ticket(asientoIdSelected.get(0),x.getPrecioId()));
				asientoIdSelected.remove(0);
			}
		});

		return tickets;
	}
	
	private Compra mapCompra (CompraDTO compraDTO) {
		return new Compra(compraDTO.getFuncion(),compraDTO.getNombre(),compraDTO.getEmail());
	}

}
