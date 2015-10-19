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

@Named
@ViewScoped
public class PesquisaUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
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
		
		for (Usuario x : usuariosFiltrados) {
			System.out.println("teste: " +x.getEmail() );
		}
	}

	public List<Usuario> getUsuariosFiltrados() {
		return usuariosFiltrados;
	}

	public UsuarioFilter getFiltro() {
		return filtro;
	}
	
	
}
