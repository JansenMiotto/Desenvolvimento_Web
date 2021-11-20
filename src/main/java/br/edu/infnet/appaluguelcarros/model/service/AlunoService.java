package br.edu.infnet.appaluguelcarros.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appaluguelcarros.model.domain.Aluno;
import br.edu.infnet.appaluguelcarros.model.domain.Usuario;
import br.edu.infnet.appaluguelcarros.model.repository.AlunoRepository;

@Service
public class AlunoService {
	@Autowired
	private AlunoRepository alunoRepository;
	public List<Aluno> obterLista(Usuario usuario){
		return (List<Aluno>)alunoRepository.obterLista(usuario.getId());
	}
	
	public List<Aluno> obterLista(){
		return (List<Aluno>)alunoRepository.findAll();
	}
	
	
	public void incluir(Aluno aluno) {
		alunoRepository.save(aluno);
	}
	
	public void excluir(Integer id) {
		alunoRepository.deleteById(id);
		
	}
}
