package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUsuariosRepository;
import com.example.demo.interfaces.IUsuarioService;
import com.example.demo.model.Usuario;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private IUsuariosRepository usuariosRepository;
	
	@Override
	public void añadirUsuario(Usuario user) {
		
		usuariosRepository.save(user);	
	}

	@Override
	public boolean chechkbyid(String usuario) {
		// TODO Auto-generated method stub
		
		return usuariosRepository.existsById(usuario);
	}
	
	@Override
	public String checkByPassword(String id) {
		
		String pass = usuariosRepository.findById(id).get().getPassword();
		return pass;
	}
	
}
