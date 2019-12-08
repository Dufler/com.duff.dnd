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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}lowExpression"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highExpression"/>
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
    "lowExpression",
    "highExpression"
})
@XmlRootElement(name = "dataRange")
public class DataRange {

    @XmlElement(required = true)
    protected LowExpression lowExpression;
    @XmlElement(required = true)
    protected HighExpression highExpression;

    /**
     * Recupera il valore della proprietà lowExpression.
     * 
     * @return
     *     possible object is
     *     {@link LowExpression }
     *     
     */
    public LowExpression getLowExpression() {
        return lowExpression;
    }

    /**
     * Imposta il valore della proprietà lowExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link LowExpression }
     *     
     */
    public void setLowExpression(LowExpression value) {
        this.lowExpression = value;
    }

    /**
     * Recupera il valore della proprietà highExpression.
     * 
     * @return
     *     possible object is
     *     {@link HighExpression }
     *     
     */
    public HighExpression getHighExpression() {
        return highExpression;
    }

    /**
     * Imposta il valore della proprietà highExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link HighExpression }
     *     
     */
    public void setHighExpression(HighExpression value) {
        this.highExpression = value;
    }

}
