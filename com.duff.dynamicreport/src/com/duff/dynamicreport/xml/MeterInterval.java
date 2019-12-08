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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataRange"/>
 *       &lt;/sequence>
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="alpha" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataRange"
})
@XmlRootElement(name = "meterInterval")
public class MeterInterval {

    @XmlElement(required = true)
    protected DataRange dataRange;
    @XmlAttribute(name = "label")
    protected String label;
    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "alpha")
    protected String alpha;

    /**
     * Recupera il valore della proprietà dataRange.
     * 
     * @return
     *     possible object is
     *     {@link DataRange }
     *     
     */
    public DataRange getDataRange() {
        return dataRange;
    }

    /**
     * Imposta il valore della proprietà dataRange.
     * 
     * @param value
     *     allowed object is
     *     {@link DataRange }
     *     
     */
    public void setDataRange(DataRange value) {
        this.dataRange = value;
    }

    /**
     * Recupera il valore della proprietà label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Imposta il valore della proprietà label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Recupera il valore della proprietà color.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Imposta il valore della proprietà color.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Recupera il valore della proprietà alpha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlpha() {
        return alpha;
    }

    /**
     * Imposta il valore della proprietà alpha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlpha(String value) {
        this.alpha = value;
    }

}
