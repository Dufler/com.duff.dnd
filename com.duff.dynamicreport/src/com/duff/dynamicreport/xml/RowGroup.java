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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstabRowHeader" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstabTotalRowHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="totalPosition" default="None">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Start"/>
 *             &lt;enumeration value="End"/>
 *             &lt;enumeration value="None"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="headerPosition" default="Top">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Top"/>
 *             &lt;enumeration value="Middle"/>
 *             &lt;enumeration value="Bottom"/>
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
    "crosstabRowHeader",
    "crosstabTotalRowHeader"
})
@XmlRootElement(name = "rowGroup")
public class RowGroup {

    @XmlElement(required = true)
    protected Bucket bucket;
    protected CrosstabRowHeader crosstabRowHeader;
    protected CrosstabTotalRowHeader crosstabTotalRowHeader;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "width", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String width;
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
     * Recupera il valore della proprietà crosstabRowHeader.
     * 
     * @return
     *     possible object is
     *     {@link CrosstabRowHeader }
     *     
     */
    public CrosstabRowHeader getCrosstabRowHeader() {
        return crosstabRowHeader;
    }

    /**
     * Imposta il valore della proprietà crosstabRowHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link CrosstabRowHeader }
     *     
     */
    public void setCrosstabRowHeader(CrosstabRowHeader value) {
        this.crosstabRowHeader = value;
    }

    /**
     * Recupera il valore della proprietà crosstabTotalRowHeader.
     * 
     * @return
     *     possible object is
     *     {@link CrosstabTotalRowHeader }
     *     
     */
    public CrosstabTotalRowHeader getCrosstabTotalRowHeader() {
        return crosstabTotalRowHeader;
    }

    /**
     * Imposta il valore della proprietà crosstabTotalRowHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link CrosstabTotalRowHeader }
     *     
     */
    public void setCrosstabTotalRowHeader(CrosstabTotalRowHeader value) {
        this.crosstabTotalRowHeader = value;
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
     * Recupera il valore della proprietà width.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Imposta il valore della proprietà width.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
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
            return "Top";
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
