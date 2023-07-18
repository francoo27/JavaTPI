package controller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@WebServlet("/images/*")
public class ImageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String IMAGE_DIRECTORY = "/Images/";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        String imageId = pathInfo.substring(1);

        if (imageId == null || imageId.isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        String imageFilePath = getImageDirectory(); // Replace with the actual method to retrieve the image directory path
        System.out.println(imageFilePath);
        // Determine the file extension based on your specific logic
        String extension = determineFileExtension(imageId);

        if (extension == null) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        imageFilePath += "/" + imageId + "." + extension;
        System.out.println(imageFilePath);
        Path imagePath = Paths.get(imageFilePath);

        if (!Files.exists(imagePath) || Files.isDirectory(imagePath)) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        String mimeType = getServletContext().getMimeType(imagePath.getFileName().toString());
        if (mimeType == null) {
            mimeType = "application/octet-stream";
        }

        response.setContentType(mimeType);
        response.setContentLength((int) Files.size(imagePath));

        try (InputStream in = Files.newInputStream(imagePath);
             OutputStream out = response.getOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
    }

    // Custom method to determine the file extension based on the imageId
    private String determineFileExtension(String imageId) {
        String[] extensions = { "jpg", "png" };
        for (String extension : extensions) {
            String filePath = getImageDirectory() + "/" + imageId + "." + extension;
            if (Files.exists(Paths.get(filePath))) {
                return extension;
            }
        }
        return null; // Return null if file with specified extensions not found
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String imageName = generateGUID();

        File imageFile = new File(getImageDirectory(), imageName);

        try (FileOutputStream out = new FileOutputStream(imageFile)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = request.getInputStream().read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }

        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().print(imageName);
    }

    private String generateGUID() {
        return UUID.randomUUID().toString();
    }

    private String getImageDirectory() {
        return getServletContext().getRealPath(IMAGE_DIRECTORY);
    }
}
