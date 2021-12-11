package br.edu.infnet.appaluguelcarros.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appaluguelcarros.model.domain.Usuario;
import br.edu.infnet.appaluguelcarros.model.domain.Veiculo;
import br.edu.infnet.appaluguelcarros.model.repository.VeiculoRepository;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	public void excluir(Integer id) {
		veiculoRepository.deleteById(id);
	}
	
	public Veiculo obterPorId(Integer id) {
		return veiculoRepository.findById(id).orElse(null);
	}
	
	public List<Veiculo> obterLista(Usuario usuario){
		return (List<Veiculo>) veiculoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nomeCarro"));
	}

	public Integer getQtde() {
		return (int) veiculoRepository.count();
	}

}
