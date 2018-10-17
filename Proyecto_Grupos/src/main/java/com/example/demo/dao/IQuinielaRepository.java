package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Quiniela;

public interface IQuinielaRepository extends CrudRepository<Quiniela, Integer> {

	Quiniela findByJornada(int jornada);
}
