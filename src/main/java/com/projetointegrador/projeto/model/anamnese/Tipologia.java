package com.projetointegrador.projeto.model.anamnese;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Tipologia {

	private String morfologia;
	private String maos;
	private String face;
	private String corpo;
	
		
	@Column (name = "tipologia_maos", nullable = false)
	public String getMaos() {
		return maos;
	}
	public void setMaos(String maos) {
		this.maos = maos;
	}
	
	@Column (name = "tipologia_face", nullable = false)

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}
	
	@Column (name = "tipologia_corpo", nullable = false)
	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}
	
	@Column(name = "morfologia", nullable = false)
	public String getMorfologia() {
		return morfologia;
	}
	public void setMorfologia(String morfologia) {
		this.morfologia = morfologia;
	}
	
	
}
