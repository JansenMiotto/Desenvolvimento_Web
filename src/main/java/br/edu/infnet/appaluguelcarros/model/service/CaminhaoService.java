package br.edu.infnet.appaluguelcarros.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appaluguelcarros.model.domain.Caminhao;
import br.edu.infnet.appaluguelcarros.model.domain.Usuario;
import br.edu.infnet.appaluguelcarros.model.repository.CaminhaoRepository;

@Service
public class CaminhaoService {
	
	@Autowired
	private CaminhaoRepository caminhaoRepository;
	
	public void incluir(Caminhao caminhao) {
		caminhaoRepository.save(caminhao);
	}
	
	public void excluir(Integer id) {
		caminhaoRepository.deleteById(id);
	}
	
	public Caminhao obterPorId(Integer id) {
		return caminhaoRepository.findById(id).orElse(null);
	}
	
	public List<Caminhao> obterLista(Usuario usuario){
		return (List<Caminhao>) caminhaoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nomeCarro"));
	}

	public Integer getQtde() {
		return (int) caminhaoRepository.count();
	}

}
