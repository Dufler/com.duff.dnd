//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.25 alle 11:10:35 PM CET 
//


package com.duff.dynamicreport.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkParameterExpression"/>
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
    "hyperlinkParameterExpression"
})
@XmlRootElement(name = "hyperlinkParameter")
public class HyperlinkParameter {

    @XmlElement(required = true)
    protected HyperlinkParameterExpression hyperlinkParameterExpression;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Recupera il valore della propriet� hyperlinkParameterExpression.
     * 
     * @return
     *     possible object is
     *     {@link HyperlinkParameterExpression }
     *     
     */
    public HyperlinkParameterExpression getHyperlinkParameterExpression() {
        return hyperlinkParameterExpression;
    }

    /**
     * Imposta il valore della propriet� hyperlinkParameterExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link HyperlinkParameterExpression }
     *     
     */
    public void setHyperlinkParameterExpression(HyperlinkParameterExpression value) {
        this.hyperlinkParameterExpression = value;
    }

    /**
     * Recupera il valore della propriet� name.
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
     * Imposta il valore della propriet� name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}