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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}variableDescription" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}variableExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}initialValueExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" default="java.lang.String" />
 *       &lt;attribute name="resetType" default="Report">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Report"/>
 *             &lt;enumeration value="Page"/>
 *             &lt;enumeration value="Column"/>
 *             &lt;enumeration value="Group"/>
 *             &lt;enumeration value="Master"/>
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
 *             &lt;enumeration value="System"/>
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
@XmlType(name = "", propOrder = {
    "variableDescription",
    "variableExpression",
    "initialValueExpression"
})
@XmlRootElement(name = "variable")
public class Variable {

    protected VariableDescription variableDescription;
    protected VariableExpression variableExpression;
    protected InitialValueExpression initialValueExpression;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "resetType")
    protected String resetType;
    @XmlAttribute(name = "resetGroup")
    protected String resetGroup;
    @XmlAttribute(name = "incrementType")
    protected String incrementType;
    @XmlAttribute(name = "incrementGroup")
    protected String incrementGroup;
    @XmlAttribute(name = "calculation")
    protected String calculation;
    @XmlAttribute(name = "incrementerFactoryClass")
    protected String incrementerFactoryClass;

    /**
     * Recupera il valore della proprietà variableDescription.
     * 
     * @return
     *     possible object is
     *     {@link VariableDescription }
     *     
     */
    public VariableDescription getVariableDescription() {
        return variableDescription;
    }

    /**
     * Imposta il valore della proprietà variableDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableDescription }
     *     
     */
    public void setVariableDescription(VariableDescription value) {
        this.variableDescription = value;
    }

    /**
     * Recupera il valore della proprietà variableExpression.
     * 
     * @return
     *     possible object is
     *     {@link VariableExpression }
     *     
     */
    public VariableExpression getVariableExpression() {
        return variableExpression;
    }

    /**
     * Imposta il valore della proprietà variableExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableExpression }
     *     
     */
    public void setVariableExpression(VariableExpression value) {
        this.variableExpression = value;
    }

    /**
     * Recupera il valore della proprietà initialValueExpression.
     * 
     * @return
     *     possible object is
     *     {@link InitialValueExpression }
     *     
     */
    public InitialValueExpression getInitialValueExpression() {
        return initialValueExpression;
    }

    /**
     * Imposta il valore della proprietà initialValueExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialValueExpression }
     *     
     */
    public void setInitialValueExpression(InitialValueExpression value) {
        this.initialValueExpression = value;
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
     * Recupera il valore della proprietà clazz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        if (clazz == null) {
            return "java.lang.String";
        } else {
            return clazz;
        }
    }

    /**
     * Imposta il valore della proprietà clazz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
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
        if (resetType == null) {
            return "Report";
        } else {
            return resetType;
        }
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
