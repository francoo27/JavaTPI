package service;

import data.UsuarioRepository;

public class AuthService {

	UsuarioRepository usuarioRepository = new UsuarioRepository();

	public boolean authenticate(String email, String token) throws Exception {
		return usuarioRepository.authenticate(email, token);
	}
	
	public void logout(String email, String token) throws Exception {
		usuarioRepository.logout(email);
	}
	
	public String login(String email, String token) throws Exception {
		return usuarioRepository.login(email, token);
	}

}
