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

import com.projetointegrador.projeto.repository.filter.RyodorakuFilter;
import com.projetointegrador.projeto.ryororaku.Ryodoraku;

public class RyodorakuRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	public Ryodoraku buscarPorId(Long id){
		return manager.find(Ryodoraku.class, id);
	}
	
	public Ryodoraku atualizar(Ryodoraku ryodoraku) {
		return manager.merge(ryodoraku);
	}

	@SuppressWarnings("unchecked")
	public List<Ryodoraku> pesquisar(RyodorakuFilter filtro) {

		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Ryodoraku.class).createAlias("cliente", "c").createAlias("profissional", "p");

		if (filtro != null) {

			if (StringUtils.isNotBlank(filtro.getPaciente())) {
				criteria.add(Restrictions.ilike("c.nome", filtro.getPaciente(),MatchMode.ANYWHERE));
			}
			if (StringUtils.isNotBlank(filtro.getProfissional())) {
				criteria.add(Restrictions.ilike("p.nome", filtro.getProfissional(), MatchMode.ANYWHERE));
			}
			if (filtro.getData() != null) {
				criteria.add(Restrictions.ge("datahj", filtro.getData()));
			}

		}

		return criteria.list();
	}

}
