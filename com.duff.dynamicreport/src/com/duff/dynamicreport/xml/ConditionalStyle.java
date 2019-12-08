//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.25 alle 11:10:35 PM CET 
//


package com.duff.dynamicreport.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}conditionExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}style"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conditionExpression",
    "style"
})
@XmlRootElement(name = "conditionalStyle")
public class ConditionalStyle {

    protected ConditionExpression conditionExpression;
    @XmlElement(required = true)
    protected Style style;

    /**
     * Recupera il valore della proprietà conditionExpression.
     * 
     * @return
     *     possible object is
     *     {@link ConditionExpression }
     *     
     */
    public ConditionExpression getConditionExpression() {
        return conditionExpression;
    }

    /**
     * Imposta il valore della proprietà conditionExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionExpression }
     *     
     */
    public void setConditionExpression(ConditionExpression value) {
        this.conditionExpression = value;
    }

    /**
     * Recupera il valore della proprietà style.
     * 
     * @return
     *     possible object is
     *     {@link Style }
     *     
     */
    public Style getStyle() {
        return style;
    }

    /**
     * Imposta il valore della proprietà style.
     * 
     * @param value
     *     allowed object is
     *     {@link Style }
     *     
     */
    public void setStyle(Style value) {
        this.style = value;
    }

}
