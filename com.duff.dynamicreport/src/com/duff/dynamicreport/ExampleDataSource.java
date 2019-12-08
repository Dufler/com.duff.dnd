package com.duff.dynamicreport;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.JRRewindableDataSource;

public class ExampleDataSource /*extends JREmptyDataSource*/ implements JRRewindableDataSource {

	private final List<String> elements;
	private int index;
	
	public ExampleDataSource() {
		elements = new ArrayList<>();
		elements.add("Element 1");
		elements.add("Element 2");
		elements.add("Element 3");
		index = 0;
	}
	
	@Override
	public Object getFieldValue(JRField arg0) throws JRException {
		String value = elements.get(index);
		return value;
	}

	@Override
	public boolean next() throws JRException {
		index++;
		return index < elements.size();
	}

	@Override
	public void moveFirst() throws JRException {
		index = 0;		
	}

}
