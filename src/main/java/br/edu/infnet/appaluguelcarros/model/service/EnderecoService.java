package br.edu.infnet.appaluguelcarros.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appaluguelcarros.clients.IEnderecoClients;
import br.edu.infnet.appaluguelcarros.model.domain.Endereco;

@Service
public class EnderecoService {
	
	@Autowired
	private IEnderecoClients enderecoClient;
	
	public Endereco obterEnderecoPorCep(String cep) {
		return enderecoClient.buscarCep(cep);
		
	}
}
