package com.projetointegrador.projeto.controller;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.projetointegrador.projeto.model.Pessoa;
import com.projetointegrador.projeto.model.Profissional;
import com.projetointegrador.projeto.repository.ClienteRepository;
import com.projetointegrador.projeto.repository.ProfissionalRepository;
import com.projetointegrador.projeto.ryororaku.Ryodoraku;
import com.projetointegrador.projeto.ryororaku.RyodorakuLadoDireito;
import com.projetointegrador.projeto.ryororaku.RyodorakuLadoEsquerdo;
import com.projetointegrador.projeto.services.CadastroRyodorakuService;
import com.projetointegrador.projeto.util.JSF.FacesUtil;

@Named
@ViewScoped
public class CadastroRyodorakuBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Pessoa> clientes;
	private List<Profissional> profissionais;
	private Pessoa pessoaSelecionada;
	private Profissional profissionalSelecionado;
		
	private Ryodoraku ryodoraku;
	private RyodorakuLadoDireito ryodorakuLadoDireito;
	private RyodorakuLadoEsquerdo ryodorakuLadoEsquerdo;
	
	@Inject
	private ClienteRepository clienteRepository;
	
	@Inject
	private ProfissionalRepository profissionalRepository;
	
	@Inject
	private CadastroRyodorakuService cadastroRyodorakuService;
	
	public CadastroRyodorakuBean(){
		limpar();
	}
	
	public void limpar(){
		ryodoraku = new Ryodoraku();
		ryodorakuLadoDireito = new RyodorakuLadoDireito();
		ryodorakuLadoEsquerdo = new RyodorakuLadoEsquerdo();
	}
	
	@PostConstruct	
	public void inicializar(){
		clientes = clienteRepository.buscarClientes();	
		profissionais = profissionalRepository.buscarProfissional();
		
	}	
		
	public void salvar(){
		this.ryodoraku.setLadoDireito(ryodorakuLadoDireito);
		this.ryodoraku.setLadoEsquerdo(ryodorakuLadoEsquerdo);
		this.ryodoraku.setDatahj(new Date());
		this.ryodoraku.setCliente(pessoaSelecionada);
		this.ryodoraku.setProfissional(profissionalSelecionado);
		this.ryodoraku.setReferenciaGrafico(calcularReferencia());
		this.ryodoraku.setLimiteSuperior(calcularReferencia().add(new BigDecimal(10)));
		this.ryodoraku.setLimiteInferior(calcularReferencia().subtract(new BigDecimal(10)));
		this.ryodoraku = cadastroRyodorakuService.salvar(this.ryodoraku);
		limpar();
		FacesUtil.addInfoMessage("Paciente salvo com sucesso!");
	}
	
	private BigDecimal calcularReferencia(){
		BigDecimal total = BigDecimal.ZERO;
		
		
		return total;
	}
	public Ryodoraku getRyodoraku() {
		return ryodoraku;
	}

	public List<Pessoa> getClientes() {
		return clientes;
	}

	public List<Profissional> getProfissionais() {
		return profissionais;
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

	public RyodorakuLadoDireito getRyodorakuLadoDireito() {
		return ryodorakuLadoDireito;
	}

	public RyodorakuLadoEsquerdo getRyodorakuLadoEsquerdo() {
		return ryodorakuLadoEsquerdo;
	}
	
}
