package com.projetointegrador.projeto.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.projetointegrador.projeto.model.Profissional;
import com.projetointegrador.projeto.repository.ProfissionalRepository;
import com.projetointegrador.projeto.repository.filter.ProfissionalFilter;

@Named
@ViewScoped
public class PesquisaProfissionalBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ProfissionalRepository profissionalRepository;
	
	private ProfissionalFilter filtro;
	
	private List<Profissional> profissionalFiltrados;
		
	public PesquisaProfissionalBean(){
		filtro = new ProfissionalFilter();
	}
	
	public void pesquisar(){
		profissionalFiltrados = profissionalRepository.filtrados(filtro);
	}

	public ProfissionalFilter getFiltro() {
		return filtro;
	}

	public List<Profissional> getProfissionalFiltrados() {
		return profissionalFiltrados;
	}	
}
