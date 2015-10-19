package com.projetointegrador.projeto.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Pessoa pessoa;
	private Profissional profissional;
	private String email;
	private String senha;
	private Boolean restricaoAcesso;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@NotBlank
	@Column (name = "email" , length = 50 )
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@NotBlank
	@Column (name = "senha" , length = 50)
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@OneToOne
	@JoinColumn(name = "pessoa_id", nullable = true)
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;		
	}
	
	@OneToOne
	@JoinColumn(name="profissional_id", nullable = true)
	public Profissional getProfissional() {
		return profissional;
	}
	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}
	
	@NotNull
	@Column (name = "controle", nullable = false, length = 10)
	public Boolean getRestricaoAcesso() {
		return restricaoAcesso;
	}
	public void setRestricaoAcesso(Boolean restricaoAcesso) {
		this.restricaoAcesso = restricaoAcesso;
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
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}
