import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.projetointegrador.projeto.ryororaku.Ryodoraku;



public class Principal {

	public static void main(String[] args) {
		Map<String, String> props = new HashMap<String, String>();
		props.put("javax.persistence.jdbc.url", "jdbc:mysql://localhost/PI");
		props.put("javax.persistence.jdbc.user", "root");
		props.put("javax.persistence.jdbc.password", "121922");
		props.put("javax.persistence.jdbc.driver", "com.mysql.jdbc.Driver");		
	
	
		EntityManagerFactory  factory = Persistence.createEntityManagerFactory("ProgramaPU", props);
		EntityManager manager = factory.createEntityManager();
		String nome = "Jaqueline Fujimoto";
		//String sql = "select * from ryodoraku where id = (select id from pessoa where nome = 'Jaqueline Fujimoto')";
		
		Ryodoraku ryo = manager.createQuery("from Ryodoraku where id = (select p.id from Pessoa p where nome = :nome)", Ryodoraku.class).setParameter("nome",nome).getSingleResult();
		
		System.out.println("Nome: " +ryo.getCliente().getNome());
		
	}
}
