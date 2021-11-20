package br.edu.infnet.appaluguelcarros.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class EconomicoController {

	@GetMapping(value="/economico")
	public String telaCadastro() {
		return "economico/economico";
	}
	
}
