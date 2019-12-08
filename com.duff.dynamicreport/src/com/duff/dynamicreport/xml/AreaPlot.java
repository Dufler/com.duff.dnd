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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}plot"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}categoryAxisLabelExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}categoryAxisFormat" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueAxisLabelExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueAxisFormat" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}domainAxisMinValueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}domainAxisMaxValueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rangeAxisMinValueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rangeAxisMaxValueExpression" minOccurs="0"/>
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
    "plot",
    "categoryAxisLabelExpression",
    "categoryAxisFormat",
    "valueAxisLabelExpression",
    "valueAxisFormat",
    "domainAxisMinValueExpression",
    "domainAxisMaxValueExpression",
    "rangeAxisMinValueExpression",
    "rangeAxisMaxValueExpression"
})
@XmlRootElement(name = "areaPlot")
public class AreaPlot {

    @XmlElement(required = true)
    protected Plot plot;
    protected CategoryAxisLabelExpression categoryAxisLabelExpression;
    protected CategoryAxisFormat categoryAxisFormat;
    protected ValueAxisLabelExpression valueAxisLabelExpression;
    protected ValueAxisFormat valueAxisFormat;
    protected DomainAxisMinValueExpression domainAxisMinValueExpression;
    protected DomainAxisMaxValueExpression domainAxisMaxValueExpression;
    protected RangeAxisMinValueExpression rangeAxisMinValueExpression;
    protected RangeAxisMaxValueExpression rangeAxisMaxValueExpression;

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
     * Recupera il valore della proprietà categoryAxisLabelExpression.
     * 
     * @return
     *     possible object is
     *     {@link CategoryAxisLabelExpression }
     *     
     */
    public CategoryAxisLabelExpression getCategoryAxisLabelExpression() {
        return categoryAxisLabelExpression;
    }

    /**
     * Imposta il valore della proprietà categoryAxisLabelExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryAxisLabelExpression }
     *     
     */
    public void setCategoryAxisLabelExpression(CategoryAxisLabelExpression value) {
        this.categoryAxisLabelExpression = value;
    }

    /**
     * Recupera il valore della proprietà categoryAxisFormat.
     * 
     * @return
     *     possible object is
     *     {@link CategoryAxisFormat }
     *     
     */
    public CategoryAxisFormat getCategoryAxisFormat() {
        return categoryAxisFormat;
    }

    /**
     * Imposta il valore della proprietà categoryAxisFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryAxisFormat }
     *     
     */
    public void setCategoryAxisFormat(CategoryAxisFormat value) {
        this.categoryAxisFormat = value;
    }

    /**
     * Recupera il valore della proprietà valueAxisLabelExpression.
     * 
     * @return
     *     possible object is
     *     {@link ValueAxisLabelExpression }
     *     
     */
    public ValueAxisLabelExpression getValueAxisLabelExpression() {
        return valueAxisLabelExpression;
    }

    /**
     * Imposta il valore della proprietà valueAxisLabelExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueAxisLabelExpression }
     *     
     */
    public void setValueAxisLabelExpression(ValueAxisLabelExpression value) {
        this.valueAxisLabelExpression = value;
    }

    /**
     * Recupera il valore della proprietà valueAxisFormat.
     * 
     * @return
     *     possible object is
     *     {@link ValueAxisFormat }
     *     
     */
    public ValueAxisFormat getValueAxisFormat() {
        return valueAxisFormat;
    }

    /**
     * Imposta il valore della proprietà valueAxisFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueAxisFormat }
     *     
     */
    public void setValueAxisFormat(ValueAxisFormat value) {
        this.valueAxisFormat = value;
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

}
