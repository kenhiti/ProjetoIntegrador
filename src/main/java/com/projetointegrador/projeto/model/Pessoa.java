package com.projetointegrador.projeto.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="pessoa")
public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String documentoIdentificacao;
	private Date dataNascimento;
	private Sexo sexo;
	private String email;
	private String telefone;
	private String celular;
	private Endereco endereco;
		
	@Id // refere ao primary key
	@GeneratedValue  //refere que é auto-incremento no mysql
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@NotBlank
	@Size(max=80)
	@Column (name = "nome",nullable = false, length = 80)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@NotBlank
	@Column (name="doc_documento_identificacao",nullable = false, length = 30)
	public String getDocumentoIdentificacao() {
		return documentoIdentificacao;
	}
	public void setDocumentoIdentificacao(String documentoIdentificacao) {
		this.documentoIdentificacao = documentoIdentificacao;
	}
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@Column (name = "data_nascimento" , nullable = false)
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column (name = "sexo",nullable = false, length = 10)
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	@NotNull
	@Embedded
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@NotBlank
	@Column (name = "email",nullable = false, length = 150)
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@NotBlank
	@Column (name = "telefone",nullable = false, length = 150)
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	@Column (name = "celular",length = 150)
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
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
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
