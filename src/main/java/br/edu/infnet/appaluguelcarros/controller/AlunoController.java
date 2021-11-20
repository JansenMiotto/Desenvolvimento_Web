package br.edu.infnet.appaluguelcarros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appaluguelcarros.model.domain.Aluno;
import br.edu.infnet.appaluguelcarros.model.domain.Usuario;
import br.edu.infnet.appaluguelcarros.model.service.AlunoService;

@Controller
public class AlunoController {
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping(value="/veiculo")
	public String telaCadastro() {
		return "veiculo/cadastro";
	}
	
	@GetMapping(value="/veiculos")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {		
		model.addAttribute("listaAlunos", alunoService.obterLista(usuario));
		return "veiculo/lista";
	}
	
	@PostMapping(value="/veiculo/incluir")
	public String incluir(Model model, Aluno aluno, @SessionAttribute("user") Usuario usuario) {
		aluno.setUsuario(usuario);
		alunoService.incluir(aluno);
		model.addAttribute("nome", aluno.getNome());
		return telaLista(model, usuario);
	}
	
	@GetMapping(value="/veiculo/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		alunoService.excluir(id);
		
		return "redirect:/veiculos";
			
	}
}
