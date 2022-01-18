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
import entity.Pais;
import service.PaisService;
/**
 * Servlet implementation class Test
 */
@WebServlet("/pais")
public class PaisListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaisListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	    PaisService paisService = new PaisService();
	    Gson gson = new Gson();
		try {
			ArrayList<Pais> paisList = paisService.getAll();
			response.getWriter().write(gson.toJson(paisList));
		} catch (Exception e) {
			e.printStackTrace();
		}

        response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8"); 
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestData = request.getReader().lines().collect(Collectors.joining());
		System.out.println(requestData);
	    Gson gson = new Gson();
	    
	    Pais pais = gson.fromJson(requestData, Pais.class);
	    PaisService paisService = new PaisService();
	    try {
			paisService.save(pais);
		} catch (Exception e) {
			e.printStackTrace();
		}
        response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doOptions(req, resp);
	}
}