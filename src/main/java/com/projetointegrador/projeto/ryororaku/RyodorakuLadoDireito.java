package com.projetointegrador.projeto.ryororaku;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RyodorakuLadoDireito {

	private Double LD_P9_1, LD_P9_2, LD_P9_3;
	private Double LD_CS7_1, LD_CS7_2, LD_CS7_3;
	private Double LD_C7_1, LD_C7_2, LD_C7_3;
	private Double LD_ID5_1, LD_ID5_2, LD_ID5_3;
	private Double LD_TR4_1, LD_TR4_2, LD_TR4_3;
	private Double LD_IG5_1, LD_IG5_2, LD_IG5_3;
	private Double LD_BP3_1, LD_BP3_2, LD_BP3_3;
	private Double LD_F3_1, LD_F3_2, LD_F3_3;
	private Double LD_R4_1, LD_R4_2, LD_R4_3;
	private Double LD_B65_1, LD_B65_2, LD_B65_3;
	private Double LD_VB40_1, LD_VB40_2, LD_VB40_3;
	private Double LD_E42_1, LD_E42_2, LD_E42_3;
	private Double mediaLD_P9;
	private Double mediaLD_CS7;
	private Double mediaLD_C7;
	private Double mediaLD_ID5;
	private Double mediaLD_TR4;
	private Double mediaLD_IG5;
	private Double mediaLD_BP3;
	private Double mediaLD_F3;
	private Double mediaLD_R4;
	private Double mediaLD_B65;
	private Double mediaLD_VB40;
	private Double mediaLD_E42;	
	
	@Column (name = "media_ld_p9", nullable = false, precision = 10, scale = 2)
	public Double getMediaLD_P9() {
		return mediaLD_P9;
	}
	public void setMediaLD_P9(Double mediaLD_P9) {
		this.mediaLD_P9 = mediaLD_P9;
	}
	
	@Column (name = "media_ld_cs7", nullable = false, precision = 10, scale = 2)
	public Double getMediaLD_CS7() {
		return mediaLD_CS7;
	}
	public void setMediaLD_CS7(Double mediaLD_CS7) {
		this.mediaLD_CS7 = mediaLD_CS7;
	}
	
	@Column (name = "media_ld_c7", nullable = false, precision = 10, scale = 2)
	public Double getMediaLD_C7() {
		return mediaLD_C7;
	}
	public void setMediaLD_C7(Double mediaLD_C7) {
		this.mediaLD_C7 = mediaLD_C7;
	}
	
	@Column (name = "media_ld_id5", nullable = false, precision = 10, scale = 2)
	public Double getMediaLD_ID5() {
		return mediaLD_ID5;
	}
	public void setMediaLD_ID5(Double mediaLD_ID5) {
		this.mediaLD_ID5 = mediaLD_ID5;
	}
	
	@Column (name = "media_ld_tr4", nullable = false, precision = 10, scale = 2)
	public Double getMediaLD_TR4() {
		return mediaLD_TR4;
	}
	public void setMediaLD_TR4(Double mediaLD_TR4) {
		this.mediaLD_TR4 = mediaLD_TR4;
	}
	
	@Column (name = "media_ld_ig5", nullable = false, precision = 10, scale = 2)
	public Double getMediaLD_IG5() {
		return mediaLD_IG5;
	}
	public void setMediaLD_IG5(Double mediaLD_IG5) {
		this.mediaLD_IG5 = mediaLD_IG5;
	}
	
	@Column (name = "media_ld_bp3", nullable = false, precision = 10, scale = 2)
	public Double getMediaLD_BP3() {
		return mediaLD_BP3;
	}
	public void setMediaLD_BP3(Double mediaLD_BP3) {
		this.mediaLD_BP3 = mediaLD_BP3;
	}
	
	@Column (name = "media_ld_f3", nullable = false, precision = 10, scale = 2)
	public Double getMediaLD_F3() {
		return mediaLD_F3;
	}
	public void setMediaLD_F3(Double mediaLD_F3) {
		this.mediaLD_F3 = mediaLD_F3;
	}
	
	@Column (name = "media_ld_r4", nullable = false, precision = 10, scale = 2)
	public Double getMediaLD_R4() {
		return mediaLD_R4;
	}
	public void setMediaLD_R4(Double mediaLD_R4) {
		this.mediaLD_R4 = mediaLD_R4;
	}
	
	@Column (name = "media_ld_b65", nullable = false, precision = 10, scale = 2)
	public Double getMediaLD_B65() {
		return mediaLD_B65;
	}
	public void setMediaLD_B65(Double mediaLD_B65) {
		this.mediaLD_B65 = mediaLD_B65;
	}
	
	@Column (name = "media_ld_vb40", nullable = false, precision = 10, scale = 2)
	public Double getMediaLD_VB40() {
		return mediaLD_VB40;
	}
	public void setMediaLD_VB40(Double mediaLD_VB40) {
		this.mediaLD_VB40 = mediaLD_VB40;
	}	
	@Column (name = "media_ld_e42", nullable = false, precision = 10, scale = 2)
	public Double getMediaLD_E42() {
		return mediaLD_E42;
	}
	public void setMediaLD_E42(Double mediaLD_E42) {
		this.mediaLD_E42 = mediaLD_E42;
	}	
	public Double getLD_P9_1() {
		return LD_P9_1;
	}	
	public void setLD_P9_1(Double lD_P9_1) {
		LD_P9_1 = lD_P9_1;
	}
	public Double getLD_P9_2() {
		return LD_P9_2;
	}
	public void setLD_P9_2(Double lD_P9_2) {
		LD_P9_2 = lD_P9_2;
	}	
	public Double getLD_P9_3() {
		return LD_P9_3;
	}
	public void setLD_P9_3(Double lD_P9_3) {
		LD_P9_3 = lD_P9_3;
	}	
	public Double getLD_CS7_1() {
		return LD_CS7_1;
	}
	public void setLD_CS7_1(Double lD_CS7_1) {
		LD_CS7_1 = lD_CS7_1;
	}	
	public Double getLD_CS7_2() {
		return LD_CS7_2;
	}
	public void setLD_CS7_2(Double lD_CS_2) {
		LD_CS7_2 = lD_CS_2;
	}	
	public Double getLD_CS7_3() {
		return LD_CS7_3;
	}
	public void setLD_CS7_3(Double lD_CS7_3) {
		LD_CS7_3 = lD_CS7_3;
	}	
	public Double getLD_C7_1() {
		return LD_C7_1;
	}
	public void setLD_C7_1(Double lD_C7_1) {
		LD_C7_1 = lD_C7_1;
	}	
	public Double getLD_C7_2() {
		return LD_C7_2;
	}
	public void setLD_C7_2(Double lD_C7_2) {
		LD_C7_2 = lD_C7_2;
	}	
	public Double getLD_C7_3() {
		return LD_C7_3;
	}
	public void setLD_C7_3(Double lD_C7_3) {
		LD_C7_3 = lD_C7_3;
	}	
	public Double getLD_ID5_1() {
		return LD_ID5_1;
	}
	public void setLD_ID5_1(Double lD_ID5_1) {
		LD_ID5_1 = lD_ID5_1;
	}	
	public Double getLD_ID5_2() {
		return LD_ID5_2;
	}
	public void setLD_ID5_2(Double lD_ID5_2) {
		LD_ID5_2 = lD_ID5_2;
	}	
	public Double getLD_ID5_3() {
		return LD_ID5_3;
	}
	public void setLD_ID5_3(Double lD_ID5_3) {
		LD_ID5_3 = lD_ID5_3;
	}	
	public Double getLD_TR4_1() {
		return LD_TR4_1;
	}
	public void setLD_TR4_1(Double lD_TR4_1) {
		LD_TR4_1 = lD_TR4_1;
	}	
	public Double getLD_TR4_2() {
		return LD_TR4_2;
	}
	public void setLD_TR4_2(Double lD_TR4_2) {
		LD_TR4_2 = lD_TR4_2;
	}	
	public Double getLD_TR4_3() {
		return LD_TR4_3;
	}
	public void setLD_TR4_3(Double lD_TR4_3) {
		LD_TR4_3 = lD_TR4_3;
	}	
	public Double getLD_IG5_1() {
		return LD_IG5_1;
	}
	public void setLD_IG5_1(Double lD_IG5_1) {
		LD_IG5_1 = lD_IG5_1;
	}	
	public Double getLD_IG5_2() {
		return LD_IG5_2;
	}
	public void setLD_IG5_2(Double lD_IG5_2) {
		LD_IG5_2 = lD_IG5_2;
	}	
	public Double getLD_IG5_3() {
		return LD_IG5_3;
	}
	public void setLD_IG5_3(Double lD_IG5_3) {
		LD_IG5_3 = lD_IG5_3;
	}	
	public Double getLD_BP3_1() {
		return LD_BP3_1;
	}
	public void setLD_BP3_1(Double lD_BP3_1) {
		LD_BP3_1 = lD_BP3_1;
	}	
	public Double getLD_BP3_2() {
		return LD_BP3_2;
	}
	public void setLD_BP3_2(Double lD_BP3_2) {
		LD_BP3_2 = lD_BP3_2;
	}	
	public Double getLD_BP3_3() {
		return LD_BP3_3;
	}
	public void setLD_BP3_3(Double lD_BP3_3) {
		LD_BP3_3 = lD_BP3_3;
	}	
	public Double getLD_F3_1() {
		return LD_F3_1;
	}
	public void setLD_F3_1(Double lD_F3_1) {
		LD_F3_1 = lD_F3_1;
	}	
	public Double getLD_F3_2() {
		return LD_F3_2;
	}
	public void setLD_F3_2(Double lD_F3_2) {
		LD_F3_2 = lD_F3_2;
	}	
	public Double getLD_F3_3() {
		return LD_F3_3;
	}
	public void setLD_F3_3(Double lD_F3_3) {
		LD_F3_3 = lD_F3_3;
	}	
	public Double getLD_R4_1() {
		return LD_R4_1;
	}
	public void setLD_R4_1(Double lD_R4_1) {
		LD_R4_1 = lD_R4_1;
	}	
	public Double getLD_R4_2() {
		return LD_R4_2;
	}
	public void setLD_R4_2(Double lD_R4_2) {
		LD_R4_2 = lD_R4_2;
	}	
	public Double getLD_R4_3() {
		return LD_R4_3;
	}
	public void setLD_R4_3(Double lD_R4_3) {
		LD_R4_3 = lD_R4_3;
	}	
	public Double getLD_B65_1() {
		return LD_B65_1;
	}
	public void setLD_B65_1(Double lD_B65_1) {
		LD_B65_1 = lD_B65_1;
	}	
	public Double getLD_B65_2() {
		return LD_B65_2;
	}
	public void setLD_B65_2(Double lD_B65_2) {
		LD_B65_2 = lD_B65_2;
	}	
	public Double getLD_B65_3() {
		return LD_B65_3;
	}
	public void setLD_B65_3(Double lD_B65_3) {
		LD_B65_3 = lD_B65_3;
	}	
	public Double getLD_VB40_1() {
		return LD_VB40_1;
	}
	public void setLD_VB40_1(Double lD_VB40_1) {
		LD_VB40_1 = lD_VB40_1;
	}	
	public Double getLD_VB40_2() {
		return LD_VB40_2;
	}
	public void setLD_VB40_2(Double lD_VB40_2) {
		LD_VB40_2 = lD_VB40_2;
	}	
	public Double getLD_VB40_3() {
		return LD_VB40_3;
	}
	public void setLD_VB40_3(Double lD_VB40_3) {
		LD_VB40_3 = lD_VB40_3;
	}	
	public Double getLD_E42_1() {
		return LD_E42_1;
	}
	public void setLD_E42_1(Double lD_E42_1) {
		LD_E42_1 = lD_E42_1;
	}	
	public Double getLD_E42_2() {
		return LD_E42_2;
	}
	public void setLD_E42_2(Double lD_E42_2) {
		LD_E42_2 = lD_E42_2;
	}	
	public Double getLD_E42_3() {
		return LD_E42_3;
	}
	public void setLD_E42_3(Double lD_E42_3) {
		LD_E42_3 = lD_E42_3;
	}		
	
	public void calcularLadoDireitoP9(){
		this.mediaLD_P9 = (this.LD_P9_1+this.LD_P9_2+this.LD_P9_3) / 3;			
	}
	public void calcularLadoDireitoCS7(){
		this.mediaLD_CS7 = (this.LD_CS7_1+this.LD_CS7_2+this.LD_CS7_3) / 3;				
	}
	public void calcularLadoDireitoC7(){
		this.mediaLD_C7 = (this.LD_C7_1+this.LD_C7_2+this.LD_C7_3) / 3;				
	}
	public void calcularLadoDireitoID5(){
		this.mediaLD_ID5 = (this.LD_ID5_1+this.LD_ID5_2+this.LD_ID5_3) / 3;				
	}
	public void calcularLadoDireitoTR4(){
		this.mediaLD_TR4 = (this.LD_TR4_1+this.LD_TR4_2+this.LD_TR4_3) / 3;			
	}
	public void calcularLadoDireitoIG5(){
		this.mediaLD_IG5 = (this.LD_IG5_1+this.LD_IG5_2+this.LD_IG5_3) / 3;				
	}
	public void calcularLadoDireitoBP3(){
		this.mediaLD_BP3 = (this.LD_BP3_1+this.LD_BP3_2+this.LD_BP3_3) / 3;				
	}
	public void calcularLadoDireitoF3(){
		this.mediaLD_F3 = (this.LD_F3_1+this.LD_F3_2+this.LD_F3_3) / 3;			
	}
	public void calcularLadoDireitoR4(){
		this.mediaLD_R4 = (this.LD_R4_1+this.LD_R4_2+this.LD_R4_3) / 3;				
	}
	public void calcularLadoDireitoB65(){
		this.mediaLD_B65 = (this.LD_B65_1+this.LD_B65_2+this.LD_B65_3) / 3;				
	}
	public void calcularLadoDireitoVB40(){
		this.mediaLD_VB40 = (this.LD_VB40_1+this.LD_VB40_2+this.LD_VB40_3) / 3;		
	}
	public void calcularLadoDireitoE42(){
		this.mediaLD_E42 = (this.LD_E42_1+this.LD_E42_2+this.LD_E42_3) / 3;			
	}
}
