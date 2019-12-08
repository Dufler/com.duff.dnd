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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}property" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="propertyExpression" type="{http://jasperreports.sourceforge.net/jasperreports}datasetPropertyExpressionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}scriptlet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}parameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}queryString" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}field" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}sortField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}variable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}filterExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}group" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scriptletClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resourceBundle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="whenResourceMissingType" default="Null">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Null"/>
 *             &lt;enumeration value="Empty"/>
 *             &lt;enumeration value="Key"/>
 *             &lt;enumeration value="Error"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "property",
    "propertyExpression",
    "scriptlet",
    "parameter",
    "queryString",
    "field",
    "sortField",
    "variable",
    "filterExpression",
    "group"
})
@XmlRootElement(name = "subDataset")
public class SubDataset {

    protected List<Property> property;
    protected List<DatasetPropertyExpressionType> propertyExpression;
    protected List<Scriptlet> scriptlet;
    protected List<Parameter> parameter;
    protected QueryString queryString;
    protected List<Field> field;
    protected List<SortField> sortField;
    protected List<Variable> variable;
    protected FilterExpression filterExpression;
    protected List<Group> group;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "scriptletClass")
    protected String scriptletClass;
    @XmlAttribute(name = "resourceBundle")
    protected String resourceBundle;
    @XmlAttribute(name = "whenResourceMissingType")
    protected String whenResourceMissingType;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

    /**
     * Gets the value of the propertyExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatasetPropertyExpressionType }
     * 
     * 
     */
    public List<DatasetPropertyExpressionType> getPropertyExpression() {
        if (propertyExpression == null) {
            propertyExpression = new ArrayList<DatasetPropertyExpressionType>();
        }
        return this.propertyExpression;
    }

    /**
     * Gets the value of the scriptlet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scriptlet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScriptlet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Scriptlet }
     * 
     * 
     */
    public List<Scriptlet> getScriptlet() {
        if (scriptlet == null) {
            scriptlet = new ArrayList<Scriptlet>();
        }
        return this.scriptlet;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parameter }
     * 
     * 
     */
    public List<Parameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<Parameter>();
        }
        return this.parameter;
    }

    /**
     * Recupera il valore della proprietà queryString.
     * 
     * @return
     *     possible object is
     *     {@link QueryString }
     *     
     */
    public QueryString getQueryString() {
        return queryString;
    }

    /**
     * Imposta il valore della proprietà queryString.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryString }
     *     
     */
    public void setQueryString(QueryString value) {
        this.queryString = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Field }
     * 
     * 
     */
    public List<Field> getField() {
        if (field == null) {
            field = new ArrayList<Field>();
        }
        return this.field;
    }

    /**
     * Gets the value of the sortField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortField }
     * 
     * 
     */
    public List<SortField> getSortField() {
        if (sortField == null) {
            sortField = new ArrayList<SortField>();
        }
        return this.sortField;
    }

    /**
     * Gets the value of the variable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Variable }
     * 
     * 
     */
    public List<Variable> getVariable() {
        if (variable == null) {
            variable = new ArrayList<Variable>();
        }
        return this.variable;
    }

    /**
     * Recupera il valore della proprietà filterExpression.
     * 
     * @return
     *     possible object is
     *     {@link FilterExpression }
     *     
     */
    public FilterExpression getFilterExpression() {
        return filterExpression;
    }

    /**
     * Imposta il valore della proprietà filterExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterExpression }
     *     
     */
    public void setFilterExpression(FilterExpression value) {
        this.filterExpression = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group }
     * 
     * 
     */
    public List<Group> getGroup() {
        if (group == null) {
            group = new ArrayList<Group>();
        }
        return this.group;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà scriptletClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptletClass() {
        return scriptletClass;
    }

    /**
     * Imposta il valore della proprietà scriptletClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptletClass(String value) {
        this.scriptletClass = value;
    }

    /**
     * Recupera il valore della proprietà resourceBundle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceBundle() {
        return resourceBundle;
    }

    /**
     * Imposta il valore della proprietà resourceBundle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceBundle(String value) {
        this.resourceBundle = value;
    }

    /**
     * Recupera il valore della proprietà whenResourceMissingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhenResourceMissingType() {
        if (whenResourceMissingType == null) {
            return "Null";
        } else {
            return whenResourceMissingType;
        }
    }

    /**
     * Imposta il valore della proprietà whenResourceMissingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhenResourceMissingType(String value) {
        this.whenResourceMissingType = value;
    }

    /**
     * Recupera il valore della proprietà uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Imposta il valore della proprietà uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
