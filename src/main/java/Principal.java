import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.projetointegrador.projeto.model.Endereco;
import com.projetointegrador.projeto.model.Pessoa;
import com.projetointegrador.projeto.model.Profissional;
import com.projetointegrador.projeto.model.Sexo;



public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory  factory = Persistence.createEntityManagerFactory("ProgramaPU");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
				
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Sonia Aparecida Santana");
		pessoa.setCelular("8878-8197");
		pessoa.setEmail("kenhitifujimoto@hotmail.com");
		pessoa.setDocumentoIdentificacao("014.424.526-41");
		pessoa.setSexo(Sexo.MASCULINO);
		pessoa.setTelefone("3217-2569");
		pessoa.setDataNascimento(new Date());
		
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Maria Fernandes da Cruz");
		endereco.setNumero("75");
		endereco.setBairro("Chacaras Tubalina");
		endereco.setCep("38413-351");
		endereco.setCidade("Uberlândia");
		endereco.setUf("MG");
		endereco.setComplemento("NA");
		
			
		pessoa.setEndereco(endereco);
		
		Profissional profissional = new Profissional();
		//profissional.setProfissional(pessoa);
		
		manager.persist(pessoa);
		manager.persist(profissional);
		
		trx.commit();
		
	}
}
