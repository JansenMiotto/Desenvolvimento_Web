package br.edu.infnet.appaluguelcarros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaluguelcarros.model.domain.Caminhao;
import br.edu.infnet.appaluguelcarros.model.domain.Economico;
import br.edu.infnet.appaluguelcarros.model.domain.Suv;
import br.edu.infnet.appaluguelcarros.model.domain.Usuario;
import br.edu.infnet.appaluguelcarros.model.service.CaminhaoService;
import br.edu.infnet.appaluguelcarros.model.service.EconomicoService;
import br.edu.infnet.appaluguelcarros.model.service.SuvService;

@Component
@Order(3)
public class VeiculoLoader implements ApplicationRunner{
	@Autowired
	private EconomicoService economicoService;
	@Autowired
	private SuvService suvSevice;
	@Autowired
	private CaminhaoService caminhaoService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Economico eco = new Economico("Celta", "Vermelho", 5, true, 50);
		eco.setArCondicionado(true);
		eco.setAutomatico(false);
		eco.setQtdeCondutores(1);
		eco.setUsuario(usuario);
		economicoService.incluir(eco);
		
		Suv suv = new Suv("Honda BR-V", "Preto", 5, true, 130);
		suv.setMotor(2.6f);
		suv.setSeguro(true);
		suv.setTotalPassageiros(6);
		suv.setUsuario(usuario);
		suvSevice.incluir(suv);
		
		Caminhao truck = new Caminhao("Carreta", "Branco", 5, true, 200);
		truck.setCambioAutomatico(false);
		truck.setQtdeEixo(5);
		truck.setTipoCarroceria("Bau");
		truck.setUsuario(usuario);
		caminhaoService.incluir(truck);
		
	}

}
