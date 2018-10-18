package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IClasificacionRepository;
import com.example.demo.interfaces.IClasificacionService;
import com.example.demo.model.Clasificacion;

@Service
public class ClasificacionService implements IClasificacionService{

	@Autowired
	private IClasificacionRepository clasificacionRepository;
	
	@Override
	public List<Clasificacion> listarUsuarios() {
		List<Clasificacion> clasificacion =new ArrayList();
		for(Clasificacion u: clasificacionRepository.findAll(new Sort(Sort.Direction.DESC, "puntos"))) {
			//System.out.println(u.getUser()+",  "+ u.getPassword()+",  "+ u.getEmail());
			clasificacion.add(u);
		}
		return clasificacion;
	}
	
	@Override
	public List<Clasificacion> listarClasificacionCategoria(int id_categoria) {
		Optional <List<Clasificacion>> o =clasificacionRepository.findByCategoria(id_categoria);
		if(o.isPresent()) {
			return o.get();
		}else {
			return null;
		}	
	}
	
	
}
