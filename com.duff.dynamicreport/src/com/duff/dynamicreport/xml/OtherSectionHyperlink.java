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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkReferenceExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkWhenExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkAnchorExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkPageExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkTooltipExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hyperlinkType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hyperlinkTarget" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hyperlinkReferenceExpression",
    "hyperlinkWhenExpression",
    "hyperlinkAnchorExpression",
    "hyperlinkPageExpression",
    "hyperlinkTooltipExpression",
    "hyperlinkParameter"
})
@XmlRootElement(name = "otherSectionHyperlink")
public class OtherSectionHyperlink {

    protected HyperlinkReferenceExpression hyperlinkReferenceExpression;
    protected HyperlinkWhenExpression hyperlinkWhenExpression;
    protected HyperlinkAnchorExpression hyperlinkAnchorExpression;
    protected HyperlinkPageExpression hyperlinkPageExpression;
    protected HyperlinkTooltipExpression hyperlinkTooltipExpression;
    protected List<HyperlinkParameter> hyperlinkParameter;
    @XmlAttribute(name = "hyperlinkType")
    protected String hyperlinkType;
    @XmlAttribute(name = "hyperlinkTarget")
    protected String hyperlinkTarget;

    /**
     * Recupera il valore della proprietà hyperlinkReferenceExpression.
     * 
     * @return
     *     possible object is
     *     {@link HyperlinkReferenceExpression }
     *     
     */
    public HyperlinkReferenceExpression getHyperlinkReferenceExpression() {
        return hyperlinkReferenceExpression;
    }

    /**
     * Imposta il valore della proprietà hyperlinkReferenceExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link HyperlinkReferenceExpression }
     *     
     */
    public void setHyperlinkReferenceExpression(HyperlinkReferenceExpression value) {
        this.hyperlinkReferenceExpression = value;
    }

    /**
     * Recupera il valore della proprietà hyperlinkWhenExpression.
     * 
     * @return
     *     possible object is
     *     {@link HyperlinkWhenExpression }
     *     
     */
    public HyperlinkWhenExpression getHyperlinkWhenExpression() {
        return hyperlinkWhenExpression;
    }

    /**
     * Imposta il valore della proprietà hyperlinkWhenExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link HyperlinkWhenExpression }
     *     
     */
    public void setHyperlinkWhenExpression(HyperlinkWhenExpression value) {
        this.hyperlinkWhenExpression = value;
    }

    /**
     * Recupera il valore della proprietà hyperlinkAnchorExpression.
     * 
     * @return
     *     possible object is
     *     {@link HyperlinkAnchorExpression }
     *     
     */
    public HyperlinkAnchorExpression getHyperlinkAnchorExpression() {
        return hyperlinkAnchorExpression;
    }

    /**
     * Imposta il valore della proprietà hyperlinkAnchorExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link HyperlinkAnchorExpression }
     *     
     */
    public void setHyperlinkAnchorExpression(HyperlinkAnchorExpression value) {
        this.hyperlinkAnchorExpression = value;
    }

    /**
     * Recupera il valore della proprietà hyperlinkPageExpression.
     * 
     * @return
     *     possible object is
     *     {@link HyperlinkPageExpression }
     *     
     */
    public HyperlinkPageExpression getHyperlinkPageExpression() {
        return hyperlinkPageExpression;
    }

    /**
     * Imposta il valore della proprietà hyperlinkPageExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link HyperlinkPageExpression }
     *     
     */
    public void setHyperlinkPageExpression(HyperlinkPageExpression value) {
        this.hyperlinkPageExpression = value;
    }

    /**
     * Recupera il valore della proprietà hyperlinkTooltipExpression.
     * 
     * @return
     *     possible object is
     *     {@link HyperlinkTooltipExpression }
     *     
     */
    public HyperlinkTooltipExpression getHyperlinkTooltipExpression() {
        return hyperlinkTooltipExpression;
    }

    /**
     * Imposta il valore della proprietà hyperlinkTooltipExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link HyperlinkTooltipExpression }
     *     
     */
    public void setHyperlinkTooltipExpression(HyperlinkTooltipExpression value) {
        this.hyperlinkTooltipExpression = value;
    }

    /**
     * Gets the value of the hyperlinkParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hyperlinkParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHyperlinkParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HyperlinkParameter }
     * 
     * 
     */
    public List<HyperlinkParameter> getHyperlinkParameter() {
        if (hyperlinkParameter == null) {
            hyperlinkParameter = new ArrayList<HyperlinkParameter>();
        }
        return this.hyperlinkParameter;
    }

    /**
     * Recupera il valore della proprietà hyperlinkType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHyperlinkType() {
        return hyperlinkType;
    }

    /**
     * Imposta il valore della proprietà hyperlinkType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHyperlinkType(String value) {
        this.hyperlinkType = value;
    }

    /**
     * Recupera il valore della proprietà hyperlinkTarget.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHyperlinkTarget() {
        return hyperlinkTarget;
    }

    /**
     * Imposta il valore della proprietà hyperlinkTarget.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHyperlinkTarget(String value) {
        this.hyperlinkTarget = value;
    }

}
