//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.25 alle 11:10:35 PM CET 
//


package com.duff.dynamicreport.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}plot"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xAxisLabelExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xAxisFormat" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}yAxisLabelExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}yAxisFormat" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}domainAxisMinValueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}domainAxisMaxValueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rangeAxisMinValueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rangeAxisMaxValueExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="scaleType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="BothAxes"/>
 *             &lt;enumeration value="DomainAxis"/>
 *             &lt;enumeration value="RangeAxis"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "plot",
    "xAxisLabelExpression",
    "xAxisFormat",
    "yAxisLabelExpression",
    "yAxisFormat",
    "domainAxisMinValueExpression",
    "domainAxisMaxValueExpression",
    "rangeAxisMinValueExpression",
    "rangeAxisMaxValueExpression"
})
@XmlRootElement(name = "bubblePlot")
public class BubblePlot {

    @XmlElement(required = true)
    protected Plot plot;
    protected XAxisLabelExpression xAxisLabelExpression;
    protected XAxisFormat xAxisFormat;
    protected YAxisLabelExpression yAxisLabelExpression;
    protected YAxisFormat yAxisFormat;
    protected DomainAxisMinValueExpression domainAxisMinValueExpression;
    protected DomainAxisMaxValueExpression domainAxisMaxValueExpression;
    protected RangeAxisMinValueExpression rangeAxisMinValueExpression;
    protected RangeAxisMaxValueExpression rangeAxisMaxValueExpression;
    @XmlAttribute(name = "scaleType")
    protected String scaleType;

    /**
     * Recupera il valore della proprietà plot.
     * 
     * @return
     *     possible object is
     *     {@link Plot }
     *     
     */
    public Plot getPlot() {
        return plot;
    }

    /**
     * Imposta il valore della proprietà plot.
     * 
     * @param value
     *     allowed object is
     *     {@link Plot }
     *     
     */
    public void setPlot(Plot value) {
        this.plot = value;
    }

    /**
     * Recupera il valore della proprietà xAxisLabelExpression.
     * 
     * @return
     *     possible object is
     *     {@link XAxisLabelExpression }
     *     
     */
    public XAxisLabelExpression getXAxisLabelExpression() {
        return xAxisLabelExpression;
    }

    /**
     * Imposta il valore della proprietà xAxisLabelExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link XAxisLabelExpression }
     *     
     */
    public void setXAxisLabelExpression(XAxisLabelExpression value) {
        this.xAxisLabelExpression = value;
    }

    /**
     * Recupera il valore della proprietà xAxisFormat.
     * 
     * @return
     *     possible object is
     *     {@link XAxisFormat }
     *     
     */
    public XAxisFormat getXAxisFormat() {
        return xAxisFormat;
    }

    /**
     * Imposta il valore della proprietà xAxisFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link XAxisFormat }
     *     
     */
    public void setXAxisFormat(XAxisFormat value) {
        this.xAxisFormat = value;
    }

    /**
     * Recupera il valore della proprietà yAxisLabelExpression.
     * 
     * @return
     *     possible object is
     *     {@link YAxisLabelExpression }
     *     
     */
    public YAxisLabelExpression getYAxisLabelExpression() {
        return yAxisLabelExpression;
    }

    /**
     * Imposta il valore della proprietà yAxisLabelExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link YAxisLabelExpression }
     *     
     */
    public void setYAxisLabelExpression(YAxisLabelExpression value) {
        this.yAxisLabelExpression = value;
    }

    /**
     * Recupera il valore della proprietà yAxisFormat.
     * 
     * @return
     *     possible object is
     *     {@link YAxisFormat }
     *     
     */
    public YAxisFormat getYAxisFormat() {
        return yAxisFormat;
    }

    /**
     * Imposta il valore della proprietà yAxisFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link YAxisFormat }
     *     
     */
    public void setYAxisFormat(YAxisFormat value) {
        this.yAxisFormat = value;
    }

    /**
     * Recupera il valore della proprietà domainAxisMinValueExpression.
     * 
     * @return
     *     possible object is
     *     {@link DomainAxisMinValueExpression }
     *     
     */
    public DomainAxisMinValueExpression getDomainAxisMinValueExpression() {
        return domainAxisMinValueExpression;
    }

    /**
     * Imposta il valore della proprietà domainAxisMinValueExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainAxisMinValueExpression }
     *     
     */
    public void setDomainAxisMinValueExpression(DomainAxisMinValueExpression value) {
        this.domainAxisMinValueExpression = value;
    }

    /**
     * Recupera il valore della proprietà domainAxisMaxValueExpression.
     * 
     * @return
     *     possible object is
     *     {@link DomainAxisMaxValueExpression }
     *     
     */
    public DomainAxisMaxValueExpression getDomainAxisMaxValueExpression() {
        return domainAxisMaxValueExpression;
    }

    /**
     * Imposta il valore della proprietà domainAxisMaxValueExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainAxisMaxValueExpression }
     *     
     */
    public void setDomainAxisMaxValueExpression(DomainAxisMaxValueExpression value) {
        this.domainAxisMaxValueExpression = value;
    }

    /**
     * Recupera il valore della proprietà rangeAxisMinValueExpression.
     * 
     * @return
     *     possible object is
     *     {@link RangeAxisMinValueExpression }
     *     
     */
    public RangeAxisMinValueExpression getRangeAxisMinValueExpression() {
        return rangeAxisMinValueExpression;
    }

    /**
     * Imposta il valore della proprietà rangeAxisMinValueExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeAxisMinValueExpression }
     *     
     */
    public void setRangeAxisMinValueExpression(RangeAxisMinValueExpression value) {
        this.rangeAxisMinValueExpression = value;
    }

    /**
     * Recupera il valore della proprietà rangeAxisMaxValueExpression.
     * 
     * @return
     *     possible object is
     *     {@link RangeAxisMaxValueExpression }
     *     
     */
    public RangeAxisMaxValueExpression getRangeAxisMaxValueExpression() {
        return rangeAxisMaxValueExpression;
    }

    /**
     * Imposta il valore della proprietà rangeAxisMaxValueExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeAxisMaxValueExpression }
     *     
     */
    public void setRangeAxisMaxValueExpression(RangeAxisMaxValueExpression value) {
        this.rangeAxisMaxValueExpression = value;
    }

    /**
     * Recupera il valore della proprietà scaleType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaleType() {
        return scaleType;
    }

    /**
     * Imposta il valore della proprietà scaleType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaleType(String value) {
        this.scaleType = value;
    }

}
