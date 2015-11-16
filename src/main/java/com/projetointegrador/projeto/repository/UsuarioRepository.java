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

import com.projetointegrador.projeto.model.Usuario;
import com.projetointegrador.projeto.repository.filter.UsuarioFilter;
import com.projetointegrador.projeto.services.NegocioException;
import com.projetointegrador.projeto.util.JPA.Transactional;

public class UsuarioRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public Usuario atualizar(Usuario usuario){		
		return manager.merge(usuario);		
	}	
	
	public Usuario buscarPorLogin(String login){
		return manager.createQuery("from Usuario where login=:login", Usuario.class)
				.setParameter("login", login).getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> filtrados (UsuarioFilter filtro){
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Usuario.class).createAlias("profissional", "p");
				
		
		if (StringUtils.isNotBlank(filtro.getNomeProfissional())) {
			criteria.add(Restrictions.ilike("p.nome", filtro.getNomeProfissional(), MatchMode.ANYWHERE));
		}
		
		if (StringUtils.isNotBlank(filtro.getLogin())) {
			
			criteria.add(Restrictions.ilike("login", filtro.getLogin(), MatchMode.ANYWHERE));
		}
						
		return criteria.addOrder(Order.asc("login")).list();
	}

	public Usuario buscarPorId(Long id) {		
		return manager.find(Usuario.class, id);
	}

	@Transactional
	public void excluir(Usuario usuarioSelecionado) {
		try{
			usuarioSelecionado = buscarPorId(usuarioSelecionado.getId());
			manager.remove(usuarioSelecionado);
			manager.flush();
		}
		catch(PersistenceException e){
			e.printStackTrace();
			throw new NegocioException("Usuário não pode ser excluído");
		}
		
	}
}
