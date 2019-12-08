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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}tabStop" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lineSpacing">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Single"/>
 *             &lt;enumeration value="1_1_2"/>
 *             &lt;enumeration value="Double"/>
 *             &lt;enumeration value="AtLeast"/>
 *             &lt;enumeration value="Fixed"/>
 *             &lt;enumeration value="Proportional"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="lineSpacingSize" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="firstLineIndent" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="leftIndent" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="rightIndent" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="spacingBefore" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="spacingAfter" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="tabStopWidth" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tabStop"
})
@XmlRootElement(name = "paragraph")
public class Paragraph {

    protected List<TabStop> tabStop;
    @XmlAttribute(name = "lineSpacing")
    protected String lineSpacing;
    @XmlAttribute(name = "lineSpacingSize")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lineSpacingSize;
    @XmlAttribute(name = "firstLineIndent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String firstLineIndent;
    @XmlAttribute(name = "leftIndent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String leftIndent;
    @XmlAttribute(name = "rightIndent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String rightIndent;
    @XmlAttribute(name = "spacingBefore")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String spacingBefore;
    @XmlAttribute(name = "spacingAfter")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String spacingAfter;
    @XmlAttribute(name = "tabStopWidth")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String tabStopWidth;

    /**
     * Gets the value of the tabStop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tabStop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTabStop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TabStop }
     * 
     * 
     */
    public List<TabStop> getTabStop() {
        if (tabStop == null) {
            tabStop = new ArrayList<TabStop>();
        }
        return this.tabStop;
    }

    /**
     * Recupera il valore della proprietà lineSpacing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineSpacing() {
        return lineSpacing;
    }

    /**
     * Imposta il valore della proprietà lineSpacing.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineSpacing(String value) {
        this.lineSpacing = value;
    }

    /**
     * Recupera il valore della proprietà lineSpacingSize.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineSpacingSize() {
        return lineSpacingSize;
    }

    /**
     * Imposta il valore della proprietà lineSpacingSize.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineSpacingSize(String value) {
        this.lineSpacingSize = value;
    }

    /**
     * Recupera il valore della proprietà firstLineIndent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstLineIndent() {
        return firstLineIndent;
    }

    /**
     * Imposta il valore della proprietà firstLineIndent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstLineIndent(String value) {
        this.firstLineIndent = value;
    }

    /**
     * Recupera il valore della proprietà leftIndent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftIndent() {
        return leftIndent;
    }

    /**
     * Imposta il valore della proprietà leftIndent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftIndent(String value) {
        this.leftIndent = value;
    }

    /**
     * Recupera il valore della proprietà rightIndent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightIndent() {
        return rightIndent;
    }

    /**
     * Imposta il valore della proprietà rightIndent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightIndent(String value) {
        this.rightIndent = value;
    }

    /**
     * Recupera il valore della proprietà spacingBefore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpacingBefore() {
        return spacingBefore;
    }

    /**
     * Imposta il valore della proprietà spacingBefore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpacingBefore(String value) {
        this.spacingBefore = value;
    }

    /**
     * Recupera il valore della proprietà spacingAfter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpacingAfter() {
        return spacingAfter;
    }

    /**
     * Imposta il valore della proprietà spacingAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpacingAfter(String value) {
        this.spacingAfter = value;
    }

    /**
     * Recupera il valore della proprietà tabStopWidth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabStopWidth() {
        return tabStopWidth;
    }

    /**
     * Imposta il valore della proprietà tabStopWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabStopWidth(String value) {
        this.tabStopWidth = value;
    }

}
