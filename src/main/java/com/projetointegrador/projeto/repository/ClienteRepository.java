package com.projetointegrador.projeto.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.projetointegrador.projeto.model.Pessoa;
import com.projetointegrador.projeto.repository.filter.ClienteFilter;

public class ClienteRepository implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	
	public Pessoa porId(Long id){
		return manager.find(Pessoa.class, id);
	}
	
	public List<Pessoa> buscarClientes(){
		return manager.createQuery("from Pessoa", Pessoa.class).getResultList();
	}
	
	public Pessoa atualizar(Pessoa cliente){		
		return manager.merge(cliente);		
	}
	
	@SuppressWarnings("unchecked")
	public List<Pessoa> filtrados (ClienteFilter filtro){
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Pessoa.class);
		
		if(StringUtils.isNotBlank(filtro.getNome())){
			criteria.add(Restrictions.ilike("nome", filtro.getNome(), MatchMode.ANYWHERE));
		}
		if(StringUtils.isNotBlank(filtro.getTelefone())){
			criteria.add(Restrictions.ilike("telefone", filtro.getTelefone(), MatchMode.ANYWHERE));
		}
		if(StringUtils.isNotBlank(filtro.getCelular())){
			criteria.add(Restrictions.ilike("celular", filtro.getCelular(), MatchMode.ANYWHERE));
		}
		
		
		return criteria.addOrder(Order.asc("nome")).list();
	}

}
