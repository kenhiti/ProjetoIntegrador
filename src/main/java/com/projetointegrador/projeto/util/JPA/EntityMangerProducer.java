package com.projetointegrador.projeto.util.JPA;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityMangerProducer {

	private EntityManagerFactory factory;
	
	public EntityMangerProducer(){
		factory = Persistence.createEntityManagerFactory("ProgramaPU");
	}
	
	@Produces
	@RequestScoped
	public EntityManager createEntityManager(){
		return factory.createEntityManager();
	}
	
	public void fecharEntityManager(@Disposes EntityManager manager){
		manager.close();
	}
	
}
