package com.andiie.alfa.controller;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.andiie.alfa.model.Chamado;
import com.andiie.alfa.model.Solicitante;
import com.andiie.alfa.model.StatusChamado;
import com.andiie.alfa.model.Tecnico;
import com.andiie.alfa.model.UrgenciaChamado;
import com.andiie.alfa.repository.ChamadoRepository;


@Controller
public class HomeController {
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	@GetMapping("/home")
	public String home(Model model) {		
		
//		Solicitante loja01 = new Solicitante();
//		Tecnico tec01 = new Tecnico();
//		
//		loja01.setCargoSolicitante("gerente");
//		loja01.setLoginUsuario("loginlj01");
//		loja01.setLojaSolicitante("loja01login");
//		loja01.setSenhaUsuario(123456);
//		loja01.setNomeUsuario("Thiago");
//		
//		tec01.setLoginUsuario("tec01login");
//		tec01.setNivelAcesso("admin");
//		tec01.setSenhaUsuario(999999);
//		tec01.setNomeUsuario("Andre");
//		
//		Chamado chamados = new Chamado();
//		
//		chamados.setDataAberturaChamado(LocalDate.EPOCH);
//		chamados.setDescricaoChamado("Descricao chamado");
//		chamados.setPrazoChamado(LocalDate.EPOCH);
//		chamados.setPrimeiroAcesso(false);
//		chamados.setTecnicoResponsavel(tec01);
//		chamados.setSolicitanteChamado(loja01);
//		chamados.setTituloChamado("Titulo do chamado");
//		chamados.setUrgenciaChamado(UrgenciaChamado.BAIXA);
//		chamados.setStatusChamado(StatusChamado.ABERTO);
//		
//		chamadoRepository.save(chamados);
		
		List<Chamado> chamados = chamadoRepository.findAll();
		
		model.addAttribute("chamados",chamados);
		
		return "/home";
	}

}
