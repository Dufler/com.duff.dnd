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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}parametersMapExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}subreportParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}connectionExpression"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataSourceExpression"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}returnValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}subreportExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isUsingCache">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="runToBottom">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="overflowType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Stretch"/>
 *             &lt;enumeration value="NoStretch"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
    "parametersMapExpression",
    "subreportParameter",
    "connectionExpression",
    "dataSourceExpression",
    "returnValue",
    "subreportExpression"
})
@XmlRootElement(name = "subreport")
public class Subreport {

    @XmlElement(required = true)
    protected ReportElement reportElement;
    protected ParametersMapExpression parametersMapExpression;
    protected List<SubreportParameter> subreportParameter;
    protected ConnectionExpression connectionExpression;
    protected DataSourceExpression dataSourceExpression;
    protected List<ReturnValue> returnValue;
    protected SubreportExpression subreportExpression;
    @XmlAttribute(name = "isUsingCache")
    protected String isUsingCache;
    @XmlAttribute(name = "runToBottom")
    protected String runToBottom;
    @XmlAttribute(name = "overflowType")
    protected String overflowType;

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
     * Recupera il valore della proprietà parametersMapExpression.
     * 
     * @return
     *     possible object is
     *     {@link ParametersMapExpression }
     *     
     */
    public ParametersMapExpression getParametersMapExpression() {
        return parametersMapExpression;
    }

    /**
     * Imposta il valore della proprietà parametersMapExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersMapExpression }
     *     
     */
    public void setParametersMapExpression(ParametersMapExpression value) {
        this.parametersMapExpression = value;
    }

    /**
     * Gets the value of the subreportParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subreportParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubreportParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubreportParameter }
     * 
     * 
     */
    public List<SubreportParameter> getSubreportParameter() {
        if (subreportParameter == null) {
            subreportParameter = new ArrayList<SubreportParameter>();
        }
        return this.subreportParameter;
    }

    /**
     * Recupera il valore della proprietà connectionExpression.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionExpression }
     *     
     */
    public ConnectionExpression getConnectionExpression() {
        return connectionExpression;
    }

    /**
     * Imposta il valore della proprietà connectionExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionExpression }
     *     
     */
    public void setConnectionExpression(ConnectionExpression value) {
        this.connectionExpression = value;
    }

    /**
     * Recupera il valore della proprietà dataSourceExpression.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceExpression }
     *     
     */
    public DataSourceExpression getDataSourceExpression() {
        return dataSourceExpression;
    }

    /**
     * Imposta il valore della proprietà dataSourceExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceExpression }
     *     
     */
    public void setDataSourceExpression(DataSourceExpression value) {
        this.dataSourceExpression = value;
    }

    /**
     * Gets the value of the returnValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnValue }
     * 
     * 
     */
    public List<ReturnValue> getReturnValue() {
        if (returnValue == null) {
            returnValue = new ArrayList<ReturnValue>();
        }
        return this.returnValue;
    }

    /**
     * Recupera il valore della proprietà subreportExpression.
     * 
     * @return
     *     possible object is
     *     {@link SubreportExpression }
     *     
     */
    public SubreportExpression getSubreportExpression() {
        return subreportExpression;
    }

    /**
     * Imposta il valore della proprietà subreportExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link SubreportExpression }
     *     
     */
    public void setSubreportExpression(SubreportExpression value) {
        this.subreportExpression = value;
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
     * Recupera il valore della proprietà runToBottom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunToBottom() {
        return runToBottom;
    }

    /**
     * Imposta il valore della proprietà runToBottom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunToBottom(String value) {
        this.runToBottom = value;
    }

    /**
     * Recupera il valore della proprietà overflowType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverflowType() {
        return overflowType;
    }

    /**
     * Imposta il valore della proprietà overflowType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverflowType(String value) {
        this.overflowType = value;
    }

}
