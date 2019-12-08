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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}seriesExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xValueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}yValueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}labelExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}itemHyperlink" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="autoSort">
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
    "seriesExpression",
    "xValueExpression",
    "yValueExpression",
    "labelExpression",
    "itemHyperlink"
})
@XmlRootElement(name = "xySeries")
public class XySeries {

    protected SeriesExpression seriesExpression;
    protected XValueExpression xValueExpression;
    protected YValueExpression yValueExpression;
    protected LabelExpression labelExpression;
    protected ItemHyperlink itemHyperlink;
    @XmlAttribute(name = "autoSort")
    protected String autoSort;

    /**
     * Recupera il valore della proprietà seriesExpression.
     * 
     * @return
     *     possible object is
     *     {@link SeriesExpression }
     *     
     */
    public SeriesExpression getSeriesExpression() {
        return seriesExpression;
    }

    /**
     * Imposta il valore della proprietà seriesExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesExpression }
     *     
     */
    public void setSeriesExpression(SeriesExpression value) {
        this.seriesExpression = value;
    }

    /**
     * Recupera il valore della proprietà xValueExpression.
     * 
     * @return
     *     possible object is
     *     {@link XValueExpression }
     *     
     */
    public XValueExpression getXValueExpression() {
        return xValueExpression;
    }

    /**
     * Imposta il valore della proprietà xValueExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link XValueExpression }
     *     
     */
    public void setXValueExpression(XValueExpression value) {
        this.xValueExpression = value;
    }

    /**
     * Recupera il valore della proprietà yValueExpression.
     * 
     * @return
     *     possible object is
     *     {@link YValueExpression }
     *     
     */
    public YValueExpression getYValueExpression() {
        return yValueExpression;
    }

    /**
     * Imposta il valore della proprietà yValueExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link YValueExpression }
     *     
     */
    public void setYValueExpression(YValueExpression value) {
        this.yValueExpression = value;
    }

    /**
     * Recupera il valore della proprietà labelExpression.
     * 
     * @return
     *     possible object is
     *     {@link LabelExpression }
     *     
     */
    public LabelExpression getLabelExpression() {
        return labelExpression;
    }

    /**
     * Imposta il valore della proprietà labelExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelExpression }
     *     
     */
    public void setLabelExpression(LabelExpression value) {
        this.labelExpression = value;
    }

    /**
     * Recupera il valore della proprietà itemHyperlink.
     * 
     * @return
     *     possible object is
     *     {@link ItemHyperlink }
     *     
     */
    public ItemHyperlink getItemHyperlink() {
        return itemHyperlink;
    }

    /**
     * Imposta il valore della proprietà itemHyperlink.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemHyperlink }
     *     
     */
    public void setItemHyperlink(ItemHyperlink value) {
        this.itemHyperlink = value;
    }

    /**
     * Recupera il valore della proprietà autoSort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoSort() {
        return autoSort;
    }

    /**
     * Imposta il valore della proprietà autoSort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoSort(String value) {
        this.autoSort = value;
    }

}
