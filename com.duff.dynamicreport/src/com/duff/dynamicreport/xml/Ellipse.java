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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}reportElement"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}graphicElement" minOccurs="0"/>
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
    "reportElement",
    "graphicElement"
})
@XmlRootElement(name = "ellipse")
public class Ellipse {

    @XmlElement(required = true)
    protected ReportElement reportElement;
    protected GraphicElement graphicElement;

    /**
     * Recupera il valore della proprietà reportElement.
     * 
     * @return
     *     possible object is
     *     {@link ReportElement }
     *     
     */
    public ReportElement getReportElement() {
        return reportElement;
    }

    /**
     * Imposta il valore della proprietà reportElement.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportElement }
     *     
     */
    public void setReportElement(ReportElement value) {
        this.reportElement = value;
    }

    /**
     * Recupera il valore della proprietà graphicElement.
     * 
     * @return
     *     possible object is
     *     {@link GraphicElement }
     *     
     */
    public GraphicElement getGraphicElement() {
        return graphicElement;
    }

    /**
     * Imposta il valore della proprietà graphicElement.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphicElement }
     *     
     */
    public void setGraphicElement(GraphicElement value) {
        this.graphicElement = value;
    }

}
