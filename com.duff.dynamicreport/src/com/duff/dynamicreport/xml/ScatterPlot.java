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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xAxisLabelExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xAxisFormat" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}yAxisLabelExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}yAxisFormat" minOccurs="0"/>
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
    "xAxisLabelExpression",
    "xAxisFormat",
    "yAxisLabelExpression",
    "yAxisFormat",
    "domainAxisMinValueExpression",
    "domainAxisMaxValueExpression",
    "rangeAxisMinValueExpression",
    "rangeAxisMaxValueExpression"
})
@XmlRootElement(name = "scatterPlot")
public class ScatterPlot {

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
    @XmlAttribute(name = "isShowLines")
    protected String isShowLines;
    @XmlAttribute(name = "isShowShapes")
    protected String isShowShapes;

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
     * Recupera il valore della proprietÓ xAxisLabelExpression.
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
     * Imposta il valore della proprietÓ xAxisLabelExpression.
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
     * Recupera il valore della proprietÓ xAxisFormat.
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
     * Imposta il valore della proprietÓ xAxisFormat.
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
     * Recupera il valore della proprietÓ yAxisLabelExpression.
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
     * Imposta il valore della proprietÓ yAxisLabelExpression.
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
     * Recupera il valore della proprietÓ yAxisFormat.
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
     * Imposta il valore della proprietÓ yAxisFormat.
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
     * Recupera il valore della proprietÓ isShowLines.
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
     * Imposta il valore della proprietÓ isShowLines.
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
     * Recupera il valore della proprietÓ isShowShapes.
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
     * Imposta il valore della proprietÓ isShowShapes.
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
