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

import entity.Complejo;
import service.ComplejoService;

/**
 * Servlet implementation class Test
 */
@WebServlet("/complejo")
public class ComplejoListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComplejoListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    ComplejoService complejoService = new ComplejoService();
	    Gson gson = new Gson();
		try {
			ArrayList<Complejo> complejoList = complejoService.getAll();
			response.getWriter().write(gson.toJson(complejoList));
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
	    
	    Complejo complejo = gson.fromJson(requestData, Complejo.class);
	    ComplejoService complejoService = new ComplejoService();
	    try {
			complejoService.save(complejo);
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