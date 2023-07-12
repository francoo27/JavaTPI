package service;

import java.util.ArrayList;

import data.AsientoRepository;
import data.UsuarioRepository;
import entity.Asiento;

public class AuthService {

	UsuarioRepository usuarioRepository = new UsuarioRepository();

	public boolean validateAuthToken(String email, String token) throws Exception {
		return usuarioRepository.validateAuthToken(email, token);
	}

}
