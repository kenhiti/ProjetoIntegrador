package com.projetointegrador.projeto.model.anamnese;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Problemas {

		private String transpiracao;
		private String localTranspiracao;
		private String problemasCorRosto;
		private String problemaFrequente;
		
		
		@Column (name = "problema_transpiracao", nullable = false)
		public String getTranspiracao() {
			return transpiracao;
		}
		public void setTranspiracao(String transpiracao) {
			this.transpiracao = transpiracao;
		}
		
		@Column (name = "problema_local_transpiracao", nullable = false)
		public String getLocalTranspiracao() {
			return localTranspiracao;
		}
		public void setLocalTranspiracao(String localTranspiracao) {
			this.localTranspiracao = localTranspiracao;
		}
		
		@Column(name = "problema_cor_rosto", nullable = false, length = 50)
		public String getProblemasCorRosto() {
			return problemasCorRosto;
		}
		public void setProblemasCorRosto(String problemasCorRosto) {
			this.problemasCorRosto = problemasCorRosto;
		}
		
		@Column(name = "problema_problemas_frequentes", nullable = false, length = 50)
		public String getProblemaFrequente() {
			return problemaFrequente;
		}
		public void setProblemaFrequente(String problemaFrequente) {
			this.problemaFrequente = problemaFrequente;
		}		
}
