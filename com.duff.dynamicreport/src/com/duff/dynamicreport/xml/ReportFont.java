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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isDefault" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fontName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="isBold">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isItalic">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isUnderline">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isStrikeThrough">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pdfFontName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pdfEncoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isPdfEmbedded">
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
@XmlType(name = "")
@XmlRootElement(name = "reportFont")
public class ReportFont {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "isDefault")
    protected String isDefault;
    @XmlAttribute(name = "fontName")
    protected String fontName;
    @XmlAttribute(name = "size")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String size;
    @XmlAttribute(name = "isBold")
    protected String isBold;
    @XmlAttribute(name = "isItalic")
    protected String isItalic;
    @XmlAttribute(name = "isUnderline")
    protected String isUnderline;
    @XmlAttribute(name = "isStrikeThrough")
    protected String isStrikeThrough;
    @XmlAttribute(name = "pdfFontName")
    protected String pdfFontName;
    @XmlAttribute(name = "pdfEncoding")
    protected String pdfEncoding;
    @XmlAttribute(name = "isPdfEmbedded")
    protected String isPdfEmbedded;

    /**
     * Recupera il valore della proprietÓ name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietÓ name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietÓ isDefault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDefault() {
        if (isDefault == null) {
            return "false";
        } else {
            return isDefault;
        }
    }

    /**
     * Imposta il valore della proprietÓ isDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDefault(String value) {
        this.isDefault = value;
    }

    /**
     * Recupera il valore della proprietÓ fontName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontName() {
        return fontName;
    }

    /**
     * Imposta il valore della proprietÓ fontName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontName(String value) {
        this.fontName = value;
    }

    /**
     * Recupera il valore della proprietÓ size.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Imposta il valore della proprietÓ size.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Recupera il valore della proprietÓ isBold.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBold() {
        return isBold;
    }

    /**
     * Imposta il valore della proprietÓ isBold.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBold(String value) {
        this.isBold = value;
    }

    /**
     * Recupera il valore della proprietÓ isItalic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsItalic() {
        return isItalic;
    }

    /**
     * Imposta il valore della proprietÓ isItalic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsItalic(String value) {
        this.isItalic = value;
    }

    /**
     * Recupera il valore della proprietÓ isUnderline.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUnderline() {
        return isUnderline;
    }

    /**
     * Imposta il valore della proprietÓ isUnderline.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUnderline(String value) {
        this.isUnderline = value;
    }

    /**
     * Recupera il valore della proprietÓ isStrikeThrough.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStrikeThrough() {
        return isStrikeThrough;
    }

    /**
     * Imposta il valore della proprietÓ isStrikeThrough.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStrikeThrough(String value) {
        this.isStrikeThrough = value;
    }

    /**
     * Recupera il valore della proprietÓ pdfFontName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfFontName() {
        return pdfFontName;
    }

    /**
     * Imposta il valore della proprietÓ pdfFontName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfFontName(String value) {
        this.pdfFontName = value;
    }

    /**
     * Recupera il valore della proprietÓ pdfEncoding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfEncoding() {
        return pdfEncoding;
    }

    /**
     * Imposta il valore della proprietÓ pdfEncoding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfEncoding(String value) {
        this.pdfEncoding = value;
    }

    /**
     * Recupera il valore della proprietÓ isPdfEmbedded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPdfEmbedded() {
        return isPdfEmbedded;
    }

    /**
     * Imposta il valore della proprietÓ isPdfEmbedded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPdfEmbedded(String value) {
        this.isPdfEmbedded = value;
    }

}
