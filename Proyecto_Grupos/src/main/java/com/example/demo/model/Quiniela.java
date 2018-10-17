package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quinielas")
public class Quiniela {
	@Id  //ponerselo al primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_quiniela") //en teoria no hace falta en este caso si coincide el nombre
	private int id_quiniela;
	
	@Column(name="id_categoria")
	private int id_categoria;
	
	@Column(name="jornada")
	private int jornada;
	
	@Column(name="posibilidad")
	private double posibilidad;
	
	@Column(name="fecha_jornada")
	private String fecha_jornada;
	
	@Column(name="resultado")
	private String resultado;
	
	@Column(name="partido")
	private String partido;

	public int getId_quiniela() {
		return id_quiniela;
	}

	public void setId_quiniela(int id_quiniela) {
		this.id_quiniela = id_quiniela;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public int getJornada() {
		return jornada;
	}

	public void setJornada(int jornada) {
		this.jornada = jornada;
	}

	public double getPosibilidad() {
		return posibilidad;
	}

	public void setPosibilidad(double posibilidad) {
		this.posibilidad = posibilidad;
	}

	public String getFecha_jornada() {
		return fecha_jornada;
	}

	public void setFecha_jornada(String fecha_jornada) {
		this.fecha_jornada = fecha_jornada;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}
	
	
}
