package br.edu.infnet.appaluguelcarros.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.appaluguelcarros.model.domain.Usuario;
import br.edu.infnet.appaluguelcarros.model.service.CaminhaoService;
import br.edu.infnet.appaluguelcarros.model.service.ClienteService;
import br.edu.infnet.appaluguelcarros.model.service.EconomicoService;
import br.edu.infnet.appaluguelcarros.model.service.LocacaoService;
import br.edu.infnet.appaluguelcarros.model.service.SuvService;
import br.edu.infnet.appaluguelcarros.model.service.UsuarioService;
import br.edu.infnet.appaluguelcarros.model.service.VeiculoService;


@SessionAttributes("user")
@Controller
public class AcessoController2 {
	
	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private EconomicoService economicoService;
	
	@Autowired
	private SuvService suvService;
	
	@Autowired
	private CaminhaoService caminhaoService;
	
	@Autowired
	private VeiculoService veiculoService;
	
	@Autowired
	private LocacaoService locacaoService;
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
	@GetMapping(value = "/home")
	public String telaHome() {
		return "home";
	}

	@GetMapping(value = "/app")
	public String telaApp(Model model) {
		Map<String, Integer> mapaApp = new HashMap<String, Integer>();
		mapaApp.put("Usuarios", usuarioService.getQtde());
		mapaApp.put("Clientes", clienteService.getQtde());
		mapaApp.put("Economicos", economicoService.getQtde());
		mapaApp.put("Suvs", suvService.getQtde());
		mapaApp.put("Caminhoes", caminhaoService.getQtde());
		mapaApp.put("Veiculos", veiculoService.getQtde());
		mapaApp.put("Locacoes", locacaoService.getQtde());
		
		model.addAttribute("mapa", mapaApp);
		
		return "app";
	}
	
	@GetMapping(value = "/logout")
	public String telaLogout(HttpSession session, SessionStatus status) {
		status.setComplete();
		session.removeAttribute("user");
		return "redirect:/";
	}
	
	@GetMapping(value = "/")
	public String telaIndex() {
		return "index";
	}
	
	@PostMapping(value = "/login")
	public String telaIndex(Model model, @RequestParam String email, @RequestParam String senha) {
		Usuario usuario = usuarioService.autenticacao(email, senha);
		
		
		if(usuario != null) {
			model.addAttribute("user", usuario);
			return "index";
		} else {
			model.addAttribute("msg", "Autenticação Inválida");
			return "login";
		}
	}
}
