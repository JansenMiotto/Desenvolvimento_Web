package br.edu.infnet.appaluguelcarros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaluguelcarros.exception.QtdeCondutoresException;
import br.edu.infnet.appaluguelcarros.model.domain.Economico;
import br.edu.infnet.appaluguelcarros.model.service.EconomicoService;

@Component
public class VeiculoLoader implements ApplicationRunner{
	@Autowired
	private EconomicoService economicoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		try {
			Economico eco = new Economico("Celta", "Pa", 5, true, 50);
			eco.setArCondicionado(true);
			eco.setAutomatico(false);
			eco.setQtdeCondutores(1);
			economicoService.incluir(eco);
		} catch (QtdeCondutoresException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
