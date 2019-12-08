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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}cellContents" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="rowTotalGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="columnTotalGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cellContents"
})
@XmlRootElement(name = "crosstabCell")
public class CrosstabCell {

    protected CellContents cellContents;
    @XmlAttribute(name = "width")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String width;
    @XmlAttribute(name = "height")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String height;
    @XmlAttribute(name = "rowTotalGroup")
    protected String rowTotalGroup;
    @XmlAttribute(name = "columnTotalGroup")
    protected String columnTotalGroup;

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
     * Recupera il valore della proprietà rowTotalGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowTotalGroup() {
        return rowTotalGroup;
    }

    /**
     * Imposta il valore della proprietà rowTotalGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowTotalGroup(String value) {
        this.rowTotalGroup = value;
    }

    /**
     * Recupera il valore della proprietà columnTotalGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnTotalGroup() {
        return columnTotalGroup;
    }

    /**
     * Imposta il valore della proprietà columnTotalGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnTotalGroup(String value) {
        this.columnTotalGroup = value;
    }

}
