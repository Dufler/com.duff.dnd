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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueDisplay" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataRange"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}lowRange" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}mediumRange" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highRange" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="valueLocation" default="bulb">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="left"/>
 *             &lt;enumeration value="right"/>
 *             &lt;enumeration value="bulb"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isShowValueLines" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="mercuryColor" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "valueDisplay",
    "dataRange",
    "lowRange",
    "mediumRange",
    "highRange"
})
@XmlRootElement(name = "thermometerPlot")
public class ThermometerPlot {

    @XmlElement(required = true)
    protected Plot plot;
    protected ValueDisplay valueDisplay;
    @XmlElement(required = true)
    protected DataRange dataRange;
    protected LowRange lowRange;
    protected MediumRange mediumRange;
    protected HighRange highRange;
    @XmlAttribute(name = "valueLocation")
    protected String valueLocation;
    @XmlAttribute(name = "isShowValueLines")
    protected String isShowValueLines;
    @XmlAttribute(name = "mercuryColor")
    protected String mercuryColor;

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
     * Recupera il valore della proprietà valueDisplay.
     * 
     * @return
     *     possible object is
     *     {@link ValueDisplay }
     *     
     */
    public ValueDisplay getValueDisplay() {
        return valueDisplay;
    }

    /**
     * Imposta il valore della proprietà valueDisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueDisplay }
     *     
     */
    public void setValueDisplay(ValueDisplay value) {
        this.valueDisplay = value;
    }

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
     * Recupera il valore della proprietà lowRange.
     * 
     * @return
     *     possible object is
     *     {@link LowRange }
     *     
     */
    public LowRange getLowRange() {
        return lowRange;
    }

    /**
     * Imposta il valore della proprietà lowRange.
     * 
     * @param value
     *     allowed object is
     *     {@link LowRange }
     *     
     */
    public void setLowRange(LowRange value) {
        this.lowRange = value;
    }

    /**
     * Recupera il valore della proprietà mediumRange.
     * 
     * @return
     *     possible object is
     *     {@link MediumRange }
     *     
     */
    public MediumRange getMediumRange() {
        return mediumRange;
    }

    /**
     * Imposta il valore della proprietà mediumRange.
     * 
     * @param value
     *     allowed object is
     *     {@link MediumRange }
     *     
     */
    public void setMediumRange(MediumRange value) {
        this.mediumRange = value;
    }

    /**
     * Recupera il valore della proprietà highRange.
     * 
     * @return
     *     possible object is
     *     {@link HighRange }
     *     
     */
    public HighRange getHighRange() {
        return highRange;
    }

    /**
     * Imposta il valore della proprietà highRange.
     * 
     * @param value
     *     allowed object is
     *     {@link HighRange }
     *     
     */
    public void setHighRange(HighRange value) {
        this.highRange = value;
    }

    /**
     * Recupera il valore della proprietà valueLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueLocation() {
        if (valueLocation == null) {
            return "bulb";
        } else {
            return valueLocation;
        }
    }

    /**
     * Imposta il valore della proprietà valueLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueLocation(String value) {
        this.valueLocation = value;
    }

    /**
     * Recupera il valore della proprietà isShowValueLines.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShowValueLines() {
        if (isShowValueLines == null) {
            return "false";
        } else {
            return isShowValueLines;
        }
    }

    /**
     * Imposta il valore della proprietà isShowValueLines.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShowValueLines(String value) {
        this.isShowValueLines = value;
    }

    /**
     * Recupera il valore della proprietà mercuryColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMercuryColor() {
        return mercuryColor;
    }

    /**
     * Imposta il valore della proprietà mercuryColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMercuryColor(String value) {
        this.mercuryColor = value;
    }

}
