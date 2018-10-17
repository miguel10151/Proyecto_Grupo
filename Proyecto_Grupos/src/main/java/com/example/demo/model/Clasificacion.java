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
@Table(name="clasificacion")
public class Clasificacion implements Serializable {
	
	@Id
	@Column(name="nick")
	private String nick;
	
	@Column(name="puntos")
	private int puntos;
	
	@Column(name="perfecto")
	private int perfecto;

	@Column(name="ganado")
	private int ganado;

	@Column(name="id_categoria")
	private int id_categoria;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getPerfecto() {
		return perfecto;
	}

	public void setPerfecto(int perfecto) {
		this.perfecto = perfecto;
	}

	public int getGanado() {
		return ganado;
	}

	public void setGanado(int ganado) {
		this.ganado = ganado;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	
	
}
