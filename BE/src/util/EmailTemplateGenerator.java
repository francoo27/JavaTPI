package util;

import java.util.List;

import entity.Asiento;
import entity.CompraDTO;

public class EmailTemplateGenerator {

	public static class TemplateGenerator {

		public static String generateCompraTemplate(CompraDTO compra) {
	        StringBuilder template = new StringBuilder();
	        template.append("<!DOCTYPE html>");
	        template.append("<html>");
	        template.append("<head>");
	        template.append("<title>Compra de Tickets</title>");
	        template.append("</head>");
	        template.append("<body>");
	        template.append("<h1>Confirmación de Compra</h1>");
	        template.append("<p>¡Gracias por tu compra!</p>");

	        template.append("<table>");
	        template.append("<tr>");
	        template.append("<th>Función:</th>");
	        template.append("<td>").append(compra.getFuncion().getNombre()).append("</td>");
	        template.append("</tr>");
	        template.append("<tr>");
	        template.append("<tr>");
	        template.append("<th>Nombre del Comprador:</th>");
	        template.append("<td>").append(compra.getNombre()).append("</td>");
	        template.append("</tr>");
	        template.append("</table>");

	        template.append("<h2>Tickets Comprados:</h2>");

	        template.append("<table>");
	        template.append("<thead>");
	        template.append("<tr>");
	        template.append("<th>#</th>");
	        template.append("<th>Asiento</th>");
	        template.append("<th>Tipo</th>");
	        template.append("</tr>");
	        template.append("</thead>");
	        template.append("<tbody>");

	        int index = 1;
	        List<Asiento> asientosComprados = compra.getAsientos();
	        for (Asiento asiento : asientosComprados) {
	            template.append("<tr>");
	            template.append("<td>").append(index++).append("</td>");
	            template.append("<td>").append(asiento.getNombre()).append("</td>");
	            template.append("<td>").append(asiento.getAdaptado() == 1 ? "Adaptado" : "Comun").append("</td>");
	            template.append("</tr>");
	        }

	        template.append("</tbody>");
	        template.append("</table>");

	        template.append("</body>");
	        template.append("</html>");

	        return template.toString();
	    }
	}

}
