package com.andiie.alfa.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Solicitante extends Usuario {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String lojaSolicitante;
	private String cargoSolicitante;
	@ElementCollection
	private List<Chamado> historicoChamadosAbertos;
	
	public List<Chamado> getHistoricoChamadosAbertos() {
		return historicoChamadosAbertos;
	}
	public void setHistoricoChamadosAbertos(List<Chamado> historicoChamadosAbertos) {
		this.historicoChamadosAbertos = historicoChamadosAbertos;
	}
	public String getLojaSolicitante() {
		return lojaSolicitante;
	}
	public void setLojaSolicitante(String lojaSolicitante) {
		this.lojaSolicitante = lojaSolicitante;
	}
	public String getCargoSolicitante() {
		return cargoSolicitante;
	}
	public void setCargoSolicitante(String cargoSolicitante) {
		this.cargoSolicitante = cargoSolicitante;
	}
	
	
	
}
