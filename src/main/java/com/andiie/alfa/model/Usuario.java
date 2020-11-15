package com.andiie.alfa.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Usuario {

	private String loginUsuario;
	private int senhaUsuario;
	private String nomeUsuario;
	
	
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getLoginUsuario() {
		return loginUsuario;
	}
	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}
	public int getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(int senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
	
	
}
