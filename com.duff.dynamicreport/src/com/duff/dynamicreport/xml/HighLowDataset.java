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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataset" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}seriesExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dateExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}lowExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}openExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}closeExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}volumeExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}itemHyperlink" minOccurs="0"/>
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
    "dataset",
    "seriesExpression",
    "dateExpression",
    "highExpression",
    "lowExpression",
    "openExpression",
    "closeExpression",
    "volumeExpression",
    "itemHyperlink"
})
@XmlRootElement(name = "highLowDataset")
public class HighLowDataset {

    protected Dataset dataset;
    protected SeriesExpression seriesExpression;
    protected DateExpression dateExpression;
    protected HighExpression highExpression;
    protected LowExpression lowExpression;
    protected OpenExpression openExpression;
    protected CloseExpression closeExpression;
    protected VolumeExpression volumeExpression;
    protected ItemHyperlink itemHyperlink;

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
     * Recupera il valore della proprietà seriesExpression.
     * 
     * @return
     *     possible object is
     *     {@link SeriesExpression }
     *     
     */
    public SeriesExpression getSeriesExpression() {
        return seriesExpression;
    }

    /**
     * Imposta il valore della proprietà seriesExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesExpression }
     *     
     */
    public void setSeriesExpression(SeriesExpression value) {
        this.seriesExpression = value;
    }

    /**
     * Recupera il valore della proprietà dateExpression.
     * 
     * @return
     *     possible object is
     *     {@link DateExpression }
     *     
     */
    public DateExpression getDateExpression() {
        return dateExpression;
    }

    /**
     * Imposta il valore della proprietà dateExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link DateExpression }
     *     
     */
    public void setDateExpression(DateExpression value) {
        this.dateExpression = value;
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
     * Recupera il valore della proprietà openExpression.
     * 
     * @return
     *     possible object is
     *     {@link OpenExpression }
     *     
     */
    public OpenExpression getOpenExpression() {
        return openExpression;
    }

    /**
     * Imposta il valore della proprietà openExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenExpression }
     *     
     */
    public void setOpenExpression(OpenExpression value) {
        this.openExpression = value;
    }

    /**
     * Recupera il valore della proprietà closeExpression.
     * 
     * @return
     *     possible object is
     *     {@link CloseExpression }
     *     
     */
    public CloseExpression getCloseExpression() {
        return closeExpression;
    }

    /**
     * Imposta il valore della proprietà closeExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link CloseExpression }
     *     
     */
    public void setCloseExpression(CloseExpression value) {
        this.closeExpression = value;
    }

    /**
     * Recupera il valore della proprietà volumeExpression.
     * 
     * @return
     *     possible object is
     *     {@link VolumeExpression }
     *     
     */
    public VolumeExpression getVolumeExpression() {
        return volumeExpression;
    }

    /**
     * Imposta il valore della proprietà volumeExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeExpression }
     *     
     */
    public void setVolumeExpression(VolumeExpression value) {
        this.volumeExpression = value;
    }

    /**
     * Recupera il valore della proprietà itemHyperlink.
     * 
     * @return
     *     possible object is
     *     {@link ItemHyperlink }
     *     
     */
    public ItemHyperlink getItemHyperlink() {
        return itemHyperlink;
    }

    /**
     * Imposta il valore della proprietà itemHyperlink.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemHyperlink }
     *     
     */
    public void setItemHyperlink(ItemHyperlink value) {
        this.itemHyperlink = value;
    }

}
