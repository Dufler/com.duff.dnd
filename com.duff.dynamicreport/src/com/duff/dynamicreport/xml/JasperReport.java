//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}property" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="propertyExpression" type="{http://jasperreports.sourceforge.net/jasperreports}datasetPropertyExpressionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}import" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}template" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}reportFont" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}style" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}subDataset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}scriptlet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}parameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}queryString" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}field" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}sortField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}variable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}filterExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}group" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}background" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}title" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pageHeader" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}columnHeader" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}detail" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}columnFooter" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pageFooter" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}lastPageFooter" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}summary" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}noData" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" default="java" />
 *       &lt;attribute name="columnCount" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="1" />
 *       &lt;attribute name="printOrder" default="Vertical">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Vertical"/>
 *             &lt;enumeration value="Horizontal"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="columnDirection" default="LTR">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="LTR"/>
 *             &lt;enumeration value="RTL"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pageWidth" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="595" />
 *       &lt;attribute name="pageHeight" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="842" />
 *       &lt;attribute name="orientation" default="Portrait">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Portrait"/>
 *             &lt;enumeration value="Landscape"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="whenNoDataType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="NoPages"/>
 *             &lt;enumeration value="BlankPage"/>
 *             &lt;enumeration value="AllSectionsNoDetail"/>
 *             &lt;enumeration value="NoDataSection"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="sectionType" default="Band">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Band"/>
 *             &lt;enumeration value="Part"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="columnWidth" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="555" />
 *       &lt;attribute name="columnSpacing" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="0" />
 *       &lt;attribute name="leftMargin" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="20" />
 *       &lt;attribute name="rightMargin" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="20" />
 *       &lt;attribute name="topMargin" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="30" />
 *       &lt;attribute name="bottomMargin" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="30" />
 *       &lt;attribute name="isTitleNewPage" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isSummaryNewPage" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isSummaryWithPageHeaderAndFooter" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isFloatColumnFooter" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
 *       &lt;attribute name="isIgnorePagination" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="formatFactoryClass" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "_import",
    "template",
    "reportFont",
    "style",
    "subDataset",
    "scriptlet",
    "parameter",
    "queryString",
    "field",
    "sortField",
    "variable",
    "filterExpression",
    "group",
    "background",
    "title",
    "pageHeader",
    "columnHeader",
    "detail",
    "columnFooter",
    "pageFooter",
    "lastPageFooter",
    "summary",
    "noData"
})
@XmlRootElement(name = "jasperReport")
public class JasperReport {

