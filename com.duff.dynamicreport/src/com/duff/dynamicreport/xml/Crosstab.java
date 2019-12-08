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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}reportElement"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}box" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstabParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}parametersMapExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstabDataset" minOccurs="0"/>
 *         &lt;element name="titleCell" type="{http://jasperreports.sourceforge.net/jasperreports}CrosstabColumnCell" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstabHeaderCell" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rowGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}columnGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}measure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstabCell" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}whenNoDataCell" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isRepeatColumnHeaders" default="true">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isRepeatRowHeaders" default="true">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="columnBreakOffset" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="10" />
 *       &lt;attribute name="runDirection" default="LTR">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="LTR"/>
 *             &lt;enumeration value="RTL"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ignoreWidth" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="horizontalPosition">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Left"/>
 *             &lt;enumeration value="Right"/>
 *             &lt;enumeration value="Center"/>
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
    "reportElement",
    "box",
    "crosstabParameter",
    "parametersMapExpression",
    "crosstabDataset",
    "titleCell",
    "crosstabHeaderCell",
    "rowGroup",
    "columnGroup",
    "measure",
    "crosstabCell",
    "whenNoDataCell"
})
@XmlRootElement(name = "crosstab")
public class Crosstab {

    @XmlElement(required = true)
    protected ReportElement reportElement;
    protected Box box;
    protected List<CrosstabParameter> crosstabParameter;
    protected ParametersMapExpression parametersMapExpression;
    protected CrosstabDataset crosstabDataset;
    protected CrosstabColumnCell titleCell;
    protected CrosstabHeaderCell crosstabHeaderCell;
    protected List<RowGroup> rowGroup;
    protected List<ColumnGroup> columnGroup;
    protected List<Measure> measure;
    protected List<CrosstabCell> crosstabCell;
    protected WhenNoDataCell whenNoDataCell;
    @XmlAttribute(name = "isRepeatColumnHeaders")
    protected String isRepeatColumnHeaders;
    @XmlAttribute(name = "isRepeatRowHeaders")
    protected String isRepeatRowHeaders;
    @XmlAttribute(name = "columnBreakOffset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String columnBreakOffset;
    @XmlAttribute(name = "runDirection")
    protected String runDirection;
    @XmlAttribute(name = "ignoreWidth")
    protected Boolean ignoreWidth;
    @XmlAttribute(name = "horizontalPosition")
    protected String horizontalPosition;

    /**
     * Recupera il valore della proprietà reportElement.
     * 
     * @return
     *     possible object is
     *     {@link ReportElement }
     *     
     */
    public ReportElement getReportElement() {
        return reportElement;
    }

    /**
     * Imposta il valore della proprietà reportElement.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportElement }
     *     
     */
    public void setReportElement(ReportElement value) {
        this.reportElement = value;
    }

    /**
     * Recupera il valore della proprietà box.
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
     * Imposta il valore della proprietà box.
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
     * Gets the value of the crosstabParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crosstabParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrosstabParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrosstabParameter }
     * 
     * 
     */
    public List<CrosstabParameter> getCrosstabParameter() {
        if (crosstabParameter == null) {
            crosstabParameter = new ArrayList<CrosstabParameter>();
        }
        return this.crosstabParameter;
    }

    /**
     * Recupera il valore della proprietà parametersMapExpression.
     * 
     * @return
     *     possible object is
     *     {@link ParametersMapExpression }
     *     
     */
    public ParametersMapExpression getParametersMapExpression() {
        return parametersMapExpression;
    }

    /**
     * Imposta il valore della proprietà parametersMapExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersMapExpression }
     *     
     */
    public void setParametersMapExpression(ParametersMapExpression value) {
        this.parametersMapExpression = value;
    }

    /**
     * Recupera il valore della proprietà crosstabDataset.
     * 
     * @return
     *     possible object is
     *     {@link CrosstabDataset }
     *     
     */
    public CrosstabDataset getCrosstabDataset() {
        return crosstabDataset;
    }

    /**
     * Imposta il valore della proprietà crosstabDataset.
     * 
     * @param value
     *     allowed object is
     *     {@link CrosstabDataset }
     *     
     */
    public void setCrosstabDataset(CrosstabDataset value) {
        this.crosstabDataset = value;
    }

    /**
     * Recupera il valore della proprietà titleCell.
     * 
     * @return
     *     possible object is
     *     {@link CrosstabColumnCell }
     *     
     */
    public CrosstabColumnCell getTitleCell() {
        return titleCell;
    }

    /**
     * Imposta il valore della proprietà titleCell.
     * 
     * @param value
     *     allowed object is
     *     {@link CrosstabColumnCell }
     *     
     */
    public void setTitleCell(CrosstabColumnCell value) {
        this.titleCell = value;
    }

    /**
     * Recupera il valore della proprietà crosstabHeaderCell.
     * 
     * @return
     *     possible object is
     *     {@link CrosstabHeaderCell }
     *     
     */
    public CrosstabHeaderCell getCrosstabHeaderCell() {
        return crosstabHeaderCell;
    }

    /**
     * Imposta il valore della proprietà crosstabHeaderCell.
     * 
     * @param value
     *     allowed object is
     *     {@link CrosstabHeaderCell }
     *     
     */
    public void setCrosstabHeaderCell(CrosstabHeaderCell value) {
        this.crosstabHeaderCell = value;
    }

    /**
     * Gets the value of the rowGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rowGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRowGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RowGroup }
     * 
     * 
     */
    public List<RowGroup> getRowGroup() {
        if (rowGroup == null) {
            rowGroup = new ArrayList<RowGroup>();
        }
        return this.rowGroup;
    }

    /**
     * Gets the value of the columnGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColumnGroup }
     * 
     * 
     */
    public List<ColumnGroup> getColumnGroup() {
        if (columnGroup == null) {
            columnGroup = new ArrayList<ColumnGroup>();
        }
        return this.columnGroup;
    }

    /**
     * Gets the value of the measure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Measure }
     * 
     * 
     */
    public List<Measure> getMeasure() {
        if (measure == null) {
            measure = new ArrayList<Measure>();
        }
        return this.measure;
    }

    /**
     * Gets the value of the crosstabCell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crosstabCell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrosstabCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrosstabCell }
     * 
     * 
     */
    public List<CrosstabCell> getCrosstabCell() {
        if (crosstabCell == null) {
            crosstabCell = new ArrayList<CrosstabCell>();
        }
        return this.crosstabCell;
    }

    /**
     * Recupera il valore della proprietà whenNoDataCell.
     * 
     * @return
     *     possible object is
     *     {@link WhenNoDataCell }
     *     
     */
    public WhenNoDataCell getWhenNoDataCell() {
        return whenNoDataCell;
    }

    /**
     * Imposta il valore della proprietà whenNoDataCell.
     * 
     * @param value
     *     allowed object is
     *     {@link WhenNoDataCell }
     *     
     */
    public void setWhenNoDataCell(WhenNoDataCell value) {
        this.whenNoDataCell = value;
    }

    /**
     * Recupera il valore della proprietà isRepeatColumnHeaders.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRepeatColumnHeaders() {
        if (isRepeatColumnHeaders == null) {
            return "true";
        } else {
            return isRepeatColumnHeaders;
        }
    }

    /**
     * Imposta il valore della proprietà isRepeatColumnHeaders.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRepeatColumnHeaders(String value) {
        this.isRepeatColumnHeaders = value;
    }

    /**
     * Recupera il valore della proprietà isRepeatRowHeaders.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRepeatRowHeaders() {
        if (isRepeatRowHeaders == null) {
            return "true";
        } else {
            return isRepeatRowHeaders;
        }
    }

    /**
     * Imposta il valore della proprietà isRepeatRowHeaders.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRepeatRowHeaders(String value) {
        this.isRepeatRowHeaders = value;
    }

    /**
     * Recupera il valore della proprietà columnBreakOffset.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnBreakOffset() {
        if (columnBreakOffset == null) {
            return "10";
        } else {
            return columnBreakOffset;
        }
    }

    /**
     * Imposta il valore della proprietà columnBreakOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnBreakOffset(String value) {
        this.columnBreakOffset = value;
    }

    /**
     * Recupera il valore della proprietà runDirection.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunDirection() {
        if (runDirection == null) {
            return "LTR";
        } else {
            return runDirection;
        }
    }

    /**
     * Imposta il valore della proprietà runDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunDirection(String value) {
        this.runDirection = value;
    }

    /**
     * Recupera il valore della proprietà ignoreWidth.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreWidth() {
        return ignoreWidth;
    }

    /**
     * Imposta il valore della proprietà ignoreWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreWidth(Boolean value) {
        this.ignoreWidth = value;
    }

    /**
     * Recupera il valore della proprietà horizontalPosition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorizontalPosition() {
        return horizontalPosition;
    }

    /**
     * Imposta il valore della proprietà horizontalPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorizontalPosition(String value) {
        this.horizontalPosition = value;
    }

}
