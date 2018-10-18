package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.example.demo.interfaces.IClasificacionService;

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
	private IClasificacionService clasificacionService;
	
	//@Autowired
	//private IQuinielaJugadorService quinielaJugadorService;
	
	@Autowired
	private IQuinielaService quinielaService;
	
	@Autowired
	private IClasificacionService clasificacionservice;
	
	/*@RequestMapping("/")
	public String index(HttpServletRequest req, HttpSession session) {
		System.err.println("entra");
		if(session.getAttribute("usuario")==null) {
		boolean registrado=false;
		session.setAttribute("registrado",registrado);
		}
	}*/
	//@Autowired
	//private ICategoriaService categoriaService;
	
	@Autowired
	private IUsuarioService usuariosservice;
	
	@RequestMapping("/") //http://localhost:8080/   index se ejecutaria al meter esa url 
	public ModelAndView inicio(HttpServletRequest req ){
		System.err.println("Entra en index.jsp");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("index");
		List<Quiniela> lista_ultima_quiniela = quinielaService.listarquinielas();//TODO:modular el sacar la lista
		//por jornada y categoria. y otro para sacar la jornada segun la categoria
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
	
	
	@RequestMapping("clasificacioncategoria")
	public ModelAndView clasificacioncategoria(HttpServletRequest req) {
		System.err.println("Entra en clasifacioncategoria.jsp");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("clasificacioncategoria");
		modelAndView.addObject("lista_clasi__categoria", clasificacionService.listarClasificacionCategoria(Integer.parseInt(req.getParameter("categoria"))));
		return modelAndView;//TODO:descomentar el add.object cuando este implementado el service, y testearlo 
	}
	
	@RequestMapping("quinielacategoria")
	public ModelAndView quinielacategoria(HttpServletRequest req) {
		System.err.println("Entra en quinielacategoria.jsp");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("quinielacategoria");
		//modelAndView.addObject("lista_quiniela_categoria", quinielaService.listarPorCategoria(Integer.parseInt(req.getParameter("categoria")))); 
		return modelAndView; //TODO:descomentar el add.object cuando este implementado el service, y testearlo 
	}
	
	@RequestMapping("formularioquiniela")
	public ModelAndView creandoquiniela(HttpServletRequest req) { //esta pagina solo se espera cuando se pulse el submit
		System.err.println("Entra en formularioquiniela.jsp");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("formularioquiniela");
		String mensaje="";
		//TODO:falta mostrar el formulario y almacenar jornada y id_categoria
		int id_categoria = Integer.parseInt(req.getParameter("id_categoria"));//TODO:mirar que se pase por el jsp
		//TODO:aqui buscar
		
		
		req.setAttribute("id_categoria",id_categoria );
		//req.setAttribute("jornada",jornada ); almacenar aqui la ultima jornada. supongo que lo mejor es
		// hacer un metodo que haga exclusivamente eso
		req.setAttribute("mensaje",mensaje );//TODO:falta meter en mensaje en "comprobarcreacionquiniela"
		return modelAndView;
	}
	
	@RequestMapping("comprobarcreacionquiniela")
	public ModelAndView comprobarcreacionquiniela(HttpServletRequest req, HttpSession session) { //esta pagina solo se espera cuando se pulse el submit
		System.err.println("Entra en comprobarcreacionquiniela.jsp");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("formularioquiniela");
		String mensaje="";
		//comprobar la quiniela, meter datos a quinielausuario y actualizar mensaje
		
		session.getAttribute("user");
		String nick = (String) session.getAttribute("user");;
		int resultado = Integer.parseInt(req.getParameter("resultado"));
		
		//int jornada = Integer.parseInt(req.getParameter("jornada")); //TODO:cambiar a ultima jornada
		int id_categoria = Integer.parseInt(req.getParameter("id_categoria"));
		//QuinielaJugador quiniela_jugador = new QuinielaJugador(nick, resultado, jornada, id_categoria);/TODO:falta
		//la jornada. por el metodo de formularioquiniela.
		
		
		//quinielaJugadorService.añadirQuinielaJugador(quiniela_jugador);//TODO descomentar el constructor de arriba
		//comentado, cuando funcione
		mensaje = "Quiniela finalizada correctamente"; //TODO:correo a modo de recibo como que ha comprado la quiniela?
		req.setAttribute("mensaje",mensaje );//TODO:comprobacion de si se mete correctamente? ifs
		return modelAndView;
	}
	//Copio de controlador
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
	
	@RequestMapping("/clasificacion")
	public String clasificacion(HttpServletRequest req) {
		System.err.println("entra");
		
		req.setAttribute("lista",clasificacionservice.listarClasificacion());
		return "clasificacion";
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
	public ModelAndView iniciarusuario(HttpServletRequest req, HttpSession session) {
		String user=req.getParameter("user");
		String password=req.getParameter("password");
		String mensaje = "";
		String passver="";
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("iniciarusuario");
		if(usuariosservice.chechkbyid(user)) {
		passver=usuariosservice.checkByPassword(user);
		}
		if(user.trim().length()==0|| password.trim().length()==0) {
			mensaje="Introduce los datos";
		}else {
			
			if(usuariosservice.chechkbyid(user)&&passver.equals(password)) {
			
				session.setAttribute("usuario", user);
			
				return inicio(req);
			}else {
				mensaje="no existe este usuario";
			}
			
			}
		req.setAttribute("mensaje", mensaje);
		return modelAndView; 
	}
}
