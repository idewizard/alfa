package com.andiie.alfa.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;


@Entity
public class Chamado {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String tituloChamado;
	@NotNull
	private String descricaoChamado;
	private LocalDate dataAberturaChamado;
	private LocalDate prazoChamado;
	private boolean primeiroAcesso;
	
	
	//private anexos, n sei como fazer
	
	@OneToOne(cascade=CascadeType.PERSIST)
	private Solicitante solicitante;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	private Tecnico tecnico;
	
	@ElementCollection
	private List<String> historicoMensagensChamado;
	
	@ElementCollection
	private List<StatusChamado> historicoStatusChamado;
	
	@Enumerated(EnumType.STRING)
	private UrgenciaChamado urgenciaChamado;
	
	@Enumerated(EnumType.STRING)
	private StatusChamado statusChamado;

	public String getTituloChamado() {
		return tituloChamado;
	}

	public void setTituloChamado(String tituloChamado) {
		this.tituloChamado = tituloChamado;
	}

	public String getDescricaoChamado() {
		return descricaoChamado;
	}

	public void setDescricaoChamado(String descricaoChamado) {
		this.descricaoChamado = descricaoChamado;
	}

	public LocalDate getDataAberturaChamado() {
		return dataAberturaChamado;
	}

	public void setDataAberturaChamado(LocalDate dataAberturaChamado) {
		this.dataAberturaChamado = dataAberturaChamado;
	}

	public Solicitante getSolicitanteChamado() {
		return solicitante;
	}

	public void setSolicitanteChamado(Solicitante solicitanteChamado) {
		this.solicitante = solicitanteChamado;
	}

	public LocalDate getPrazoChamado() {
		return prazoChamado;
	}

	public void setPrazoChamado(LocalDate prazoChamado) {
		this.prazoChamado = prazoChamado;
	}

	public boolean isPrimeiroAcesso() {
		return primeiroAcesso;
	}

	public void setPrimeiroAcesso(boolean primeiroAcesso) {
		this.primeiroAcesso = primeiroAcesso;
	}

	public Tecnico getTecnicoResponsavel() {
		return tecnico;
	}

	public void setTecnicoResponsavel(Tecnico tecnicoResponsavel) {
		this.tecnico = tecnicoResponsavel;
	}

	public List<String> getHistoricoMensagensChamado() {
		return historicoMensagensChamado;
	}

	public void setHistoricoMensagensChamado(List<String> historicoMensagensChamado) {
		this.historicoMensagensChamado = historicoMensagensChamado;
	}

	public List<StatusChamado> getHistoricoStatusChamado() {
		return historicoStatusChamado;
	}

	public void setHistoricoStatusChamado(List<StatusChamado> historicoStatusChamado) {
		this.historicoStatusChamado = historicoStatusChamado;
	}

	public UrgenciaChamado getUrgenciaChamado() {
		return urgenciaChamado;
	}

	public void setUrgenciaChamado(UrgenciaChamado urgenciaChamado) {
		this.urgenciaChamado = urgenciaChamado;
	}

	public StatusChamado getStatusChamado() {
		return statusChamado;
	}

	public void setStatusChamado(StatusChamado statusChamado) {
		this.statusChamado = statusChamado;
	}
	
	
	
}
