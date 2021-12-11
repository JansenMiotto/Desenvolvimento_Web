package br.edu.infnet.appaluguelcarros.model.repository;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appaluguelcarros.model.domain.Caminhao;
import br.edu.infnet.appaluguelcarros.model.domain.Economico;

@Repository
public interface CaminhaoRepository extends CrudRepository<Caminhao, Integer>{


	@Query("from Caminhao c where c.usuario.id =:id")
	public List<Caminhao> findAll(Integer id, Sort by);

}
