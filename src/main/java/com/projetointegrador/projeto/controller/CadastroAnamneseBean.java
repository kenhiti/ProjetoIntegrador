package com.projetointegrador.projeto.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import java.util.Date;
import java.util.List;

import com.projetointegrador.projeto.model.Pessoa;
import com.projetointegrador.projeto.model.Profissional;
import com.projetointegrador.projeto.model.anamnese.Anamnese;
import com.projetointegrador.projeto.model.anamnese.Diagnostico;
import com.projetointegrador.projeto.model.anamnese.ExameFisico;
import com.projetointegrador.projeto.model.anamnese.Historico;
import com.projetointegrador.projeto.model.anamnese.Preferencias;
import com.projetointegrador.projeto.model.anamnese.Problemas;
import com.projetointegrador.projeto.model.anamnese.Pulsologia;
import com.projetointegrador.projeto.model.anamnese.Tipologia;
import com.projetointegrador.projeto.repository.ClienteRepository;
import com.projetointegrador.projeto.repository.ProfissionalRepository;
import com.projetointegrador.projeto.services.CadastroAnamneseService;
import com.projetointegrador.projeto.util.JSF.FacesUtil;

@Named
@ViewScoped
public class CadastroAnamneseBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Anamnese anamnese;
	private Diagnostico diagnostico;
	private ExameFisico exameFisico;
	private Historico historico;
	private Preferencias preferencias;
	private Problemas problemas;
	private Pulsologia pulsologia;
	private Tipologia tipologia;	
	
	private List<Pessoa> clientes;
	private List<Profissional> profissionais;
	
	private Pessoa pessoaSelecionada;
	
	private Profissional profissionalSelecionado;
	
	@Inject
	private ClienteRepository clienteRepository;
	
	@Inject
	private ProfissionalRepository profissionalRepository;
	
	@Inject
	private CadastroAnamneseService cadastroAnamneseService;
	
	
	public CadastroAnamneseBean(){
		limpar();	
	}
	
	public void limpar(){
		
		this.profissionalSelecionado = new Profissional();
		this.pessoaSelecionada = new Pessoa();
		
		this.anamnese = new Anamnese();
		this.anamnese.setDiagnostico( new Diagnostico());
		this.anamnese.setExameFisico(new ExameFisico());
		this.anamnese.setHistorico(new Historico());
		this.anamnese.setPreferencias(new Preferencias());
		this.anamnese.setProblemas(new Problemas());
		this.anamnese.setPulsologia(new Pulsologia());
		this.anamnese.setTipologia(new Tipologia());
		this.anamnese.setCliente(new Pessoa());
		this.anamnese.setProfissional(new Profissional());		
	}
	
	public void inicializar(){
				
		clientes = clienteRepository.buscarClientes();	
		profissionais = profissionalRepository.buscarProfissional();
		
	}
	public void salvar(){		
		this.anamnese.setCliente(pessoaSelecionada);
		this.anamnese.setProfissional(profissionalSelecionado);
		this.anamnese.setDataCriacao(new Date());
		this.anamnese = cadastroAnamneseService.salvar(this.anamnese);
		limpar();
		FacesUtil.addInfoMessage("Ficha salvo com sucesso!");
	}
	
	public boolean isEditando(){
		return this.anamnese.getId() != null;
	}

	public Anamnese getAnamnese() {
		return anamnese;
	}
	
	public void setAnamnese(Anamnese anamnese){
		this.anamnese = anamnese;
		
		if(this.anamnese != null){
			this.profissionalSelecionado = this.anamnese.getProfissional();
			this.pessoaSelecionada = this.anamnese.getCliente();
		}
		
	}

	public List<Pessoa> getClientes() {
		return clientes;
	}	

	public void setClientes(List<Pessoa> clientes) {
		this.clientes = clientes;
	}

	public List<Profissional> getProfissionais() {
		return profissionais;
	}

	public Diagnostico getDiagnostico() {
		return diagnostico;
	}

	public ExameFisico getExameFisico() {
		return exameFisico;
	}

	public Historico getHistorico() {
		return historico;
	}

	public Preferencias getPreferencias() {
		return preferencias;
	}

	public Problemas getProblemas() {
		return problemas;
	}

	public Pulsologia getPulsologia() {
		return pulsologia;
	}

	public Tipologia getTipologia() {
		return tipologia;
	}

	public Pessoa getPessoaSelecionada() {
		return pessoaSelecionada;
	}

	public void setPessoaSelecionada(Pessoa pessoaSelecionada) {
		this.pessoaSelecionada = pessoaSelecionada;
	}

	public Profissional getProfissionalSelecionado() {
		return profissionalSelecionado;
	}

	public void setProfissionalSelecionado(Profissional profissionalSelecionado) {
		this.profissionalSelecionado = profissionalSelecionado;
	}	
	
	
}
