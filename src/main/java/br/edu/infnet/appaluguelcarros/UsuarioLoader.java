package br.edu.infnet.appaluguelcarros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaluguelcarros.model.domain.Endereco;
import br.edu.infnet.appaluguelcarros.model.domain.Usuario;
import br.edu.infnet.appaluguelcarros.model.service.UsuarioService;

@Component
@Order(1)
public class UsuarioLoader implements ApplicationRunner{
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Endereco endereco = new Endereco();
		endereco.setBairro("Pq Paraiso");
		endereco.setCep("06850150");
		endereco.setComplemento(null);
		endereco.setLocalidade("localidade");
		endereco.setLogradouro("logradouro");
		endereco.setUf("SP");
		
		Usuario usuario = new Usuario();
		usuario.setEmail("t@t.com");
		usuario.setNome("Jansen Miotto");
		usuario.setSenha("123");
		usuario.setEndereco(endereco);
		usuario.setAdmin(true);
		usuarioService.incluir(usuario);
		
	}

}
