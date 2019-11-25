package com.duff.dynamicreport;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class Report {
	
	private final String path;
	
	public Report(String path) {
		this.path = path;
	}
	
	public JasperDesign getReport() {
		JasperDesign report;
		try (InputStream stream = getStream()) {
			report = JRXmlLoader.load(stream);
		} catch (JRException | IOException e) {
			report = null;
			e.printStackTrace();
		}
		return report;
	}
	
//	private InputStream getStream() throws IOException {
//		InputStream stream = new FileInputStream(path);
//		return stream;
//	}
	
	private InputStream getStream() throws IOException {
		InputStream stream = Report.class.getResourceAsStream("/com/duff/dynamicreport/resources/reportBase.jrxml");
		return stream;
	}

}
