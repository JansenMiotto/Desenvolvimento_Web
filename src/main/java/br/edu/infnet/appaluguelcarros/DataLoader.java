package br.edu.infnet.appaluguelcarros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaluguelcarros.model.domain.Usuario;
import br.edu.infnet.appaluguelcarros.model.repository.UsuarioRepository;

@Component
public class DataLoader implements ApplicationRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setEmail("t@t.com");
		usuario.setNome("Jansen Miotto");
		usuario.setSenha("123");
		usuarioRepository.save(usuario);
		
	}

}
