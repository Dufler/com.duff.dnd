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
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}reportElement"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}box" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}chartTitle" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}chartSubtitle" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}chartLegend" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}anchorNameExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkReferenceExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkWhenExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkAnchorExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkPageExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkTooltipExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isShowLegend">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="evaluationTime" type="{http://jasperreports.sourceforge.net/jasperreports}basicEvaluationTime" default="Now" />
 *       &lt;attribute name="evaluationGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hyperlinkType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hyperlinkTarget" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bookmarkLevel" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="0" />
 *       &lt;attribute name="customizerClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="renderType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="theme" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "box",
    "chartTitle",
    "chartSubtitle",
    "chartLegend",
    "anchorNameExpression",
    "hyperlinkReferenceExpression",
    "hyperlinkWhenExpression",
    "hyperlinkAnchorExpression",
    "hyperlinkPageExpression",
    "hyperlinkTooltipExpression",
    "hyperlinkParameter"
})
@XmlRootElement(name = "chart")
public class Chart {

    @XmlElement(required = true)
    protected ReportElement reportElement;
    protected Box box;
    protected ChartTitle chartTitle;
    protected ChartSubtitle chartSubtitle;
    protected ChartLegend chartLegend;
    protected AnchorNameExpression anchorNameExpression;
    protected HyperlinkReferenceExpression hyperlinkReferenceExpression;
    protected HyperlinkWhenExpression hyperlinkWhenExpression;
    protected HyperlinkAnchorExpression hyperlinkAnchorExpression;
    protected HyperlinkPageExpression hyperlinkPageExpression;
    protected HyperlinkTooltipExpression hyperlinkTooltipExpression;
    protected List<HyperlinkParameter> hyperlinkParameter;
    @XmlAttribute(name = "isShowLegend")
    protected String isShowLegend;
    @XmlAttribute(name = "evaluationTime")
    protected BasicEvaluationTime evaluationTime;
    @XmlAttribute(name = "evaluationGroup")
    protected String evaluationGroup;
    @XmlAttribute(name = "hyperlinkType")
    protected String hyperlinkType;
    @XmlAttribute(name = "hyperlinkTarget")
    protected String hyperlinkTarget;
    @XmlAttribute(name = "bookmarkLevel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String bookmarkLevel;
    @XmlAttribute(name = "customizerClass")
    protected String customizerClass;
    @XmlAttribute(name = "renderType")
    protected String renderType;
    @XmlAttribute(name = "theme")
    protected String theme;

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
     * Recupera il valore della proprietà box.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getBox() {
        return box;
    }

    /**
     * Imposta il valore della proprietà box.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setBox(Box value) {
        this.box = value;
    }

    /**
     * Recupera il valore della proprietà chartTitle.
     * 
     * @return
     *     possible object is
     *     {@link ChartTitle }
     *     
     */
    public ChartTitle getChartTitle() {
        return chartTitle;
    }

    /**
     * Imposta il valore della proprietà chartTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartTitle }
     *     
     */
    public void setChartTitle(ChartTitle value) {
        this.chartTitle = value;
    }

    /**
     * Recupera il valore della proprietà chartSubtitle.
     * 
     * @return
     *     possible object is
     *     {@link ChartSubtitle }
     *     
     */
    public ChartSubtitle getChartSubtitle() {
        return chartSubtitle;
    }

    /**
     * Imposta il valore della proprietà chartSubtitle.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartSubtitle }
     *     
     */
    public void setChartSubtitle(ChartSubtitle value) {
        this.chartSubtitle = value;
    }

    /**
     * Recupera il valore della proprietà chartLegend.
     * 
     * @return
     *     possible object is
     *     {@link ChartLegend }
     *     
     */
    public ChartLegend getChartLegend() {
        return chartLegend;
    }

    /**
     * Imposta il valore della proprietà chartLegend.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartLegend }
     *     
     */
    public void setChartLegend(ChartLegend value) {
        this.chartLegend = value;
    }

    /**
     * Recupera il valore della proprietà anchorNameExpression.
     * 
     * @return
     *     possible object is
     *     {@link AnchorNameExpression }
     *     
     */
    public AnchorNameExpression getAnchorNameExpression() {
        return anchorNameExpression;
    }

    /**
     * Imposta il valore della proprietà anchorNameExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link AnchorNameExpression }
     *     
     */
    public void setAnchorNameExpression(AnchorNameExpression value) {
        this.anchorNameExpression = value;
    }

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
     * Recupera il valore della proprietà isShowLegend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShowLegend() {
        return isShowLegend;
    }

    /**
     * Imposta il valore della proprietà isShowLegend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShowLegend(String value) {
        this.isShowLegend = value;
    }

    /**
     * Recupera il valore della proprietà evaluationTime.
     * 
     * @return
     *     possible object is
     *     {@link BasicEvaluationTime }
     *     
     */
    public BasicEvaluationTime getEvaluationTime() {
        if (evaluationTime == null) {
            return BasicEvaluationTime.NOW;
        } else {
            return evaluationTime;
        }
    }

    /**
     * Imposta il valore della proprietà evaluationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicEvaluationTime }
     *     
     */
    public void setEvaluationTime(BasicEvaluationTime value) {
        this.evaluationTime = value;
    }

    /**
     * Recupera il valore della proprietà evaluationGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluationGroup() {
        return evaluationGroup;
    }

    /**
     * Imposta il valore della proprietà evaluationGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluationGroup(String value) {
        this.evaluationGroup = value;
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

    /**
     * Recupera il valore della proprietà bookmarkLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookmarkLevel() {
        if (bookmarkLevel == null) {
            return "0";
        } else {
            return bookmarkLevel;
        }
    }

    /**
     * Imposta il valore della proprietà bookmarkLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookmarkLevel(String value) {
        this.bookmarkLevel = value;
    }

    /**
     * Recupera il valore della proprietà customizerClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomizerClass() {
        return customizerClass;
    }

    /**
     * Imposta il valore della proprietà customizerClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomizerClass(String value) {
        this.customizerClass = value;
    }

    /**
     * Recupera il valore della proprietà renderType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderType() {
        return renderType;
    }

    /**
     * Imposta il valore della proprietà renderType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderType(String value) {
        this.renderType = value;
    }

    /**
     * Recupera il valore della proprietà theme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Imposta il valore della proprietà theme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheme(String value) {
        this.theme = value;
    }

}
