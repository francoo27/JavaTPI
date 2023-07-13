package controller;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AuthService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/authorization/logout")
public class LogoutServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
    private AuthService authService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
        authService = new AuthService();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getHeader("X-User-Email");
        String token = request.getHeader("X-Auth-Token");
        try {
        	authService.logout(email, token);
            response.getWriter().write("Logout successful");
        } catch (Exception e) {
            response.getWriter().write("Error occurred during logout");
        }
    }

}
