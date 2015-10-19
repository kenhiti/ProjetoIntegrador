package com.projetointegrador.projeto.ryororaku;

import java.io.Serializable;
import java.math.BigDecimal;
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

import com.projetointegrador.projeto.model.Pessoa;
import com.projetointegrador.projeto.model.Profissional;

@Entity
@Table (name= "ryodoraku")
public class Ryodoraku implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Date datahj;
	private Pessoa cliente;
	private Profissional profissional;
	private RyodorakuLadoDireito ladoDireito;
	private RyodorakuLadoEsquerdo ladoEsquerdo;
	
	private BigDecimal limiteSuperior;
	private BigDecimal limiteInferior;
	private BigDecimal referenciaGrafico;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name= "data_criacao", nullable = false, length = 15)
	public Date getDatahj() {
		return datahj;
	}
	public void setDatahj(Date datahj) {
		this.datahj = datahj;
	}
	
	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	
	@ManyToOne
	@JoinColumn(name = "profissional_id", nullable = false)
	public Profissional getProfissional() {
		return profissional;
	}
	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}
	
	@NotNull
	@Embedded
	public RyodorakuLadoDireito getLadoDireito() {
		return ladoDireito;
	}
	public void setLadoDireito(RyodorakuLadoDireito ladoDireito) {
		this.ladoDireito = ladoDireito;
	}
	
	@NotNull
	@Embedded
	public RyodorakuLadoEsquerdo getLadoEsquerdo() {
		return ladoEsquerdo;
	}
	public void setLadoEsquerdo(RyodorakuLadoEsquerdo ladoEsquerdo) {
		this.ladoEsquerdo = ladoEsquerdo;
	}
	
	@Column (name = "limite_superior", nullable = false, precision = 10, scale = 2)
	public BigDecimal getLimiteSuperior() {
		return limiteSuperior;
	}
	public void setLimiteSuperior(BigDecimal limiteSuperior) {
		this.limiteSuperior = limiteSuperior;
	}
	
	@Column (name = "limite_inferior", nullable = false, precision = 10, scale = 2)
	public BigDecimal getLimiteInferior() {
		return limiteInferior;
	}
	public void setLimiteInferior(BigDecimal limiteInferior) {
		this.limiteInferior = limiteInferior;
	}
	
	@Column (name = "referencia_grafico", nullable = false, precision = 10, scale = 2)
	public BigDecimal getReferenciaGrafico() {
		return referenciaGrafico;
	}
	public void setReferenciaGrafico(BigDecimal referenciaGrafico) {
		this.referenciaGrafico = referenciaGrafico;
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
		Ryodoraku other = (Ryodoraku) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
	
}
