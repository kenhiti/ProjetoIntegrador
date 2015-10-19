package com.projetointegrador.projeto.services;

import java.io.Serializable;

import javax.inject.Inject;

import com.projetointegrador.projeto.model.*;
import com.projetointegrador.projeto.repository.ClienteRepository;
import com.projetointegrador.projeto.util.JPA.Transactional;

public class CadastroClienteService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ClienteRepository clienteRepository;
	
	@Transactional
	public Pessoa salvar(Pessoa cliente){
		return clienteRepository.atualizar(cliente);
	}

}
