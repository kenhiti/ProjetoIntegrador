package com.projetointegrador.projeto.model.anamnese;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.projetointegrador.projeto.model.Pessoa;
import com.projetointegrador.projeto.model.Profissional;

@Entity
@Table(name = "anamnese")
public class Anamnese implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Date dataCriacao;
	private Pessoa cliente;
	private Profissional profissional;
	private Historico historico;
	private Preferencias preferencias;
	private Problemas problemas;
	private ExameFisico exameFisico;
	private Tipologia tipologia;
	private Pulsologia pulsologia;
	private Diagnostico diagnostico;
	private String conclusao;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_criacao", nullable = false )
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	@ManyToOne
	@JoinColumn(name = "profissional_id")
	public Profissional getProfissional() {
		return profissional;
	}
	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}
	
	@NotNull
	@Embedded
	public Historico getHistorico() {
		return historico;
	}
	public void setHistorico(Historico historico) {
		this.historico = historico;
	}
	
	@NotNull
	@Embedded
	public Preferencias getPreferencias() {
		return preferencias;
	}
	public void setPreferencias(Preferencias preferencias) {
		this.preferencias = preferencias;
	}
	
	@NotNull
	@Embedded
	public Problemas getProblemas() {
		return problemas;
	}
	public void setProblemas(Problemas problemas) {
		this.problemas = problemas;
	}
	
	@NotNull
	@Embedded
	public ExameFisico getExameFisico() {
		return exameFisico;
	}
	public void setExameFisico(ExameFisico exameFisico) {
		this.exameFisico = exameFisico;
	}
	
	@NotNull
	@Embedded
	public Tipologia getTipologia() {
		return tipologia;
	}
	public void setTipologia(Tipologia tipologia) {
		this.tipologia = tipologia;
	}
	
	@NotNull
	@Embedded
	public Pulsologia getPulsologia() {
		return pulsologia;
	}
	public void setPulsologia(Pulsologia pulsologia) {
		this.pulsologia = pulsologia;
	}
	
	@NotNull
	@Embedded
	public Diagnostico getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	@NotBlank
	@Column (columnDefinition = "text")
	public String getConclusao() {
		return conclusao;
	}
	public void setConclusao(String conclusao) {
		this.conclusao = conclusao;
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Anamnese other = (Anamnese) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
