package br.edu.infnet.appaluguelcarros.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appaluguelcarros.model.domain.Locacao;
import br.edu.infnet.appaluguelcarros.model.domain.Usuario;
import br.edu.infnet.appaluguelcarros.model.domain.Veiculo;
import br.edu.infnet.appaluguelcarros.model.service.ClienteService;
import br.edu.infnet.appaluguelcarros.model.service.LocacaoService;
import br.edu.infnet.appaluguelcarros.model.service.VeiculoService;

@Controller
public class LocacaoController {
	@Autowired
	private LocacaoService locacaoService;
	@Autowired
	private VeiculoService veiculoService;
	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping(value="/locacao")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("veiculos", veiculoService.obterLista(usuario));
		model.addAttribute("clientes", clienteService.obterLista(usuario));
		return "locacao/cadastro";
	}
	
	@GetMapping(value="/locacoes")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {		
		model.addAttribute("listaLocacao", locacaoService.obterLista(usuario));
		return "locacao/lista";
	}
	
	@PostMapping(value="/locacao/incluir")
	public String incluir(Model model, @RequestParam String[] veiculosIds, Locacao locacao, @SessionAttribute("user") Usuario usuario) {
		List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
		locacao.setUsuario(usuario);
		for(String idVeiculo : veiculosIds) {
			listaVeiculos.add(veiculoService.obterPorId(Integer.valueOf(idVeiculo)));
		}
		locacao.setVeiculos(listaVeiculos);
		locacaoService.incluir(locacao);

		model.addAttribute("descricao", locacao.getDescricao());
		return telaLista(model, usuario);
	}
	
	@GetMapping(value="/locacao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		locacaoService.excluir(id);
		
		return "redirect:/locacoes";
			
	}
}
