package controller;

import java.io.IOException;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.TecnologiaProyeccion;
import service.TecnologiaProyeccionService;
import com.google.gson.*;

/**
 * Servlet implementation class TecnologiaProyeccionServlet
 */
@WebServlet("/tecnologia-proyeccion/*")
public class TecnologiaProyeccionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TecnologiaProyeccionServlet() {
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
	    TecnologiaProyeccionService tecnologiaProyeccionService = new TecnologiaProyeccionService();
	    Gson gson = new Gson();
		try {
			TecnologiaProyeccion tecnologiaProyeccion = tecnologiaProyeccionService.getById(id.intValue());
			if(tecnologiaProyeccion.getId() == 0) {
				throw new ServletException("TecnologiaProyeccion inexistente"); 
			} else {
				response.getWriter().write(gson.toJson(tecnologiaProyeccion));
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
	    
	    TecnologiaProyeccion tecnologiaProyeccion = gson.fromJson(requestData, TecnologiaProyeccion.class);
	    TecnologiaProyeccionService tecnologiaProyeccionService = new TecnologiaProyeccionService();
		try {
			TecnologiaProyeccion currentTecnologiaProyeccion = tecnologiaProyeccionService.getById(tecnologiaProyeccion.getId());
			if(currentTecnologiaProyeccion.getId() == 0) {
				throw new ServletException("TecnologiaProyeccion inexistente"); 
			}
			tecnologiaProyeccionService.save(tecnologiaProyeccion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		Long id = Long.valueOf(pathInfo.substring(1));
	    TecnologiaProyeccionService tecnologiaProyeccionService = new TecnologiaProyeccionService();
		try {
			TecnologiaProyeccion tecnologiaProyeccion = tecnologiaProyeccionService.getById(id.intValue());
			if(tecnologiaProyeccion.getId() == 0) {
				throw new ServletException("TecnologiaProyeccion inexistente"); 
			} else {
				tecnologiaProyeccionService.delete(tecnologiaProyeccion.getId());
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
