package com.projetointegrador.projeto.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.projetointegrador.projeto.model.BancoDados;


public class BDRepository implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public List<BancoDados> buscarTodos(){
		return manager.createQuery("from BancoDados",BancoDados.class).getResultList();
	}
	
	
}
