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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}break"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}line"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rectangle"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}ellipse"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}image"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}staticText"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}textField"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}subreport"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pieChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pie3DChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}barChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bar3DChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyBarChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}stackedBarChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}stackedBar3DChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}lineChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyLineChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}areaChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyAreaChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}scatterChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bubbleChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}timeSeriesChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highLowChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}candlestickChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}meterChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}thermometerChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}multiAxisChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}stackedAreaChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}ganttChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}elementGroup"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstab"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}frame"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}componentElement"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}genericElement"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "breakOrLineOrRectangle"
})
@XmlRootElement(name = "elementGroup")
public class ElementGroup {

    @XmlElements({
        @XmlElement(name = "break", type = Break.class),
        @XmlElement(name = "line", type = Line.class),
        @XmlElement(name = "rectangle", type = Rectangle.class),
        @XmlElement(name = "ellipse", type = Ellipse.class),
        @XmlElement(name = "image", type = Image.class),
        @XmlElement(name = "staticText", type = StaticText.class),
        @XmlElement(name = "textField", type = TextField.class),
        @XmlElement(name = "subreport", type = Subreport.class),
        @XmlElement(name = "pieChart", type = PieChart.class),
        @XmlElement(name = "pie3DChart", type = Pie3DChart.class),
        @XmlElement(name = "barChart", type = BarChart.class),
        @XmlElement(name = "bar3DChart", type = Bar3DChart.class),
        @XmlElement(name = "xyBarChart", type = XyBarChart.class),
        @XmlElement(name = "stackedBarChart", type = StackedBarChart.class),
        @XmlElement(name = "stackedBar3DChart", type = StackedBar3DChart.class),
        @XmlElement(name = "lineChart", type = LineChart.class),
        @XmlElement(name = "xyLineChart", type = XyLineChart.class),
        @XmlElement(name = "areaChart", type = AreaChart.class),
        @XmlElement(name = "xyAreaChart", type = XyAreaChart.class),
        @XmlElement(name = "scatterChart", type = ScatterChart.class),
        @XmlElement(name = "bubbleChart", type = BubbleChart.class),
        @XmlElement(name = "timeSeriesChart", type = TimeSeriesChart.class),
        @XmlElement(name = "highLowChart", type = HighLowChart.class),
        @XmlElement(name = "candlestickChart", type = CandlestickChart.class),
        @XmlElement(name = "meterChart", type = MeterChart.class),
        @XmlElement(name = "thermometerChart", type = ThermometerChart.class),
        @XmlElement(name = "multiAxisChart", type = MultiAxisChart.class),
        @XmlElement(name = "stackedAreaChart", type = StackedAreaChart.class),
        @XmlElement(name = "ganttChart", type = GanttChart.class),
        @XmlElement(name = "elementGroup", type = ElementGroup.class),
        @XmlElement(name = "crosstab", type = Crosstab.class),
        @XmlElement(name = "frame", type = Frame.class),
        @XmlElement(name = "componentElement", type = ComponentElement.class),
        @XmlElement(name = "genericElement", type = GenericElement.class)
    })
    protected List<Object> breakOrLineOrRectangle;

    /**
     * Gets the value of the breakOrLineOrRectangle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the breakOrLineOrRectangle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBreakOrLineOrRectangle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Break }
     * {@link Line }
     * {@link Rectangle }
     * {@link Ellipse }
     * {@link Image }
     * {@link StaticText }
     * {@link TextField }
     * {@link Subreport }
     * {@link PieChart }
     * {@link Pie3DChart }
     * {@link BarChart }
     * {@link Bar3DChart }
     * {@link XyBarChart }
     * {@link StackedBarChart }
     * {@link StackedBar3DChart }
     * {@link LineChart }
     * {@link XyLineChart }
     * {@link AreaChart }
     * {@link XyAreaChart }
     * {@link ScatterChart }
     * {@link BubbleChart }
     * {@link TimeSeriesChart }
     * {@link HighLowChart }
     * {@link CandlestickChart }
     * {@link MeterChart }
     * {@link ThermometerChart }
     * {@link MultiAxisChart }
     * {@link StackedAreaChart }
     * {@link GanttChart }
     * {@link ElementGroup }
     * {@link Crosstab }
     * {@link Frame }
     * {@link ComponentElement }
     * {@link GenericElement }
     * 
     * 
     */
    public List<Object> getBreakOrLineOrRectangle() {
        if (breakOrLineOrRectangle == null) {
            breakOrLineOrRectangle = new ArrayList<Object>();
        }
        return this.breakOrLineOrRectangle;
    }

}
