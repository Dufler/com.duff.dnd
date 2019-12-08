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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bucketExpression" minOccurs="0"/>
 *         &lt;element name="labelExpression" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}comparatorExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bucketProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" default="java.lang.String" />
 *       &lt;attribute name="order" default="Ascending">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Ascending"/>
 *             &lt;enumeration value="Descending"/>
 *             &lt;enumeration value="None"/>
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
    "bucketExpression",
    "labelExpression",
    "comparatorExpression",
    "bucketProperty"
})
@XmlRootElement(name = "axisLevelBucket")
public class AxisLevelBucket {

    protected BucketExpression bucketExpression;
    protected AxisLevelBucket.LabelExpression labelExpression;
    protected ComparatorExpression comparatorExpression;
    protected List<BucketProperty> bucketProperty;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "order")
    protected String order;

    /**
     * Recupera il valore della proprietà bucketExpression.
     * 
     * @return
     *     possible object is
     *     {@link BucketExpression }
     *     
     */
    public BucketExpression getBucketExpression() {
        return bucketExpression;
    }

    /**
     * Imposta il valore della proprietà bucketExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link BucketExpression }
     *     
     */
    public void setBucketExpression(BucketExpression value) {
        this.bucketExpression = value;
    }

    /**
     * Recupera il valore della proprietà labelExpression.
     * 
     * @return
     *     possible object is
     *     {@link AxisLevelBucket.LabelExpression }
     *     
     */
    public AxisLevelBucket.LabelExpression getLabelExpression() {
        return labelExpression;
    }

    /**
     * Imposta il valore della proprietà labelExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link AxisLevelBucket.LabelExpression }
     *     
     */
    public void setLabelExpression(AxisLevelBucket.LabelExpression value) {
        this.labelExpression = value;
    }

    /**
     * Recupera il valore della proprietà comparatorExpression.
     * 
     * @return
     *     possible object is
     *     {@link ComparatorExpression }
     *     
     */
    public ComparatorExpression getComparatorExpression() {
        return comparatorExpression;
    }

    /**
     * Imposta il valore della proprietà comparatorExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparatorExpression }
     *     
     */
    public void setComparatorExpression(ComparatorExpression value) {
        this.comparatorExpression = value;
    }

    /**
     * Gets the value of the bucketProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bucketProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBucketProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BucketProperty }
     * 
     * 
     */
    public List<BucketProperty> getBucketProperty() {
        if (bucketProperty == null) {
            bucketProperty = new ArrayList<BucketProperty>();
        }
        return this.bucketProperty;
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
     * Recupera il valore della proprietà order.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        if (order == null) {
            return "Ascending";
        } else {
            return order;
        }
    }

    /**
     * Imposta il valore della proprietà order.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
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
