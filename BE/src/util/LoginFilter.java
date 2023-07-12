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

public class LoginFilter implements Filter {

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// No es la mejor forma pero es facil redirigir todos los servlets a este filtro
		// y bloquear
		final String Login = "/authorization/login";

		String url = ((HttpServletRequest) req).getRequestURL().toString();
		String servlet = ((HttpServletRequest) req).getServletPath();

		HttpServletRequest httpRequest = (HttpServletRequest) req;
		if (httpRequest.getMethod().equalsIgnoreCase("POST") || httpRequest.getMethod().equalsIgnoreCase("PUT")) {
			if (!servlet.equals(Login)) {
				System.out.println("The token is not valid.");
				((HttpServletResponse) res).sendError(HttpServletResponse.SC_UNAUTHORIZED, "The token is not valid.");
			} else {
				chain.doFilter(req, res);
			}
		}
		chain.doFilter(req, res);
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}