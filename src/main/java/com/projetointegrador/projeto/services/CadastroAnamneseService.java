package com.projetointegrador.projeto.services;

import java.io.Serializable;

import javax.inject.Inject;

import com.projetointegrador.projeto.model.anamnese.Anamnese;
import com.projetointegrador.projeto.repository.AnamneseRepository;
import com.projetointegrador.projeto.util.JPA.Transactional;

public class CadastroAnamneseService implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private AnamneseRepository anamneseRepository;
	
	@Transactional
	public Anamnese salvar(Anamnese anamnese){
		return anamneseRepository.atualizar(anamnese);
	}

}
