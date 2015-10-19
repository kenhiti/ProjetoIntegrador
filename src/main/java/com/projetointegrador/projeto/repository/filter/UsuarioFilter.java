package com.projetointegrador.projeto.repository.filter;

import java.io.Serializable;

public class UsuarioFilter implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nomePaciente;
	private String nomeProfissional;
	private String login;
		
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getNomeProfissional() {
		return nomeProfissional;
	}
	public void setNomeProfissional(String nomeProfissional) {
		this.nomeProfissional = nomeProfissional;
	}
	
	
	
}
