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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}parametersMapExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}datasetParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}connectionExpression"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataSourceExpression"/>
 *         &lt;/choice>
 *         &lt;element name="returnValue" type="{http://jasperreports.sourceforge.net/jasperreports}variableReturnValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="subDataset" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "parametersMapExpression",
    "datasetParameter",
    "connectionExpression",
    "dataSourceExpression",
    "returnValue"
})
@XmlRootElement(name = "datasetRun")
public class DatasetRun {

    protected List<Property> property;
    protected ParametersMapExpression parametersMapExpression;
    protected List<DatasetParameter> datasetParameter;
    protected ConnectionExpression connectionExpression;
    protected DataSourceExpression dataSourceExpression;
    protected List<VariableReturnValue> returnValue;
    @XmlAttribute(name = "subDataset", required = true)
    protected String subDataset;
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
     * Gets the value of the datasetParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasetParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasetParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatasetParameter }
     * 
     * 
     */
    public List<DatasetParameter> getDatasetParameter() {
        if (datasetParameter == null) {
            datasetParameter = new ArrayList<DatasetParameter>();
        }
        return this.datasetParameter;
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
     * {@link VariableReturnValue }
     * 
     * 
     */
    public List<VariableReturnValue> getReturnValue() {
        if (returnValue == null) {
            returnValue = new ArrayList<VariableReturnValue>();
        }
        return this.returnValue;
    }

    /**
     * Recupera il valore della proprietà subDataset.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDataset() {
        return subDataset;
    }

    /**
     * Imposta il valore della proprietà subDataset.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDataset(String value) {
        this.subDataset = value;
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
