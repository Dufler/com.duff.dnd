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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}graphicElement" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}imageExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}anchorNameExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkReferenceExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkWhenExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkAnchorExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkPageExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkTooltipExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="scaleImage">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Clip"/>
 *             &lt;enumeration value="FillFrame"/>
 *             &lt;enumeration value="RetainShape"/>
 *             &lt;enumeration value="RealHeight"/>
 *             &lt;enumeration value="RealSize"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rotation">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Left"/>
 *             &lt;enumeration value="Right"/>
 *             &lt;enumeration value="UpsideDown"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="hAlign">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Left"/>
 *             &lt;enumeration value="Center"/>
 *             &lt;enumeration value="Right"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="vAlign">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Top"/>
 *             &lt;enumeration value="Middle"/>
 *             &lt;enumeration value="Bottom"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isUsingCache">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isLazy" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="onErrorType" default="Error">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Error"/>
 *             &lt;enumeration value="Blank"/>
 *             &lt;enumeration value="Icon"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="evaluationTime" type="{http://jasperreports.sourceforge.net/jasperreports}complexEvaluationTime" default="Now" />
 *       &lt;attribute name="evaluationGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hyperlinkType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hyperlinkTarget" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bookmarkLevel" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="0" />
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
    "graphicElement",
    "imageExpression",
    "anchorNameExpression",
    "hyperlinkReferenceExpression",
    "hyperlinkWhenExpression",
    "hyperlinkAnchorExpression",
    "hyperlinkPageExpression",
    "hyperlinkTooltipExpression",
    "hyperlinkParameter"
})
@XmlRootElement(name = "image")
public class Image {

    @XmlElement(required = true)
    protected ReportElement reportElement;
    protected Box box;
    protected GraphicElement graphicElement;
    protected ImageExpression imageExpression;
    protected AnchorNameExpression anchorNameExpression;
    protected HyperlinkReferenceExpression hyperlinkReferenceExpression;
    protected HyperlinkWhenExpression hyperlinkWhenExpression;
    protected HyperlinkAnchorExpression hyperlinkAnchorExpression;
    protected HyperlinkPageExpression hyperlinkPageExpression;
    protected HyperlinkTooltipExpression hyperlinkTooltipExpression;
    protected List<HyperlinkParameter> hyperlinkParameter;
    @XmlAttribute(name = "scaleImage")
    protected String scaleImage;
    @XmlAttribute(name = "rotation")
    protected String rotation;
    @XmlAttribute(name = "hAlign")
    protected String hAlign;
    @XmlAttribute(name = "vAlign")
    protected String vAlign;
    @XmlAttribute(name = "isUsingCache")
    protected String isUsingCache;
    @XmlAttribute(name = "isLazy")
    protected String isLazy;
    @XmlAttribute(name = "onErrorType")
    protected String onErrorType;
    @XmlAttribute(name = "evaluationTime")
    protected ComplexEvaluationTime evaluationTime;
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

    /**
     * Recupera il valore della proprietà imageExpression.
     * 
     * @return
     *     possible object is
     *     {@link ImageExpression }
     *     
     */
    public ImageExpression getImageExpression() {
        return imageExpression;
    }

    /**
     * Imposta il valore della proprietà imageExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageExpression }
     *     
     */
    public void setImageExpression(ImageExpression value) {
        this.imageExpression = value;
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
     * Recupera il valore della proprietà scaleImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaleImage() {
        return scaleImage;
    }

    /**
     * Imposta il valore della proprietà scaleImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaleImage(String value) {
        this.scaleImage = value;
    }

    /**
     * Recupera il valore della proprietà rotation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotation() {
        return rotation;
    }

    /**
     * Imposta il valore della proprietà rotation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotation(String value) {
        this.rotation = value;
    }

    /**
     * Recupera il valore della proprietà hAlign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHAlign() {
        return hAlign;
    }

    /**
     * Imposta il valore della proprietà hAlign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHAlign(String value) {
        this.hAlign = value;
    }

    /**
     * Recupera il valore della proprietà vAlign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAlign() {
        return vAlign;
    }

    /**
     * Imposta il valore della proprietà vAlign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAlign(String value) {
        this.vAlign = value;
    }

    /**
     * Recupera il valore della proprietà isUsingCache.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUsingCache() {
        return isUsingCache;
    }

    /**
     * Imposta il valore della proprietà isUsingCache.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUsingCache(String value) {
        this.isUsingCache = value;
    }

    /**
     * Recupera il valore della proprietà isLazy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLazy() {
        if (isLazy == null) {
            return "false";
        } else {
            return isLazy;
        }
    }

    /**
     * Imposta il valore della proprietà isLazy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLazy(String value) {
        this.isLazy = value;
    }

    /**
     * Recupera il valore della proprietà onErrorType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnErrorType() {
        if (onErrorType == null) {
            return "Error";
        } else {
            return onErrorType;
        }
    }

    /**
     * Imposta il valore della proprietà onErrorType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnErrorType(String value) {
        this.onErrorType = value;
    }

    /**
     * Recupera il valore della proprietà evaluationTime.
     * 
     * @return
     *     possible object is
     *     {@link ComplexEvaluationTime }
     *     
     */
    public ComplexEvaluationTime getEvaluationTime() {
        if (evaluationTime == null) {
            return ComplexEvaluationTime.NOW;
        } else {
            return evaluationTime;
        }
    }

    /**
     * Imposta il valore della proprietà evaluationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexEvaluationTime }
     *     
     */
    public void setEvaluationTime(ComplexEvaluationTime value) {
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

}
