//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.25 alle 11:10:35 PM CET 
//


package com.duff.dynamicreport.xml;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}box" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}paragraph" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}conditionalStyle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isDefault">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Opaque"/>
 *             &lt;enumeration value="Transparent"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="forecolor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="backcolor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pen">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Thin"/>
 *             &lt;enumeration value="1Point"/>
 *             &lt;enumeration value="2Point"/>
 *             &lt;enumeration value="4Point"/>
 *             &lt;enumeration value="Dotted"/>
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
 *       &lt;attribute name="radius" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="scaleImage">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Clip"/>
 *             &lt;enumeration value="FillFrame"/>
 *             &lt;enumeration value="RetainShape"/>
 *             &lt;enumeration value="RealHeight"/>
 *             &lt;enumeration value="RealSize"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="hAlign">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Left"/>
 *             &lt;enumeration value="Center"/>
 *             &lt;enumeration value="Right"/>
 *             &lt;enumeration value="Justified"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="hTextAlign">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Left"/>
 *             &lt;enumeration value="Center"/>
 *             &lt;enumeration value="Right"/>
 *             &lt;enumeration value="Justified"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="hImageAlign">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Left"/>
 *             &lt;enumeration value="Center"/>
 *             &lt;enumeration value="Right"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="vAlign">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Top"/>
 *             &lt;enumeration value="Middle"/>
 *             &lt;enumeration value="Bottom"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="vTextAlign">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Top"/>
 *             &lt;enumeration value="Middle"/>
 *             &lt;enumeration value="Bottom"/>
 *             &lt;enumeration value="Justified"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="vImageAlign">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Top"/>
 *             &lt;enumeration value="Middle"/>
 *             &lt;enumeration value="Bottom"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="border">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Thin"/>
 *             &lt;enumeration value="1Point"/>
 *             &lt;enumeration value="2Point"/>
 *             &lt;enumeration value="4Point"/>
 *             &lt;enumeration value="Dotted"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="borderColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="padding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="topBorder">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Thin"/>
 *             &lt;enumeration value="1Point"/>
 *             &lt;enumeration value="2Point"/>
 *             &lt;enumeration value="4Point"/>
 *             &lt;enumeration value="Dotted"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="topBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="topPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="leftBorder">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Thin"/>
 *             &lt;enumeration value="1Point"/>
 *             &lt;enumeration value="2Point"/>
 *             &lt;enumeration value="4Point"/>
 *             &lt;enumeration value="Dotted"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="leftBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="leftPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="bottomBorder">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Thin"/>
 *             &lt;enumeration value="1Point"/>
 *             &lt;enumeration value="2Point"/>
 *             &lt;enumeration value="4Point"/>
 *             &lt;enumeration value="Dotted"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="bottomBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bottomPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="rightBorder">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Thin"/>
 *             &lt;enumeration value="1Point"/>
 *             &lt;enumeration value="2Point"/>
 *             &lt;enumeration value="4Point"/>
 *             &lt;enumeration value="Dotted"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rightBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rightPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
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
 *       &lt;attribute name="fontName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fontSize" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
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
 *       &lt;attribute name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isBlankWhenNull">
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
    "box",
    "paragraph",
    "conditionalStyle"
})
@XmlRootElement(name = "style")
public class Style {

