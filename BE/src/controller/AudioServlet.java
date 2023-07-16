package controller;

import java.io.IOException;
import java.util.stream.Collectors;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.Audio;
import service.AudioService;

@WebServlet("/audio/*")
public class AudioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private AudioService audioService;
    private Gson gson;

    public AudioServlet() {
        super();
        audioService = new AudioService();
        gson = new Gson();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        Long id = Long.valueOf(pathInfo.substring(1));
        try {
            Audio audio = audioService.getById(id.intValue());
            if (audio.getId() == 0) {
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

    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	    request.setCharacterEncoding("UTF-8"); 
        String requestData = request.getReader().lines().collect(Collectors.joining());
        Audio audio = gson.fromJson(requestData, Audio.class);
        try {
            Audio currentAudio = audioService.getById(audio.getId());
            if (currentAudio.getId() == 0) {
                throw new ServletException("Audio inexistente");
            }
            audioService.save(audio);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        Long id = Long.valueOf(pathInfo.substring(1));
        try {
            Audio audio = audioService.getById(id.intValue());
            if (audio.getId() == 0) {
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

    protected void doOptions(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.doOptions(req, resp);
    }
}
