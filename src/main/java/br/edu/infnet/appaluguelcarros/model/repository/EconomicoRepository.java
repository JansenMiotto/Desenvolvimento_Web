package br.edu.infnet.appaluguelcarros.model.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appaluguelcarros.model.domain.Economico;

@Repository
public interface EconomicoRepository extends CrudRepository<Economico, Integer>{

}
