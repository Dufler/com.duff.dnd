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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}paragraph" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="textAlignment">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Left"/>
 *             &lt;enumeration value="Center"/>
 *             &lt;enumeration value="Right"/>
 *             &lt;enumeration value="Justified"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="verticalAlignment">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Top"/>
 *             &lt;enumeration value="Middle"/>
 *             &lt;enumeration value="Bottom"/>
 *             &lt;enumeration value="Justified"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rotation">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Left"/>
 *             &lt;enumeration value="Right"/>
 *             &lt;enumeration value="UpsideDown"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="lineSpacing">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Single"/>
 *             &lt;enumeration value="1_1_2"/>
 *             &lt;enumeration value="Double"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isStyledText">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="markup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "font",
    "paragraph"
})
@XmlRootElement(name = "textElement")
public class TextElement {

    protected Font font;
    protected Paragraph paragraph;
    @XmlAttribute(name = "textAlignment")
    protected String textAlignment;
    @XmlAttribute(name = "verticalAlignment")
    protected String verticalAlignment;
    @XmlAttribute(name = "rotation")
    protected String rotation;
    @XmlAttribute(name = "lineSpacing")
    protected String lineSpacing;
    @XmlAttribute(name = "isStyledText")
    protected String isStyledText;
    @XmlAttribute(name = "markup")
    protected String markup;

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
     * Recupera il valore della proprietà paragraph.
     * 
     * @return
     *     possible object is
     *     {@link Paragraph }
     *     
     */
    public Paragraph getParagraph() {
        return paragraph;
    }

    /**
     * Imposta il valore della proprietà paragraph.
     * 
     * @param value
     *     allowed object is
     *     {@link Paragraph }
     *     
     */
    public void setParagraph(Paragraph value) {
        this.paragraph = value;
    }

    /**
     * Recupera il valore della proprietà textAlignment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAlignment() {
        return textAlignment;
    }

    /**
     * Imposta il valore della proprietà textAlignment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAlignment(String value) {
        this.textAlignment = value;
    }

    /**
     * Recupera il valore della proprietà verticalAlignment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalAlignment() {
        return verticalAlignment;
    }

    /**
     * Imposta il valore della proprietà verticalAlignment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalAlignment(String value) {
        this.verticalAlignment = value;
    }

    /**
     * Recupera il valore della proprietà rotation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotation() {
        return rotation;
    }

    /**
     * Imposta il valore della proprietà rotation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotation(String value) {
        this.rotation = value;
    }

    /**
     * Recupera il valore della proprietà lineSpacing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineSpacing() {
        return lineSpacing;
    }

    /**
     * Imposta il valore della proprietà lineSpacing.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineSpacing(String value) {
        this.lineSpacing = value;
    }

    /**
     * Recupera il valore della proprietà isStyledText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStyledText() {
        return isStyledText;
    }

    /**
     * Imposta il valore della proprietà isStyledText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStyledText(String value) {
        this.isStyledText = value;
    }

    /**
     * Recupera il valore della proprietà markup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkup() {
        return markup;
    }

    /**
     * Imposta il valore della proprietà markup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkup(String value) {
        this.markup = value;
    }

}
