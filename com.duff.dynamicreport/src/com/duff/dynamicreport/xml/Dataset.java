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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}incrementWhenExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}datasetRun" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="resetType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Report"/>
 *             &lt;enumeration value="Page"/>
 *             &lt;enumeration value="Column"/>
 *             &lt;enumeration value="Group"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="resetGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="incrementType" default="None">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Report"/>
 *             &lt;enumeration value="Page"/>
 *             &lt;enumeration value="Column"/>
 *             &lt;enumeration value="Group"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="incrementGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "incrementWhenExpression",
    "datasetRun"
})
@XmlRootElement(name = "dataset")
public class Dataset {

    protected IncrementWhenExpression incrementWhenExpression;
    protected DatasetRun datasetRun;
    @XmlAttribute(name = "resetType")
    protected String resetType;
    @XmlAttribute(name = "resetGroup")
    protected String resetGroup;
    @XmlAttribute(name = "incrementType")
    protected String incrementType;
    @XmlAttribute(name = "incrementGroup")
    protected String incrementGroup;

    /**
     * Recupera il valore della proprietà incrementWhenExpression.
     * 
     * @return
     *     possible object is
     *     {@link IncrementWhenExpression }
     *     
     */
    public IncrementWhenExpression getIncrementWhenExpression() {
        return incrementWhenExpression;
    }

    /**
     * Imposta il valore della proprietà incrementWhenExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link IncrementWhenExpression }
     *     
     */
    public void setIncrementWhenExpression(IncrementWhenExpression value) {
        this.incrementWhenExpression = value;
    }

    /**
     * Recupera il valore della proprietà datasetRun.
     * 
     * @return
     *     possible object is
     *     {@link DatasetRun }
     *     
     */
    public DatasetRun getDatasetRun() {
        return datasetRun;
    }

    /**
     * Imposta il valore della proprietà datasetRun.
     * 
     * @param value
     *     allowed object is
     *     {@link DatasetRun }
     *     
     */
    public void setDatasetRun(DatasetRun value) {
        this.datasetRun = value;
    }

    /**
     * Recupera il valore della proprietà resetType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetType() {
        return resetType;
    }

    /**
     * Imposta il valore della proprietà resetType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetType(String value) {
        this.resetType = value;
    }

    /**
     * Recupera il valore della proprietà resetGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetGroup() {
        return resetGroup;
    }

    /**
     * Imposta il valore della proprietà resetGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetGroup(String value) {
        this.resetGroup = value;
    }

    /**
     * Recupera il valore della proprietà incrementType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncrementType() {
        if (incrementType == null) {
            return "None";
        } else {
            return incrementType;
        }
    }

    /**
     * Imposta il valore della proprietà incrementType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncrementType(String value) {
        this.incrementType = value;
    }

    /**
     * Recupera il valore della proprietà incrementGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncrementGroup() {
        return incrementGroup;
    }

    /**
     * Imposta il valore della proprietà incrementGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncrementGroup(String value) {
        this.incrementGroup = value;
    }

}
