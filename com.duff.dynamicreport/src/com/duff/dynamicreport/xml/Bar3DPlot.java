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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}itemLabel" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}categoryAxisLabelExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}categoryAxisFormat" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueAxisLabelExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueAxisFormat" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}domainAxisMinValueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}domainAxisMaxValueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rangeAxisMinValueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rangeAxisMaxValueExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isShowLabels">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="xOffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="yOffset" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "itemLabel",
    "categoryAxisLabelExpression",
    "categoryAxisFormat",
    "valueAxisLabelExpression",
    "valueAxisFormat",
    "domainAxisMinValueExpression",
    "domainAxisMaxValueExpression",
    "rangeAxisMinValueExpression",
    "rangeAxisMaxValueExpression"
})
@XmlRootElement(name = "bar3DPlot")
public class Bar3DPlot {

    @XmlElement(required = true)
    protected Plot plot;
    protected ItemLabel itemLabel;
    protected CategoryAxisLabelExpression categoryAxisLabelExpression;
    protected CategoryAxisFormat categoryAxisFormat;
    protected ValueAxisLabelExpression valueAxisLabelExpression;
    protected ValueAxisFormat valueAxisFormat;
    protected DomainAxisMinValueExpression domainAxisMinValueExpression;
    protected DomainAxisMaxValueExpression domainAxisMaxValueExpression;
    protected RangeAxisMinValueExpression rangeAxisMinValueExpression;
    protected RangeAxisMaxValueExpression rangeAxisMaxValueExpression;
    @XmlAttribute(name = "isShowLabels")
    protected String isShowLabels;
    @XmlAttribute(name = "xOffset")
    protected String xOffset;
    @XmlAttribute(name = "yOffset")
    protected String yOffset;

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
     * Recupera il valore della propriet� itemLabel.
     * 
     * @return
     *     possible object is
     *     {@link ItemLabel }
     *     
     */
    public ItemLabel getItemLabel() {
        return itemLabel;
    }

    /**
     * Imposta il valore della propriet� itemLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLabel }
     *     
     */
    public void setItemLabel(ItemLabel value) {
        this.itemLabel = value;
    }

    /**
     * Recupera il valore della propriet� categoryAxisLabelExpression.
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
     * Imposta il valore della propriet� categoryAxisLabelExpression.
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
     * Recupera il valore della propriet� categoryAxisFormat.
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
     * Imposta il valore della propriet� categoryAxisFormat.
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
     * Recupera il valore della propriet� isShowLabels.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShowLabels() {
        return isShowLabels;
    }

    /**
     * Imposta il valore della propriet� isShowLabels.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShowLabels(String value) {
        this.isShowLabels = value;
    }

    /**
     * Recupera il valore della propriet� xOffset.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXOffset() {
        return xOffset;
    }

    /**
     * Imposta il valore della propriet� xOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXOffset(String value) {
        this.xOffset = value;
    }

    /**
     * Recupera il valore della propriet� yOffset.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYOffset() {
        return yOffset;
    }

    /**
     * Imposta il valore della propriet� yOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYOffset(String value) {
        this.yOffset = value;
    }

}