package br.edu.infnet.appaluguelcarros.model.repository;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appaluguelcarros.model.domain.Locacao;

@Repository
public interface LocacaoRepository extends CrudRepository<Locacao, Integer>{


	@Query("from Locacao l where l.usuario.id =:id")
	public List<Locacao> findAll(Integer id, Sort by);
}
