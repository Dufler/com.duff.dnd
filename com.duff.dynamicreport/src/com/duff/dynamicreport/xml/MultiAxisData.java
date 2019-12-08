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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}multiAxisDataset"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataAxis" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}multiAxisMeasure" maxOccurs="unbounded"/>
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
    "multiAxisDataset",
    "dataAxis",
    "multiAxisMeasure"
})
@XmlRootElement(name = "multiAxisData")
public class MultiAxisData {

    @XmlElement(required = true)
    protected MultiAxisDataset multiAxisDataset;
    @XmlElement(required = true)
    protected List<DataAxis> dataAxis;
    @XmlElement(required = true)
    protected List<MultiAxisMeasure> multiAxisMeasure;

    /**
     * Recupera il valore della proprietà multiAxisDataset.
     * 
     * @return
     *     possible object is
     *     {@link MultiAxisDataset }
     *     
     */
    public MultiAxisDataset getMultiAxisDataset() {
        return multiAxisDataset;
    }

    /**
     * Imposta il valore della proprietà multiAxisDataset.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiAxisDataset }
     *     
     */
    public void setMultiAxisDataset(MultiAxisDataset value) {
        this.multiAxisDataset = value;
    }

    /**
     * Gets the value of the dataAxis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataAxis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataAxis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataAxis }
     * 
     * 
     */
    public List<DataAxis> getDataAxis() {
        if (dataAxis == null) {
            dataAxis = new ArrayList<DataAxis>();
        }
        return this.dataAxis;
    }

    /**
     * Gets the value of the multiAxisMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiAxisMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiAxisMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiAxisMeasure }
     * 
     * 
     */
    public List<MultiAxisMeasure> getMultiAxisMeasure() {
        if (multiAxisMeasure == null) {
            multiAxisMeasure = new ArrayList<MultiAxisMeasure>();
        }
        return this.multiAxisMeasure;
    }

}
