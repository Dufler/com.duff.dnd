package com.duff.dynamicreport;

import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.duff.dynamicreport.xml.Band;
import com.duff.dynamicreport.xml.ColumnHeader;
import com.duff.dynamicreport.xml.ComplexEvaluationTime;
import com.duff.dynamicreport.xml.Field;
import com.duff.dynamicreport.xml.Font;
import com.duff.dynamicreport.xml.JasperReport;
import com.duff.dynamicreport.xml.PageHeader;
import com.duff.dynamicreport.xml.Parameter;
import com.duff.dynamicreport.xml.QueryString;
import com.duff.dynamicreport.xml.ReportElement;
import com.duff.dynamicreport.xml.StaticText;
import com.duff.dynamicreport.xml.Text;
import com.duff.dynamicreport.xml.TextElement;
import com.duff.dynamicreport.xml.TextField;
import com.duff.dynamicreport.xml.TextFieldExpression;
import com.duff.dynamicreport.xml.Title;
import com.duff.dynamicreport.xml.Variable;
import com.duff.dynamicreport.xml.VariableExpression;

public class ReportBuilder {
	
	public enum BandSplitType {	Stretch	}
	
	private JasperReport buildReport() {
		JasperReport jr = new JasperReport();
		jr.setName("Report di test");
		jr.setTitle(getTitle());
		jr.setQueryString(addQuery());
		//Aggiungo i parametri, i campi e le variabili
		addParameters(jr);
		addFields(jr);
		addVariables(jr);
		jr.setPageHeader(getPageHeader());
		jr.setColumnHeader(getColumnHeader());
		return jr;
	}
	
