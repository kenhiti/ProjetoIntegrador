package com.projetointegrador.projeto.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.projetointegrador.projeto.model.Usuario;
import com.projetointegrador.projeto.repository.UsuarioRepository;
import com.projetointegrador.projeto.repository.filter.UsuarioFilter;
import com.projetointegrador.projeto.util.JSF.FacesUtil;

@Named
@ViewScoped
public class PesquisaUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Usuario usuarioSelecionado;
	
	@Inject
	private UsuarioRepository usuarioRepository;
	
	private UsuarioFilter filtro;
	
	private List<Usuario> usuariosFiltrados;
	
	public PesquisaUsuarioBean() {
		filtro = new UsuarioFilter();
		usuariosFiltrados = new ArrayList<Usuario>();
	}
	
	public void pesquisar(){
		usuariosFiltrados = usuarioRepository.filtrados(filtro);	
		
	}
	
	public void excluir(){
		usuarioRepository.excluir(this.usuarioSelecionado);
		usuariosFiltrados.remove(this.usuarioSelecionado);
		FacesUtil.addInfoMessage("Usuario: "+this.usuarioSelecionado.getProfissional().getNome()+" excluído com sucesso.");
	}

	public List<Usuario> getUsuariosFiltrados() {
		return usuariosFiltrados;
	}

	public UsuarioFilter getFiltro() {
		return filtro;
	}

	public Usuario getUsuarioSelecionado() {
		return usuarioSelecionado;
	}

	public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
		this.usuarioSelecionado = usuarioSelecionado;
	}	
}
