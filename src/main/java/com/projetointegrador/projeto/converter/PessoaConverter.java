package com.projetointegrador.projeto.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;



import com.projetointegrador.projeto.model.Pessoa;
import com.projetointegrador.projeto.repository.ClienteRepository;
import com.projetointegrador.projeto.util.cdi.CDIServiceLocator;

@FacesConverter(forClass = Pessoa.class)
public class PessoaConverter implements Converter {
	
	
	private ClienteRepository clienteRepository;
	
	public PessoaConverter(){
		clienteRepository = CDIServiceLocator.getBean(ClienteRepository.class);
	}
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Pessoa pessoaRetorno = null;
		
		if(value != null ){
			Long id = new Long(value);
			pessoaRetorno = clienteRepository.porId(id);
		}
		
		return pessoaRetorno;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null){
			Pessoa pessoa = (Pessoa) value; 
			return pessoa.getId() == null ? null : pessoa.getId().toString();
		}
		return "";
	}

}
