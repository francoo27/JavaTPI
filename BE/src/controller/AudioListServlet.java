package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.Audio;
import service.AudioService;

@WebServlet("/audio")
public class AudioListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private AudioService audioService;
    private Gson gson;

    public AudioListServlet() {
        super();
        audioService = new AudioService();
        gson = new Gson();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ArrayList<Audio> audioList = audioService.getAll();
            response.getWriter().write(gson.toJson(audioList));
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String requestData = request.getReader().lines().collect(Collectors.joining());
        Audio audio = gson.fromJson(requestData, Audio.class);

        try {
            audioService.save(audio);
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
    }

    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.doOptions(req, resp);
    }
}
