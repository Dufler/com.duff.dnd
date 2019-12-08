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
 *       &lt;choice>
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}stackedAreaChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}ganttChart"/>
 *       &lt;/choice>
 *       &lt;attribute name="position">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="leftOrTop"/>
 *             &lt;enumeration value="rightOrBottom"/>
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
    "barChart",
    "bar3DChart",
    "xyBarChart",
    "stackedBarChart",
    "stackedBar3DChart",
    "lineChart",
    "xyLineChart",
    "areaChart",
    "xyAreaChart",
    "scatterChart",
    "bubbleChart",
    "timeSeriesChart",
    "highLowChart",
    "candlestickChart",
    "stackedAreaChart",
    "ganttChart"
})
@XmlRootElement(name = "axis")
public class Axis {

    protected BarChart barChart;
    protected Bar3DChart bar3DChart;
    protected XyBarChart xyBarChart;
    protected StackedBarChart stackedBarChart;
    protected StackedBar3DChart stackedBar3DChart;
    protected LineChart lineChart;
    protected XyLineChart xyLineChart;
    protected AreaChart areaChart;
    protected XyAreaChart xyAreaChart;
    protected ScatterChart scatterChart;
    protected BubbleChart bubbleChart;
    protected TimeSeriesChart timeSeriesChart;
    protected HighLowChart highLowChart;
    protected CandlestickChart candlestickChart;
    protected StackedAreaChart stackedAreaChart;
    protected GanttChart ganttChart;
    @XmlAttribute(name = "position")
    protected String position;

    /**
     * Recupera il valore della proprietà barChart.
     * 
     * @return
     *     possible object is
     *     {@link BarChart }
     *     
     */
    public BarChart getBarChart() {
        return barChart;
    }

    /**
     * Imposta il valore della proprietà barChart.
     * 
     * @param value
     *     allowed object is
     *     {@link BarChart }
     *     
     */
    public void setBarChart(BarChart value) {
        this.barChart = value;
    }

    /**
     * Recupera il valore della proprietà bar3DChart.
     * 
     * @return
     *     possible object is
     *     {@link Bar3DChart }
     *     
     */
    public Bar3DChart getBar3DChart() {
        return bar3DChart;
    }

    /**
     * Imposta il valore della proprietà bar3DChart.
     * 
     * @param value
     *     allowed object is
     *     {@link Bar3DChart }
     *     
     */
    public void setBar3DChart(Bar3DChart value) {
        this.bar3DChart = value;
    }

    /**
     * Recupera il valore della proprietà xyBarChart.
     * 
     * @return
     *     possible object is
     *     {@link XyBarChart }
     *     
     */
    public XyBarChart getXyBarChart() {
        return xyBarChart;
    }

    /**
     * Imposta il valore della proprietà xyBarChart.
     * 
     * @param value
     *     allowed object is
     *     {@link XyBarChart }
     *     
     */
    public void setXyBarChart(XyBarChart value) {
        this.xyBarChart = value;
    }

    /**
     * Recupera il valore della proprietà stackedBarChart.
     * 
     * @return
     *     possible object is
     *     {@link StackedBarChart }
     *     
     */
    public StackedBarChart getStackedBarChart() {
        return stackedBarChart;
    }

    /**
     * Imposta il valore della proprietà stackedBarChart.
     * 
     * @param value
     *     allowed object is
     *     {@link StackedBarChart }
     *     
     */
    public void setStackedBarChart(StackedBarChart value) {
        this.stackedBarChart = value;
    }

    /**
     * Recupera il valore della proprietà stackedBar3DChart.
     * 
     * @return
     *     possible object is
     *     {@link StackedBar3DChart }
     *     
     */
    public StackedBar3DChart getStackedBar3DChart() {
        return stackedBar3DChart;
    }

    /**
     * Imposta il valore della proprietà stackedBar3DChart.
     * 
     * @param value
     *     allowed object is
     *     {@link StackedBar3DChart }
     *     
     */
    public void setStackedBar3DChart(StackedBar3DChart value) {
        this.stackedBar3DChart = value;
    }

    /**
     * Recupera il valore della proprietà lineChart.
     * 
     * @return
     *     possible object is
     *     {@link LineChart }
     *     
     */
    public LineChart getLineChart() {
        return lineChart;
    }

    /**
     * Imposta il valore della proprietà lineChart.
     * 
     * @param value
     *     allowed object is
     *     {@link LineChart }
     *     
     */
    public void setLineChart(LineChart value) {
        this.lineChart = value;
    }

    /**
     * Recupera il valore della proprietà xyLineChart.
     * 
     * @return
     *     possible object is
     *     {@link XyLineChart }
     *     
     */
    public XyLineChart getXyLineChart() {
        return xyLineChart;
    }

