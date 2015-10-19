package com.projetointegrador.projeto.services;

import java.io.Serializable;

import javax.inject.Inject;

import com.projetointegrador.projeto.repository.RyodorakuRepository;
import com.projetointegrador.projeto.ryororaku.Ryodoraku;
import com.projetointegrador.projeto.util.JPA.Transactional;

public class CadastroRyodorakuService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private RyodorakuRepository ryodorakuRepository;
	
	@Transactional
	public Ryodoraku salvar(Ryodoraku ryodoraku){
		return ryodorakuRepository.atualizar(ryodoraku);
	}
}
