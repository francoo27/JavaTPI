package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class UsuarioRepository {
	
	public boolean validateAuthToken(String email, String token) throws Exception {
	    String query = "SELECT * FROM java_tpi.usuario WHERE email = ? AND token = ? AND token_valid_until >= current_timestamp()";
	    try (Connection conn = FactoryConection.getInstancia().getConn();
	        PreparedStatement stmt = conn.prepareStatement(query)) {
	        stmt.setString(1, email);
	        stmt.setString(2, token);
	        try (ResultSet rs = stmt.executeQuery()) {
	            return rs.next();
	        }
	    } catch (Exception e) {
	        throw e;
	    }
	}

}
