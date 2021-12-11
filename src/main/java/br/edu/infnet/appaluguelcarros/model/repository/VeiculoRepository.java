package br.edu.infnet.appaluguelcarros.model.repository;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appaluguelcarros.model.domain.Veiculo;

@Repository
public interface VeiculoRepository extends CrudRepository<Veiculo, Integer>{


	@Query("from Veiculo v where v.usuario.id =:id")
	public List<Veiculo> findAll(Integer id, Sort by);
}