	public boolean buildReportFile() {
		boolean success;
		try {
			JasperReport jr = buildReport();
			File xml = new File("C:\\Users\\Duff\\Desktop\\DnD\\report.jrxml");
			StringWriter stringWritter = new StringWriter();
			JAXBContext jaxbContext = JAXBContext.newInstance(JasperReport.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
			//jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "/com/duff/dynamicreport/resources/schema.xsd");
			jaxbMarshaller.marshal(jr, stringWritter);
	        String content = stringWritter.toString().replaceAll("&lt;!\\[", "<![").replaceAll("\\]&gt;", "]>");
	        FileWriter writer = new FileWriter(xml);
	        writer.write(content);
	        writer.flush();
	        writer.close();
			//jaxbMarshaller.marshal(jr, xml);
			success = true;
		} catch (Exception e) {
			success = false;
			e.printStackTrace();
		}
		return success;
	}
	
	private Title getTitle() {
		Title title = new Title();
		Band titleBand = new Band();
		titleBand.setHeight("100");
		titleBand.setSplitType("Stretch");
		title.setBand(titleBand);
		List<Object> items = titleBand.getBreakOrLineOrRectangle();
		StaticText textTitle = new StaticText();
		Text text = new Text();
		text.setContent("Spedizioni: Report Semplice");
		textTitle.setText(text);
		ReportElement reportElement = new ReportElement();
		reportElement.setX("0");
		reportElement.setY("20");
		reportElement.setWidth("240");
		reportElement.setHeight("45");
		textTitle.setReportElement(reportElement);
		TextElement textElement = new TextElement();
		Font font = new Font();
		font.setFontName("SansSerif");
		font.setSize("20");
		textElement.setFont(font);
		textTitle.setTextElement(textElement);
		items.add(textTitle);
		return title;
	}
	
	private PageHeader getPageHeader() {
		PageHeader ph = new PageHeader();
		//Aggiungo la banda
		Band band = getBand(BandSplitType.Stretch, 50);
		ph.setBand(band);
		//e poi gli elementi che essa contiene
		Font fontPH = getFont("SansSerif", 12);
		List<Object> items = band.getBreakOrLineOrRectangle();
		items.add(getStaticText("Da:", 0, 0, 31, 20, fontPH));
		items.add(getStaticText("A:", 0, 21, 31, 20, fontPH));
		items.add(getTextField("$P{DataDa}", 40, 1, 90, 21, fontPH, ComplexEvaluationTime.REPORT));
		items.add(getTextField("$P{DataA}", 40, 21, 90, 21, fontPH, ComplexEvaluationTime.REPORT));
		return ph;
	}
	
	private ColumnHeader getColumnHeader() {
		ColumnHeader ch = new ColumnHeader();
		Band band = getBand(BandSplitType.Stretch, 90);
		ch.setBand(band);
		Font fontPH = getFont("SansSerif", 12);
		List<Object> items = band.getBreakOrLineOrRectangle();
		items.add(getStaticText("Totale spedizioni:", 0, 0, 100, 20, fontPH));
		items.add(getTextField("$V{REPORT_COUNT}", 110, 0, 120, 21, fontPH, ComplexEvaluationTime.REPORT));
		items.add(getStaticText("Totale colli:", 0, 30, 100, 20, fontPH));
		items.add(getTextField("$V{totaleColli}", 110, 30, 120, 21, fontPH, ComplexEvaluationTime.REPORT));
		return ch;
	}
	
	private Band getBand(BandSplitType type, int height) {
		Band band = new Band();
		band.setHeight(Integer.toString(height));
		band.setSplitType(type.toString());
		return band;
	}
	
	private StaticText getStaticText(String content, int x, int y, int width, int height, Font font) {
		StaticText textTitle = new StaticText();
		Text text = new Text();
		text.setContent(content);
		textTitle.setText(text);
		textTitle.setReportElement(getReportElement(x, y, width, height));
		TextElement textElement = new TextElement();
		textElement.setFont(font);
		textTitle.setTextElement(textElement);
		return textTitle;
	}
	
	private TextField getTextField(String expression, int x, int y, int width, int height, Font font, ComplexEvaluationTime evaluation) {
		TextField textField = new TextField();
		textField.setEvaluationTime(evaluation);
		textField.setReportElement(getReportElement(x, y, width, height));
		TextFieldExpression tfExpression = new TextFieldExpression();
		tfExpression.setContent(expression);
		textField.setTextFieldExpression(tfExpression);
		TextElement textElement = new TextElement();
		textElement.setFont(font);
		textField.setTextElement(textElement);
		return textField;
	}
	
	private ReportElement getReportElement(int x, int y, int width, int height) {
		ReportElement reportElement = new ReportElement();
		reportElement.setX(Integer.toString(x));
		reportElement.setY(Integer.toString(y));
		reportElement.setWidth(Integer.toString(width));
		reportElement.setHeight(Integer.toString(height));
		return reportElement;
	}
	
	private Font getFont(String fontName, int size) {
		Font font = new Font();
		font.setFontName(fontName);
		font.setSize(Integer.toString(size));
		return font;
	}
	
	private QueryString addQuery() {
		QueryString query = null; //new QueryString();
		return query;
	}
	
	private void addParameters(JasperReport jr) {
		List<Parameter> parameters = jr.getParameter();
		Parameter dataDa = new Parameter();
		dataDa.setName("DataDa");
		dataDa.setClazz("java.util.Date");
		parameters.add(dataDa);
		Parameter dataA = new Parameter();
		dataA.setName("DataA");
		dataA.setClazz("java.util.Date");
		parameters.add(dataA);
	}
	
	private void addFields(JasperReport jr) {
		List<Field> fields = jr.getField();
		Field colli = new Field();
		colli.setName("colli");
		colli.setClazz("java.lang.Integer");
		fields.add(colli);
	}
	
	private void addVariables(JasperReport jr) {
		List<Variable> variables = jr.getVariable();
		Variable totaleColli = new Variable();
		totaleColli.setCalculation("Sum");
		totaleColli.setIncrementType("Report");
		totaleColli.setClazz("java.lang.Integer");
		totaleColli.setName("totaleColli");
		VariableExpression expression = new VariableExpression();
		expression.setContent("$F{colli}");
		totaleColli.setVariableExpression(expression);
		variables.add(totaleColli);
	}

}
