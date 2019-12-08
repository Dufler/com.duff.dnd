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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}axisFormat"/>
 *       &lt;/sequence>
 *       &lt;attribute name="labelRotation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "axisFormat"
})
@XmlRootElement(name = "categoryAxisFormat")
public class CategoryAxisFormat {

    @XmlElement(required = true)
    protected AxisFormat axisFormat;
    @XmlAttribute(name = "labelRotation")
    protected String labelRotation;

    /**
     * Recupera il valore della proprietà axisFormat.
     * 
     * @return
     *     possible object is
     *     {@link AxisFormat }
     *     
     */
    public AxisFormat getAxisFormat() {
        return axisFormat;
    }

    /**
     * Imposta il valore della proprietà axisFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link AxisFormat }
     *     
     */
    public void setAxisFormat(AxisFormat value) {
        this.axisFormat = value;
    }

    /**
     * Recupera il valore della proprietà labelRotation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelRotation() {
        return labelRotation;
    }

    /**
     * Imposta il valore della proprietà labelRotation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelRotation(String value) {
        this.labelRotation = value;
    }

}
