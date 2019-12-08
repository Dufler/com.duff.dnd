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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bucketExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}orderByExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}comparatorExpression" minOccurs="0"/>
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
    "orderByExpression",
    "comparatorExpression"
})
@XmlRootElement(name = "bucket")
public class Bucket {

    protected BucketExpression bucketExpression;
    protected OrderByExpression orderByExpression;
    protected ComparatorExpression comparatorExpression;
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
     * Recupera il valore della proprietà orderByExpression.
     * 
     * @return
     *     possible object is
     *     {@link OrderByExpression }
     *     
     */
    public OrderByExpression getOrderByExpression() {
        return orderByExpression;
    }

    /**
     * Imposta il valore della proprietà orderByExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderByExpression }
     *     
     */
    public void setOrderByExpression(OrderByExpression value) {
        this.orderByExpression = value;
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

}
