package controller;

import java.io.IOException;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Pais;
import service.PaisService;
import com.google.gson.*;

/**
 * Servlet implementation class PaisServlet
 */
@WebServlet("/pais/*")
public class PaisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaisServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pathInfo = request.getPathInfo();
		Long id = Long.valueOf(pathInfo.substring(1));
	    PaisService paisService = new PaisService();
	    Gson gson = new Gson();
		try {
			Pais pais = paisService.getById(id.intValue());
			if(pais.getId() == 0) {
				throw new ServletException("Pais inexistente"); 
			} else {
				response.getWriter().write(gson.toJson(pais));
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
	    Gson gson = new Gson();
	    
	    Pais pais = gson.fromJson(requestData, Pais.class);
	    PaisService paisService = new PaisService();
		try {
			Pais currentPais = paisService.getById(pais.getId());
			if(currentPais.getId() == 0) {
				throw new ServletException("Pais inexistente"); 
			}
			paisService.save(pais);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		Long id = Long.valueOf(pathInfo.substring(1));
	    PaisService paisService = new PaisService();
		try {
			Pais pais = paisService.getById(id.intValue());
			if(pais.getId() == 0) {
				throw new ServletException("Pais inexistente"); 
			} else {
				paisService.delete(pais.getId());
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
