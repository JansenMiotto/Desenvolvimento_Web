package br.edu.infnet.appaluguelcarros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appaluguelcarros.model.domain.Suv;
import br.edu.infnet.appaluguelcarros.model.domain.Usuario;
import br.edu.infnet.appaluguelcarros.model.service.SuvService;

@Controller
public class SuvController {

	@Autowired
	private SuvService suvService;
	
	
	@GetMapping(value="/suv")
	public String telaCadastro() {
		return "suv/suv";
	}
	
	
	@GetMapping(value="/suvs")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {		
		model.addAttribute("listaSuv", suvService.obterLista(usuario));
		return "suv/lista";
	}
	
	@PostMapping(value="/suv/incluir")
	public String incluir(Model model, Suv suv, @SessionAttribute("user") Usuario usuario) {
		
		suv.setUsuario(usuario);
		suvService.incluir(suv);
		model.addAttribute("nome", suv.getNomeCarro());
		return telaLista(model, usuario);
	}
	
	@GetMapping(value="/suv/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		suvService.excluir(id);
		return "redirect:/suvs";
			
	}
	
	
}
