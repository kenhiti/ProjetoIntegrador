package com.projetointegrador.projeto.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.projetointegrador.projeto.model.anamnese.Anamnese;
import com.projetointegrador.projeto.repository.AnamneseRepository;
import com.projetointegrador.projeto.util.cdi.CDIServiceLocator;

@FacesConverter(forClass = Anamnese.class)
public class AnamneseConverter implements Converter {
	
	private AnamneseRepository repository;
	
	public AnamneseConverter() {
		repository = CDIServiceLocator.getBean(AnamneseRepository.class);
	}
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Anamnese anamnese = null;
		
		if(value != null){
			Long id = new Long(value);
			anamnese = repository.buscarPorId(id);
		}
		
		return anamnese;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		if(value != null){
			Anamnese anamnese = (Anamnese)value;
			return anamnese.getId() == null ? null : anamnese.getId().toString();
		}
		return "";
	}

}
