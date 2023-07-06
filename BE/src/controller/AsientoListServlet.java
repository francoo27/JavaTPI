package controller;


import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.Asiento;
import service.AsientoService;

/**
 * Servlet implementation class Test
 */
@WebServlet("/asiento")
public class AsientoListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AsientoListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String queryString = request.getQueryString();
	    int idFuncion = 0;
	    if (queryString != null) {
			String[] queryStringArr = queryString.split("=");
			idFuncion = Integer.parseInt(queryStringArr[1]);
	    }
	    AsientoService asientoService = new AsientoService();
	    Gson gson = new Gson();
		try {
			System.out.println(idFuncion);
			ArrayList<Asiento> asientoList = asientoService.getAllByFuncion(idFuncion);
			response.getWriter().write(gson.toJson(asientoList));
		} catch (Exception e) {
			e.printStackTrace();
		}

        response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8"); 
	}
	
}