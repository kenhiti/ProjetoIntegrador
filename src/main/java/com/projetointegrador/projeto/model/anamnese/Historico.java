package com.projetointegrador.projeto.model.anamnese;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Historico implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String motivoConsulta;
	private String antecedentesPatologicos;
	private String habitosAlimentares;
	private String desejos;
	private String aversoes;
	
	@Column(name = "hist_motivo_consulta", nullable = false) 
	public String getMotivoConsulta() {
		return motivoConsulta;
	}
	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}
	
	@Column(name = "hist_antecedentes_patologicos", nullable = false)
	public String getAntecedentesPatologicos() {
		return antecedentesPatologicos;
	}
	public void setAntecedentesPatologicos(String antecedentesPatologicos) {
		this.antecedentesPatologicos = antecedentesPatologicos;
	}
	
	@Column(name = "hist_habitos_alimentares", nullable = false)
	public String getHabitosAlimentares() {
		return habitosAlimentares;
	}
	public void setHabitosAlimentares(String habitosAlimentares) {
		this.habitosAlimentares = habitosAlimentares;
	}
	
	@Column(name = "hist_desejos", nullable = false)
	public String getDesejos() {
		return desejos;
	}
	public void setDesejos(String desejos) {
		this.desejos = desejos;
	}
	
	@Column(name = "hist_aversoes", nullable = false)
	public String getAversoes() {
		return aversoes;
	}
	public void setAversoes(String aversoes) {
		this.aversoes = aversoes;
	}
}
