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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}seriesExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}taskExpression"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}subtaskExpression"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}startDateExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}endDateExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}percentExpression" minOccurs="0"/>
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
    "seriesExpression",
    "taskExpression",
    "subtaskExpression",
    "startDateExpression",
    "endDateExpression",
    "percentExpression"
})
@XmlRootElement(name = "ganttSeries")
public class GanttSeries {

    protected SeriesExpression seriesExpression;
    @XmlElement(required = true)
    protected TaskExpression taskExpression;
    @XmlElement(required = true)
    protected SubtaskExpression subtaskExpression;
    protected StartDateExpression startDateExpression;
    protected EndDateExpression endDateExpression;
    protected PercentExpression percentExpression;

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
     * Recupera il valore della proprietà taskExpression.
     * 
     * @return
     *     possible object is
     *     {@link TaskExpression }
     *     
     */
    public TaskExpression getTaskExpression() {
        return taskExpression;
    }

    /**
     * Imposta il valore della proprietà taskExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskExpression }
     *     
     */
    public void setTaskExpression(TaskExpression value) {
        this.taskExpression = value;
    }

    /**
     * Recupera il valore della proprietà subtaskExpression.
     * 
     * @return
     *     possible object is
     *     {@link SubtaskExpression }
     *     
     */
    public SubtaskExpression getSubtaskExpression() {
        return subtaskExpression;
    }

    /**
     * Imposta il valore della proprietà subtaskExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link SubtaskExpression }
     *     
     */
    public void setSubtaskExpression(SubtaskExpression value) {
        this.subtaskExpression = value;
    }

    /**
     * Recupera il valore della proprietà startDateExpression.
     * 
     * @return
     *     possible object is
     *     {@link StartDateExpression }
     *     
     */
    public StartDateExpression getStartDateExpression() {
        return startDateExpression;
    }

    /**
     * Imposta il valore della proprietà startDateExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDateExpression }
     *     
     */
    public void setStartDateExpression(StartDateExpression value) {
        this.startDateExpression = value;
    }

    /**
     * Recupera il valore della proprietà endDateExpression.
     * 
     * @return
     *     possible object is
     *     {@link EndDateExpression }
     *     
     */
    public EndDateExpression getEndDateExpression() {
        return endDateExpression;
    }

    /**
     * Imposta il valore della proprietà endDateExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDateExpression }
     *     
     */
    public void setEndDateExpression(EndDateExpression value) {
        this.endDateExpression = value;
    }

    /**
     * Recupera il valore della proprietà percentExpression.
     * 
     * @return
     *     possible object is
     *     {@link PercentExpression }
     *     
     */
    public PercentExpression getPercentExpression() {
        return percentExpression;
    }

    /**
     * Imposta il valore della proprietà percentExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentExpression }
     *     
     */
    public void setPercentExpression(PercentExpression value) {
        this.percentExpression = value;
    }

}
