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
 *       &lt;attribute name="subreportVariable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="toVariable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="calculation" default="Nothing">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Nothing"/>
 *             &lt;enumeration value="Count"/>
 *             &lt;enumeration value="DistinctCount"/>
 *             &lt;enumeration value="Sum"/>
 *             &lt;enumeration value="Average"/>
 *             &lt;enumeration value="Lowest"/>
 *             &lt;enumeration value="Highest"/>
 *             &lt;enumeration value="StandardDeviation"/>
 *             &lt;enumeration value="Variance"/>
 *             &lt;enumeration value="First"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="incrementerFactoryClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "returnValue")
public class ReturnValue {

    @XmlAttribute(name = "subreportVariable")
    protected String subreportVariable;
    @XmlAttribute(name = "toVariable")
    protected String toVariable;
    @XmlAttribute(name = "calculation")
    protected String calculation;
    @XmlAttribute(name = "incrementerFactoryClass")
    protected String incrementerFactoryClass;

    /**
     * Recupera il valore della proprietà subreportVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubreportVariable() {
        return subreportVariable;
    }

    /**
     * Imposta il valore della proprietà subreportVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubreportVariable(String value) {
        this.subreportVariable = value;
    }

    /**
     * Recupera il valore della proprietà toVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToVariable() {
        return toVariable;
    }

    /**
     * Imposta il valore della proprietà toVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToVariable(String value) {
        this.toVariable = value;
    }

    /**
     * Recupera il valore della proprietà calculation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculation() {
        if (calculation == null) {
            return "Nothing";
        } else {
            return calculation;
        }
    }

    /**
     * Imposta il valore della proprietà calculation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculation(String value) {
        this.calculation = value;
    }

    /**
     * Recupera il valore della proprietà incrementerFactoryClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncrementerFactoryClass() {
        return incrementerFactoryClass;
    }

    /**
     * Imposta il valore della proprietà incrementerFactoryClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncrementerFactoryClass(String value) {
        this.incrementerFactoryClass = value;
    }

}
