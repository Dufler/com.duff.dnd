//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.25 alle 11:10:35 PM CET 
//


package com.duff.dynamicreport.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java per expressionReturnValue complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="expressionReturnValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://jasperreports.sourceforge.net/jasperreports}commonReturnValue">
 *       &lt;sequence>
 *         &lt;element name="expression">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expressionReturnValue", propOrder = {
    "expression"
})
public class ExpressionReturnValue
    extends CommonReturnValue
{

    @XmlElement(required = true)
    protected ExpressionReturnValue.Expression expression;

    /**
     * Recupera il valore della proprietà expression.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionReturnValue.Expression }
     *     
     */
    public ExpressionReturnValue.Expression getExpression() {
        return expression;
    }

    /**
     * Imposta il valore della proprietà expression.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionReturnValue.Expression }
     *     
     */
    public void setExpression(ExpressionReturnValue.Expression value) {
        this.expression = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class Expression {

        @XmlValue
        protected String content;

        /**
         * Recupera il valore della proprietà content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            return content;
        }

        /**
         * Imposta il valore della proprietà content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
        }

    }

}
