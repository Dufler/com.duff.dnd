//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}seriesColor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="backcolor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orientation">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Horizontal"/>
 *             &lt;enumeration value="Vertical"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="backgroundAlpha" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="foregroundAlpha" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
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
    "seriesColor"
})
@XmlRootElement(name = "plot")
public class Plot {

    protected List<SeriesColor> seriesColor;
    @XmlAttribute(name = "backcolor")
    protected String backcolor;
    @XmlAttribute(name = "orientation")
    protected String orientation;
    @XmlAttribute(name = "backgroundAlpha")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String backgroundAlpha;
    @XmlAttribute(name = "foregroundAlpha")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String foregroundAlpha;
    @XmlAttribute(name = "labelRotation")
    protected String labelRotation;

    /**
     * Gets the value of the seriesColor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seriesColor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeriesColor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeriesColor }
     * 
     * 
     */
    public List<SeriesColor> getSeriesColor() {
        if (seriesColor == null) {
            seriesColor = new ArrayList<SeriesColor>();
        }
        return this.seriesColor;
    }

    /**
     * Recupera il valore della proprietà backcolor.
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
     * Imposta il valore della proprietà backcolor.
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
     * Recupera il valore della proprietà orientation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Imposta il valore della proprietà orientation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Recupera il valore della proprietà backgroundAlpha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundAlpha() {
        return backgroundAlpha;
    }

    /**
     * Imposta il valore della proprietà backgroundAlpha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundAlpha(String value) {
        this.backgroundAlpha = value;
    }

    /**
     * Recupera il valore della proprietà foregroundAlpha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForegroundAlpha() {
        return foregroundAlpha;
    }

    /**
     * Imposta il valore della proprietà foregroundAlpha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForegroundAlpha(String value) {
        this.foregroundAlpha = value;
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
