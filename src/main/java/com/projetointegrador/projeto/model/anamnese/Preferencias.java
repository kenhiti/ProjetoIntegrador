package com.projetointegrador.projeto.model.anamnese;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Preferencias {

	private String preferenciasAmbientais;
	private String preferenciasClimaticas; 
	private String preferenciasEmocao;
	private String preferenciasPalatais;
	private String observacoesGerais;
	
	
	@Column(name = "preferencias_ambientais", nullable = false, length = 50)
	public String getPreferenciasAmbientais() {
		return preferenciasAmbientais;
	}
	public void setPreferenciasAmbientais(String  preferenciasAmbientais) {
		this.preferenciasAmbientais = preferenciasAmbientais;
	}
	
	@Column(name = "preferencias_climaticas", nullable = false, length = 50)
	public String getPreferenciasClimaticas() {
		return preferenciasClimaticas;
	}
	public void setPreferenciasClimaticas(String preferenciasClimaticas) {
		this.preferenciasClimaticas = preferenciasClimaticas;
	}
	
	@Column(name = "preferencias_emocao", nullable = false, length = 50)
	public String getPreferenciasEmocao() {
		return preferenciasEmocao;
	}
	public void setPreferenciasEmocao(String preferenciasEmocao) {
		this.preferenciasEmocao = preferenciasEmocao;
	}

	@Column(name = "preferencias_palatais", nullable = false, length = 50)
	public String getPreferenciasPalatais() {
		return preferenciasPalatais;
	}
	public void setPreferenciasPalatais(String preferenciasPalatais) {
		this.preferenciasPalatais = preferenciasPalatais;
	}
	
	@Column (name = "observacoes_gerais", columnDefinition = "text")
	public String getObservacoesGerais() {
		return observacoesGerais;
	}
	public void setObservacoesGerais(String observacoesGerais) {
		this.observacoesGerais = observacoesGerais;
	}
	
	
	
}
