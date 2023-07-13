package controller;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import service.AuthService;

@WebServlet("/authorization/login")
public class LoginServlet extends HttpServlet implements Servlet {
    private static final long serialVersionUID = 1L;
    private AuthService authService;
    private Gson gson;

    public LoginServlet() {
        super();
        authService = new AuthService();
        gson = new Gson();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        JsonObject jsonData = gson.fromJson(request.getReader(), JsonObject.class);

        String email = jsonData.get("email").getAsString();
        String password = jsonData.get("password").getAsString();
        try {
            String token = authService.login(email, password);
            JsonObject jsonResponse = new JsonObject();
            jsonResponse.addProperty("token", token);
            response.getWriter().write(gson.toJson(jsonResponse));
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(500);
        }
    }
}
