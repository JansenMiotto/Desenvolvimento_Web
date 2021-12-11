package br.edu.infnet.appaluguelcarros.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appaluguelcarros.model.domain.Suv;
import br.edu.infnet.appaluguelcarros.model.domain.Usuario;
import br.edu.infnet.appaluguelcarros.model.repository.SuvRepository;

@Service
public class SuvService {
	
	@Autowired
	private SuvRepository suvRepository;
	
	public void incluir(Suv suv) {
		suvRepository.save(suv);
	}
	
	public void excluir(Integer id) {
		suvRepository.deleteById(id);
	}
	
	public Suv obterPorId(Integer id) {
		return suvRepository.findById(id).orElse(null);
	}
	
	public List<Suv> obterLista(Usuario usuario){
		return (List<Suv>) suvRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nomeCarro"));
	}

	public Integer getQtde() {
		return (int) suvRepository.count();
	}

}
