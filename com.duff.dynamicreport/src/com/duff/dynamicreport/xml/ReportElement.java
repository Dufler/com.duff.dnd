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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}property" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}propertyExpression" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}printWhenExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="positionType" default="FixRelativeToTop">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Float"/>
 *             &lt;enumeration value="FixRelativeToTop"/>
 *             &lt;enumeration value="FixRelativeToBottom"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="stretchType" default="NoStretch">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="NoStretch"/>
 *             &lt;enumeration value="RelativeToTallestObject"/>
 *             &lt;enumeration value="RelativeToBandHeight"/>
 *             &lt;enumeration value="ElementGroupBottom"/>
 *             &lt;enumeration value="ElementGroupHeight"/>
 *             &lt;enumeration value="ContainerBottom"/>
 *             &lt;enumeration value="ContainerHeight"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isPrintRepeatedValues" default="true">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="mode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Opaque"/>
 *             &lt;enumeration value="Transparent"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="isRemoveLineWhenBlank" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isPrintInFirstWholeBand" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isPrintWhenDetailOverflows" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="printWhenGroupChanges" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="forecolor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="backcolor" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "printWhenExpression"
})
@XmlRootElement(name = "reportElement")
public class ReportElement {

    protected List<Property> property;
    protected List<PropertyExpressionType> propertyExpression;
    protected PrintWhenExpression printWhenExpression;
    @XmlAttribute(name = "uuid")
    protected String uuid;
    @XmlAttribute(name = "key")
    protected String key;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "positionType")
    protected String positionType;
    @XmlAttribute(name = "stretchType")
    protected String stretchType;
    @XmlAttribute(name = "isPrintRepeatedValues")
    protected String isPrintRepeatedValues;
    @XmlAttribute(name = "mode")
    protected String mode;
    @XmlAttribute(name = "x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String x;
    @XmlAttribute(name = "y", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String y;
    @XmlAttribute(name = "width", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String width;
    @XmlAttribute(name = "height", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String height;
    @XmlAttribute(name = "isRemoveLineWhenBlank")
    protected String isRemoveLineWhenBlank;
    @XmlAttribute(name = "isPrintInFirstWholeBand")
    protected String isPrintInFirstWholeBand;
    @XmlAttribute(name = "isPrintWhenDetailOverflows")
    protected String isPrintWhenDetailOverflows;
    @XmlAttribute(name = "printWhenGroupChanges")
    protected String printWhenGroupChanges;
    @XmlAttribute(name = "forecolor")
    protected String forecolor;
    @XmlAttribute(name = "backcolor")
    protected String backcolor;

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
     * {@link PropertyExpressionType }
     * 
     * 
     */
    public List<PropertyExpressionType> getPropertyExpression() {
        if (propertyExpression == null) {
            propertyExpression = new ArrayList<PropertyExpressionType>();
        }
        return this.propertyExpression;
    }

    /**
     * Recupera il valore della proprietà printWhenExpression.
     * 
     * @return
     *     possible object is
     *     {@link PrintWhenExpression }
     *     
     */
    public PrintWhenExpression getPrintWhenExpression() {
        return printWhenExpression;
    }

    /**
     * Imposta il valore della proprietà printWhenExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintWhenExpression }
     *     
     */
    public void setPrintWhenExpression(PrintWhenExpression value) {
        this.printWhenExpression = value;
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

    /**
     * Recupera il valore della proprietà key.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Imposta il valore della proprietà key.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Recupera il valore della proprietà style.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Imposta il valore della proprietà style.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Recupera il valore della proprietà positionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionType() {
        if (positionType == null) {
            return "FixRelativeToTop";
        } else {
            return positionType;
        }
    }

    /**
     * Imposta il valore della proprietà positionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionType(String value) {
        this.positionType = value;
    }

    /**
     * Recupera il valore della proprietà stretchType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStretchType() {
        if (stretchType == null) {
            return "NoStretch";
        } else {
            return stretchType;
        }
    }

    /**
     * Imposta il valore della proprietà stretchType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStretchType(String value) {
        this.stretchType = value;
    }

    /**
     * Recupera il valore della proprietà isPrintRepeatedValues.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrintRepeatedValues() {
        if (isPrintRepeatedValues == null) {
            return "true";
        } else {
            return isPrintRepeatedValues;
        }
    }

    /**
     * Imposta il valore della proprietà isPrintRepeatedValues.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrintRepeatedValues(String value) {
        this.isPrintRepeatedValues = value;
    }

    /**
     * Recupera il valore della proprietà mode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Imposta il valore della proprietà mode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Recupera il valore della proprietà x.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX() {
        return x;
    }

    /**
     * Imposta il valore della proprietà x.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX(String value) {
        this.x = value;
    }

    /**
     * Recupera il valore della proprietà y.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY() {
        return y;
    }

    /**
     * Imposta il valore della proprietà y.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY(String value) {
        this.y = value;
    }

    /**
     * Recupera il valore della proprietà width.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Imposta il valore della proprietà width.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Recupera il valore della proprietà height.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Imposta il valore della proprietà height.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Recupera il valore della proprietà isRemoveLineWhenBlank.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRemoveLineWhenBlank() {
        if (isRemoveLineWhenBlank == null) {
            return "false";
        } else {
            return isRemoveLineWhenBlank;
        }
    }

    /**
     * Imposta il valore della proprietà isRemoveLineWhenBlank.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRemoveLineWhenBlank(String value) {
        this.isRemoveLineWhenBlank = value;
    }

    /**
     * Recupera il valore della proprietà isPrintInFirstWholeBand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrintInFirstWholeBand() {
        if (isPrintInFirstWholeBand == null) {
            return "false";
        } else {
            return isPrintInFirstWholeBand;
        }
    }

    /**
     * Imposta il valore della proprietà isPrintInFirstWholeBand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrintInFirstWholeBand(String value) {
        this.isPrintInFirstWholeBand = value;
    }

    /**
     * Recupera il valore della proprietà isPrintWhenDetailOverflows.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrintWhenDetailOverflows() {
        if (isPrintWhenDetailOverflows == null) {
            return "false";
        } else {
            return isPrintWhenDetailOverflows;
        }
    }

    /**
     * Imposta il valore della proprietà isPrintWhenDetailOverflows.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrintWhenDetailOverflows(String value) {
        this.isPrintWhenDetailOverflows = value;
    }

    /**
     * Recupera il valore della proprietà printWhenGroupChanges.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintWhenGroupChanges() {
        return printWhenGroupChanges;
    }

    /**
     * Imposta il valore della proprietà printWhenGroupChanges.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintWhenGroupChanges(String value) {
        this.printWhenGroupChanges = value;
    }

    /**
     * Recupera il valore della proprietà forecolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecolor() {
        return forecolor;
    }

    /**
     * Imposta il valore della proprietà forecolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecolor(String value) {
        this.forecolor = value;
    }

    /**
     * Recupera il valore della proprietà backcolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackcolor() {
        return backcolor;
    }

    /**
     * Imposta il valore della proprietà backcolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackcolor(String value) {
        this.backcolor = value;
    }

}
