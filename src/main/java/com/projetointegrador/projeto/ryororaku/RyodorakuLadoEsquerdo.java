package com.projetointegrador.projeto.ryororaku;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RyodorakuLadoEsquerdo {

	private Double LE_P9_1, LE_P9_2, LE_P9_3;
	private Double LE_CS7_1, LE_CS7_2, LE_CS7_3;
	private Double LE_C7_1, LE_C7_2, LE_C7_3;
	private Double LE_ID5_1, LE_ID5_2, LE_ID5_3;
	private Double LE_TR4_1, LE_TR4_2, LE_TR4_3;
	private Double LE_IG5_1, LE_IG5_2, LE_IG5_3;
	private Double LE_BP3_1, LE_BP3_2, LE_BP3_3;
	private Double LE_F3_1, LE_F3_2, LE_F3_3;
	private Double LE_R4_1, LE_R4_2, LE_R4_3;
	private Double LE_B65_1, LE_B65_2, LE_B65_3;
	private Double LE_VB40_1, LE_VB40_2, LE_VB40_3;
	private Double LE_E42_1, LE_E42_2, LE_E42_3;
	private Double mediaLE_P9;
	private Double mediaLE_CS7;
	private Double mediaLE_C7;
	private Double mediaLE_ID5;
	private Double mediaLE_TR4;
	private Double mediaLE_IG5;
	private Double mediaLE_BP3;
	private Double mediaLE_F3;
	private Double mediaLE_R4;
	private Double mediaLE_B65;
	private Double mediaLE_VB40;
	private Double mediaLE_E42;
	
		
	@Column(name = "media_le_p9", nullable = false, precision = 10, scale = 2)
	public Double getMediaLE_P9() {
		return mediaLE_P9;
	}
	public void setMediaLE_P9(Double mediaLE_P9) {
		this.mediaLE_P9 = mediaLE_P9;
	}
	
	@Column(name = "media_le_cs7", nullable = false, precision = 10, scale = 2)
	public Double getMediaLE_CS7() {
		return mediaLE_CS7;
	}
	public void setMediaLE_CS7(Double mediaLE_CS7) {
		this.mediaLE_CS7 = mediaLE_CS7;
	}
	
	@Column(name = "media_le_c7", nullable = false, precision = 10, scale = 2)
	public Double getMediaLE_C7() {
		return mediaLE_C7;
	}
	public void setMediaLE_C7(Double mediaLE_C7) {
		this.mediaLE_C7 = mediaLE_C7;
	}
	
	@Column(name = "media_le_id5", nullable = false, precision = 10, scale = 2)
	public Double getMediaLE_ID5() {
		return mediaLE_ID5;
	}
	public void setMediaLE_ID5(Double mediaLE_ID5) {
		this.mediaLE_ID5 = mediaLE_ID5;
	}
	
	@Column(name = "media_le_tr4", nullable = false, precision = 10, scale = 2)
	public Double getMediaLE_TR4() {
		return mediaLE_TR4;
	}
	public void setMediaLE_TR4(Double mediaLE_TR4) {
		this.mediaLE_TR4 = mediaLE_TR4;
	}
	
	@Column(name = "media_le_ig5", nullable = false, precision = 10, scale = 2)
	public Double getMediaLE_IG5() {
		return mediaLE_IG5;
	}
	public void setMediaLE_IG5(Double mediaLE_IG5) {
		this.mediaLE_IG5 = mediaLE_IG5;
	}
	
	@Column(name = "media_le_bp3", nullable = false, precision = 10, scale = 2)
	public Double getMediaLE_BP3() {
		return mediaLE_BP3;
	}
	public void setMediaLE_BP3(Double mediaLE_BP3) {
		this.mediaLE_BP3 = mediaLE_BP3;
	}
	
	@Column(name = "media_le_f3", nullable = false, precision = 10, scale = 2)
	public Double getMediaLE_F3() {
		return mediaLE_F3;
	}
	public void setMediaLE_F3(Double mediaLE_F3) {
		this.mediaLE_F3 = mediaLE_F3;
	}
	
	@Column(name = "media_le_r4", nullable = false, precision = 10, scale = 2)
	public Double getMediaLE_R4() {
		return mediaLE_R4;
	}
	public void setMediaLE_R4(Double mediaLE_R4) {
		this.mediaLE_R4 = mediaLE_R4;
	}
	
	@Column(name = "media_le_b65", nullable = false, precision = 10, scale = 2)
	public Double getMediaLE_B65() {
		return mediaLE_B65;
	}
	public void setMediaLE_B65(Double mediaLE_B65) {
		this.mediaLE_B65 = mediaLE_B65;
	}
	
	@Column(name = "media_le_vb40", nullable = false, precision = 10, scale = 2)
	public Double getMediaLE_VB40() {
		return mediaLE_VB40;
	}
	public void setMediaLE_VB40(Double mediaLE_VB40) {
		this.mediaLE_VB40 = mediaLE_VB40;
	}
	
	@Column(name = "media_le_e42", nullable = false, precision = 10, scale = 2)
	public Double getMediaLE_E42() {
		return mediaLE_E42;
	}
	public void setMediaLE_E42(Double mediaLE_E42) {
		this.mediaLE_E42 = mediaLE_E42;
	}
	
	public Double getLE_P9_1() {
		return LE_P9_1;
	}
	public void setLE_P9_1(Double lE_P9_1) {
		LE_P9_1 = lE_P9_1;
	}
	public Double getLE_P9_2() {
		return LE_P9_2;
	}
	public void setLE_P9_2(Double lE_P9_2) {
		LE_P9_2 = lE_P9_2;
	}
	public Double getLE_P9_3() {
		return LE_P9_3;
	}
	public void setLE_P9_3(Double lE_P9_3) {
		LE_P9_3 = lE_P9_3;
	}
	public Double getLE_CS7_1() {
		return LE_CS7_1;
	}
	public void setLE_CS7_1(Double lE_CS7_1) {
		LE_CS7_1 = lE_CS7_1;
	}
	public Double getLE_CS7_2() {
		return LE_CS7_2;
	}
	public void setLE_CS7_2(Double lE_CS7_2) {
		LE_CS7_2 = lE_CS7_2;
	}
	public Double getLE_CS7_3() {
		return LE_CS7_3;
	}
	public void setLE_CS7_3(Double lE_CS7_3) {
		LE_CS7_3 = lE_CS7_3;
	}
	public Double getLE_C7_1() {
		return LE_C7_1;
	}
	public void setLE_C7_1(Double lE_C7_1) {
		LE_C7_1 = lE_C7_1;
	}
	public Double getLE_C7_2() {
		return LE_C7_2;
	}
	public void setLE_C7_2(Double lE_C7_2) {
		LE_C7_2 = lE_C7_2;
	}
	public Double getLE_C7_3() {
		return LE_C7_3;
	}
	public void setLE_C7_3(Double lE_C7_3) {
		LE_C7_3 = lE_C7_3;
	}
	public Double getLE_ID5_1() {
		return LE_ID5_1;
	}
	public void setLE_ID5_1(Double lE_ID5_1) {
		LE_ID5_1 = lE_ID5_1;
	}
	public Double getLE_ID5_2() {
		return LE_ID5_2;
	}
	public void setLE_ID5_2(Double lE_ID5_2) {
		LE_ID5_2 = lE_ID5_2;
	}
	public Double getLE_ID5_3() {
		return LE_ID5_3;
	}
	public void setLE_ID5_3(Double lE_ID5_3) {
		LE_ID5_3 = lE_ID5_3;
	}
	public Double getLE_TR4_1() {
		return LE_TR4_1;
	}
	public void setLE_TR4_1(Double lE_TR4_1) {
		LE_TR4_1 = lE_TR4_1;
	}
	public Double getLE_TR4_2() {
		return LE_TR4_2;
	}
	public void setLE_TR4_2(Double lE_TR4_2) {
		LE_TR4_2 = lE_TR4_2;
	}
	public Double getLE_TR4_3() {
		return LE_TR4_3;
	}
	public void setLE_TR4_3(Double lE_TR4_3) {
		LE_TR4_3 = lE_TR4_3;
	}
	public Double getLE_IG5_1() {
		return LE_IG5_1;
	}
	public void setLE_IG5_1(Double lE_IG5_1) {
		LE_IG5_1 = lE_IG5_1;
	}
	public Double getLE_IG5_2() {
		return LE_IG5_2;
	}
	public void setLE_IG5_2(Double lE_IG5_2) {
		LE_IG5_2 = lE_IG5_2;
	}
	public Double getLE_IG5_3() {
		return LE_IG5_3;
	}
	public void setLE_IG5_3(Double lE_IG5_3) {
		LE_IG5_3 = lE_IG5_3;
	}
	public Double getLE_BP3_1() {
		return LE_BP3_1;
	}
	public void setLE_BP3_1(Double lE_BP3_1) {
		LE_BP3_1 = lE_BP3_1;
	}
	public Double getLE_BP3_2() {
		return LE_BP3_2;
	}
	public void setLE_BP3_2(Double lE_BP3_2) {
		LE_BP3_2 = lE_BP3_2;
	}
	public Double getLE_BP3_3() {
		return LE_BP3_3;
	}
	public void setLE_BP3_3(Double lE_BP3_3) {
		LE_BP3_3 = lE_BP3_3;
	}
	public Double getLE_F3_1() {
		return LE_F3_1;
	}
	public void setLE_F3_1(Double lE_F3_1) {
		LE_F3_1 = lE_F3_1;
	}
	public Double getLE_F3_2() {
		return LE_F3_2;
	}
	public void setLE_F3_2(Double lE_F3_2) {
		LE_F3_2 = lE_F3_2;
	}
	public Double getLE_F3_3() {
		return LE_F3_3;
	}
	public void setLE_F3_3(Double lE_F3_3) {
		LE_F3_3 = lE_F3_3;
	}
	public Double getLE_R4_1() {
		return LE_R4_1;
	}
	public void setLE_R4_1(Double lE_R4_1) {
		LE_R4_1 = lE_R4_1;
	}
	public Double getLE_R4_2() {
		return LE_R4_2;
	}
	public void setLE_R4_2(Double lE_R4_2) {
		LE_R4_2 = lE_R4_2;
	}
	public Double getLE_R4_3() {
		return LE_R4_3;
	}
	public void setLE_R4_3(Double lE_R4_3) {
		LE_R4_3 = lE_R4_3;
	}
	public Double getLE_B65_1() {
		return LE_B65_1;
	}
	public void setLE_B65_1(Double lE_B65_1) {
		LE_B65_1 = lE_B65_1;
	}
	public Double getLE_B65_2() {
		return LE_B65_2;
	}
	public void setLE_B65_2(Double lE_B65_2) {
		LE_B65_2 = lE_B65_2;
	}
	public Double getLE_B65_3() {
		return LE_B65_3;
	}
	public void setLE_B65_3(Double lE_B65_3) {
		LE_B65_3 = lE_B65_3;
	}
	public Double getLE_VB40_1() {
		return LE_VB40_1;
	}
	public void setLE_VB40_1(Double lE_VB40_1) {
		LE_VB40_1 = lE_VB40_1;
	}
	public Double getLE_VB40_2() {
		return LE_VB40_2;
	}
	public void setLE_VB40_2(Double lE_VB40_2) {
		LE_VB40_2 = lE_VB40_2;
	}
	public Double getLE_VB40_3() {
		return LE_VB40_3;
	}
	public void setLE_VB40_3(Double lE_VB40_3) {
		LE_VB40_3 = lE_VB40_3;
	}
	public Double getLE_E42_1() {
		return LE_E42_1;
	}
	public void setLE_E42_1(Double lE_E42_1) {
		LE_E42_1 = lE_E42_1;
	}
	public Double getLE_E42_2() {
		return LE_E42_2;
	}
	public void setLE_E42_2(Double lE_E42_2) {
		LE_E42_2 = lE_E42_2;
	}
	public Double getLE_E42_3() {
		return LE_E42_3;
	}
	public void setLE_E42_3(Double lE_E42_3) {
		LE_E42_3 = lE_E42_3;
	}
	
	public void calcularLadoEsquerdoP9(){		
		this.mediaLE_P9 = (this.LE_P9_1+this.LE_P9_2+this.LE_P9_3) / 3;				
	}	
	public void calcularLadoEsquerdoCS7(){		
		this.mediaLE_CS7 = (this.LE_CS7_1+this.LE_CS7_2+this.LE_CS7_3) / 3;				
	}	
	public void calcularLadoEsquerdoC7(){		
		this.mediaLE_C7 = (this.LE_C7_1+this.LE_C7_2+this.LE_C7_3) / 3;				
	}	
	public void calcularLadoEsquerdoID5(){		
		this.mediaLE_ID5 = (this.LE_ID5_1+this.LE_ID5_2+this.LE_ID5_3) / 3;				
	}
	public void calcularLadoEsquerdoTR4(){		
		this.mediaLE_TR4 = (this.LE_TR4_1+this.LE_TR4_2+this.LE_TR4_3) / 3;				
	}	
	public void calcularLadoEsquerdoIG5(){		
		this.mediaLE_IG5 = (this.LE_IG5_1+this.LE_IG5_2+this.LE_IG5_3) / 3;				
	}	
	public void calcularLadoEsquerdoBP3(){		
		this.mediaLE_BP3 = (this.LE_BP3_1+this.LE_BP3_2+this.LE_BP3_3) / 3;				
	}
	public void calcularLadoEsquerdoF3(){		
		this.mediaLE_F3 = (this.LE_F3_1+this.LE_F3_2+this.LE_F3_3) / 3;				
	}	
	public void calcularLadoEsquerdoR4(){		
		this.mediaLE_R4 = (this.LE_R4_1+this.LE_R4_2+this.LE_R4_3) / 3;				
	}	
	public void calcularLadoEsquerdoB65(){		
		this.mediaLE_B65 = (this.LE_B65_1+this.LE_B65_2+this.LE_B65_3) / 3;				
	}
	public void calcularLadoEsquerdoVB40(){		
		this.mediaLE_VB40 = (this.LE_VB40_1+this.LE_VB40_2+this.LE_VB40_3) / 3;				
	}
	public void calcularLadoEsquerdoE42(){		
		this.mediaLE_E42 = (this.LE_E42_1+this.LE_E42_2+this.LE_E42_3) / 3;				
	}
}