    protected List<Property> property;
    protected List<DatasetPropertyExpressionType> propertyExpression;
    @XmlElement(name = "import")
    protected List<Import> _import;
    protected List<Template> template;
    protected List<ReportFont> reportFont;
    protected List<Style> style;
    protected List<SubDataset> subDataset;
    protected List<Scriptlet> scriptlet;
    protected List<Parameter> parameter;
    protected QueryString queryString;
    protected List<Field> field;
    protected List<SortField> sortField;
    protected List<Variable> variable;
    protected FilterExpression filterExpression;
    protected List<Group> group;
    protected Background background;
    protected Title title;
    protected PageHeader pageHeader;
    protected ColumnHeader columnHeader;
    protected Detail detail;
    protected ColumnFooter columnFooter;
    protected PageFooter pageFooter;
    protected LastPageFooter lastPageFooter;
    protected Summary summary;
    protected NoData noData;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "language")
    protected String language;
    @XmlAttribute(name = "columnCount")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String columnCount;
    @XmlAttribute(name = "printOrder")
    protected String printOrder;
    @XmlAttribute(name = "columnDirection")
    protected String columnDirection;
    @XmlAttribute(name = "pageWidth")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String pageWidth;
    @XmlAttribute(name = "pageHeight")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String pageHeight;
    @XmlAttribute(name = "orientation")
    protected String orientation;
    @XmlAttribute(name = "whenNoDataType")
    protected String whenNoDataType;
    @XmlAttribute(name = "sectionType")
    protected String sectionType;
    @XmlAttribute(name = "columnWidth")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String columnWidth;
    @XmlAttribute(name = "columnSpacing")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String columnSpacing;
    @XmlAttribute(name = "leftMargin")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String leftMargin;
    @XmlAttribute(name = "rightMargin")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String rightMargin;
    @XmlAttribute(name = "topMargin")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String topMargin;
    @XmlAttribute(name = "bottomMargin")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String bottomMargin;
    @XmlAttribute(name = "isTitleNewPage")
    protected String isTitleNewPage;
    @XmlAttribute(name = "isSummaryNewPage")
    protected String isSummaryNewPage;
    @XmlAttribute(name = "isSummaryWithPageHeaderAndFooter")
    protected String isSummaryWithPageHeaderAndFooter;
    @XmlAttribute(name = "isFloatColumnFooter")
    protected String isFloatColumnFooter;
    @XmlAttribute(name = "scriptletClass")
    protected String scriptletClass;
    @XmlAttribute(name = "resourceBundle")
    protected String resourceBundle;
    @XmlAttribute(name = "whenResourceMissingType")
    protected String whenResourceMissingType;
    @XmlAttribute(name = "isIgnorePagination")
    protected String isIgnorePagination;
    @XmlAttribute(name = "formatFactoryClass")
    protected String formatFactoryClass;
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
     * Gets the value of the import property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the import property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Import }
     * 
     * 
     */
    public List<Import> getImport() {
        if (_import == null) {
            _import = new ArrayList<Import>();
        }
        return this._import;
    }

    /**
     * Gets the value of the template property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the template property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Template }
     * 
     * 
     */
    public List<Template> getTemplate() {
        if (template == null) {
            template = new ArrayList<Template>();
        }
        return this.template;
    }

    /**
     * Gets the value of the reportFont property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportFont property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportFont().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportFont }
     * 
     * 
     */
    public List<ReportFont> getReportFont() {
        if (reportFont == null) {
            reportFont = new ArrayList<ReportFont>();
        }
        return this.reportFont;
    }

    /**
     * Gets the value of the style property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the style property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Style }
     * 
     * 
     */
    public List<Style> getStyle() {
        if (style == null) {
            style = new ArrayList<Style>();
        }
        return this.style;
    }

    /**
     * Gets the value of the subDataset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subDataset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubDataset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubDataset }
     * 
     * 
     */
    public List<SubDataset> getSubDataset() {
        if (subDataset == null) {
            subDataset = new ArrayList<SubDataset>();
        }
        return this.subDataset;
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
     * Recupera il valore della propriet� queryString.
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
     * Imposta il valore della propriet� queryString.
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
     * Recupera il valore della propriet� filterExpression.
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
     * Imposta il valore della propriet� filterExpression.
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
     * Recupera il valore della propriet� background.
     * 
     * @return
     *     possible object is
     *     {@link Background }
     *     
     */
    public Background getBackground() {
        return background;
    }

    /**
     * Imposta il valore della propriet� background.
     * 
     * @param value
     *     allowed object is
     *     {@link Background }
     *     
     */
    public void setBackground(Background value) {
        this.background = value;
    }

    /**
     * Recupera il valore della propriet� title.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Imposta il valore della propriet� title.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Recupera il valore della propriet� pageHeader.
     * 
     * @return
     *     possible object is
     *     {@link PageHeader }
     *     
     */
    public PageHeader getPageHeader() {
        return pageHeader;
    }

    /**
     * Imposta il valore della propriet� pageHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link PageHeader }
     *     
     */
    public void setPageHeader(PageHeader value) {
        this.pageHeader = value;
    }

    /**
     * Recupera il valore della propriet� columnHeader.
     * 
     * @return
     *     possible object is
     *     {@link ColumnHeader }
     *     
     */
    public ColumnHeader getColumnHeader() {
        return columnHeader;
    }

    /**
     * Imposta il valore della propriet� columnHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnHeader }
     *     
     */
    public void setColumnHeader(ColumnHeader value) {
        this.columnHeader = value;
    }

    /**
     * Recupera il valore della propriet� detail.
     * 
     * @return
     *     possible object is
     *     {@link Detail }
     *     
     */
    public Detail getDetail() {
        return detail;
    }

    /**
     * Imposta il valore della propriet� detail.
     * 
     * @param value
     *     allowed object is
     *     {@link Detail }
     *     
     */
    public void setDetail(Detail value) {
        this.detail = value;
    }

    /**
     * Recupera il valore della propriet� columnFooter.
     * 
     * @return
     *     possible object is
     *     {@link ColumnFooter }
     *     
     */
    public ColumnFooter getColumnFooter() {
        return columnFooter;
    }

    /**
     * Imposta il valore della propriet� columnFooter.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnFooter }
     *     
     */
    public void setColumnFooter(ColumnFooter value) {
        this.columnFooter = value;
    }

    /**
     * Recupera il valore della propriet� pageFooter.
     * 
     * @return
     *     possible object is
     *     {@link PageFooter }
     *     
     */
    public PageFooter getPageFooter() {
        return pageFooter;
    }

    /**
     * Imposta il valore della propriet� pageFooter.
     * 
     * @param value
     *     allowed object is
     *     {@link PageFooter }
     *     
     */
    public void setPageFooter(PageFooter value) {
        this.pageFooter = value;
    }

    /**
     * Recupera il valore della propriet� lastPageFooter.
     * 
     * @return
     *     possible object is
     *     {@link LastPageFooter }
     *     
     */
    public LastPageFooter getLastPageFooter() {
        return lastPageFooter;
    }

    /**
     * Imposta il valore della propriet� lastPageFooter.
     * 
     * @param value
     *     allowed object is
     *     {@link LastPageFooter }
     *     
     */
    public void setLastPageFooter(LastPageFooter value) {
        this.lastPageFooter = value;
    }

    /**
     * Recupera il valore della propriet� summary.
     * 
     * @return
     *     possible object is
     *     {@link Summary }
     *     
     */
    public Summary getSummary() {
        return summary;
    }

    /**
     * Imposta il valore della propriet� summary.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary }
     *     
     */
    public void setSummary(Summary value) {
        this.summary = value;
    }

    /**
     * Recupera il valore della propriet� noData.
     * 
     * @return
     *     possible object is
     *     {@link NoData }
     *     
     */
    public NoData getNoData() {
        return noData;
    }

    /**
     * Imposta il valore della propriet� noData.
     * 
     * @param value
     *     allowed object is
     *     {@link NoData }
     *     
     */
    public void setNoData(NoData value) {
        this.noData = value;
    }

    /**
     * Recupera il valore della propriet� name.
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
     * Imposta il valore della propriet� name.
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
     * Recupera il valore della propriet� language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        if (language == null) {
            return "java";
        } else {
            return language;
        }
    }

    /**
     * Imposta il valore della propriet� language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Recupera il valore della propriet� columnCount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnCount() {
        if (columnCount == null) {
            return "1";
        } else {
            return columnCount;
        }
    }

    /**
     * Imposta il valore della propriet� columnCount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnCount(String value) {
        this.columnCount = value;
    }

    /**
     * Recupera il valore della propriet� printOrder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintOrder() {
        if (printOrder == null) {
            return "Vertical";
        } else {
            return printOrder;
        }
    }

    /**
     * Imposta il valore della propriet� printOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintOrder(String value) {
        this.printOrder = value;
    }

    /**
     * Recupera il valore della propriet� columnDirection.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnDirection() {
        if (columnDirection == null) {
            return "LTR";
        } else {
            return columnDirection;
        }
    }

    /**
     * Imposta il valore della propriet� columnDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnDirection(String value) {
        this.columnDirection = value;
    }

    /**
     * Recupera il valore della propriet� pageWidth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageWidth() {
        if (pageWidth == null) {
            return "595";
        } else {
            return pageWidth;
        }
    }

    /**
     * Imposta il valore della propriet� pageWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageWidth(String value) {
        this.pageWidth = value;
    }

    /**
     * Recupera il valore della propriet� pageHeight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageHeight() {
        if (pageHeight == null) {
            return "842";
        } else {
            return pageHeight;
        }
    }

    /**
     * Imposta il valore della propriet� pageHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageHeight(String value) {
        this.pageHeight = value;
    }

    /**
     * Recupera il valore della propriet� orientation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        if (orientation == null) {
            return "Portrait";
        } else {
            return orientation;
        }
    }

    /**
     * Imposta il valore della propriet� orientation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Recupera il valore della propriet� whenNoDataType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhenNoDataType() {
        return whenNoDataType;
    }

    /**
     * Imposta il valore della propriet� whenNoDataType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhenNoDataType(String value) {
        this.whenNoDataType = value;
    }

    /**
     * Recupera il valore della propriet� sectionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionType() {
        if (sectionType == null) {
            return "Band";
        } else {
            return sectionType;
        }
    }

    /**
     * Imposta il valore della propriet� sectionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionType(String value) {
        this.sectionType = value;
    }

    /**
     * Recupera il valore della propriet� columnWidth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnWidth() {
        if (columnWidth == null) {
            return "555";
        } else {
            return columnWidth;
        }
    }

    /**
     * Imposta il valore della propriet� columnWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnWidth(String value) {
        this.columnWidth = value;
    }

    /**
     * Recupera il valore della propriet� columnSpacing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnSpacing() {
        if (columnSpacing == null) {
            return "0";
        } else {
            return columnSpacing;
        }
    }

    /**
     * Imposta il valore della propriet� columnSpacing.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnSpacing(String value) {
        this.columnSpacing = value;
    }

    /**
     * Recupera il valore della propriet� leftMargin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftMargin() {
        if (leftMargin == null) {
            return "20";
        } else {
            return leftMargin;
        }
    }

    /**
     * Imposta il valore della propriet� leftMargin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftMargin(String value) {
        this.leftMargin = value;
    }

    /**
     * Recupera il valore della propriet� rightMargin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightMargin() {
        if (rightMargin == null) {
            return "20";
        } else {
            return rightMargin;
        }
    }

    /**
     * Imposta il valore della propriet� rightMargin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightMargin(String value) {
        this.rightMargin = value;
    }

    /**
     * Recupera il valore della propriet� topMargin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopMargin() {
        if (topMargin == null) {
            return "30";
        } else {
            return topMargin;
        }
    }

    /**
     * Imposta il valore della propriet� topMargin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopMargin(String value) {
        this.topMargin = value;
    }

    /**
     * Recupera il valore della propriet� bottomMargin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottomMargin() {
        if (bottomMargin == null) {
            return "30";
        } else {
            return bottomMargin;
        }
    }

    /**
     * Imposta il valore della propriet� bottomMargin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottomMargin(String value) {
        this.bottomMargin = value;
    }

    /**
     * Recupera il valore della propriet� isTitleNewPage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTitleNewPage() {
        if (isTitleNewPage == null) {
            return "false";
        } else {
            return isTitleNewPage;
        }
    }

    /**
     * Imposta il valore della propriet� isTitleNewPage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTitleNewPage(String value) {
        this.isTitleNewPage = value;
    }

    /**
     * Recupera il valore della propriet� isSummaryNewPage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSummaryNewPage() {
        if (isSummaryNewPage == null) {
            return "false";
        } else {
            return isSummaryNewPage;
        }
    }

    /**
     * Imposta il valore della propriet� isSummaryNewPage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSummaryNewPage(String value) {
        this.isSummaryNewPage = value;
    }

    /**
     * Recupera il valore della propriet� isSummaryWithPageHeaderAndFooter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSummaryWithPageHeaderAndFooter() {
        if (isSummaryWithPageHeaderAndFooter == null) {
            return "false";
        } else {
            return isSummaryWithPageHeaderAndFooter;
        }
    }

    /**
     * Imposta il valore della propriet� isSummaryWithPageHeaderAndFooter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSummaryWithPageHeaderAndFooter(String value) {
        this.isSummaryWithPageHeaderAndFooter = value;
    }

    /**
     * Recupera il valore della propriet� isFloatColumnFooter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsFloatColumnFooter() {
        if (isFloatColumnFooter == null) {
            return "false";
        } else {
            return isFloatColumnFooter;
        }
    }

    /**
     * Imposta il valore della propriet� isFloatColumnFooter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsFloatColumnFooter(String value) {
        this.isFloatColumnFooter = value;
    }

    /**
     * Recupera il valore della propriet� scriptletClass.
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
     * Imposta il valore della propriet� scriptletClass.
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
     * Recupera il valore della propriet� resourceBundle.
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
     * Imposta il valore della propriet� resourceBundle.
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
     * Recupera il valore della propriet� whenResourceMissingType.
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
     * Imposta il valore della propriet� whenResourceMissingType.
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
     * Recupera il valore della propriet� isIgnorePagination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsIgnorePagination() {
        if (isIgnorePagination == null) {
            return "false";
        } else {
            return isIgnorePagination;
        }
    }

    /**
     * Imposta il valore della propriet� isIgnorePagination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsIgnorePagination(String value) {
        this.isIgnorePagination = value;
    }

    /**
     * Recupera il valore della propriet� formatFactoryClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatFactoryClass() {
        return formatFactoryClass;
    }

    /**
     * Imposta il valore della propriet� formatFactoryClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatFactoryClass(String value) {
        this.formatFactoryClass = value;
    }

    /**
     * Recupera il valore della propriet� uuid.
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
     * Imposta il valore della propriet� uuid.
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
