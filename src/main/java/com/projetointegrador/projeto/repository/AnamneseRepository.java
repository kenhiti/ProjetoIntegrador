package com.projetointegrador.projeto.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
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
		Criteria criteria = session.createCriteria(Anamnese.class).createAlias("cliente", "c").createAlias("profissional", "p");
		
		if(filtro != null){
			
			if(StringUtils.isNotBlank (filtro.getPaciente())){
				criteria.add(Restrictions.ilike("c.nome", filtro.getPaciente(), MatchMode.ANYWHERE));
			}
			if(StringUtils.isNotBlank(filtro.getProfissional())){
				criteria.add(Restrictions.ilike("p.nome", filtro.getProfissional(), MatchMode.ANYWHERE));
			}
			if(filtro.getData() != null){
				criteria.add(Restrictions.ge("dataCriacao", filtro.getData()));
			}
			
		}
		
		return criteria.list();
	}

	public Anamnese buscarPorId(Long id) {
		return manager.find(Anamnese.class, id);
	}

}
