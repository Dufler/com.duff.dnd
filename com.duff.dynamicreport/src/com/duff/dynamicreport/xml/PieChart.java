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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}piePlot"/>
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
    "piePlot"
})
@XmlRootElement(name = "pieChart")
public class PieChart {

    @XmlElement(required = true)
    protected Chart chart;
    @XmlElement(required = true)
    protected PieDataset pieDataset;
    @XmlElement(required = true)
    protected PiePlot piePlot;

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
     * Recupera il valore della proprietà piePlot.
     * 
     * @return
     *     possible object is
     *     {@link PiePlot }
     *     
     */
    public PiePlot getPiePlot() {
        return piePlot;
    }

    /**
     * Imposta il valore della proprietà piePlot.
     * 
     * @param value
     *     allowed object is
     *     {@link PiePlot }
     *     
     */
    public void setPiePlot(PiePlot value) {
        this.piePlot = value;
    }

}
