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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highLowDataset"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}candlestickPlot"/>
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
    "highLowDataset",
    "candlestickPlot"
})
@XmlRootElement(name = "candlestickChart")
public class CandlestickChart {

    @XmlElement(required = true)
    protected Chart chart;
    @XmlElement(required = true)
    protected HighLowDataset highLowDataset;
    @XmlElement(required = true)
    protected CandlestickPlot candlestickPlot;

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
     * Recupera il valore della proprietà highLowDataset.
     * 
     * @return
     *     possible object is
     *     {@link HighLowDataset }
     *     
     */
    public HighLowDataset getHighLowDataset() {
        return highLowDataset;
    }

    /**
     * Imposta il valore della proprietà highLowDataset.
     * 
     * @param value
     *     allowed object is
     *     {@link HighLowDataset }
     *     
     */
    public void setHighLowDataset(HighLowDataset value) {
        this.highLowDataset = value;
    }

    /**
     * Recupera il valore della proprietà candlestickPlot.
     * 
     * @return
     *     possible object is
     *     {@link CandlestickPlot }
     *     
     */
    public CandlestickPlot getCandlestickPlot() {
        return candlestickPlot;
    }

    /**
     * Imposta il valore della proprietà candlestickPlot.
     * 
     * @param value
     *     allowed object is
     *     {@link CandlestickPlot }
     *     
     */
    public void setCandlestickPlot(CandlestickPlot value) {
        this.candlestickPlot = value;
    }

}
