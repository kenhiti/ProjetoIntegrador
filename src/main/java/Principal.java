import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.projetointegrador.projeto.model.Usuario;
import com.projetointegrador.projeto.ryororaku.Ryodoraku;



public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory  factory = Persistence.createEntityManagerFactory("ProgramaPU");
		EntityManager manager = factory.createEntityManager();
		
		Ryodoraku ryo =  manager.find(Ryodoraku.class, 1L);
		
		System.out.println(ryo);
		
	}
}
