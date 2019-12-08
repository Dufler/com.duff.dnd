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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}axisLevelBucket"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "axisLevelBucket"
})
@XmlRootElement(name = "axisLevel")
public class AxisLevel {

    @XmlElement(required = true)
    protected AxisLevel.LabelExpression labelExpression;
    @XmlElement(required = true)
    protected AxisLevelBucket axisLevelBucket;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Recupera il valore della proprietà labelExpression.
     * 
     * @return
     *     possible object is
     *     {@link AxisLevel.LabelExpression }
     *     
     */
    public AxisLevel.LabelExpression getLabelExpression() {
        return labelExpression;
    }

    /**
     * Imposta il valore della proprietà labelExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link AxisLevel.LabelExpression }
     *     
     */
    public void setLabelExpression(AxisLevel.LabelExpression value) {
        this.labelExpression = value;
    }

    /**
     * Recupera il valore della proprietà axisLevelBucket.
     * 
     * @return
     *     possible object is
     *     {@link AxisLevelBucket }
     *     
     */
    public AxisLevelBucket getAxisLevelBucket() {
        return axisLevelBucket;
    }

    /**
     * Imposta il valore della proprietà axisLevelBucket.
     * 
     * @param value
     *     allowed object is
     *     {@link AxisLevelBucket }
     *     
     */
    public void setAxisLevelBucket(AxisLevelBucket value) {
        this.axisLevelBucket = value;
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

}
