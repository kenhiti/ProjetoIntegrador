package com.projetointegrador.projeto.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.projetointegrador.projeto.model.Pessoa;
import com.projetointegrador.projeto.model.Profissional;
import com.projetointegrador.projeto.repository.ClienteRepository;
import com.projetointegrador.projeto.repository.ProfissionalRepository;
import com.projetointegrador.projeto.repository.RyodorakuRepository;
import com.projetointegrador.projeto.repository.filter.RyodorakuFilter;
import com.projetointegrador.projeto.ryororaku.Ryodoraku;

@Named
@SessionScoped
public class PesquisaRyodorakuBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Ryodoraku ryodoraku;
	private List<Ryodoraku> listaRyodoraku;
	
	private Pessoa pacienteSelecionado;
	private List<Pessoa> pacientes;
	
	private Profissional profissionalSelecionado;
	private List<Profissional> profissionais;
	
	private RyodorakuFilter filtro;
	
	@Inject
	private ClienteRepository clienteRepository;
	
	@Inject
	private ProfissionalRepository ProfissionalRepository;
	
	@Inject 
	private RyodorakuRepository ryoRepository;
	
	@PostConstruct
	public void init(){
		pacienteSelecionado = new Pessoa();
		pacientes = new ArrayList<Pessoa>();
		
		profissionalSelecionado = new Profissional();
		profissionais = new ArrayList<Profissional>();
		
		filtro = new RyodorakuFilter();
		
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
		this.listaRyodoraku = ryoRepository.pesquisar(filtro); 
	}
	
	
	public Ryodoraku getRyodoraku() {
		return ryodoraku;
	}

	public void setRyodoraku(Ryodoraku ryodoraku) {
		this.ryodoraku = ryodoraku;
	}

	public List<Ryodoraku> getListaRyodoraku() {
		return listaRyodoraku;
	}

	public void setListaRyodoraku(List<Ryodoraku> listaRyodoraku) {
		this.listaRyodoraku = listaRyodoraku;
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

	public RyodorakuFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(RyodorakuFilter filtro) {
		this.filtro = filtro;
	}
	
}
