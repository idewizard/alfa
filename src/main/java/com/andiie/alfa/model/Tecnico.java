package com.andiie.alfa.model;

import java.util.List;

public class Tecnico extends Usuario {

	private String nivelAcesso;
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
