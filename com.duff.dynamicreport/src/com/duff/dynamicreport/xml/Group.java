//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.25 alle 11:10:35 PM CET 
//


package com.duff.dynamicreport.xml;

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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}groupExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}groupHeader" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}groupFooter" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isStartNewColumn" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isStartNewPage" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isResetPageNumber" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isReprintHeaderOnEachPage" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isReprintHeaderOnEachColumn" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="minHeightToStartNewPage" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="0" />
 *       &lt;attribute name="minDetailsToStartFromTop" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="0" />
 *       &lt;attribute name="footerPosition" default="Normal">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Normal"/>
 *             &lt;enumeration value="StackAtBottom"/>
 *             &lt;enumeration value="ForceAtBottom"/>
 *             &lt;enumeration value="CollateAtBottom"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="keepTogether" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="preventOrphanFooter" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
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
    "groupExpression",
    "groupHeader",
    "groupFooter"
})
@XmlRootElement(name = "group")
public class Group {

    protected GroupExpression groupExpression;
    protected GroupHeader groupHeader;
    protected GroupFooter groupFooter;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "isStartNewColumn")
    protected String isStartNewColumn;
    @XmlAttribute(name = "isStartNewPage")
    protected String isStartNewPage;
    @XmlAttribute(name = "isResetPageNumber")
    protected String isResetPageNumber;
    @XmlAttribute(name = "isReprintHeaderOnEachPage")
    protected String isReprintHeaderOnEachPage;
    @XmlAttribute(name = "isReprintHeaderOnEachColumn")
    protected String isReprintHeaderOnEachColumn;
    @XmlAttribute(name = "minHeightToStartNewPage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String minHeightToStartNewPage;
    @XmlAttribute(name = "minDetailsToStartFromTop")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String minDetailsToStartFromTop;
    @XmlAttribute(name = "footerPosition")
    protected String footerPosition;
    @XmlAttribute(name = "keepTogether")
    protected String keepTogether;
    @XmlAttribute(name = "preventOrphanFooter")
    protected String preventOrphanFooter;

    /**
     * Recupera il valore della proprietà groupExpression.
     * 
     * @return
     *     possible object is
     *     {@link GroupExpression }
     *     
     */
    public GroupExpression getGroupExpression() {
        return groupExpression;
    }

    /**
     * Imposta il valore della proprietà groupExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupExpression }
     *     
     */
    public void setGroupExpression(GroupExpression value) {
        this.groupExpression = value;
    }

    /**
     * Recupera il valore della proprietà groupHeader.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader }
     *     
     */
    public GroupHeader getGroupHeader() {
        return groupHeader;
    }

    /**
     * Imposta il valore della proprietà groupHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader }
     *     
     */
    public void setGroupHeader(GroupHeader value) {
        this.groupHeader = value;
    }

    /**
     * Recupera il valore della proprietà groupFooter.
     * 
     * @return
     *     possible object is
     *     {@link GroupFooter }
     *     
     */
    public GroupFooter getGroupFooter() {
        return groupFooter;
    }

    /**
     * Imposta il valore della proprietà groupFooter.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupFooter }
     *     
     */
    public void setGroupFooter(GroupFooter value) {
        this.groupFooter = value;
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
     * Recupera il valore della proprietà isStartNewColumn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStartNewColumn() {
        if (isStartNewColumn == null) {
            return "false";
        } else {
            return isStartNewColumn;
        }
    }

    /**
     * Imposta il valore della proprietà isStartNewColumn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStartNewColumn(String value) {
        this.isStartNewColumn = value;
    }

    /**
     * Recupera il valore della proprietà isStartNewPage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStartNewPage() {
        if (isStartNewPage == null) {
            return "false";
        } else {
            return isStartNewPage;
        }
    }

    /**
     * Imposta il valore della proprietà isStartNewPage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStartNewPage(String value) {
        this.isStartNewPage = value;
    }

    /**
     * Recupera il valore della proprietà isResetPageNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsResetPageNumber() {
        if (isResetPageNumber == null) {
            return "false";
        } else {
            return isResetPageNumber;
        }
    }

    /**
     * Imposta il valore della proprietà isResetPageNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsResetPageNumber(String value) {
        this.isResetPageNumber = value;
    }

    /**
     * Recupera il valore della proprietà isReprintHeaderOnEachPage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsReprintHeaderOnEachPage() {
        if (isReprintHeaderOnEachPage == null) {
            return "false";
        } else {
            return isReprintHeaderOnEachPage;
        }
    }

    /**
     * Imposta il valore della proprietà isReprintHeaderOnEachPage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsReprintHeaderOnEachPage(String value) {
        this.isReprintHeaderOnEachPage = value;
    }

    /**
     * Recupera il valore della proprietà isReprintHeaderOnEachColumn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsReprintHeaderOnEachColumn() {
        if (isReprintHeaderOnEachColumn == null) {
            return "false";
        } else {
            return isReprintHeaderOnEachColumn;
        }
    }

    /**
     * Imposta il valore della proprietà isReprintHeaderOnEachColumn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsReprintHeaderOnEachColumn(String value) {
        this.isReprintHeaderOnEachColumn = value;
    }

    /**
     * Recupera il valore della proprietà minHeightToStartNewPage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinHeightToStartNewPage() {
        if (minHeightToStartNewPage == null) {
            return "0";
        } else {
            return minHeightToStartNewPage;
        }
    }

    /**
     * Imposta il valore della proprietà minHeightToStartNewPage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinHeightToStartNewPage(String value) {
        this.minHeightToStartNewPage = value;
    }

    /**
     * Recupera il valore della proprietà minDetailsToStartFromTop.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinDetailsToStartFromTop() {
        if (minDetailsToStartFromTop == null) {
            return "0";
        } else {
            return minDetailsToStartFromTop;
        }
    }

    /**
     * Imposta il valore della proprietà minDetailsToStartFromTop.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinDetailsToStartFromTop(String value) {
        this.minDetailsToStartFromTop = value;
    }

    /**
     * Recupera il valore della proprietà footerPosition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFooterPosition() {
        if (footerPosition == null) {
            return "Normal";
        } else {
            return footerPosition;
        }
    }

    /**
     * Imposta il valore della proprietà footerPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFooterPosition(String value) {
        this.footerPosition = value;
    }

    /**
     * Recupera il valore della proprietà keepTogether.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeepTogether() {
        if (keepTogether == null) {
            return "false";
        } else {
            return keepTogether;
        }
    }

    /**
     * Imposta il valore della proprietà keepTogether.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepTogether(String value) {
        this.keepTogether = value;
    }

    /**
     * Recupera il valore della proprietà preventOrphanFooter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreventOrphanFooter() {
        if (preventOrphanFooter == null) {
            return "false";
        } else {
            return preventOrphanFooter;
        }
    }

    /**
     * Imposta il valore della proprietà preventOrphanFooter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreventOrphanFooter(String value) {
        this.preventOrphanFooter = value;
    }

}
