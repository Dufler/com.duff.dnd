//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.25 alle 11:10:35 PM CET 
//


package com.duff.dynamicreport.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per variableReturnValue complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="variableReturnValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://jasperreports.sourceforge.net/jasperreports}commonReturnValue">
 *       &lt;attribute name="fromVariable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variableReturnValue")
public class VariableReturnValue
    extends CommonReturnValue
{

    @XmlAttribute(name = "fromVariable")
    protected String fromVariable;

    /**
     * Recupera il valore della propriet� fromVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromVariable() {
        return fromVariable;
    }

    /**
     * Imposta il valore della propriet� fromVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromVariable(String value) {
        this.fromVariable = value;
    }

}
