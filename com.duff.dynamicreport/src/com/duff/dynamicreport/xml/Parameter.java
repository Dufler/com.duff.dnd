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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}property" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}parameterDescription" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}defaultValueExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" default="java.lang.String" />
 *       &lt;attribute name="nestedType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isForPrompting" default="true">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="evaluationTime">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Early"/>
 *             &lt;enumeration value="Late"/>
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
    "property",
    "parameterDescription",
    "defaultValueExpression"
})
@XmlRootElement(name = "parameter")
public class Parameter {

    protected List<Property> property;
    protected ParameterDescription parameterDescription;
    protected DefaultValueExpression defaultValueExpression;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "nestedType")
    protected String nestedType;
    @XmlAttribute(name = "isForPrompting")
    protected String isForPrompting;
    @XmlAttribute(name = "evaluationTime")
    protected String evaluationTime;

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

    /**
     * Recupera il valore della proprietà parameterDescription.
     * 
     * @return
     *     possible object is
     *     {@link ParameterDescription }
     *     
     */
    public ParameterDescription getParameterDescription() {
        return parameterDescription;
    }

    /**
     * Imposta il valore della proprietà parameterDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterDescription }
     *     
     */
    public void setParameterDescription(ParameterDescription value) {
        this.parameterDescription = value;
    }

    /**
     * Recupera il valore della proprietà defaultValueExpression.
     * 
     * @return
     *     possible object is
     *     {@link DefaultValueExpression }
     *     
     */
    public DefaultValueExpression getDefaultValueExpression() {
        return defaultValueExpression;
    }

    /**
     * Imposta il valore della proprietà defaultValueExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultValueExpression }
     *     
     */
    public void setDefaultValueExpression(DefaultValueExpression value) {
        this.defaultValueExpression = value;
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
     * Recupera il valore della proprietà nestedType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNestedType() {
        return nestedType;
    }

    /**
     * Imposta il valore della proprietà nestedType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNestedType(String value) {
        this.nestedType = value;
    }

    /**
     * Recupera il valore della proprietà isForPrompting.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsForPrompting() {
        if (isForPrompting == null) {
            return "true";
        } else {
            return isForPrompting;
        }
    }

    /**
     * Imposta il valore della proprietà isForPrompting.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsForPrompting(String value) {
        this.isForPrompting = value;
    }

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
