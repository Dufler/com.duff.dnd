//
// Questo file Ŕ stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrÓ persa durante la ricompilazione dello schema di origine. 
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}timeAxisLabelExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}timeAxisFormat" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueAxisLabelExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueAxisFormat" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}domainAxisMinValueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}domainAxisMaxValueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rangeAxisMinValueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rangeAxisMaxValueExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isShowVolume">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
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
    "timeAxisLabelExpression",
    "timeAxisFormat",
    "valueAxisLabelExpression",
    "valueAxisFormat",
    "domainAxisMinValueExpression",
    "domainAxisMaxValueExpression",
    "rangeAxisMinValueExpression",
    "rangeAxisMaxValueExpression"
})
@XmlRootElement(name = "candlestickPlot")
public class CandlestickPlot {

    @XmlElement(required = true)
    protected Plot plot;
    protected TimeAxisLabelExpression timeAxisLabelExpression;
    protected TimeAxisFormat timeAxisFormat;
    protected ValueAxisLabelExpression valueAxisLabelExpression;
    protected ValueAxisFormat valueAxisFormat;
    protected DomainAxisMinValueExpression domainAxisMinValueExpression;
    protected DomainAxisMaxValueExpression domainAxisMaxValueExpression;
    protected RangeAxisMinValueExpression rangeAxisMinValueExpression;
    protected RangeAxisMaxValueExpression rangeAxisMaxValueExpression;
    @XmlAttribute(name = "isShowVolume")
    protected String isShowVolume;

    /**
     * Recupera il valore della proprietÓ plot.
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
     * Imposta il valore della proprietÓ plot.
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
     * Recupera il valore della proprietÓ timeAxisLabelExpression.
     * 
     * @return
     *     possible object is
     *     {@link TimeAxisLabelExpression }
     *     
     */
    public TimeAxisLabelExpression getTimeAxisLabelExpression() {
        return timeAxisLabelExpression;
    }

    /**
     * Imposta il valore della proprietÓ timeAxisLabelExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeAxisLabelExpression }
     *     
     */
    public void setTimeAxisLabelExpression(TimeAxisLabelExpression value) {
        this.timeAxisLabelExpression = value;
    }

    /**
     * Recupera il valore della proprietÓ timeAxisFormat.
     * 
     * @return
     *     possible object is
     *     {@link TimeAxisFormat }
     *     
     */
    public TimeAxisFormat getTimeAxisFormat() {
        return timeAxisFormat;
    }

    /**
     * Imposta il valore della proprietÓ timeAxisFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeAxisFormat }
     *     
     */
    public void setTimeAxisFormat(TimeAxisFormat value) {
        this.timeAxisFormat = value;
    }

    /**
     * Recupera il valore della proprietÓ valueAxisLabelExpression.
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
     * Imposta il valore della proprietÓ valueAxisLabelExpression.
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
     * Recupera il valore della proprietÓ valueAxisFormat.
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
     * Imposta il valore della proprietÓ valueAxisFormat.
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
     * Recupera il valore della proprietÓ domainAxisMinValueExpression.
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
     * Imposta il valore della proprietÓ domainAxisMinValueExpression.
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
     * Recupera il valore della proprietÓ domainAxisMaxValueExpression.
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
     * Imposta il valore della proprietÓ domainAxisMaxValueExpression.
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
     * Recupera il valore della proprietÓ rangeAxisMinValueExpression.
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
     * Imposta il valore della proprietÓ rangeAxisMinValueExpression.
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
     * Recupera il valore della proprietÓ rangeAxisMaxValueExpression.
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
     * Imposta il valore della proprietÓ rangeAxisMaxValueExpression.
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
     * Recupera il valore della proprietÓ isShowVolume.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShowVolume() {
        return isShowVolume;
    }

    /**
     * Imposta il valore della proprietÓ isShowVolume.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShowVolume(String value) {
        this.isShowVolume = value;
    }

}
