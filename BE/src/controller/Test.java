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
import util.AppDataException;

import java.io.BufferedReader;
/**
 * Servlet implementation class Test
 */
@WebServlet("/test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    List<String> list = new ArrayList<>();
	    list.add("item1");
	    list.add("item2");
	    list.add("item3");
	    
	    Connection stmt;
		try {
			stmt = FactoryConection.getInstancia().getConn();
			response.getWriter().write("\"{'eeeeeeeeee':'eeeeeeeeee'}\"");
		} catch (SQLException | AppDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


        response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.addHeader("Access-Control-Allow-Origin", "*");
	    response.getWriter().write("\"{'adsasd':'asda'}\"");
	    
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  StringBuffer jb = new StringBuffer();
		  String line = null;
		  try {
		    BufferedReader reader = request.getReader();
		    while ((line = reader.readLine()) != null)
		      jb.append(line);
		  } catch (Exception e) { /*report an error*/ }

		  try {
		    JSONObject jsonObject =  HTTP.toJSONObject(jb.toString());
		  } catch (JSONException e) {
		    // crash and burn
		    throw new IOException("Error parsing JSON request string");
		  }
	}

}
