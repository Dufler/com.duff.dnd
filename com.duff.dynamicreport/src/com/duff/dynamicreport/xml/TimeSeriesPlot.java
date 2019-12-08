//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
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
 *       &lt;attribute name="isShowLines">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isShowShapes">
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
@XmlRootElement(name = "timeSeriesPlot")
public class TimeSeriesPlot {

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
    @XmlAttribute(name = "isShowLines")
    protected String isShowLines;
    @XmlAttribute(name = "isShowShapes")
    protected String isShowShapes;

    /**
     * Recupera il valore della propriet� plot.
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
     * Imposta il valore della propriet� plot.
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
     * Recupera il valore della propriet� timeAxisLabelExpression.
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
     * Imposta il valore della propriet� timeAxisLabelExpression.
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
     * Recupera il valore della propriet� timeAxisFormat.
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
     * Imposta il valore della propriet� timeAxisFormat.
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
     * Recupera il valore della propriet� valueAxisLabelExpression.
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
     * Imposta il valore della propriet� valueAxisLabelExpression.
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
     * Recupera il valore della propriet� valueAxisFormat.
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
     * Imposta il valore della propriet� valueAxisFormat.
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
     * Recupera il valore della propriet� domainAxisMinValueExpression.
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
     * Imposta il valore della propriet� domainAxisMinValueExpression.
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
     * Recupera il valore della propriet� domainAxisMaxValueExpression.
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
     * Imposta il valore della propriet� domainAxisMaxValueExpression.
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
     * Recupera il valore della propriet� rangeAxisMinValueExpression.
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
     * Imposta il valore della propriet� rangeAxisMinValueExpression.
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
     * Recupera il valore della propriet� rangeAxisMaxValueExpression.
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
     * Imposta il valore della propriet� rangeAxisMaxValueExpression.
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
     * Recupera il valore della propriet� isShowLines.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShowLines() {
        return isShowLines;
    }

    /**
     * Imposta il valore della propriet� isShowLines.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShowLines(String value) {
        this.isShowLines = value;
    }

    /**
     * Recupera il valore della propriet� isShowShapes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShowShapes() {
        return isShowShapes;
    }

    /**
     * Imposta il valore della propriet� isShowShapes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShowShapes(String value) {
        this.isShowShapes = value;
    }

}
