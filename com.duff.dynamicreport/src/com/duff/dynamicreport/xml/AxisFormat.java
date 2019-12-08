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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}labelFont" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}tickLabelFont" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="labelColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tickLabelColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tickLabelMask" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="verticalTickLabels" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="axisLineColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "labelFont",
    "tickLabelFont"
})
@XmlRootElement(name = "axisFormat")
public class AxisFormat {

    protected LabelFont labelFont;
    protected TickLabelFont tickLabelFont;
    @XmlAttribute(name = "labelColor")
    protected String labelColor;
    @XmlAttribute(name = "tickLabelColor")
    protected String tickLabelColor;
    @XmlAttribute(name = "tickLabelMask")
    protected String tickLabelMask;
    @XmlAttribute(name = "verticalTickLabels")
    protected Boolean verticalTickLabels;
    @XmlAttribute(name = "axisLineColor")
    protected String axisLineColor;

    /**
     * Recupera il valore della proprietà labelFont.
     * 
     * @return
     *     possible object is
     *     {@link LabelFont }
     *     
     */
    public LabelFont getLabelFont() {
        return labelFont;
    }

    /**
     * Imposta il valore della proprietà labelFont.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelFont }
     *     
     */
    public void setLabelFont(LabelFont value) {
        this.labelFont = value;
    }

    /**
     * Recupera il valore della proprietà tickLabelFont.
     * 
     * @return
     *     possible object is
     *     {@link TickLabelFont }
     *     
     */
    public TickLabelFont getTickLabelFont() {
        return tickLabelFont;
    }

    /**
     * Imposta il valore della proprietà tickLabelFont.
     * 
     * @param value
     *     allowed object is
     *     {@link TickLabelFont }
     *     
     */
    public void setTickLabelFont(TickLabelFont value) {
        this.tickLabelFont = value;
    }

    /**
     * Recupera il valore della proprietà labelColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelColor() {
        return labelColor;
    }

    /**
     * Imposta il valore della proprietà labelColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelColor(String value) {
        this.labelColor = value;
    }

    /**
     * Recupera il valore della proprietà tickLabelColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTickLabelColor() {
        return tickLabelColor;
    }

    /**
     * Imposta il valore della proprietà tickLabelColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTickLabelColor(String value) {
        this.tickLabelColor = value;
    }

    /**
     * Recupera il valore della proprietà tickLabelMask.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTickLabelMask() {
        return tickLabelMask;
    }

    /**
     * Imposta il valore della proprietà tickLabelMask.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTickLabelMask(String value) {
        this.tickLabelMask = value;
    }

    /**
     * Recupera il valore della proprietà verticalTickLabels.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerticalTickLabels() {
        return verticalTickLabels;
    }

    /**
     * Imposta il valore della proprietà verticalTickLabels.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerticalTickLabels(Boolean value) {
        this.verticalTickLabels = value;
    }

    /**
     * Recupera il valore della proprietà axisLineColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxisLineColor() {
        return axisLineColor;
    }

    /**
     * Imposta il valore della proprietà axisLineColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxisLineColor(String value) {
        this.axisLineColor = value;
    }

}
