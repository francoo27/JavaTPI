package controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


/**
 * Servlet implementation class ImagePostServlet
 */
@WebServlet("/images")
@MultipartConfig(
		  fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
		  maxFileSize = 1024 * 1024 * 10,      // 10 MB
		  maxRequestSize = 1024 * 1024 * 100   // 100 MB
		)
public class ImagePostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String IMAGE_DIRECTORY = "/Images/";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImagePostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String contentType = request.getContentType();

        if (contentType != null && contentType.equals("image/jpeg")) {
            String imageName = generateGUID() + ".jpg";
            String filePath = getImageDirectory() + File.separator + imageName;

            File createdFile = new File(filePath);

            try (InputStream in = request.getInputStream();
                 FileOutputStream out = new FileOutputStream(createdFile)) {
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }

                response.setStatus(HttpServletResponse.SC_OK);
        	    Gson gson = new Gson();
                response.getWriter().write(gson.toJson(imageName));
            } catch (IOException e) {
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                response.getWriter().print("Error uploading image");
            }
        } else {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().print("Invalid image type");
        }
    }

    private String generateGUID() {
        return UUID.randomUUID().toString();
    }

    private String getImageDirectory() {
        return getServletContext().getRealPath(IMAGE_DIRECTORY);
    }

}
