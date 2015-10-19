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

import com.projetointegrador.projeto.model.Usuario;
import com.projetointegrador.projeto.repository.filter.UsuarioFilter;

public class UsuarioRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public Usuario atualizar(Usuario usuario){		
		return manager.merge(usuario);		
	}	
	
	@SuppressWarnings("unchecked")
	public List<Usuario> filtrados (UsuarioFilter filtro){
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Usuario.class);
				//.createAlias("pessoa", "c")
				//.createAlias("profissional", "p");
		
		/*if (StringUtils.isNotBlank(filtro.getNomePaciente())) {
			// acessamos o nome do cliente associado ao pedido pelo alias "c", criado anteriormente
			criteria.add(Restrictions.ilike("c.nome", filtro.getNomePaciente(), MatchMode.ANYWHERE));
		}
		
		if (StringUtils.isNotBlank(filtro.getNomeProfissional())) {
			// acessamos o nome do vendedor associado ao pedido pelo alias "v", criado anteriormente
			criteria.add(Restrictions.ilike("p.nome", filtro.getNomeProfissional(), MatchMode.ANYWHERE));
		}*/
		
		if(StringUtils.isNotBlank(filtro.getLogin())){
			criteria.add(Restrictions.ilike("login", filtro.getLogin(), MatchMode.ANYWHERE));
		}
				
		return criteria.addOrder(Order.asc("login")).list();
	}
}
