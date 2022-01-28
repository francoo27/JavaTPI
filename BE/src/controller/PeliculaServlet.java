package controller;

import java.io.IOException;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Pelicula;
import service.PeliculaService;
import com.google.gson.*;

/**
 * Servlet implementation class PeliculaServlet
 */
@WebServlet("/pelicula/*")
public class PeliculaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PeliculaServlet() {
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
	    PeliculaService peliculaService = new PeliculaService();
	    Gson gson = new Gson();
		try {
			Pelicula pelicula = peliculaService.getById(id.intValue());
			if(pelicula.getId() == 0) {
				throw new ServletException("Pelicula inexistente"); 
			} else {
				response.getWriter().write(gson.toJson(pelicula));
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
		System.out.println(requestData);
	    Gson gson = new Gson();
	    
	    Pelicula pelicula = gson.fromJson(requestData, Pelicula.class);
	    PeliculaService peliculaService = new PeliculaService();
		try {
			Pelicula currentPelicula = peliculaService.getById(pelicula.getId());
			if(currentPelicula.getId() == 0) {
				throw new ServletException("Pelicula inexistente"); 
			}
			peliculaService.save(pelicula);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		Long id = Long.valueOf(pathInfo.substring(1));
	    PeliculaService peliculaService = new PeliculaService();
		System.out.println(id);
		try {
			Pelicula pelicula = peliculaService.getById(id.intValue());
			if(pelicula.getId() == 0) {
				throw new ServletException("Pelicula inexistente"); 
			} else {
				peliculaService.delete(pelicula.getId());
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
