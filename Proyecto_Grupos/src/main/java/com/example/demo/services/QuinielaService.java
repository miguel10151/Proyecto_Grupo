package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IQuinielaRepository;
import com.example.demo.model.Quiniela;

@Service
public class QuinielaService {

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
	public Optional<List<Quiniela>> listarPorCategoria(int id_categoria) {
		Optional<List<Quiniela>> quinielas=quinielaRepository.findbyIdCategoria(id_categoria);
		return quinielas;
	}
	
	@Override
	public Optional<List<Quiniela>> listarPorJornada(int jornada) {
		Optional<List<Quiniela>> quinielas=quinielaRepository.findbyJornada(jornada);
		return quinielas;
	}
	
	@Override
	public Optional<List<Quiniela>> listarPorJornadaYCategoria(int jornada, int categoria) {
		Optional<List<Quiniela>> quinielas=quinielaRepository.findbyIdCategoriaAndJornada(categoria, jornada);
		return quinielas;
	}
}
