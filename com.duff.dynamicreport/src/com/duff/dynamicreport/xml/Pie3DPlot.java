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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}itemLabel" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isShowLabels">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="depthFactor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isCircular">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="labelFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="legendLabelFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "itemLabel"
})
@XmlRootElement(name = "pie3DPlot")
public class Pie3DPlot {

    @XmlElement(required = true)
    protected Plot plot;
    protected ItemLabel itemLabel;
    @XmlAttribute(name = "isShowLabels")
    protected String isShowLabels;
    @XmlAttribute(name = "depthFactor")
    protected String depthFactor;
    @XmlAttribute(name = "isCircular")
    protected String isCircular;
    @XmlAttribute(name = "labelFormat")
    protected String labelFormat;
    @XmlAttribute(name = "legendLabelFormat")
    protected String legendLabelFormat;

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
     * Recupera il valore della proprietà itemLabel.
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
     * Imposta il valore della proprietà itemLabel.
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
     * Recupera il valore della proprietà isShowLabels.
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
     * Imposta il valore della proprietà isShowLabels.
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
     * Recupera il valore della proprietà depthFactor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepthFactor() {
        return depthFactor;
    }

    /**
     * Imposta il valore della proprietà depthFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepthFactor(String value) {
        this.depthFactor = value;
    }

    /**
     * Recupera il valore della proprietà isCircular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCircular() {
        return isCircular;
    }

    /**
     * Imposta il valore della proprietà isCircular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCircular(String value) {
        this.isCircular = value;
    }

    /**
     * Recupera il valore della proprietà labelFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelFormat() {
        return labelFormat;
    }

    /**
     * Imposta il valore della proprietà labelFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelFormat(String value) {
        this.labelFormat = value;
    }

    /**
     * Recupera il valore della proprietà legendLabelFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegendLabelFormat() {
        return legendLabelFormat;
    }

    /**
     * Imposta il valore della proprietà legendLabelFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegendLabelFormat(String value) {
        this.legendLabelFormat = value;
    }

}
