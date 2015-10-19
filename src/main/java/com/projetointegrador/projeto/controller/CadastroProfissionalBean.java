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
		endereco = new Endereco();
		profissional = new Profissional();
		
	}
	
	public void salvar(){
		this.profissional.setEndereco(endereco);
		this.profissional= cadastroProfissionalService.salvar(this.profissional);
		limpar();
		FacesUtil.addInfoMessage("Profissional salvo com sucesso!");
	}		
	

	public Profissional getProfissional() {
		return profissional;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
}
