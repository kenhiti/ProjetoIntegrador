package com.projetointegrador.projeto.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.projetointegrador.projeto.model.Profissional;
import com.projetointegrador.projeto.model.Usuario;
import com.projetointegrador.projeto.repository.ProfissionalRepository;
import com.projetointegrador.projeto.services.CadastroUsuarioService;
import com.projetointegrador.projeto.util.JSF.FacesUtil;

@Named
@ViewScoped
public class CadastroUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;	
	
	private Profissional profissionalSelecionado;	
	
	private List<Profissional> profissionais;
	
	@Inject
	private CadastroUsuarioService cadastroUsuarioService;
	
	@Inject
	private ProfissionalRepository profissionalRepository;
	
	public CadastroUsuarioBean(){
		limpar();		
	}
	
	@PostConstruct
	public void inicializar(){		
		profissionais = profissionalRepository.buscarProfissional();
	}
	
	private void limpar(){
		usuario = new Usuario();
	}

	
	public void salvar(){
		this.usuario.setProfissional(profissionalSelecionado);		
		this.usuario = cadastroUsuarioService.salvar(this.usuario);
		limpar();
		FacesUtil.addInfoMessage("Usuario salvo com sucesso!");
	}		
	
	public Usuario getUsuario() {
		return usuario;
	}	
	
	public void setUsuario(Usuario usuario){
		this.usuario = usuario;
		
		if(this.usuario != null){
			this.profissionalSelecionado = this.usuario.getProfissional();
		}
	}
	
	public List<Profissional> getProfissionais() {
		return profissionais;
	}

	public Profissional getProfissionalSelecionado() {
		return profissionalSelecionado;
	}
	public void setProfissionalSelecionado(Profissional profissionalSelecionado) {
		this.profissionalSelecionado = profissionalSelecionado;
	}
	
	public boolean isEditando(){
		return this.usuario.getId() != null;
	}
	
}
