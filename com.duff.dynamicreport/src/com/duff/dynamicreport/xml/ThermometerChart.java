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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueDataset"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}thermometerPlot"/>
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
    "valueDataset",
    "thermometerPlot"
})
@XmlRootElement(name = "thermometerChart")
public class ThermometerChart {

    @XmlElement(required = true)
    protected Chart chart;
    @XmlElement(required = true)
    protected ValueDataset valueDataset;
    @XmlElement(required = true)
    protected ThermometerPlot thermometerPlot;

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
     * Recupera il valore della propriet� valueDataset.
     * 
     * @return
     *     possible object is
     *     {@link ValueDataset }
     *     
     */
    public ValueDataset getValueDataset() {
        return valueDataset;
    }

    /**
     * Imposta il valore della propriet� valueDataset.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueDataset }
     *     
     */
    public void setValueDataset(ValueDataset value) {
        this.valueDataset = value;
    }

    /**
     * Recupera il valore della propriet� thermometerPlot.
     * 
     * @return
     *     possible object is
     *     {@link ThermometerPlot }
     *     
     */
    public ThermometerPlot getThermometerPlot() {
        return thermometerPlot;
    }

    /**
     * Imposta il valore della propriet� thermometerPlot.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermometerPlot }
     *     
     */
    public void setThermometerPlot(ThermometerPlot value) {
        this.thermometerPlot = value;
    }

}
