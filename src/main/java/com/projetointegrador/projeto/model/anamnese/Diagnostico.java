package com.projetointegrador.projeto.model.anamnese;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Diagnostico {

	private String duplaVasos;
	private String meridiano;
	private String fatoresExternos;
	private String fatoresInternos;
	private String localAfetado;
	private String pulso;
	private String qualMeridiano;
	private String etiologia;
	
	@Column(name = "Diagnostico_dupla_de_vasos", nullable = false, length = 50)
	public String getDuplaVasos() {
		return duplaVasos;
	}
	public void setDuplaVasos(String duplaVasos) {
		this.duplaVasos = duplaVasos;
	}
	
	@Column(name = "Diagnostico_meridiano", nullable = false, length = 50)
	public String getMeridiano() {
		return meridiano;
	}
	public void setMeridiano(String meridiano) {
		this.meridiano = meridiano;
	}
	
	@Column(name = "Diagnostico_fatores_externos", nullable = false, length = 50)
	public String getFatoresExternos() {
		return fatoresExternos;
	}
	public void setFatoresExternos(String externos) {
		this.fatoresExternos = externos;
	}
	
	@Column(name = "Diagnostico_fatores_internos", nullable = false, length = 50)
	public String getFatoresInternos() {
		return fatoresInternos;
	}
	public void setFatoresInternos(String internos) {
		this.fatoresInternos = internos;
	}
	
	@Column(name = "Diagnostico_local_afetado", nullable = false, length = 50)
	public String getLocalAfetado() {
		return localAfetado;
	}
	public void setLocalAfetado(String local) {
		this.localAfetado = local;
	}
	
	@Column(name = "Diagnostico_pulso", nullable = false, length = 50)
	public String getPulso() {
		return pulso;
	}
	public void setPulso(String pulso) {
		this.pulso = pulso;
	}
	
	@Column (name = "Diagnostico_qual_meridiano", nullable = false)
	public String getQualMeridiano() {
		return qualMeridiano;
	}
	public void setQualMeridiano(String qualMeridiano) {
		this.qualMeridiano = qualMeridiano;
	}
	
	@Column (name = "Diagnostico_etiologia", nullable = false)
	public String getEtiologia() {
		return etiologia;
	}
	public void setEtiologia(String etiologia) {
		this.etiologia = etiologia;
	}
	
	
}
