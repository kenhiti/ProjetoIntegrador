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

import com.projetointegrador.projeto.model.anamnese.Anamnese;
import com.projetointegrador.projeto.repository.filter.AnamneseFilter;

public class AnamneseRepository implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public Anamnese atualizar(Anamnese anamnese){		
		return manager.merge(anamnese);		
	}
	
	@SuppressWarnings("unchecked")
	public List<Anamnese> filtrados (AnamneseFilter filtro){
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Anamnese.class);
		
		if(filtro != null){
			
			if(StringUtils.isNotBlank (filtro.getPaciente().getNome())){
				criteria.add(Restrictions.ilike("nome", filtro.getPaciente().getNome(), MatchMode.ANYWHERE));
			}
			if(StringUtils.isNotBlank(filtro.getPaciente().getTelefone())){
				criteria.add(Restrictions.ilike("telefone", filtro.getPaciente().getTelefone(), MatchMode.ANYWHERE));
			}
			if(StringUtils.isNotBlank(filtro.getPaciente().getCelular())){
				criteria.add(Restrictions.ilike("celular", filtro.getPaciente().getCelular(), MatchMode.ANYWHERE));
			}
		}
		
		return criteria.addOrder(Order.asc("nome")).list();
	}

}
