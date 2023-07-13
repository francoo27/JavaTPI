package controller;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import service.AuthService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/authorization")
public class Authorization extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	private AuthService authService;
	private Gson gson;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Authorization() {
		super();
		// TODO Auto-generated constructor stub
		authService = new AuthService();
		gson = new Gson();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			HttpServletRequest httpRequest = (HttpServletRequest) request;
			String email = httpRequest.getHeader("X-User-Email");
			String token = httpRequest.getHeader("X-Auth-Token");
			response.getWriter().write(gson.toJson(authService.authenticate(email, token)));
		} catch (Exception e) {
			e.printStackTrace();
			response.sendError(500);
		}

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
	}

}
