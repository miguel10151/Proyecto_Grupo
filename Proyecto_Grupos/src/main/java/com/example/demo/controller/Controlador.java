package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaces.IUsuarioService;
import com.example.demo.model.Usuario;

@Controller
public class Controlador {

	@Autowired
	private IUsuarioService usuariosservice;
	
	@RequestMapping("/")
	public String index(HttpServletRequest req, HttpSession session) {
		System.err.println("entra");
		if(session.getAttribute("usuario")==null) {
		boolean registrado=false;
		session.setAttribute("registrado",registrado);
		}
		return "index";
	}
	
	@RequestMapping("formulario")
	public String intermedio(HttpServletRequest req) {
		String mensaje="";
		req.setAttribute("mensaje",mensaje );
		return "iniciarusuario";
	}
	
	@RequestMapping("formulario2")
	public String intermedio2(HttpServletRequest req) {
		String mensaje="";
		req.setAttribute("mensaje",mensaje );
		return "altausuario";
	}
	
	@RequestMapping("/altausuario")
	public String alta(HttpServletRequest req) {
		System.err.println("entra");
		String user=req.getParameter("user");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		
		String mensaje = "";
		
		if(user.trim().length()==0|| password.trim().length()==0|| email.trim().length()==0) {
			mensaje="Introduce los datos";
		}else {
			if(!usuariosservice.chechkbyid(user)) {
				mensaje="Usuario insertado";
				Usuario u = new Usuario(user, password, email);
				usuariosservice.añadirUsuario(u);
			}else {
				mensaje="Usuario ya existe";
			}
		}
		req.setAttribute("mensaje", mensaje);
		return "iniciarusuario";
	}
	
	@RequestMapping("/iniciarusuario")
	public String iniciarusuario(HttpServletRequest req, HttpSession session) {
		String user=req.getParameter("user");
		String password=req.getParameter("password");
		String mensaje = "";
		String passver="";
		
		
		if(usuariosservice.chechkbyid(user)) {
		passver=usuariosservice.checkByPassword(user);
		}
		if(user.trim().length()==0|| password.trim().length()==0) {
			mensaje="Introduce los datos";
		}else {
			
			if(usuariosservice.chechkbyid(user)&&passver.equals(password)) {
				boolean registrado=true;
				session.setAttribute("usuario", user);
				session.setAttribute("registrado", registrado);
				return index(req, session);
			}else {
				mensaje="no existe este usuario";
			}
			
			}
		req.setAttribute("mensaje", mensaje);
		return "iniciarusuario"; 
	}
}
