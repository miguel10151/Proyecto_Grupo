package com.example.demo.interfaces;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Quiniela;

public interface IQuinielaService {
	
	public List<Quiniela> listarPorJornada(int jornada);
	public List<Quiniela> listarPorCategoria(int categoria);
	public List<Quiniela> listarquinielas();
//	public List<Quiniela> listarPorJornadaYCategoria(int jornada, int categoria);

	public List<Quiniela> listarlistaPorJornada(List<Quiniela> lista, int jornada);
	public List<Quiniela> listarlistaPorCategoria(List<Quiniela> lista, int id_categoria);

}
