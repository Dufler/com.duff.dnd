//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.25 alle 11:10:35 PM CET 
//


package com.duff.dynamicreport.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}keyExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}labelExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}sectionHyperlink" minOccurs="0"/>
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
    "keyExpression",
    "valueExpression",
    "labelExpression",
    "sectionHyperlink"
})
@XmlRootElement(name = "pieSeries")
public class PieSeries {

    protected KeyExpression keyExpression;
    protected ValueExpression valueExpression;
    protected LabelExpression labelExpression;
    protected SectionHyperlink sectionHyperlink;

    /**
     * Recupera il valore della proprietà keyExpression.
     * 
     * @return
     *     possible object is
     *     {@link KeyExpression }
     *     
     */
    public KeyExpression getKeyExpression() {
        return keyExpression;
    }

    /**
     * Imposta il valore della proprietà keyExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExpression }
     *     
     */
    public void setKeyExpression(KeyExpression value) {
        this.keyExpression = value;
    }

    /**
     * Recupera il valore della proprietà valueExpression.
     * 
     * @return
     *     possible object is
     *     {@link ValueExpression }
     *     
     */
    public ValueExpression getValueExpression() {
        return valueExpression;
    }

    /**
     * Imposta il valore della proprietà valueExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueExpression }
     *     
     */
    public void setValueExpression(ValueExpression value) {
        this.valueExpression = value;
    }

    /**
     * Recupera il valore della proprietà labelExpression.
     * 
     * @return
     *     possible object is
     *     {@link LabelExpression }
     *     
     */
    public LabelExpression getLabelExpression() {
        return labelExpression;
    }

    /**
     * Imposta il valore della proprietà labelExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelExpression }
     *     
     */
    public void setLabelExpression(LabelExpression value) {
        this.labelExpression = value;
    }

    /**
     * Recupera il valore della proprietà sectionHyperlink.
     * 
     * @return
     *     possible object is
     *     {@link SectionHyperlink }
     *     
     */
    public SectionHyperlink getSectionHyperlink() {
        return sectionHyperlink;
    }

    /**
     * Imposta il valore della proprietà sectionHyperlink.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionHyperlink }
     *     
     */
    public void setSectionHyperlink(SectionHyperlink value) {
        this.sectionHyperlink = value;
    }

}
