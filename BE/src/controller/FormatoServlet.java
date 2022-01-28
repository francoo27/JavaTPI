package controller;

import java.io.IOException;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Formato;
import service.FormatoService;
import com.google.gson.*;

/**
 * Servlet implementation class FormatoServlet
 */
@WebServlet("/formato/*")
public class FormatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormatoServlet() {
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
	    FormatoService formatoService = new FormatoService();
	    Gson gson = new Gson();
		try {
			Formato formato = formatoService.getById(id.intValue());
			if(formato.getId() == 0) {
				throw new ServletException("Formato inexistente"); 
			} else {
				response.getWriter().write(gson.toJson(formato));
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
	    
	    Formato formato = gson.fromJson(requestData, Formato.class);
	    FormatoService formatoService = new FormatoService();
		try {
			Formato currentFormato = formatoService.getById(formato.getId());
			if(currentFormato.getId() == 0) {
				throw new ServletException("Formato inexistente"); 
			}
			formatoService.save(formato);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		Long id = Long.valueOf(pathInfo.substring(1));
	    FormatoService formatoService = new FormatoService();
		System.out.println(id);
		try {
			Formato formato = formatoService.getById(id.intValue());
			if(formato.getId() == 0) {
				throw new ServletException("Formato inexistente"); 
			} else {
				formatoService.delete(formato.getId());
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
