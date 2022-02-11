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

import entity.Funcion;
import service.FuncionService;

/**
 * Servlet implementation class Test
 */
@WebServlet("/funcion")
public class FuncionListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FuncionListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String queryString = request.getQueryString();
	    int idPelicula , idFormato;
		idPelicula = idFormato = 0;
	    if (queryString != null) {
			String[] queryStringArr = queryString.split("&");
			String[] firstParameter =  queryStringArr[0].split("=");
			String[] secondParameter =  queryStringArr[1].split("=");
			idPelicula = Integer.parseInt(firstParameter[1]);
			idFormato = Integer.parseInt(secondParameter[1]);
			System.out.println(idPelicula+"-"+idFormato);
	    }
	    
	    FuncionService funcionService = new FuncionService();
	    Gson gson = new Gson();
		try {
			ArrayList<Funcion> funcionList = funcionService.getAll(idPelicula,idFormato);
			response.getWriter().write(gson.toJson(funcionList));
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
	    
	    Funcion funcion = gson.fromJson(requestData, Funcion.class);
	    FuncionService funcionService = new FuncionService();
	    try {
			funcionService.save(funcion);
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