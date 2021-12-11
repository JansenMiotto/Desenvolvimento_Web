package br.edu.infnet.appaluguelcarros.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appaluguelcarros.model.domain.Locacao;
import br.edu.infnet.appaluguelcarros.model.domain.Usuario;
import br.edu.infnet.appaluguelcarros.model.repository.LocacaoRepository;

@Service
public class LocacaoService {
	@Autowired
	private LocacaoRepository locacaoRepository;
	public List<Locacao> obterLista(Usuario usuario){
		return (List<Locacao>)locacaoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "descricao"));
	}
	
	public List<Locacao> obterLista(){
		return (List<Locacao>)locacaoRepository.findAll();
	}
	
	
	public void incluir(Locacao locacao) {
		locacaoRepository.save(locacao);
	}
	
	public void excluir(Integer id) {
		locacaoRepository.deleteById(id);
		
	}

	public Integer getQtde() {
		return (int) locacaoRepository.count();
	}
}
