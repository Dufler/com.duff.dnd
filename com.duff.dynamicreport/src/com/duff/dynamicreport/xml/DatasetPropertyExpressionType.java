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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per datasetPropertyExpressionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="datasetPropertyExpressionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://jasperreports.sourceforge.net/jasperreports}propertyExpressionType">
 *       &lt;attribute name="evaluationTime">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Early"/>
 *             &lt;enumeration value="Late"/>
 *             &lt;enumeration value="Report"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datasetPropertyExpressionType")
public class DatasetPropertyExpressionType
    extends PropertyExpressionType
{

    @XmlAttribute(name = "evaluationTime")
    protected String evaluationTime;

    /**
     * Recupera il valore della proprietà evaluationTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluationTime() {
        return evaluationTime;
    }

    /**
     * Imposta il valore della proprietà evaluationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluationTime(String value) {
        this.evaluationTime = value;
    }

}
