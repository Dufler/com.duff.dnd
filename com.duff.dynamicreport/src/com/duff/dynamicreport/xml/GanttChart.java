//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.25 alle 11:10:35 PM CET 
//


package com.duff.dynamicreport.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}chart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}ganttDataset"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}barPlot"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "chart",
    "ganttDataset",
    "barPlot"
})
@XmlRootElement(name = "ganttChart")
public class GanttChart {

    @XmlElement(required = true)
    protected Chart chart;
    @XmlElement(required = true)
    protected GanttDataset ganttDataset;
    @XmlElement(required = true)
    protected BarPlot barPlot;

    /**
     * Recupera il valore della propriet� chart.
     * 
     * @return
     *     possible object is
     *     {@link Chart }
     *     
     */
    public Chart getChart() {
        return chart;
    }

    /**
     * Imposta il valore della propriet� chart.
     * 
     * @param value
     *     allowed object is
     *     {@link Chart }
     *     
     */
    public void setChart(Chart value) {
        this.chart = value;
    }

    /**
     * Recupera il valore della propriet� ganttDataset.
     * 
     * @return
     *     possible object is
     *     {@link GanttDataset }
     *     
     */
    public GanttDataset getGanttDataset() {
        return ganttDataset;
    }

    /**
     * Imposta il valore della propriet� ganttDataset.
     * 
     * @param value
     *     allowed object is
     *     {@link GanttDataset }
     *     
     */
    public void setGanttDataset(GanttDataset value) {
        this.ganttDataset = value;
    }

    /**
     * Recupera il valore della propriet� barPlot.
     * 
     * @return
     *     possible object is
     *     {@link BarPlot }
     *     
     */
    public BarPlot getBarPlot() {
        return barPlot;
    }

    /**
     * Imposta il valore della propriet� barPlot.
     * 
     * @param value
     *     allowed object is
     *     {@link BarPlot }
     *     
     */
    public void setBarPlot(BarPlot value) {
        this.barPlot = value;
    }

}
