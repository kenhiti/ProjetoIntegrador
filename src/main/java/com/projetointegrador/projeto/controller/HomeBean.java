package com.projetointegrador.projeto.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import com.projetointegrador.projeto.security.SpringUser;

@Named
@RequestScoped
public class HomeBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	
	private String user;
	private String perfil;
	
	@PostConstruct
	public void init(){
		user = getUsuarioLogado().getUsuario().getProfissional().getNome();
		perfil = getUsuarioLogado().getUsuario().getPerfil();
	}
	
	public String getNomeUsuario() {
		String nome = null;
		
		SpringUser usuarioLogado = getUsuarioLogado();
		
		if (usuarioLogado != null) {
			nome = usuarioLogado.getUsuario().getProfissional().getNome();
		}
		
		return nome;
	}

	private SpringUser getUsuarioLogado() {
		SpringUser usuario = null;
		
		UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken)FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal();
		
		if (auth != null && auth.getPrincipal() != null) {
			usuario = (SpringUser) auth.getPrincipal();
		}
		
		return usuario;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}	
}
