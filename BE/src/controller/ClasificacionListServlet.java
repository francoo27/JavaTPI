package controller;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.FactoryConection;
import entity.Clasificacion;
import server.ClasificacionService;
import util.AppDataException;

import java.io.BufferedReader;
/**
 * Servlet implementation class Test
 */
@WebServlet("/clasificacion")
public class ClasificacionListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClasificacionListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	    ClasificacionService clasificacionService = new ClasificacionService();
		try {
			ArrayList<Clasificacion> clasificacionList = clasificacionService.getAll();
			response.getWriter().write(Clasificacion.buildEntityArrayAsJson(clasificacionList));
		} catch (Exception e) {
			e.printStackTrace();
		}

        response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.addHeader("Access-Control-Allow-Origin", "*");    
	}
	
}
