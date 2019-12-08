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
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}box" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}line"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rectangle"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}ellipse"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}image"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}staticText"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}textField"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}subreport"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}elementGroup"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}frame"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}componentElement"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}genericElement"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="backcolor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Opaque"/>
 *             &lt;enumeration value="Transparent"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "box",
    "lineOrRectangleOrEllipse"
})
@XmlRootElement(name = "cellContents")
public class CellContents {

    protected List<Property> property;
    protected Box box;
    @XmlElements({
        @XmlElement(name = "line", type = Line.class),
        @XmlElement(name = "rectangle", type = Rectangle.class),
        @XmlElement(name = "ellipse", type = Ellipse.class),
        @XmlElement(name = "image", type = Image.class),
        @XmlElement(name = "staticText", type = StaticText.class),
        @XmlElement(name = "textField", type = TextField.class),
        @XmlElement(name = "subreport", type = Subreport.class),
        @XmlElement(name = "elementGroup", type = ElementGroup.class),
        @XmlElement(name = "frame", type = Frame.class),
        @XmlElement(name = "componentElement", type = ComponentElement.class),
        @XmlElement(name = "genericElement", type = GenericElement.class)
    })
    protected List<Object> lineOrRectangleOrEllipse;
    @XmlAttribute(name = "backcolor")
    protected String backcolor;
    @XmlAttribute(name = "mode")
    protected String mode;
    @XmlAttribute(name = "style")
    protected String style;

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
     * Gets the value of the lineOrRectangleOrEllipse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineOrRectangleOrEllipse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineOrRectangleOrEllipse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Line }
     * {@link Rectangle }
     * {@link Ellipse }
     * {@link Image }
     * {@link StaticText }
     * {@link TextField }
     * {@link Subreport }
     * {@link ElementGroup }
     * {@link Frame }
     * {@link ComponentElement }
     * {@link GenericElement }
     * 
     * 
     */
    public List<Object> getLineOrRectangleOrEllipse() {
        if (lineOrRectangleOrEllipse == null) {
            lineOrRectangleOrEllipse = new ArrayList<Object>();
        }
        return this.lineOrRectangleOrEllipse;
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

}
