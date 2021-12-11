package br.edu.infnet.appaluguelcarros;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaluguelcarros.model.domain.Caminhao;
import br.edu.infnet.appaluguelcarros.model.domain.Cliente;
import br.edu.infnet.appaluguelcarros.model.domain.Economico;
import br.edu.infnet.appaluguelcarros.model.domain.Locacao;
import br.edu.infnet.appaluguelcarros.model.domain.Suv;
import br.edu.infnet.appaluguelcarros.model.domain.Usuario;
import br.edu.infnet.appaluguelcarros.model.domain.Veiculo;
import br.edu.infnet.appaluguelcarros.model.service.LocacaoService;

@Component
@Order(4)
public class LocacaoLoader implements ApplicationRunner{
	@Autowired
	private LocacaoService locacaoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {	
		Economico eco = new Economico();
		eco.setId(1);
		
		Suv suv = new Suv();
		suv.setId(2);
		
		Caminhao truck = new Caminhao();
		truck.setId(3);
		
		Cliente cliente = new Cliente();
		cliente.setId(1);
		
	
		List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
		listaVeiculos.add(eco);
		listaVeiculos.add(truck);
		listaVeiculos.add(suv);
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Locacao locacao = new Locacao();
		locacao.setDescricao("Primeira Locacao");
		locacao.setVeiculos(listaVeiculos);
		locacao.setCliente(cliente);
		locacao.setUsuario(usuario);
		
		locacaoService.incluir(locacao);
		
	}

}
