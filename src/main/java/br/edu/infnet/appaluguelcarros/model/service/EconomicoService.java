package br.edu.infnet.appaluguelcarros.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appaluguelcarros.model.domain.Economico;
import br.edu.infnet.appaluguelcarros.model.domain.Usuario;
import br.edu.infnet.appaluguelcarros.model.repository.EconomicoRepository;

@Service
public class EconomicoService {
	
	@Autowired
	private EconomicoRepository economicoRepository;
	
	public void incluir(Economico economico) {
		economicoRepository.save(economico);
	}
	
	public void excluir(Integer id) {
		economicoRepository.deleteById(id);
	}
	
	public Economico obterPorId(Integer id) {
		return economicoRepository.findById(id).orElse(null);
	}
	
	public List<Economico> obterLista(Usuario usuario){
		return (List<Economico>) economicoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nomeCarro"));
	}

	public Integer getQtde() {
		return (int) economicoRepository.count();
	}

}
