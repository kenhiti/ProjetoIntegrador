package com.projetointegrador.projeto.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.projetointegrador.projeto.model.Usuario;

public class SpringUser extends User {
	
	private static final long serialVersionUID = 1L;

	private Usuario usuario;
	
	public SpringUser(Usuario usuario, 	Collection<? extends GrantedAuthority> authorities) {
		super(usuario.getLogin(), usuario.getSenha(), authorities);
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
