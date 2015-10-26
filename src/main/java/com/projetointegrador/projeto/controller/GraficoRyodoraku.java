package com.projetointegrador.projeto.controller;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;

import com.projetointegrador.projeto.repository.RyodorakuRepository;
import com.projetointegrador.projeto.ryororaku.Ryodoraku;

@Named
@ViewScoped
public class GraficoRyodoraku implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Ryodoraku ryodoraku;
	
	@Inject
	private RyodorakuRepository repository;
	
	private LineChartModel lineModel1;
 
     
    @PostConstruct
    public void init() {
    	Map<String, String> params =  FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		String urlID = params.get("ryodoraku");
		
		if(urlID == null){
			this.ryodoraku = (Ryodoraku)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("ryodoraku");
		}
		else{
			Long id = new Long(urlID);
			this.ryodoraku = repository.buscarPorId(id);
		}
    	createLineModels();        
    }
 
    public LineChartModel getLineModel1() {
        return lineModel1;
    }
 
    private void createLineModels() {
        lineModel1 = initLinearModel();        
        lineModel1.setTitle("Geral");
        lineModel1.setLegendPosition("e");
        lineModel1.getAxes().put(AxisType.X, new CategoryAxis("Years"));
        lineModel1.setAnimate(true);
        lineModel1.setSeriesColors("3e289b, 0080ff, 000000, FF0000, FF0000");        
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(80);       
    }
     
    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();
 
        ChartSeries series1 = new ChartSeries();
        series1.setLabel("Direito");
 
        series1.set("P9", this.ryodoraku.getLadoDireito().getMediaLD_P9());
        series1.set("CS7", this.ryodoraku.getLadoDireito().getMediaLD_CS7());
        series1.set("C7", this.ryodoraku.getLadoDireito().getMediaLD_C7());
        series1.set("ID5", this.ryodoraku.getLadoDireito().getMediaLD_ID5());

        series1.set("TR4", this.ryodoraku.getLadoDireito().getMediaLD_TR4());
        series1.set("IG5", this.ryodoraku.getLadoDireito().getMediaLD_IG5());
        series1.set("BP3", this.ryodoraku.getLadoDireito().getMediaLD_BP3());
        series1.set("F3", this.ryodoraku.getLadoDireito().getMediaLD_F3());

        series1.set("R4", this.ryodoraku.getLadoDireito().getMediaLD_R4());
        series1.set("B65", this.ryodoraku.getLadoDireito().getMediaLD_B65());
        series1.set("VB40", this.ryodoraku.getLadoDireito().getMediaLD_VB40());
        series1.set("E42", this.ryodoraku.getLadoDireito().getMediaLD_E42());
        
 
        ChartSeries series2 = new ChartSeries();
        series2.setLabel("Esquerdo");
 
        series2.set("P9", this.ryodoraku.getLadoEsquerdo().getMediaLE_P9());
        series2.set("CS7", this.ryodoraku.getLadoEsquerdo().getMediaLE_CS7());
        series2.set("C7", this.ryodoraku.getLadoEsquerdo().getMediaLE_C7());
        series2.set("ID5", this.ryodoraku.getLadoEsquerdo().getMediaLE_ID5());

        series2.set("TR4", this.ryodoraku.getLadoEsquerdo().getMediaLE_TR4());
        series2.set("IG5", this.ryodoraku.getLadoEsquerdo().getMediaLE_IG5());
        series2.set("BP3", this.ryodoraku.getLadoEsquerdo().getMediaLE_BP3());
        series2.set("F3", this.ryodoraku.getLadoEsquerdo().getMediaLE_F3());

        series2.set("R4", this.ryodoraku.getLadoEsquerdo().getMediaLE_R4());
        series2.set("B65", this.ryodoraku.getLadoEsquerdo().getMediaLE_B65());
        series2.set("VB40", this.ryodoraku.getLadoEsquerdo().getMediaLE_VB40());
        series2.set("E42", this.ryodoraku.getLadoEsquerdo().getMediaLE_E42());
        
        ChartSeries series3 = new ChartSeries();
        series3.setLabel("Referência");
 
        series3.set("P9", this.ryodoraku.getReferenciaGrafico());
        series3.set("CS7", this.ryodoraku.getReferenciaGrafico());
        series3.set("C7", this.ryodoraku.getReferenciaGrafico());
        series3.set("ID5", this.ryodoraku.getReferenciaGrafico());

        series3.set("TR4", this.ryodoraku.getReferenciaGrafico());
        series3.set("IG5", this.ryodoraku.getReferenciaGrafico());
        series3.set("BP3", this.ryodoraku.getReferenciaGrafico());
        series3.set("F3", this.ryodoraku.getReferenciaGrafico());

        series3.set("R4", this.ryodoraku.getReferenciaGrafico());
        series3.set("B65", this.ryodoraku.getReferenciaGrafico());
        series3.set("VB40", this.ryodoraku.getReferenciaGrafico());
        series3.set("E42", this.ryodoraku.getReferenciaGrafico());
        
        ChartSeries series4 = new ChartSeries();
        series4.setLabel("Limite Superior");
        
        series4.set("P9", this.ryodoraku.getLimiteSuperior());
        series4.set("CS7", this.ryodoraku.getLimiteSuperior());
        series4.set("C7", this.ryodoraku.getLimiteSuperior());
        series4.set("ID5", this.ryodoraku.getLimiteSuperior());

        series4.set("TR4", this.ryodoraku.getLimiteSuperior());
        series4.set("IG5", this.ryodoraku.getLimiteSuperior());
        series4.set("BP3", this.ryodoraku.getLimiteSuperior());
        series4.set("F3", this.ryodoraku.getLimiteSuperior());

        series4.set("R4", this.ryodoraku.getLimiteSuperior());
        series4.set("B65", this.ryodoraku.getLimiteSuperior());
        series4.set("VB40", this.ryodoraku.getLimiteSuperior());
        series4.set("E42", this.ryodoraku.getLimiteSuperior());
        
        ChartSeries series5 = new ChartSeries();
        series5.setLabel("Limite Inferior");
        
        series5.set("P9", this.ryodoraku.getLimiteInferior());
        series5.set("CS7", this.ryodoraku.getLimiteInferior());
        series5.set("C7", this.ryodoraku.getLimiteInferior());
        series5.set("ID5", this.ryodoraku.getLimiteInferior());

        series5.set("TR4", this.ryodoraku.getLimiteInferior());
        series5.set("IG5", this.ryodoraku.getLimiteInferior());
        series5.set("BP3", this.ryodoraku.getLimiteInferior());
        series5.set("F3", this.ryodoraku.getLimiteInferior());

        series5.set("R4", this.ryodoraku.getLimiteInferior());
        series5.set("B65", this.ryodoraku.getLimiteInferior());
        series5.set("VB40", this.ryodoraku.getLimiteInferior());
        series5.set("E42", this.ryodoraku.getLimiteInferior());
 
        model.addSeries(series1);
        model.addSeries(series2);
        model.addSeries(series3);
        model.addSeries(series4);
        model.addSeries(series5);        
         
        return model;
    }
     
    

	public Ryodoraku getRyodoraku() {
		return ryodoraku;
	}

	public void setRyodoraku(Ryodoraku ryodoraku) {
		this.ryodoraku = ryodoraku;
	}
}
