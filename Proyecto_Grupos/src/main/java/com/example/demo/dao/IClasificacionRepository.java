package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Clasificacion;

public interface IClasificacionRepository extends CrudRepository<Clasificacion, String> {

	Iterable<Clasificacion> findAll(Sort sort);
	
	@Query(value="Select * from clasificacion where id_categoria = :id_categoria order by puntos DESC", nativeQuery=true)
	public Optional<List<Clasificacion>> findByCategoria(@Param("id_categoria")int id);
}
