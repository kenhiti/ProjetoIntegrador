package com.projetointegrador.projeto.util.JPA;

import java.util.HashMap;
import java.util.Map;

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
		Map<String, String> props = new HashMap<String, String>();
		props.put("javax.persistence.jdbc.url", "jdbc:mysql://localhost/PI");
		props.put("javax.persistence.jdbc.user", "root");
		props.put("javax.persistence.jdbc.password", "121922");
		props.put("javax.persistence.jdbc.driver", "com.mysql.jdbc.Driver");
		
	
		factory = Persistence.createEntityManagerFactory("ProgramaPU",props);
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
