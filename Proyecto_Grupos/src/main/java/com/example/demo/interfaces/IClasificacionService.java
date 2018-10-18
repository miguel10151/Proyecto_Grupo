package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.model.Clasificacion;



public interface IClasificacionService {
	
	public List<Clasificacion> listarUsuarios();

	public List<Clasificacion> listarClasificacionCategoria(int id_categoria); 
}
