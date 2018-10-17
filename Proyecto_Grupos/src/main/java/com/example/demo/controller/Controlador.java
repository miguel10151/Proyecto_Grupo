package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.interfaces.ICategoriaService;
import com.example.demo.interfaces.IClasificacionService;
import com.example.demo.interfaces.IQuinielaJugadorService;
import com.example.demo.interfaces.IQuinielaService;
import com.example.demo.interfaces.IUsuarioService;
import com.example.demo.model.Quiniela;
import com.example.demo.model.Usuario;
import com.example.demo.services.QuinielaService;

@Controller
public class Controlador {

	
	//@Autowired
	//private IClasificacionService clasificacionService;
	
	//@Autowired
	//private IQuinielaJugadorService quinielaJugadorService;
	
	@Autowired
	private IQuinielaService quinielaService;
	
	//@Autowired
	//private ICategoriaService categoriaService;
	
	//@Autowired
	//private IUsuarioService usuarioService;
	
	@RequestMapping("/") //http://localhost:8080/   index se ejecutaria al meter esa url 
	public ModelAndView inicio(HttpServletRequest req){
		System.err.println("Entra en index.jsp");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("index");
		List<Quiniela> lista_ultima_quiniela = quinielaService.listarquinielas();
		for(Quiniela q:lista_ultima_quiniela)
		{
			System.out.println(q.getId_quiniela());
		}
		//System.out.println(lista_ultima_quiniela);
		Quiniela ultima_quiniela = lista_ultima_quiniela.get(lista_ultima_quiniela.size()-1);
		System.out.println(ultima_quiniela.toString());
		int jornada = ultima_quiniela.getJornada();
		System.out.println("jornada: " + jornada);
		List<Quiniela> aux_lista=quinielaService.listarlistaPorCategoria(lista_ultima_quiniela, 1);
		for(Quiniela q:aux_lista)
		{
			System.out.println(q.getId_quiniela());
		}
		//System.out.println(aux_lista);
		lista_ultima_quiniela = quinielaService.listarlistaPorJornada(aux_lista, jornada);
		for(Quiniela q:lista_ultima_quiniela)
		{
			System.out.println(q.getId_quiniela());
		}
		//System.out.println(lista_ultima_quiniela);
		//lista_ultima_quiniela = quinielaService.listarPorJornadaYCategoria(jornada, 1);// TODO; de momento solo muestra la categoria 1
		modelAndView.addObject("lista_ultima_quiniela", lista_ultima_quiniela);
		return modelAndView; 
	}
	
	/*
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
	}*/
}
