package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.web.ResourceProperties.Strategy;

@Entity
@Table(name="categorias")
public class Categoria implements Serializable {
	
	@Id
	@Column(name="id_categoria")
	private int id_categoria;
	
	@Column(name="nombre_deporte")
	private String nombre_deporte;

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNombre_deporte() {
		return nombre_deporte;
	}

	public void setNombre_deporte(String nombre_deporte) {
		this.nombre_deporte = nombre_deporte;
	}

	
}
