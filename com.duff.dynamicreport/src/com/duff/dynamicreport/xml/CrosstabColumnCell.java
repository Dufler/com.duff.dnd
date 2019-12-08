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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per CrosstabColumnCell complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CrosstabColumnCell">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}cellContents"/>
 *       &lt;/sequence>
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="contentsPosition" default="Left">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Left"/>
 *             &lt;enumeration value="Center"/>
 *             &lt;enumeration value="Right"/>
 *             &lt;enumeration value="Stretch"/>
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
@XmlType(name = "CrosstabColumnCell", propOrder = {
    "cellContents"
})
public class CrosstabColumnCell {

    @XmlElement(required = true)
    protected CellContents cellContents;
    @XmlAttribute(name = "height", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String height;
    @XmlAttribute(name = "contentsPosition")
    protected String contentsPosition;

    /**
     * Recupera il valore della proprietà cellContents.
     * 
     * @return
     *     possible object is
     *     {@link CellContents }
     *     
     */
    public CellContents getCellContents() {
        return cellContents;
    }

    /**
     * Imposta il valore della proprietà cellContents.
     * 
     * @param value
     *     allowed object is
     *     {@link CellContents }
     *     
     */
    public void setCellContents(CellContents value) {
        this.cellContents = value;
    }

    /**
     * Recupera il valore della proprietà height.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Imposta il valore della proprietà height.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Recupera il valore della proprietà contentsPosition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentsPosition() {
        if (contentsPosition == null) {
            return "Left";
        } else {
            return contentsPosition;
        }
    }

    /**
     * Imposta il valore della proprietà contentsPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentsPosition(String value) {
        this.contentsPosition = value;
    }

}
