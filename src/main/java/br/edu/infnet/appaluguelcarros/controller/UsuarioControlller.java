package br.edu.infnet.appaluguelcarros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appaluguelcarros.model.domain.Endereco;
import br.edu.infnet.appaluguelcarros.model.domain.Usuario;
import br.edu.infnet.appaluguelcarros.model.service.EnderecoService;
import br.edu.infnet.appaluguelcarros.model.service.UsuarioService;

@Controller
public class UsuarioControlller {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private EnderecoService enderecoService;
	
	@PostMapping(value = "/cep")
	public String buscarCep(Model model, @RequestParam String cep) {
		
		model.addAttribute("endereco", enderecoService.obterEnderecoPorCep(cep));
		return "usuario/cadastro";
	}
	
	@GetMapping(value = "/usuario")
	public String telaCadastro() {
		return "usuario/cadastro";
	}
	
	@GetMapping(value = "/usuarios")
	public String telaLista(Model model) {
		model.addAttribute("listaUsuarios", usuarioService.obterLista());
		
		return "usuario/lista";
	}
	
	@PostMapping(value="/usuario/incluir")
	public String incluir(Model model, Usuario usuario, Endereco endereco) {
		usuario.setEndereco(endereco);
		usuarioService.incluir(usuario);
		
		return "index";
	}
	
	@GetMapping(value="/usuario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		usuarioService.excluir(id);
		
		return "redirect:/usuarios";
			
	}	
	
	
	
}
