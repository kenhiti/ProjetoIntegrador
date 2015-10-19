package com.projetointegrador.projeto.repository.filter;

import java.io.Serializable;
import java.util.Date;

import com.projetointegrador.projeto.model.Pessoa;
import com.projetointegrador.projeto.model.Profissional;

public class AnamneseFilter implements Serializable {

private static final long serialVersionUID = 1L;
	
	private Pessoa paciente;
	private Profissional profissional;
	private Date data;
	
	public Pessoa getPaciente() {
		return paciente;
	}
	public void setPaciente(Pessoa paciente) {
		this.paciente = paciente;
	}
	public Profissional getProfissional() {
		return profissional;
	}
	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}
