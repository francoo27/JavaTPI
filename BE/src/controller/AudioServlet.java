package controller;

import java.io.IOException;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Audio;
import service.AudioService;
import com.google.gson.*;

/**
 * Servlet implementation class AudioServlet
 */
@WebServlet("/audio/*")
public class AudioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AudioServlet() {
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
	    AudioService audioService = new AudioService();
	    Gson gson = new Gson();
		try {
			Audio audio = audioService.getById(id.intValue());
			if(audio.getId() == 0) {
				throw new ServletException("Audio inexistente"); 
			} else {
				response.getWriter().write(gson.toJson(audio));
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
	    
	    Audio audio = gson.fromJson(requestData, Audio.class);
	    AudioService audioService = new AudioService();
		try {
			Audio currentAudio = audioService.getById(audio.getId());
			if(currentAudio.getId() == 0) {
				throw new ServletException("Audio inexistente"); 
			}
			audioService.save(audio);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		Long id = Long.valueOf(pathInfo.substring(1));
	    AudioService audioService = new AudioService();
		System.out.println(id);
		try {
			Audio audio = audioService.getById(id.intValue());
			if(audio.getId() == 0) {
				throw new ServletException("Audio inexistente"); 
			} else {
				audioService.delete(audio.getId());
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
