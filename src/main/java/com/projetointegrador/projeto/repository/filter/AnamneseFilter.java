package com.projetointegrador.projeto.repository.filter;

import java.io.Serializable;
import java.util.Date;

public class AnamneseFilter implements Serializable {

private static final long serialVersionUID = 1L;
	
	private String paciente;
	private String profissional;
	private Date data;
	
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	public String getProfissional() {
		return profissional;
	}
	public void setProfissional(String profissional) {
		this.profissional = profissional;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}
