package com.projetointegrador.projeto.controller;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
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
	
	private Boolean controle;
	
	@Inject
	private ClienteRepository clienteRepository;
	
	@Inject
	private ProfissionalRepository profissionalRepository;
	
	@Inject
	private CadastroRyodorakuService cadastroRyodorakuService;
	
	public CadastroRyodorakuBean(){
		controle = true;
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
		popularObjetoGrafico();
		limpar();
		FacesUtil.addInfoMessage("Paciente salvo com sucesso!");
		controle = false;
	}
	
	public void popularObjetoGrafico(){
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String,Object> sessionaMap = externalContext.getSessionMap();
		sessionaMap.put("ryodoraku", this.ryodoraku);			
	}
	
	private BigDecimal calcularReferencia(){
		Double total = calcularReferenciaDireito() + calcularReferenciaEsquerdo();
		total = total / 2.0;		
		return new BigDecimal(total);
	}
	
	private Double calcularReferenciaDireito(){
		Double soma = ryodorakuLadoDireito.getMediaLD_B65()+ryodorakuLadoDireito.getMediaLD_BP3()+ryodorakuLadoDireito.getMediaLD_C7()+
				ryodorakuLadoDireito.getMediaLD_CS7()+ryodorakuLadoDireito.getMediaLD_E42()+ryodorakuLadoDireito.getMediaLD_F3()+
				ryodorakuLadoDireito.getMediaLD_ID5()+ryodorakuLadoDireito.getMediaLD_IG5()+ryodorakuLadoDireito.getMediaLD_P9()+
				ryodorakuLadoDireito.getMediaLD_R4()+ryodorakuLadoDireito.getMediaLD_TR4()+ryodorakuLadoDireito.getMediaLD_VB40();
		return soma / 12.0;				
	}
	
	private Double calcularReferenciaEsquerdo(){
		Double soma = ryodorakuLadoEsquerdo.getMediaLE_B65()+ryodorakuLadoEsquerdo.getMediaLE_BP3()+ryodorakuLadoEsquerdo.getMediaLE_C7()+
				ryodorakuLadoEsquerdo.getMediaLE_CS7()+ryodorakuLadoEsquerdo.getMediaLE_E42()+ryodorakuLadoEsquerdo.getMediaLE_F3()+
				ryodorakuLadoEsquerdo.getMediaLE_ID5()+ryodorakuLadoEsquerdo.getMediaLE_IG5()+ryodorakuLadoEsquerdo.getMediaLE_P9()+
				ryodorakuLadoEsquerdo.getMediaLE_R4()+ryodorakuLadoEsquerdo.getMediaLE_TR4()+ryodorakuLadoEsquerdo.getMediaLE_VB40();
		return soma / 12.0;		
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

	public Boolean getControle() {
		return controle;
	}

	public void setControle(Boolean controle) {
		this.controle = controle;
	}	
}
