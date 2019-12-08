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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}reportElement"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}genericElementType"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}genericElementParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="evaluationTime" type="{http://jasperreports.sourceforge.net/jasperreports}complexEvaluationTime" default="Now" />
 *       &lt;attribute name="evaluationGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "genericElementType",
    "genericElementParameter"
})
@XmlRootElement(name = "genericElement")
public class GenericElement {

    @XmlElement(required = true)
    protected ReportElement reportElement;
    @XmlElement(required = true)
    protected GenericElementType genericElementType;
    protected List<GenericElementParameter> genericElementParameter;
    @XmlAttribute(name = "evaluationTime")
    protected ComplexEvaluationTime evaluationTime;
    @XmlAttribute(name = "evaluationGroup")
    protected String evaluationGroup;

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
     * Recupera il valore della proprietà genericElementType.
     * 
     * @return
     *     possible object is
     *     {@link GenericElementType }
     *     
     */
    public GenericElementType getGenericElementType() {
        return genericElementType;
    }

    /**
     * Imposta il valore della proprietà genericElementType.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericElementType }
     *     
     */
    public void setGenericElementType(GenericElementType value) {
        this.genericElementType = value;
    }

    /**
     * Gets the value of the genericElementParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericElementParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericElementParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericElementParameter }
     * 
     * 
     */
    public List<GenericElementParameter> getGenericElementParameter() {
        if (genericElementParameter == null) {
            genericElementParameter = new ArrayList<GenericElementParameter>();
        }
        return this.genericElementParameter;
    }

    /**
     * Recupera il valore della proprietà evaluationTime.
     * 
     * @return
     *     possible object is
     *     {@link ComplexEvaluationTime }
     *     
     */
    public ComplexEvaluationTime getEvaluationTime() {
        if (evaluationTime == null) {
            return ComplexEvaluationTime.NOW;
        } else {
            return evaluationTime;
        }
    }

    /**
     * Imposta il valore della proprietà evaluationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexEvaluationTime }
     *     
     */
    public void setEvaluationTime(ComplexEvaluationTime value) {
        this.evaluationTime = value;
    }

    /**
     * Recupera il valore della proprietà evaluationGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluationGroup() {
        return evaluationGroup;
    }

    /**
     * Imposta il valore della proprietà evaluationGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluationGroup(String value) {
        this.evaluationGroup = value;
    }

}
