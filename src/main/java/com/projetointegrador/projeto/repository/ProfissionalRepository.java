package com.projetointegrador.projeto.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.projetointegrador.projeto.model.Profissional;
import com.projetointegrador.projeto.repository.filter.ProfissionalFilter;
import com.projetointegrador.projeto.services.NegocioException;
import com.projetointegrador.projeto.util.JPA.Transactional;

public class ProfissionalRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public Profissional porId(Long id){
		return manager.find(Profissional.class, id);
	}
	
	public List<Profissional> buscarProfissional(){
		return manager.createQuery("from Profissional", Profissional.class).getResultList();
	}
	
	public Profissional atualizar(Profissional profissional){		
		return manager.merge(profissional);		
	}
	
	@SuppressWarnings("unchecked")
	public List<Profissional> filtrados (ProfissionalFilter filtro){
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Profissional.class);
		
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
	
	@Transactional
	public void excluir(Profissional profissional) {
		
		try{
			profissional = porId(profissional.getId());
			manager.remove(profissional);
			manager.flush();			
		}
		catch(PersistenceException e){
			e.printStackTrace();
			throw new NegocioException("Profissional não pode ser excluído.");
		}
		
	}

}
