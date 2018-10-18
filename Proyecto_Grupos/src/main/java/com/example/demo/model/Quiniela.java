package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quinielas")
public class Quiniela implements Serializable{
	@Id  //ponerselo al primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_quinielas") //en teoria no hace falta en este caso si coincide el nombre
	private int id_quiniela;
	
	@Column(name="id_categoria")
	private int id_categoria;
	
	@Column(name="jornada")
	private int jornada;
	
	@Column(name="posibilidad_local")
	private double posibilidad_local;
	
	@Column(name="posibilidad_empate")
	private double posibilidad_empate;
	
	@Column(name="posibilidad_visitante")
	private double posibilidad_visitante;
	
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

	public double getPosibilidad_local() {
		return posibilidad_local;
	}

	public void setPosibilidad_local(double posibilidad_local) {
		this.posibilidad_local = posibilidad_local;
	}

	public double getPosibilidad_empate() {
		return posibilidad_empate;
	}

	public void setPosibilidad_empate(double posibilidad_empate) {
		this.posibilidad_empate = posibilidad_empate;
	}

	public double getPosibilidad_visitante() {
		return posibilidad_visitante;
	}

	public void setPosibilidad_visitante(double posibilidad_visitante) {
		this.posibilidad_visitante = posibilidad_visitante;
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
