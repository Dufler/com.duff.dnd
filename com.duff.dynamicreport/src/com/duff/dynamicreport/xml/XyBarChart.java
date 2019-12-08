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
 *         &lt;choice>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}timePeriodDataset"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}timeSeriesDataset"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyDataset"/>
 *         &lt;/choice>
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
    "timePeriodDataset",
    "timeSeriesDataset",
    "xyDataset",
    "barPlot"
})
@XmlRootElement(name = "xyBarChart")
public class XyBarChart {

    @XmlElement(required = true)
    protected Chart chart;
    protected TimePeriodDataset timePeriodDataset;
    protected TimeSeriesDataset timeSeriesDataset;
    protected XyDataset xyDataset;
    @XmlElement(required = true)
    protected BarPlot barPlot;

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
     * Recupera il valore della proprietà timePeriodDataset.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodDataset }
     *     
     */
    public TimePeriodDataset getTimePeriodDataset() {
        return timePeriodDataset;
    }

    /**
     * Imposta il valore della proprietà timePeriodDataset.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodDataset }
     *     
     */
    public void setTimePeriodDataset(TimePeriodDataset value) {
        this.timePeriodDataset = value;
    }

    /**
     * Recupera il valore della proprietà timeSeriesDataset.
     * 
     * @return
     *     possible object is
     *     {@link TimeSeriesDataset }
     *     
     */
    public TimeSeriesDataset getTimeSeriesDataset() {
        return timeSeriesDataset;
    }

    /**
     * Imposta il valore della proprietà timeSeriesDataset.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeriesDataset }
     *     
     */
    public void setTimeSeriesDataset(TimeSeriesDataset value) {
        this.timeSeriesDataset = value;
    }

    /**
     * Recupera il valore della proprietà xyDataset.
     * 
     * @return
     *     possible object is
     *     {@link XyDataset }
     *     
     */
    public XyDataset getXyDataset() {
        return xyDataset;
    }

    /**
     * Imposta il valore della proprietà xyDataset.
     * 
     * @param value
     *     allowed object is
     *     {@link XyDataset }
     *     
     */
    public void setXyDataset(XyDataset value) {
        this.xyDataset = value;
    }

    /**
     * Recupera il valore della proprietà barPlot.
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
     * Imposta il valore della proprietà barPlot.
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
