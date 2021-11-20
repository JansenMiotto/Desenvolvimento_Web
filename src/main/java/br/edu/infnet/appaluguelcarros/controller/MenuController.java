package br.edu.infnet.appaluguelcarros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {


	
	@GetMapping(value ="/economico")
	public String telaEconomico() {
		return "economico/economico";
	}

	@GetMapping(value ="/caminhao")
	public String telaCaminhao() {
		return "caminhao/caminhao";
	}
	
	@GetMapping(value ="/suv")
	public String telaSuv() {
		return "suv/suv";
	}

	
	
}