    protected Box box;
    protected Paragraph paragraph;
    protected List<ConditionalStyle> conditionalStyle;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "isDefault")
    protected String isDefault;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "mode")
    protected String mode;
    @XmlAttribute(name = "forecolor")
    protected String forecolor;
    @XmlAttribute(name = "backcolor")
    protected String backcolor;
    @XmlAttribute(name = "pen")
    protected String pen;
    @XmlAttribute(name = "fill")
    protected String fill;
    @XmlAttribute(name = "radius")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String radius;
    @XmlAttribute(name = "scaleImage")
    protected String scaleImage;
    @XmlAttribute(name = "hAlign")
    protected String hAlign;
    @XmlAttribute(name = "hTextAlign")
    protected String hTextAlign;
    @XmlAttribute(name = "hImageAlign")
    protected String hImageAlign;
    @XmlAttribute(name = "vAlign")
    protected String vAlign;
    @XmlAttribute(name = "vTextAlign")
    protected String vTextAlign;
    @XmlAttribute(name = "vImageAlign")
    protected String vImageAlign;
    @XmlAttribute(name = "border")
    protected String border;
    @XmlAttribute(name = "borderColor")
    protected String borderColor;
    @XmlAttribute(name = "padding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String padding;
    @XmlAttribute(name = "topBorder")
    protected String topBorder;
    @XmlAttribute(name = "topBorderColor")
    protected String topBorderColor;
    @XmlAttribute(name = "topPadding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String topPadding;
    @XmlAttribute(name = "leftBorder")
    protected String leftBorder;
    @XmlAttribute(name = "leftBorderColor")
    protected String leftBorderColor;
    @XmlAttribute(name = "leftPadding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String leftPadding;
    @XmlAttribute(name = "bottomBorder")
    protected String bottomBorder;
    @XmlAttribute(name = "bottomBorderColor")
    protected String bottomBorderColor;
    @XmlAttribute(name = "bottomPadding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String bottomPadding;
    @XmlAttribute(name = "rightBorder")
    protected String rightBorder;
    @XmlAttribute(name = "rightBorderColor")
    protected String rightBorderColor;
    @XmlAttribute(name = "rightPadding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String rightPadding;
    @XmlAttribute(name = "rotation")
    protected String rotation;
    @XmlAttribute(name = "lineSpacing")
    protected String lineSpacing;
    @XmlAttribute(name = "isStyledText")
    protected String isStyledText;
    @XmlAttribute(name = "markup")
    protected String markup;
    @XmlAttribute(name = "fontName")
    protected String fontName;
    @XmlAttribute(name = "fontSize")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String fontSize;
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
    @XmlAttribute(name = "pattern")
    protected String pattern;
    @XmlAttribute(name = "isBlankWhenNull")
    protected String isBlankWhenNull;

    /**
     * Recupera il valore della propriet� box.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getBox() {
        return box;
    }

    /**
     * Imposta il valore della propriet� box.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setBox(Box value) {
        this.box = value;
    }

    /**
     * Recupera il valore della propriet� paragraph.
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
     * Imposta il valore della propriet� paragraph.
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
     * Gets the value of the conditionalStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionalStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionalStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionalStyle }
     * 
     * 
     */
    public List<ConditionalStyle> getConditionalStyle() {
        if (conditionalStyle == null) {
            conditionalStyle = new ArrayList<ConditionalStyle>();
        }
        return this.conditionalStyle;
    }

    /**
     * Recupera il valore della propriet� name.
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
     * Imposta il valore della propriet� name.
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
     * Recupera il valore della propriet� isDefault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * Imposta il valore della propriet� isDefault.
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
     * Recupera il valore della propriet� style.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Imposta il valore della propriet� style.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Recupera il valore della propriet� mode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Imposta il valore della propriet� mode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Recupera il valore della propriet� forecolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecolor() {
        return forecolor;
    }

    /**
     * Imposta il valore della propriet� forecolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecolor(String value) {
        this.forecolor = value;
    }

    /**
     * Recupera il valore della propriet� backcolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackcolor() {
        return backcolor;
    }

    /**
     * Imposta il valore della propriet� backcolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackcolor(String value) {
        this.backcolor = value;
    }

    /**
     * Recupera il valore della propriet� pen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPen() {
        return pen;
    }

    /**
     * Imposta il valore della propriet� pen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPen(String value) {
        this.pen = value;
    }

    /**
     * Recupera il valore della propriet� fill.
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
     * Imposta il valore della propriet� fill.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFill(String value) {
        this.fill = value;
    }

    /**
     * Recupera il valore della propriet� radius.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadius() {
        return radius;
    }

    /**
     * Imposta il valore della propriet� radius.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadius(String value) {
        this.radius = value;
    }

    /**
     * Recupera il valore della propriet� scaleImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaleImage() {
        return scaleImage;
    }

    /**
     * Imposta il valore della propriet� scaleImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaleImage(String value) {
        this.scaleImage = value;
    }

    /**
     * Recupera il valore della propriet� hAlign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHAlign() {
        return hAlign;
    }

    /**
     * Imposta il valore della propriet� hAlign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHAlign(String value) {
        this.hAlign = value;
    }

    /**
     * Recupera il valore della propriet� hTextAlign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHTextAlign() {
        return hTextAlign;
    }

    /**
     * Imposta il valore della propriet� hTextAlign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHTextAlign(String value) {
        this.hTextAlign = value;
    }

    /**
     * Recupera il valore della propriet� hImageAlign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHImageAlign() {
        return hImageAlign;
    }

    /**
     * Imposta il valore della propriet� hImageAlign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHImageAlign(String value) {
        this.hImageAlign = value;
    }

    /**
     * Recupera il valore della propriet� vAlign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAlign() {
        return vAlign;
    }

    /**
     * Imposta il valore della propriet� vAlign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAlign(String value) {
        this.vAlign = value;
    }

    /**
     * Recupera il valore della propriet� vTextAlign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTextAlign() {
        return vTextAlign;
    }

    /**
     * Imposta il valore della propriet� vTextAlign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTextAlign(String value) {
        this.vTextAlign = value;
    }

    /**
     * Recupera il valore della propriet� vImageAlign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVImageAlign() {
        return vImageAlign;
    }

    /**
     * Imposta il valore della propriet� vImageAlign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVImageAlign(String value) {
        this.vImageAlign = value;
    }

    /**
     * Recupera il valore della propriet� border.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorder() {
        return border;
    }

    /**
     * Imposta il valore della propriet� border.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorder(String value) {
        this.border = value;
    }

    /**
     * Recupera il valore della propriet� borderColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * Imposta il valore della propriet� borderColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderColor(String value) {
        this.borderColor = value;
    }

    /**
     * Recupera il valore della propriet� padding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadding() {
        return padding;
    }

    /**
     * Imposta il valore della propriet� padding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadding(String value) {
        this.padding = value;
    }

    /**
     * Recupera il valore della propriet� topBorder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopBorder() {
        return topBorder;
    }

    /**
     * Imposta il valore della propriet� topBorder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopBorder(String value) {
        this.topBorder = value;
    }

    /**
     * Recupera il valore della propriet� topBorderColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopBorderColor() {
        return topBorderColor;
    }

    /**
     * Imposta il valore della propriet� topBorderColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopBorderColor(String value) {
        this.topBorderColor = value;
    }

    /**
     * Recupera il valore della propriet� topPadding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopPadding() {
        return topPadding;
    }

    /**
     * Imposta il valore della propriet� topPadding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopPadding(String value) {
        this.topPadding = value;
    }

    /**
     * Recupera il valore della propriet� leftBorder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftBorder() {
        return leftBorder;
    }

    /**
     * Imposta il valore della propriet� leftBorder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftBorder(String value) {
        this.leftBorder = value;
    }

    /**
     * Recupera il valore della propriet� leftBorderColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftBorderColor() {
        return leftBorderColor;
    }

    /**
     * Imposta il valore della propriet� leftBorderColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftBorderColor(String value) {
        this.leftBorderColor = value;
    }

    /**
     * Recupera il valore della propriet� leftPadding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftPadding() {
        return leftPadding;
    }

    /**
     * Imposta il valore della propriet� leftPadding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftPadding(String value) {
        this.leftPadding = value;
    }

    /**
     * Recupera il valore della propriet� bottomBorder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottomBorder() {
        return bottomBorder;
    }

    /**
     * Imposta il valore della propriet� bottomBorder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottomBorder(String value) {
        this.bottomBorder = value;
    }

    /**
     * Recupera il valore della propriet� bottomBorderColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottomBorderColor() {
        return bottomBorderColor;
    }

    /**
     * Imposta il valore della propriet� bottomBorderColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottomBorderColor(String value) {
        this.bottomBorderColor = value;
    }

    /**
     * Recupera il valore della propriet� bottomPadding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottomPadding() {
        return bottomPadding;
    }

    /**
     * Imposta il valore della propriet� bottomPadding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottomPadding(String value) {
        this.bottomPadding = value;
    }

    /**
     * Recupera il valore della propriet� rightBorder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightBorder() {
        return rightBorder;
    }

    /**
     * Imposta il valore della propriet� rightBorder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightBorder(String value) {
        this.rightBorder = value;
    }

    /**
     * Recupera il valore della propriet� rightBorderColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightBorderColor() {
        return rightBorderColor;
    }

    /**
     * Imposta il valore della propriet� rightBorderColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightBorderColor(String value) {
        this.rightBorderColor = value;
    }

    /**
     * Recupera il valore della propriet� rightPadding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightPadding() {
        return rightPadding;
    }

    /**
     * Imposta il valore della propriet� rightPadding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightPadding(String value) {
        this.rightPadding = value;
    }

    /**
     * Recupera il valore della propriet� rotation.
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
     * Imposta il valore della propriet� rotation.
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
     * Recupera il valore della propriet� lineSpacing.
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
     * Imposta il valore della propriet� lineSpacing.
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
     * Recupera il valore della propriet� isStyledText.
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
     * Imposta il valore della propriet� isStyledText.
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
     * Recupera il valore della propriet� markup.
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
     * Imposta il valore della propriet� markup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkup(String value) {
        this.markup = value;
    }

    /**
     * Recupera il valore della propriet� fontName.
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
     * Imposta il valore della propriet� fontName.
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
     * Recupera il valore della propriet� fontSize.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * Imposta il valore della propriet� fontSize.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSize(String value) {
        this.fontSize = value;
    }

    /**
     * Recupera il valore della propriet� isBold.
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
     * Imposta il valore della propriet� isBold.
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
     * Recupera il valore della propriet� isItalic.
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
     * Imposta il valore della propriet� isItalic.
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
     * Recupera il valore della propriet� isUnderline.
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
     * Imposta il valore della propriet� isUnderline.
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
     * Recupera il valore della propriet� isStrikeThrough.
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
     * Imposta il valore della propriet� isStrikeThrough.
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
     * Recupera il valore della propriet� pdfFontName.
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
     * Imposta il valore della propriet� pdfFontName.
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
     * Recupera il valore della propriet� pdfEncoding.
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
     * Imposta il valore della propriet� pdfEncoding.
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
     * Recupera il valore della propriet� isPdfEmbedded.
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
     * Imposta il valore della propriet� isPdfEmbedded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPdfEmbedded(String value) {
        this.isPdfEmbedded = value;
    }

    /**
     * Recupera il valore della propriet� pattern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Imposta il valore della propriet� pattern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Recupera il valore della propriet� isBlankWhenNull.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBlankWhenNull() {
        return isBlankWhenNull;
    }

    /**
     * Imposta il valore della propriet� isBlankWhenNull.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBlankWhenNull(String value) {
        this.isBlankWhenNull = value;
    }

}
