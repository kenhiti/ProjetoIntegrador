package com.projetointegrador.projeto.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.projetointegrador.projeto.model.Endereco;
import com.projetointegrador.projeto.model.Pessoa;
import com.projetointegrador.projeto.services.CadastroClienteService;
import com.projetointegrador.projeto.util.JSF.FacesUtil;

@Named
@ViewScoped
public class CadastroClienteBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Pessoa cliente;
	private Endereco endereco;
		
	@Inject
	private CadastroClienteService cadastroClienteService;
	
	public CadastroClienteBean(){
		limpar();		
	}
	
	private void limpar(){
		cliente = new Pessoa();	
		endereco = new Endereco();		
	}
	
	public void salvar(){
		
		this.cliente.setEndereco(endereco);
		this.cliente = cadastroClienteService.salvar(this.cliente);
		limpar();
		FacesUtil.addInfoMessage("Paciente salvo com sucesso!");
	}		
	
	public Pessoa getCliente() {
		return cliente;
	}

	public Endereco getEndereco() {
		return endereco;
	}

}
