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

import entity.Sala;
import service.SalaService;

/**
 * Servlet implementation class Test
 */
@WebServlet("/sala")
public class SalaListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SalaListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String queryString = request.getQueryString();
	    int idComplejo = 0;
	    if (queryString != null) {
			String[] queryStringArr = queryString.split("=");
			idComplejo = Integer.parseInt(queryStringArr[1]);
			System.out.println(idComplejo);
	    }

	    SalaService salaService = new SalaService();
	    Gson gson = new Gson();
		try {
			ArrayList<Sala> salaList = salaService.getAll(idComplejo);
			response.getWriter().write(gson.toJson(salaList));
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
	    Gson gson = new Gson();
	    
	    Sala sala = gson.fromJson(requestData, Sala.class);
	    SalaService salaService = new SalaService();
	    try {
			salaService.save(sala);
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