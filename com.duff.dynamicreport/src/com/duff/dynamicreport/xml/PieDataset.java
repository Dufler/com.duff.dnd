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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataset" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pieSeries" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}keyExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}labelExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}sectionHyperlink" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}otherKeyExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}otherLabelExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}otherSectionHyperlink" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="minPercentage" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="maxCount" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataset",
    "pieSeries",
    "keyExpression",
    "valueExpression",
    "labelExpression",
    "sectionHyperlink",
    "otherKeyExpression",
    "otherLabelExpression",
    "otherSectionHyperlink"
})
@XmlRootElement(name = "pieDataset")
public class PieDataset {

    protected Dataset dataset;
    protected List<PieSeries> pieSeries;
    protected KeyExpression keyExpression;
    protected ValueExpression valueExpression;
    protected LabelExpression labelExpression;
    protected SectionHyperlink sectionHyperlink;
    protected OtherKeyExpression otherKeyExpression;
    protected OtherLabelExpression otherLabelExpression;
    protected OtherSectionHyperlink otherSectionHyperlink;
    @XmlAttribute(name = "minPercentage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String minPercentage;
    @XmlAttribute(name = "maxCount")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String maxCount;

    /**
     * Recupera il valore della proprietà dataset.
     * 
     * @return
     *     possible object is
     *     {@link Dataset }
     *     
     */
    public Dataset getDataset() {
        return dataset;
    }

    /**
     * Imposta il valore della proprietà dataset.
     * 
     * @param value
     *     allowed object is
     *     {@link Dataset }
     *     
     */
    public void setDataset(Dataset value) {
        this.dataset = value;
    }

    /**
     * Gets the value of the pieSeries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pieSeries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPieSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PieSeries }
     * 
     * 
     */
    public List<PieSeries> getPieSeries() {
        if (pieSeries == null) {
            pieSeries = new ArrayList<PieSeries>();
        }
        return this.pieSeries;
    }

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

    /**
     * Recupera il valore della proprietà otherKeyExpression.
     * 
     * @return
     *     possible object is
     *     {@link OtherKeyExpression }
     *     
     */
    public OtherKeyExpression getOtherKeyExpression() {
        return otherKeyExpression;
    }

    /**
     * Imposta il valore della proprietà otherKeyExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherKeyExpression }
     *     
     */
    public void setOtherKeyExpression(OtherKeyExpression value) {
        this.otherKeyExpression = value;
    }

    /**
     * Recupera il valore della proprietà otherLabelExpression.
     * 
     * @return
     *     possible object is
     *     {@link OtherLabelExpression }
     *     
     */
    public OtherLabelExpression getOtherLabelExpression() {
        return otherLabelExpression;
    }

    /**
     * Imposta il valore della proprietà otherLabelExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherLabelExpression }
     *     
     */
    public void setOtherLabelExpression(OtherLabelExpression value) {
        this.otherLabelExpression = value;
    }

    /**
     * Recupera il valore della proprietà otherSectionHyperlink.
     * 
     * @return
     *     possible object is
     *     {@link OtherSectionHyperlink }
     *     
     */
    public OtherSectionHyperlink getOtherSectionHyperlink() {
        return otherSectionHyperlink;
    }

    /**
     * Imposta il valore della proprietà otherSectionHyperlink.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherSectionHyperlink }
     *     
     */
    public void setOtherSectionHyperlink(OtherSectionHyperlink value) {
        this.otherSectionHyperlink = value;
    }

    /**
     * Recupera il valore della proprietà minPercentage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinPercentage() {
        return minPercentage;
    }

    /**
     * Imposta il valore della proprietà minPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinPercentage(String value) {
        this.minPercentage = value;
    }

    /**
     * Recupera il valore della proprietà maxCount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCount() {
        return maxCount;
    }

    /**
     * Imposta il valore della proprietà maxCount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCount(String value) {
        this.maxCount = value;
    }

}
