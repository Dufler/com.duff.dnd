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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}font" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="textColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="backgroundColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="position">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Top"/>
 *             &lt;enumeration value="Bottom"/>
 *             &lt;enumeration value="Left"/>
 *             &lt;enumeration value="Right"/>
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
    "font"
})
@XmlRootElement(name = "chartLegend")
public class ChartLegend {

    protected Font font;
    @XmlAttribute(name = "textColor")
    protected String textColor;
    @XmlAttribute(name = "backgroundColor")
    protected String backgroundColor;
    @XmlAttribute(name = "position")
    protected String position;

    /**
     * Recupera il valore della proprietà font.
     * 
     * @return
     *     possible object is
     *     {@link Font }
     *     
     */
    public Font getFont() {
        return font;
    }

    /**
     * Imposta il valore della proprietà font.
     * 
     * @param value
     *     allowed object is
     *     {@link Font }
     *     
     */
    public void setFont(Font value) {
        this.font = value;
    }

    /**
     * Recupera il valore della proprietà textColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * Imposta il valore della proprietà textColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextColor(String value) {
        this.textColor = value;
    }

    /**
     * Recupera il valore della proprietà backgroundColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Imposta il valore della proprietà backgroundColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

    /**
     * Recupera il valore della proprietà position.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Imposta il valore della proprietà position.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

}
