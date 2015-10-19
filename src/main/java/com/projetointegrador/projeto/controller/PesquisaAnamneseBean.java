package com.projetointegrador.projeto.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.projetointegrador.projeto.model.Pessoa;
import com.projetointegrador.projeto.model.Profissional;
import com.projetointegrador.projeto.model.anamnese.Anamnese;
import com.projetointegrador.projeto.repository.AnamneseRepository;
import com.projetointegrador.projeto.repository.ClienteRepository;
import com.projetointegrador.projeto.repository.ProfissionalRepository;
import com.projetointegrador.projeto.repository.filter.AnamneseFilter;

@Named
@ViewScoped
public class PesquisaAnamneseBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Pessoa pacienteSelecionado;
	private List<Pessoa> pacientes;
	
	private Profissional profissionalSelecionado;
	private List<Profissional> profissionais;
	
	private AnamneseFilter filtro;
	
	private Anamnese anamnese;
	private List<Anamnese> anamneses;
	
	@Inject
	private ClienteRepository clienteRepository;
	
	@Inject
	private ProfissionalRepository ProfissionalRepository;
	
	@Inject 
	private AnamneseRepository anamneseRepository;
	
	@PostConstruct
	public void init(){
		pacienteSelecionado = new Pessoa();
		pacientes = new ArrayList<Pessoa>();
		
		profissionalSelecionado = new Profissional();
		profissionais = new ArrayList<Profissional>();
		
		
		buscarPacientes();
		buscarProfissionais();
	}
	
	private void buscarPacientes(){
		this.profissionais = ProfissionalRepository.buscarProfissional();
	}
	
	private void buscarProfissionais(){
		this.pacientes = clienteRepository.buscarClientes();
	}
	
	public void pesquisar(){
		this.anamneses = anamneseRepository.filtrados(filtro);
	}
	
	
	public Pessoa getPacienteSelecionado() {
		return pacienteSelecionado;
	}
	public void setPacienteSelecionado(Pessoa pacienteSelecionado) {
		this.pacienteSelecionado = pacienteSelecionado;
	}
	public List<Pessoa> getPacientes() {
		return pacientes;
	}
	public void setPacientes(List<Pessoa> pacientes) {
		this.pacientes = pacientes;
	}
	public Profissional getProfissionalSelecionado() {
		return profissionalSelecionado;
	}
	public void setProfissionalSelecionado(Profissional profissionalSelecionado) {
		this.profissionalSelecionado = profissionalSelecionado;
	}
	public List<Profissional> getProfissionais() {
		return profissionais;
	}
	public void setProfissionais(List<Profissional> profissionais) {
		this.profissionais = profissionais;
	}

	public AnamneseFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(AnamneseFilter filtro) {
		this.filtro = filtro;
	}
	
}
