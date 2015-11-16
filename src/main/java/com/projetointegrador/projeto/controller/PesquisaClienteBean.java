package com.projetointegrador.projeto.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.projetointegrador.projeto.model.Pessoa;
import com.projetointegrador.projeto.repository.ClienteRepository;
import com.projetointegrador.projeto.repository.filter.ClienteFilter;
import com.projetointegrador.projeto.util.JSF.FacesUtil;

@Named
@ViewScoped
public class PesquisaClienteBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Pessoa pacienteSelecionado;
	
	@Inject
	private ClienteRepository clienteRepository;
	
	private ClienteFilter filtro;
	
	private List<Pessoa> clientesFiltrados;
		
	public PesquisaClienteBean(){
		filtro = new ClienteFilter();
		pacienteSelecionado = new Pessoa();
	}
	
	public void pesquisar(){
		clientesFiltrados = clienteRepository.filtrados(filtro);
	}
	
	public void excluir(){
		clienteRepository.excluir(pacienteSelecionado);
		clientesFiltrados.remove(pacienteSelecionado);
		FacesUtil.addInfoMessage("Paciente: "+pacienteSelecionado.getNome()+" excluído com sucesso!!!");
	}
	
	public List<Pessoa> getClientesFiltrados() {
		return clientesFiltrados;
	}

	public ClienteFilter getFiltro() {
		return filtro;
	}

	public Pessoa getPacienteSelecionado() {
		return pacienteSelecionado;
	}

	public void setPacienteSelecionado(Pessoa pacienteSelecionado) {
		this.pacienteSelecionado = pacienteSelecionado;
	}
}
