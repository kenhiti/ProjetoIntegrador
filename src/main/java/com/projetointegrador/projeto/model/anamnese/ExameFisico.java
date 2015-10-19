package com.projetointegrador.projeto.model.anamnese;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ExameFisico {

	private String peso;
	private String PA;
	private String fezes;
	private String sono;
	private String dentes;
	private String altura;
	private String voz;
	private String urina;
	private String menstruacao;
	private String narizGarganta;
	private String FC;
	private String olhos;
	private String digestao;
	private String sistemaReprodutor;
	private String postura;
	
	
	@Column (name = "exame_fisico_peso", nullable = false)
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	@Column (name = "exame_fisico_PA", nullable = false)
	public String getPA() {
		return PA;
	}
	public void setPA(String pA) {
		PA = pA;
	}
	
	@Column (name = "exame_fisico_fezes", nullable = false)
	public String getFezes() {
		return fezes;
	}
	public void setFezes(String fezes) {
		this.fezes = fezes;
	}
	
	@Column (name = "exame_fisico_sono", nullable = false)
	public String getSono() {
		return sono;
	}
	public void setSono(String sono) {
		this.sono = sono;
	}
	
	@Column (name = "exame_fisico_dentes", nullable = false)
	public String getDentes() {
		return dentes;
	}
	public void setDentes(String dentes) {
		this.dentes = dentes;
	}
	
	@Column (name = "exame_fisico_altura", nullable = false)
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	@Column (name = "exame_fisico_voz", nullable = false)
	public String getVoz() {
		return voz;
	}
	public void setVoz(String voz) {
		this.voz = voz;
	}
	
	@Column (name = "exame_fisico_urina", nullable = false)
	public String getUrina() {
		return urina;
	}
	public void setUrina(String urina) {
		this.urina = urina;
	}
	
	@Column (name = "exame_fisico_menstruacao", nullable = false)
	public String getMenstruacao() {
		return menstruacao;
	}
	public void setMenstruacao(String menstruacao) {
		this.menstruacao = menstruacao;
	}
	
	@Column (name = "exame_fisico_nariz_garganta", nullable = false)
	public String getNarizGarganta() {
		return narizGarganta;
	}
	public void setNarizGarganta(String narizGarganta) {
		this.narizGarganta = narizGarganta;
	}
	
	@Column (name = "exame_fisico_FC", nullable = false)
	public String getFC() {
		return FC;
	}
	public void setFC(String fC) {
		FC = fC;
	}
	
	@Column (name = "exame_fisico_olhos", nullable = false)
	public String getOlhos() {
		return olhos;
	}
	public void setOlhos(String olhos) {
		this.olhos = olhos;
	}
	
	@Column (name = "exame_fisico_digestao", nullable = false)
	public String getDigestao() {
		return digestao;
	}
	public void setDigestao(String digestao) {
		this.digestao = digestao;
	}
	
	@Column (name = "exame_fisico_sistema_reprodutor", nullable = false)
	public String getSistemaReprodutor() {
		return sistemaReprodutor;
	}
	public void setSistemaReprodutor(String sistemaReprodutor) {
		this.sistemaReprodutor = sistemaReprodutor;
	}
	
	@Column (name = "exame_fisico_postura", nullable = false)
	public String getPostura() {
		return postura;
	}
	public void setPostura(String postura) {
		this.postura = postura;
	}	
}
