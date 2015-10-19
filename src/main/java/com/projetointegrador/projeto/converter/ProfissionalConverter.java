package com.projetointegrador.projeto.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.projetointegrador.projeto.model.Profissional;
import com.projetointegrador.projeto.repository.ProfissionalRepository;
import com.projetointegrador.projeto.util.cdi.CDIServiceLocator;

@FacesConverter(forClass = Profissional.class)
public class ProfissionalConverter implements Converter {

	private ProfissionalRepository profissionalRepository;
	
	public ProfissionalConverter(){
		profissionalRepository = CDIServiceLocator.getBean(ProfissionalRepository.class);
	}
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Profissional profissionalRetorno = null;
		
		if(value != null ){
			Long id = new Long(value);
			profissionalRetorno = profissionalRepository.porId(id);
		}
		
		return profissionalRetorno;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null){
			return ((Profissional)value).getId().toString();
		}
		return "";
	}

}
