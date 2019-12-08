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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bucket"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstabHeader" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstabColumnHeader" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstabTotalColumnHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="totalPosition" default="None">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Start"/>
 *             &lt;enumeration value="End"/>
 *             &lt;enumeration value="None"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="headerPosition" default="Left">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Left"/>
 *             &lt;enumeration value="Center"/>
 *             &lt;enumeration value="Right"/>
 *             &lt;enumeration value="Stretch"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="mergeHeaderCells" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bucket",
    "crosstabHeader",
    "crosstabColumnHeader",
    "crosstabTotalColumnHeader"
})
@XmlRootElement(name = "columnGroup")
public class ColumnGroup {

    @XmlElement(required = true)
    protected Bucket bucket;
    protected CrosstabHeader crosstabHeader;
    protected CrosstabColumnHeader crosstabColumnHeader;
    protected CrosstabTotalColumnHeader crosstabTotalColumnHeader;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "height", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String height;
    @XmlAttribute(name = "totalPosition")
    protected String totalPosition;
    @XmlAttribute(name = "headerPosition")
    protected String headerPosition;
    @XmlAttribute(name = "mergeHeaderCells")
    protected Boolean mergeHeaderCells;

    /**
     * Recupera il valore della proprietà bucket.
     * 
     * @return
     *     possible object is
     *     {@link Bucket }
     *     
     */
    public Bucket getBucket() {
        return bucket;
    }

    /**
     * Imposta il valore della proprietà bucket.
     * 
     * @param value
     *     allowed object is
     *     {@link Bucket }
     *     
     */
    public void setBucket(Bucket value) {
        this.bucket = value;
    }

    /**
     * Recupera il valore della proprietà crosstabHeader.
     * 
     * @return
     *     possible object is
     *     {@link CrosstabHeader }
     *     
     */
    public CrosstabHeader getCrosstabHeader() {
        return crosstabHeader;
    }

    /**
     * Imposta il valore della proprietà crosstabHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link CrosstabHeader }
     *     
     */
    public void setCrosstabHeader(CrosstabHeader value) {
        this.crosstabHeader = value;
    }

    /**
     * Recupera il valore della proprietà crosstabColumnHeader.
     * 
     * @return
     *     possible object is
     *     {@link CrosstabColumnHeader }
     *     
     */
    public CrosstabColumnHeader getCrosstabColumnHeader() {
        return crosstabColumnHeader;
    }

    /**
     * Imposta il valore della proprietà crosstabColumnHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link CrosstabColumnHeader }
     *     
     */
    public void setCrosstabColumnHeader(CrosstabColumnHeader value) {
        this.crosstabColumnHeader = value;
    }

    /**
     * Recupera il valore della proprietà crosstabTotalColumnHeader.
     * 
     * @return
     *     possible object is
     *     {@link CrosstabTotalColumnHeader }
     *     
     */
    public CrosstabTotalColumnHeader getCrosstabTotalColumnHeader() {
        return crosstabTotalColumnHeader;
    }

    /**
     * Imposta il valore della proprietà crosstabTotalColumnHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link CrosstabTotalColumnHeader }
     *     
     */
    public void setCrosstabTotalColumnHeader(CrosstabTotalColumnHeader value) {
        this.crosstabTotalColumnHeader = value;
    }

    /**
     * Recupera il valore della proprietà name.
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
     * Imposta il valore della proprietà name.
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
     * Recupera il valore della proprietà totalPosition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPosition() {
        if (totalPosition == null) {
            return "None";
        } else {
            return totalPosition;
        }
    }

    /**
     * Imposta il valore della proprietà totalPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPosition(String value) {
        this.totalPosition = value;
    }

    /**
     * Recupera il valore della proprietà headerPosition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderPosition() {
        if (headerPosition == null) {
            return "Left";
        } else {
            return headerPosition;
        }
    }

    /**
     * Imposta il valore della proprietà headerPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderPosition(String value) {
        this.headerPosition = value;
    }

    /**
     * Recupera il valore della proprietà mergeHeaderCells.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMergeHeaderCells() {
        return mergeHeaderCells;
    }

    /**
     * Imposta il valore della proprietà mergeHeaderCells.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMergeHeaderCells(Boolean value) {
        this.mergeHeaderCells = value;
    }

}
