package service;

import data.UsuarioRepository;

public class AuthService {

	UsuarioRepository usuarioRepository = new UsuarioRepository();

	public boolean validateAuthToken(String email, String token) throws Exception {
		return usuarioRepository.validateAuthToken(email, token);
	}

}
