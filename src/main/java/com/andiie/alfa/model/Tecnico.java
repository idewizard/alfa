package com.andiie.alfa.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tecnico extends Usuario {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String nivelAcesso;
	
	@ElementCollection
	private List<Chamado> chamadosAtendidos;
	
	public String getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	public List<Chamado> getChamadosAtendidos() {
		return chamadosAtendidos;
	}
	public void setChamadosAtendidos(List<Chamado> chamadosAtendidos) {
		this.chamadosAtendidos = chamadosAtendidos;
	}
	
	
	
}