    /**
     * Imposta il valore della proprietà xyLineChart.
     * 
     * @param value
     *     allowed object is
     *     {@link XyLineChart }
     *     
     */
    public void setXyLineChart(XyLineChart value) {
        this.xyLineChart = value;
    }

    /**
     * Recupera il valore della proprietà areaChart.
     * 
     * @return
     *     possible object is
     *     {@link AreaChart }
     *     
     */
    public AreaChart getAreaChart() {
        return areaChart;
    }

    /**
     * Imposta il valore della proprietà areaChart.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaChart }
     *     
     */
    public void setAreaChart(AreaChart value) {
        this.areaChart = value;
    }

    /**
     * Recupera il valore della proprietà xyAreaChart.
     * 
     * @return
     *     possible object is
     *     {@link XyAreaChart }
     *     
     */
    public XyAreaChart getXyAreaChart() {
        return xyAreaChart;
    }

    /**
     * Imposta il valore della proprietà xyAreaChart.
     * 
     * @param value
     *     allowed object is
     *     {@link XyAreaChart }
     *     
     */
    public void setXyAreaChart(XyAreaChart value) {
        this.xyAreaChart = value;
    }

    /**
     * Recupera il valore della proprietà scatterChart.
     * 
     * @return
     *     possible object is
     *     {@link ScatterChart }
     *     
     */
    public ScatterChart getScatterChart() {
        return scatterChart;
    }

    /**
     * Imposta il valore della proprietà scatterChart.
     * 
     * @param value
     *     allowed object is
     *     {@link ScatterChart }
     *     
     */
    public void setScatterChart(ScatterChart value) {
        this.scatterChart = value;
    }

    /**
     * Recupera il valore della proprietà bubbleChart.
     * 
     * @return
     *     possible object is
     *     {@link BubbleChart }
     *     
     */
    public BubbleChart getBubbleChart() {
        return bubbleChart;
    }

    /**
     * Imposta il valore della proprietà bubbleChart.
     * 
     * @param value
     *     allowed object is
     *     {@link BubbleChart }
     *     
     */
    public void setBubbleChart(BubbleChart value) {
        this.bubbleChart = value;
    }

    /**
     * Recupera il valore della proprietà timeSeriesChart.
     * 
     * @return
     *     possible object is
     *     {@link TimeSeriesChart }
     *     
     */
    public TimeSeriesChart getTimeSeriesChart() {
        return timeSeriesChart;
    }

    /**
     * Imposta il valore della proprietà timeSeriesChart.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeriesChart }
     *     
     */
    public void setTimeSeriesChart(TimeSeriesChart value) {
        this.timeSeriesChart = value;
    }

    /**
     * Recupera il valore della proprietà highLowChart.
     * 
     * @return
     *     possible object is
     *     {@link HighLowChart }
     *     
     */
    public HighLowChart getHighLowChart() {
        return highLowChart;
    }

    /**
     * Imposta il valore della proprietà highLowChart.
     * 
     * @param value
     *     allowed object is
     *     {@link HighLowChart }
     *     
     */
    public void setHighLowChart(HighLowChart value) {
        this.highLowChart = value;
    }

    /**
     * Recupera il valore della proprietà candlestickChart.
     * 
     * @return
     *     possible object is
     *     {@link CandlestickChart }
     *     
     */
    public CandlestickChart getCandlestickChart() {
        return candlestickChart;
    }

    /**
     * Imposta il valore della proprietà candlestickChart.
     * 
     * @param value
     *     allowed object is
     *     {@link CandlestickChart }
     *     
     */
    public void setCandlestickChart(CandlestickChart value) {
        this.candlestickChart = value;
    }

    /**
     * Recupera il valore della proprietà stackedAreaChart.
     * 
     * @return
     *     possible object is
     *     {@link StackedAreaChart }
     *     
     */
    public StackedAreaChart getStackedAreaChart() {
        return stackedAreaChart;
    }

    /**
     * Imposta il valore della proprietà stackedAreaChart.
     * 
     * @param value
     *     allowed object is
     *     {@link StackedAreaChart }
     *     
     */
    public void setStackedAreaChart(StackedAreaChart value) {
        this.stackedAreaChart = value;
    }

    /**
     * Recupera il valore della proprietà ganttChart.
     * 
     * @return
     *     possible object is
     *     {@link GanttChart }
     *     
     */
    public GanttChart getGanttChart() {
        return ganttChart;
    }

    /**
     * Imposta il valore della proprietà ganttChart.
     * 
     * @param value
     *     allowed object is
     *     {@link GanttChart }
     *     
     */
    public void setGanttChart(GanttChart value) {
        this.ganttChart = value;
    }

    /**
     * Recupera il valore della proprietà position.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Imposta il valore della proprietà position.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

}
