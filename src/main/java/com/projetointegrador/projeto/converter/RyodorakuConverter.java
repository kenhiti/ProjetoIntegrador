package com.projetointegrador.projeto.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.projetointegrador.projeto.repository.RyodorakuRepository;
import com.projetointegrador.projeto.ryororaku.Ryodoraku;
import com.projetointegrador.projeto.util.cdi.CDIServiceLocator;

@FacesConverter(forClass = Ryodoraku.class)
public class RyodorakuConverter implements Converter{
	
	private RyodorakuRepository repository;
	
	public RyodorakuConverter(){
		repository = CDIServiceLocator.getBean(RyodorakuRepository.class);
	}
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Ryodoraku ryodoraku = null;
		
		if(value != null){
			Long id = new Long(value);
			ryodoraku = repository.buscarPorId(id);
		}
		return ryodoraku;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent conponent, Object value) {
				
		if(value != null){
			Ryodoraku ryodoraku = (Ryodoraku)value;
			return ryodoraku.getId() == null ? null : ryodoraku.getId().toString();
		}
		
		return "";
	}

}
