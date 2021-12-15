package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Clasificacion;
import service.ClasificacionService;
import com.google.gson.*;

/**
 * Servlet implementation class ClasificacionServlet
 */
@WebServlet("/clasificacion/*")
public class ClasificacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClasificacionServlet() {
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
		System.out.println(id);
	    ClasificacionService clasificacionService = new ClasificacionService();
		try {
			Clasificacion clasificacion = clasificacionService.getById(id.intValue());
			response.getWriter().write(Clasificacion.buildEntityAsJson(clasificacion));
		} catch (Exception e) {
			e.printStackTrace();
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
	    
	    Clasificacion clasificacion = gson.fromJson(requestData, Clasificacion.class);
	    ClasificacionService clasificacionService = new ClasificacionService();
		try {
			Clasificacion currentClasificacion = clasificacionService.getById(clasificacion.getId());
			if(currentClasificacion.getId() == 0) {
				throw new ServletException("Clasificacion inexistente"); 
			}
			System.out.println(clasificacion.getIdentificador());
			clasificacionService.save(clasificacion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

}
