package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.UUID;

public class UsuarioRepository {

	public boolean authenticate(String email, String token) throws Exception {
	    String query = "SELECT * FROM usuario WHERE email = ? AND token = ?";
	    try (Connection conn = FactoryConection.getInstancia().getConn();
	         PreparedStatement stmt = conn.prepareStatement(query)) {
	        stmt.setString(1, email);
	        stmt.setString(2, token);
	        try (ResultSet rs = stmt.executeQuery()) {
	            if (rs.next()) {
	                Timestamp tokenValidUntil = rs.getTimestamp("token_valid_until");
	                Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
	                if (tokenValidUntil == null || tokenValidUntil.before(currentTimestamp)) {
	                    clearTokenAndTimestamp(email);
	                    return false;
	                }
	                return true;
	            }
	            return false;
	        }
	    } catch (Exception e) {
	        throw e;
	    }
	}

	private void clearTokenAndTimestamp(String email) throws Exception {
	    String updateQuery = "UPDATE usuario SET token = NULL, token_valid_until = NULL WHERE email = ?";
	    try (Connection conn = FactoryConection.getInstancia().getConn();
	         PreparedStatement stmt = conn.prepareStatement(updateQuery)) {
	        stmt.setString(1, email);
	        stmt.executeUpdate();
	    } catch (Exception e) {
	        throw e;
	    }
	}

	public void logout(String email) throws Exception {
		String query = "UPDATE usuario SET token = NULL, token_valid_until = NULL WHERE email = ?";
		try (Connection conn = FactoryConection.getInstancia().getConn();
				PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, email);
			stmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}

    public String login(String email, String password) throws Exception {
        if (!validateCredentials(email, password)) {
            throw new Exception("Credenciales inválidas");
        }

        String token = generateToken();
        Timestamp tokenValidUntil = calculateTokenValidUntil();

        String query = "UPDATE usuario SET token = ?, token_valid_until = ? WHERE email = ?";
        try (Connection conn = FactoryConection.getInstancia().getConn();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, token);
            stmt.setTimestamp(2, tokenValidUntil);
            stmt.setString(3, email);
            stmt.executeUpdate();
        } catch (Exception e) {
            throw e;
        }

        return token;
    }

    private boolean validateCredentials(String email, String password) throws Exception {
        String query = "SELECT * FROM usuario WHERE email = ? AND password = ?";
        try (Connection conn = FactoryConection.getInstancia().getConn();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, email);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        } catch (Exception e) {
            throw e;
        }
    }

	private String generateToken() {
		return UUID.randomUUID().toString();
	}

	private Timestamp calculateTokenValidUntil() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR_OF_DAY, 1);
		return new Timestamp(calendar.getTimeInMillis());
	}

}
