package controller;

import java.io.IOException;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Funcion;
import service.FuncionService;
import com.google.gson.*;

/**
 * Servlet implementation class FuncionServlet
 */
@WebServlet("/funcion/*")
public class FuncionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final Gson gson;
	private final FuncionService funcionService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FuncionServlet() {
        super();
        // TODO Auto-generated constructor stub
	    gson = new Gson();
	    funcionService = new FuncionService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pathInfo = request.getPathInfo();
		Long id = Long.valueOf(pathInfo.substring(1));
		try {
			Funcion funcion = funcionService.getById(id.intValue());
			if(funcion.getId() == 0) {
				throw new ServletException("Funcion inexistente"); 
			} else {
				response.getWriter().write(gson.toJson(funcion));
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendError(500);
		}

        response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8"); 
	}



	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestData = request.getReader().lines().collect(Collectors.joining());
	    Funcion funcion = gson.fromJson(requestData, Funcion.class);
	    
	    String queryString = request.getQueryString();
	    

		try {
			Funcion currentFuncion = funcionService.getById(funcion.getId());
			if(currentFuncion.getId() == 0) {
				throw new ServletException("Funcion inexistente"); 
			}
			if (queryString != null) {
				String[] queryStringArr = queryString.split("=");
				boolean cancelar = Boolean.parseBoolean(queryStringArr[1]);
				if(cancelar) {
					funcion.cancelar();
				}
		    }
			funcionService.save(funcion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		Long id = Long.valueOf(pathInfo.substring(1));
		try {
			Funcion funcion = funcionService.getById(id.intValue());
			if(funcion.getId() == 0) {
				throw new ServletException("Funcion inexistente"); 
			} else {
				funcionService.delete(funcion.getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendError(500);
		}

        response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8"); 
	}
	
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doOptions(req, resp);
	}

}
