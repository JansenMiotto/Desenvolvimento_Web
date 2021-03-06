package br.edu.infnet.appaluguelcarros.model.repository;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appaluguelcarros.model.domain.Economico;
import br.edu.infnet.appaluguelcarros.model.domain.Veiculo;

@Repository
public interface EconomicoRepository extends CrudRepository<Economico, Integer>{

	List<Economico> findAll(Sort by);
	
	@Query("from Economico e where e.usuario.id =:id")
	public List<Economico> findAll(Integer id, Sort by);

}
