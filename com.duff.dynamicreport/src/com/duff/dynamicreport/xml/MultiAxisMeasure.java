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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="labelExpression">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valueExpression" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="calculation" type="{http://jasperreports.sourceforge.net/jasperreports}aggregationCalculationType" default="Nothing" />
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
    "labelExpression",
    "valueExpression"
})
@XmlRootElement(name = "multiAxisMeasure")
public class MultiAxisMeasure {

    @XmlElement(required = true)
    protected MultiAxisMeasure.LabelExpression labelExpression;
    protected MultiAxisMeasure.ValueExpression valueExpression;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "calculation")
    protected AggregationCalculationType calculation;
    @XmlAttribute(name = "incrementerFactoryClass")
    protected String incrementerFactoryClass;

    /**
     * Recupera il valore della proprietà labelExpression.
     * 
     * @return
     *     possible object is
     *     {@link MultiAxisMeasure.LabelExpression }
     *     
     */
    public MultiAxisMeasure.LabelExpression getLabelExpression() {
        return labelExpression;
    }

    /**
     * Imposta il valore della proprietà labelExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiAxisMeasure.LabelExpression }
     *     
     */
    public void setLabelExpression(MultiAxisMeasure.LabelExpression value) {
        this.labelExpression = value;
    }

    /**
     * Recupera il valore della proprietà valueExpression.
     * 
     * @return
     *     possible object is
     *     {@link MultiAxisMeasure.ValueExpression }
     *     
     */
    public MultiAxisMeasure.ValueExpression getValueExpression() {
        return valueExpression;
    }

    /**
     * Imposta il valore della proprietà valueExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiAxisMeasure.ValueExpression }
     *     
     */
    public void setValueExpression(MultiAxisMeasure.ValueExpression value) {
        this.valueExpression = value;
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
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class LabelExpression {

        @XmlValue
        protected String content;

        /**
         * Recupera il valore della proprietà content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            return content;
        }

        /**
         * Imposta il valore della proprietà content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class ValueExpression {

        @XmlValue
        protected String content;

        /**
         * Recupera il valore della proprietà content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            return content;
        }

        /**
         * Imposta il valore della proprietà content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
        }

    }

}
