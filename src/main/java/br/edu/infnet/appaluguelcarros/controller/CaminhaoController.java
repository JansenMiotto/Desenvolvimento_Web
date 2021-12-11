package br.edu.infnet.appaluguelcarros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appaluguelcarros.model.domain.Caminhao;
import br.edu.infnet.appaluguelcarros.model.domain.Usuario;
import br.edu.infnet.appaluguelcarros.model.service.CaminhaoService;

@Controller
public class CaminhaoController {

	@Autowired
	private CaminhaoService caminhaoService;
	
	
	@GetMapping(value="/caminhao")
	public String telaCadastro() {
		return "caminhao/caminhao";
	}
	
	
	@GetMapping(value="/caminhoes")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {		
		model.addAttribute("listaCaminhao", caminhaoService.obterLista(usuario));
		return "caminhao/lista";
	}
	
	@PostMapping(value="/caminhao/incluir")
	public String incluir(Model model, Caminhao caminhao, @SessionAttribute("user") Usuario usuario) {
		caminhao.setUsuario(usuario);
		caminhaoService.incluir(caminhao);
		model.addAttribute("nome", caminhao.getNomeCarro());
		return telaLista(model, usuario);
	}
	
	@GetMapping(value="/caminhao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		caminhaoService.excluir(id);
		return "redirect:/caminhoes";
			
	}
	
	
}
