package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IQuinielaRepository;
import com.example.demo.interfaces.IQuinielaService;
import com.example.demo.model.Quiniela;

@Service
public class QuinielaService implements IQuinielaService {

	@Autowired
	IQuinielaRepository quinielaRepository; //aqui estan todos los metodos del dao hechos

	@Override
	public List<Quiniela> listarquinielas() {
		List<Quiniela> quinielas=new ArrayList();
		for(Quiniela q:quinielaRepository.findAll())
		{
			quinielas.add(q);
		}
		return quinielas;
	}

	@Override
	public List<Quiniela> listarPorCategoria(int id_categoria) {
		List<Quiniela> quinielas=(List<Quiniela>)quinielaRepository.findbyIdCategoria(id_categoria).get();
		return quinielas;
	}
	
	@Override
	public List<Quiniela> listarPorJornada(int jornada) {
		List<Quiniela> quinielas=quinielaRepository.findbyJornada(jornada).get();
		return quinielas;
	}
	
	public List<Quiniela> listarlistaPorJornada(List<Quiniela> lista, int id_categoria){
		lista = quinielaRepository.findbyJornada(id_categoria).get();
		return lista;
	}
	
	public List<Quiniela> listarlistaPorCategoria(List<Quiniela> lista, int jornada){
		lista = quinielaRepository.findbyIdCategoria(jornada).get();
		return lista;
	}
	
	/*
	@Override
	public List<Quiniela> listarPorJornadaYCategoria(int jornada, int categoria) {
		List<Quiniela> quinielas=quinielaRepository.findbyIdCategoriaAndJornada(categoria, jornada).get();
		return quinielas;
	}*/
}
