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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}measureExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="calculation" type="{http://jasperreports.sourceforge.net/jasperreports}aggregationCalculationType" default="Nothing" />
 *       &lt;attribute name="incrementerFactoryClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="percentageOf" default="None">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="GrandTotal"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="percentageCalculatorClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "measureExpression"
})
@XmlRootElement(name = "measure")
public class Measure {

    protected MeasureExpression measureExpression;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "calculation")
    protected AggregationCalculationType calculation;
    @XmlAttribute(name = "incrementerFactoryClass")
    protected String incrementerFactoryClass;
    @XmlAttribute(name = "percentageOf")
    protected String percentageOf;
    @XmlAttribute(name = "percentageCalculatorClass")
    protected String percentageCalculatorClass;

    /**
     * Recupera il valore della proprietà measureExpression.
     * 
     * @return
     *     possible object is
     *     {@link MeasureExpression }
     *     
     */
    public MeasureExpression getMeasureExpression() {
        return measureExpression;
    }

    /**
     * Imposta il valore della proprietà measureExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureExpression }
     *     
     */
    public void setMeasureExpression(MeasureExpression value) {
        this.measureExpression = value;
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
        return clazz;
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
     * Recupera il valore della proprietà calculation.
     * 
     * @return
     *     possible object is
     *     {@link AggregationCalculationType }
     *     
     */
    public AggregationCalculationType getCalculation() {
        if (calculation == null) {
            return AggregationCalculationType.NOTHING;
        } else {
            return calculation;
        }
    }

    /**
     * Imposta il valore della proprietà calculation.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationCalculationType }
     *     
     */
    public void setCalculation(AggregationCalculationType value) {
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

    /**
     * Recupera il valore della proprietà percentageOf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentageOf() {
        if (percentageOf == null) {
            return "None";
        } else {
            return percentageOf;
        }
    }

    /**
     * Imposta il valore della proprietà percentageOf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentageOf(String value) {
        this.percentageOf = value;
    }

    /**
     * Recupera il valore della proprietà percentageCalculatorClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentageCalculatorClass() {
        return percentageCalculatorClass;
    }

    /**
     * Imposta il valore della proprietà percentageCalculatorClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentageCalculatorClass(String value) {
        this.percentageCalculatorClass = value;
    }

}
