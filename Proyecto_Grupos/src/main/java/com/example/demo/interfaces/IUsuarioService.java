package com.example.demo.interfaces;

import com.example.demo.model.Usuario;

public interface IUsuarioService {
	public void añadirUsuario(Usuario user);
	public boolean chechkbyid(String usuario);
	public String checkByPassword(String id);
}
