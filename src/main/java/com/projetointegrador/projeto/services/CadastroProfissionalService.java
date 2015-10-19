package com.projetointegrador.projeto.services;

import java.io.Serializable;

import javax.inject.Inject;

import com.projetointegrador.projeto.model.Profissional;
import com.projetointegrador.projeto.repository.ProfissionalRepository;
import com.projetointegrador.projeto.util.JPA.Transactional;

public class CadastroProfissionalService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ProfissionalRepository profissionalRepository;

	@Transactional
	public Profissional salvar(Profissional profissional) {
		return profissionalRepository.atualizar(profissional);
	}
}
