package com.projetointegrador.projeto.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.projetointegrador.projeto.model.Endereco;
import com.projetointegrador.projeto.model.Profissional;
import com.projetointegrador.projeto.services.CadastroProfissionalService;
import com.projetointegrador.projeto.util.JSF.FacesUtil;

@Named
@ViewScoped
public class CadastroProfissionalBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Profissional profissional;
	private Endereco endereco;
	
	@Inject
	private CadastroProfissionalService cadastroProfissionalService;
	
	public CadastroProfissionalBean() {
		limpar();
	}
	
	public void inicializar(){
		
	}
	
	private void limpar(){
		profissional = new Profissional();
		profissional.setEndereco(new Endereco());
		
	}
	
	public void salvar(){
		
		this.profissional= cadastroProfissionalService.salvar(this.profissional);
		limpar();
		FacesUtil.addInfoMessage("Profissional salvo com sucesso!");
	}
	
	public boolean isEditando() {
		return this.profissional.getId() != null;
	}
	
	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}	
}
