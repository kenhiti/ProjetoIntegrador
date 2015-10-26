package com.projetointegrador.projeto.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.projetointegrador.projeto.model.Usuario;
import com.projetointegrador.projeto.repository.UsuarioRepository;
import com.projetointegrador.projeto.util.cdi.CDIServiceLocator;

@FacesConverter(forClass = Usuario.class)
public class UsuarioConverter implements Converter {
	
	private UsuarioRepository repository;
	
	public UsuarioConverter() {
		repository = CDIServiceLocator.getBean(UsuarioRepository.class); 
	}
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Usuario usuario = null;
		
		if(value != null){
			Long id = new Long(value);
			usuario = repository.buscarPorId(id);
		}
		
		return usuario;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null){
			Usuario usuario = (Usuario)value;
			return usuario.getId() == null ? null : usuario.getId().toString();
		}
		return "";
	}

}
