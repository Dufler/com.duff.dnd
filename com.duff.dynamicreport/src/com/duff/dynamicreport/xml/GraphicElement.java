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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pen" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="stretchType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="NoStretch"/>
 *             &lt;enumeration value="RelativeToTallestObject"/>
 *             &lt;enumeration value="RelativeToBandHeight"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fill">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Solid"/>
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
    "pen"
})
@XmlRootElement(name = "graphicElement")
public class GraphicElement {

    protected Pen pen;
    @XmlAttribute(name = "stretchType")
    protected String stretchType;
    @XmlAttribute(name = "fill")
    protected String fill;

    /**
     * Recupera il valore della proprietà pen.
     * 
     * @return
     *     possible object is
     *     {@link Pen }
     *     
     */
    public Pen getPen() {
        return pen;
    }

    /**
     * Imposta il valore della proprietà pen.
     * 
     * @param value
     *     allowed object is
     *     {@link Pen }
     *     
     */
    public void setPen(Pen value) {
        this.pen = value;
    }

    /**
     * Recupera il valore della proprietà stretchType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStretchType() {
        return stretchType;
    }

    /**
     * Imposta il valore della proprietà stretchType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStretchType(String value) {
        this.stretchType = value;
    }

    /**
     * Recupera il valore della proprietà fill.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFill() {
        return fill;
    }

    /**
     * Imposta il valore della proprietà fill.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFill(String value) {
        this.fill = value;
    }

}
