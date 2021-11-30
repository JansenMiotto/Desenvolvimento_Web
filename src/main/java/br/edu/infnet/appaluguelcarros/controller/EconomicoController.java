package br.edu.infnet.appaluguelcarros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appaluguelcarros.model.domain.Economico;
import br.edu.infnet.appaluguelcarros.model.service.EconomicoService;

@Controller
public class EconomicoController {

	@Autowired
	private EconomicoService economicoService;
	
	
	@GetMapping(value="/cadastro")
	public String telaCadastro() {
		return "economico/economico";
	}
	
	
	@GetMapping(value="/economico")
	public String telaLista(Model model) {		
		model.addAttribute("listaEconomicos", economicoService.obterLista());
		return "economico/lista";
	}
	
	@PostMapping(value="/economico/incluir")
	public String incluir(Model model, Economico economico) {
		
		economicoService.incluir(economico);
		model.addAttribute("nome", economico.getNomeCarro());
		return telaLista(model);
	}
	
	@GetMapping(value="/economico/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		economicoService.excluir(id);
		
		return "redirect:/economicos";
			
	}
	
	
}
