//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pieDataset"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pie3DPlot"/>
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
    "pieDataset",
    "pie3DPlot"
})
@XmlRootElement(name = "pie3DChart")
public class Pie3DChart {

    @XmlElement(required = true)
    protected Chart chart;
    @XmlElement(required = true)
    protected PieDataset pieDataset;
    @XmlElement(required = true)
    protected Pie3DPlot pie3DPlot;

    /**
     * Recupera il valore della proprietà chart.
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
     * Imposta il valore della proprietà chart.
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
     * Recupera il valore della proprietà pieDataset.
     * 
     * @return
     *     possible object is
     *     {@link PieDataset }
     *     
     */
    public PieDataset getPieDataset() {
        return pieDataset;
    }

    /**
     * Imposta il valore della proprietà pieDataset.
     * 
     * @param value
     *     allowed object is
     *     {@link PieDataset }
     *     
     */
    public void setPieDataset(PieDataset value) {
        this.pieDataset = value;
    }

    /**
     * Recupera il valore della proprietà pie3DPlot.
     * 
     * @return
     *     possible object is
     *     {@link Pie3DPlot }
     *     
     */
    public Pie3DPlot getPie3DPlot() {
        return pie3DPlot;
    }

    /**
     * Imposta il valore della proprietà pie3DPlot.
     * 
     * @param value
     *     allowed object is
     *     {@link Pie3DPlot }
     *     
     */
    public void setPie3DPlot(Pie3DPlot value) {
        this.pie3DPlot = value;
    }

}
