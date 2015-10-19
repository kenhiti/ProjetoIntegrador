package com.projetointegrador.projeto.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.projetointegrador.projeto.model.Pessoa;
import com.projetointegrador.projeto.model.Profissional;
import com.projetointegrador.projeto.model.Usuario;
import com.projetointegrador.projeto.repository.ClienteRepository;
import com.projetointegrador.projeto.repository.ProfissionalRepository;
import com.projetointegrador.projeto.services.CadastroUsuarioService;
import com.projetointegrador.projeto.util.JSF.FacesUtil;

@Named
@ViewScoped
public class CadastroUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;
	
	private Pessoa pessoaSelecionada;
	
	private Profissional profissionalSelecionado;
	
	private List<Pessoa> pessoas ;
	private List<Profissional> profissionais;
	
	@Inject
	private CadastroUsuarioService cadastroUsuarioService;
	
	@Inject
	private ClienteRepository clienteRepository;
	
	@Inject
	private ProfissionalRepository profissionalRepository;
	
	public CadastroUsuarioBean(){
		limpar();		
	}
	
	public void inicializar(){	
		pessoas = clienteRepository.buscarClientes();	
		profissionais = profissionalRepository.buscarProfissional();
	}
	
	private void limpar(){
		usuario = new Usuario();
	}

	
	public void salvar(){
		if(usuario.getRestricaoAcesso() == true){
			this.usuario.setPessoa(pessoaSelecionada);
		}			
		else{
			this.usuario.setProfissional(profissionalSelecionado);
		}
		
		this.usuario = cadastroUsuarioService.salvar(this.usuario);
		limpar();
		FacesUtil.addInfoMessage("Usuario salvo com sucesso!");
	}		
	
	public Usuario getUsuario() {
		return usuario;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
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
	
}
