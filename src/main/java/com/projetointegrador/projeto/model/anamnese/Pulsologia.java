package com.projetointegrador.projeto.model.anamnese;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Pulsologia {

	private String superficialIG_1;
	private String superficialID_1;
	private String profundoP_1;
	private String profundoC_1;
	private String superficialE_2;
	private String superficialVB_2;
	private String profundoBP_2;
	private String profundoF_2;
	private String superficialTA_3;
	private String superficialB_3;
	private String profundoCS_3;
	private String profundoR_3;
	
	private String cor;
	private String aspecto;
	
	private String localAfetado;

	@Column (name = "pulsologia_superficial_IG", nullable = false)
	public String getSuperficialIG_1() {
		return superficialIG_1;
	}
	public void setSuperficialIG_1(String superficialIG_1) {
		this.superficialIG_1 = superficialIG_1;
	}

	@Column (name = "pulsologia_superficial_ID", nullable = false)
	public String getSuperficialID_1() {
		return superficialID_1;
	}	
	public void setSuperficialID_1(String superficialID_1) {
		this.superficialID_1 = superficialID_1;
	}

	@Column (name = "pulsologia_profundo_P", nullable = false)
	public String getProfundoP_1() {
		return profundoP_1;
	}
	public void setProfundoP_1(String profundoP_1) {
		this.profundoP_1 = profundoP_1;
	}

	@Column (name = "pulsologia_profundo_C", nullable = false)
	public String getProfundoC_1() {
		return profundoC_1;
	}
	public void setProfundoC_1(String profundoC_1) {
		this.profundoC_1 = profundoC_1;
	}

	@Column (name = "pulsologia_superficial_E", nullable = false)
	public String getSuperficialE_2() {
		return superficialE_2;
	}
	public void setSuperficialE_2(String superficialE_2) {
		this.superficialE_2 = superficialE_2;
	}

	@Column (name = "pulsologia_superficial_VB", nullable = false)
	public String getSuperficialVB_2() {
		return superficialVB_2;
	}
	public void setSuperficialVB_2(String superficialVB_2) {
		this.superficialVB_2 = superficialVB_2;
	}

	@Column (name = "pulsologia_profundo_BP", nullable = false)
	public String getProfundoBP_2() {
		return profundoBP_2;
	}
	public void setProfundoBP_2(String profundoBP_2) {
		this.profundoBP_2 = profundoBP_2;
	}

	@Column (name = "pulsologia_profundo_F", nullable = false)
	public String getProfundoF_2() {
		return profundoF_2;
	}
	public void setProfundoF_2(String profundoF_2) {
		this.profundoF_2 = profundoF_2;
	}
	@Column (name = "pulsologia_superficial_TA", nullable = false)
	public String getSuperficialTA_3() {
		return superficialTA_3;
	}
	public void setSuperficialTA_3(String superficialTA_3) {
		this.superficialTA_3 = superficialTA_3;
	}

	@Column (name = "pulsologia_superficial_B", nullable = false)
	public String getSuperficialB_3() {
		return superficialB_3;
	}
	public void setSuperficialB_3(String superficialB_3) {
		this.superficialB_3 = superficialB_3;
	}

	@Column (name = "pulsologia_profundo_CS", nullable = false)
	public String getProfundoCS_3() {
		return profundoCS_3;
	}
	public void setProfundoCS_3(String profundoCS_3) {
		this.profundoCS_3 = profundoCS_3;
	}

	@Column (name = "pulsologia_profundo_R", nullable = false)
	public String getProfundoR_3() {
		return profundoR_3;
	}
	public void setProfundoR_3(String profundoR_3) {
		this.profundoR_3 = profundoR_3;
	}

	@Column(name = "pulsologia_cor", nullable = false)
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Column(name = "pulsologia_aspecto", nullable = false)
	public String getAspecto() {
		return aspecto;
	}
	public void setAspecto(String aspecto) {
		this.aspecto = aspecto;
	}

	@Column(name = "pulsologia_local_afetado", nullable = false)
	public String getLocalAfetado() {
		return localAfetado;
	}
	public void setLocalAfetado(String localAfetado) {
		this.localAfetado = localAfetado;
	}	
}
