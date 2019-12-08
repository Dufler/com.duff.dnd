//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.25 alle 11:10:35 PM CET 
//


package com.duff.dynamicreport.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per basicEvaluationTime.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="basicEvaluationTime">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Now"/>
 *     &lt;enumeration value="Report"/>
 *     &lt;enumeration value="Page"/>
 *     &lt;enumeration value="Column"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Band"/>
 *     &lt;enumeration value="Master"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "basicEvaluationTime")
@XmlEnum
public enum BasicEvaluationTime {

    @XmlEnumValue("Now")
    NOW("Now"),
    @XmlEnumValue("Report")
    REPORT("Report"),
    @XmlEnumValue("Page")
    PAGE("Page"),
    @XmlEnumValue("Column")
    COLUMN("Column"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Band")
    BAND("Band"),
    @XmlEnumValue("Master")
    MASTER("Master");
    private final String value;

    BasicEvaluationTime(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BasicEvaluationTime fromValue(String v) {
        for (BasicEvaluationTime c: BasicEvaluationTime.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
