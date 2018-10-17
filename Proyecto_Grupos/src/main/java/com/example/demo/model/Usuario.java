package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario") //aqui el nombre de la tabla
public class Usuario implements Serializable{
	
	@Id  //ponerselo al primary key
	@Column(name="nick") 
	private String nick;
	
	@Column(name="password")
	private String password;
	
	@Column(name="mail")
	private String mail;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nick, String password, String mail) {
		super();
		this.nick = nick;
		this.password = password;
		this.mail = mail;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
