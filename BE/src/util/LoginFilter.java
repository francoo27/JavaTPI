package util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AuthService;

public class LoginFilter implements Filter {

	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
	        throws IOException, ServletException {
	    final String loginPath = "/authorization/login";

	    HttpServletRequest httpRequest = (HttpServletRequest) req;
	    HttpServletResponse httpResponse = (HttpServletResponse) res;
	    String servletPath = httpRequest.getServletPath();
	    AuthService authService = new AuthService();

	    if (httpRequest.getMethod().equalsIgnoreCase("POST") || httpRequest.getMethod().equalsIgnoreCase("PUT") || httpRequest.getMethod().equalsIgnoreCase("DELETE")) {
	        if (!servletPath.equals(loginPath)) {
	            String email = httpRequest.getHeader("X-User-Email");
	            String token = httpRequest.getHeader("X-Auth-Token");

	            if (email == null || token == null) {
	                System.out.println("Missing email or token headers.");
	                httpResponse.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing email or token headers.");
	                return;
	            }

	            try {
	                if (!authService.authenticate(email, token)) {
	                    System.out.println("The token is not valid.");
	                    httpResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "The token is not valid.");
	                    return;
	                }
	            } catch (Exception e) {
	                throw new ServletException("Error validating authentication token", e);
	            }
	        }
	    }

	    chain.doFilter(req, res);
	}




    @Override
    public void destroy() {
        // Cleanup code, if any
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // Initialization code, if any
    }
}
