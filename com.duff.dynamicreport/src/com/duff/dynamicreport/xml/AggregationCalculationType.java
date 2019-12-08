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
 * <p>Classe Java per aggregationCalculationType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="aggregationCalculationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nothing"/>
 *     &lt;enumeration value="Count"/>
 *     &lt;enumeration value="DistinctCount"/>
 *     &lt;enumeration value="Sum"/>
 *     &lt;enumeration value="Average"/>
 *     &lt;enumeration value="Lowest"/>
 *     &lt;enumeration value="Highest"/>
 *     &lt;enumeration value="StandardDeviation"/>
 *     &lt;enumeration value="Variance"/>
 *     &lt;enumeration value="First"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "aggregationCalculationType")
@XmlEnum
public enum AggregationCalculationType {


    /**
     * No calculations are performed.
     * 
     */
    @XmlEnumValue("Nothing")
    NOTHING("Nothing"),

    /**
     * The measure stores the number of the not null
     *       values.
     * 
     */
    @XmlEnumValue("Count")
    COUNT("Count"),

    /**
     * The measure stores the number of distinct not null
     *       values.
     * 
     */
    @XmlEnumValue("DistinctCount")
    DISTINCT_COUNT("DistinctCount"),

    /**
     * The measure stores the sum of the not null values.
     *       Numeric measures only.
     * 
     */
    @XmlEnumValue("Sum")
    SUM("Sum"),

    /**
     * The measure stores the average of the not null
     *       values. Numeric measures only.
     * 
     */
    @XmlEnumValue("Average")
    AVERAGE("Average"),

    /**
     * The measure stores the lowest value.
     * 
     */
    @XmlEnumValue("Lowest")
    LOWEST("Lowest"),

    /**
     * The measure stores the highest value.
     *      
     * 
     */
    @XmlEnumValue("Highest")
    HIGHEST("Highest"),

    /**
     * The measure stores the standard deviation of the not
     *       null values. Numeric measures only.
     * 
     */
    @XmlEnumValue("StandardDeviation")
    STANDARD_DEVIATION("StandardDeviation"),

    /**
     * The measure stores the variance of the not null
     *       values. Numeric measures only.
     * 
     */
    @XmlEnumValue("Variance")
    VARIANCE("Variance"),

    /**
     * The measure stores the first value encountered and
     *       ignores subsequent values.
     * 
     */
    @XmlEnumValue("First")
    FIRST("First");
    private final String value;

    AggregationCalculationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AggregationCalculationType fromValue(String v) {
        for (AggregationCalculationType c: AggregationCalculationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
