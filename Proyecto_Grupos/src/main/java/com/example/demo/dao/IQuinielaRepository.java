package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Quiniela;

public interface IQuinielaRepository extends CrudRepository<Quiniela, Integer> {

	//Quiniela findByJornada(int jornada);
	
	@Query(value="SELECT * FROM quinielas WHERE jornada = :jornada", nativeQuery=true)
	public Optional<List<Quiniela>> findbyJornada(@Param("jornada")int id_categoria);
	
	@Query(value="SELECT * FROM quinielas WHERE id_categoria = :id_categoria", nativeQuery=true)
	public Optional<List<Quiniela>> findbyIdCategoria(@Param("id_categoria")int id_categoria);
	
	@Query(value="SELECT * FROM quinielas WHERE id_categoria = :id_categoria AND = :jornada", nativeQuery=true)
	public Optional<List<Quiniela>> findbyIdCategoriaAndJornada(@Param("id_categoria")int id_categoria, @Param("jornada")int jornada);
}
