package com.projetointegrador.projeto.repository;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.projetointegrador.projeto.ryororaku.Ryodoraku;

public class RyodorakuRepository implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public Ryodoraku atualizar(Ryodoraku ryodoraku){		
		return manager.merge(ryodoraku);		
	}

}
