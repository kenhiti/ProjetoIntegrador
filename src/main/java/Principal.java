import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.projetointegrador.projeto.model.Profissional;



public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory  factory = Persistence.createEntityManagerFactory("ProgramaPU");
		EntityManager manager = factory.createEntityManager();
		
		Profissional profissional =  manager.find(Profissional.class, 1L);
		
		System.out.println(profissional);
		
	}
}
