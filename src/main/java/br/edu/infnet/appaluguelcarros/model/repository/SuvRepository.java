package br.edu.infnet.appaluguelcarros.model.repository;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appaluguelcarros.model.domain.Economico;
import br.edu.infnet.appaluguelcarros.model.domain.Suv;

@Repository
public interface SuvRepository extends CrudRepository<Suv, Integer>{
	
	@Query("from Suv s where s.usuario.id =:id")
	public List<Suv> findAll(Integer id, Sort by);

}
