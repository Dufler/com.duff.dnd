package com.duff.dnd.parts;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import com.duff.dynamicreport.JasperReportBuilder;
import com.duff.dynamicreport.Report;
import com.duff.dynamicreport.ReportBuilder;

public class SamplePart {

	private TableViewer tableViewer;

	@Inject
	private MPart part;

	@PostConstruct
	public void createComposite(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		Text txtInput = new Text(parent, SWT.BORDER);
		txtInput.setMessage("Enter text to mark part as dirty");
		txtInput.addModifyListener(e -> part.setDirty(true));
		txtInput.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		tableViewer = new TableViewer(parent);

		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		tableViewer.setInput(createInitialDataModel());
		tableViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
	}

	@Focus
	public void setFocus() {
		tableViewer.getTable().setFocus();
	}

	@Persist
	public void save() {
		part.setDirty(false);
	}
	
	private List<String> createInitialDataModel() {
		ReportBuilder builder = new ReportBuilder();
		boolean success = builder.buildReportFile();
		if (success) {
			String pathExport = "C:\\Users\\Duff\\Documents\\test.pdf";
			Report report = new Report("C:\\Users\\Duff\\Desktop\\DnD\\report.jrxml");
			HashMap<String, Object> parameters = new HashMap<>();
			parameters.put("DataDa", new Date());
			parameters.put("DataA", new Date());
			List<Spedizione> data = new LinkedList<>();
			Spedizione s1 = new Spedizione(1, 3, 1.5, 0.6, true, new Date());
			data.add(s1);
			Spedizione s2 = new Spedizione(3, 1, 3.5, 2.6, true, new Date());
			data.add(s2);
			Spedizione s3 = new Spedizione(6, 2, 7.5, 2.6, true, new Date());
			data.add(s3);
			try {
				JasperReportBuilder.buildReportPDF(report, pathExport, parameters, data);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
//		ProprietaDao dao = new ProprietaDao();
//		String key = "qualcosa";
//		Proprieta p = dao.trovaDaChiave(key);
//		if (p == null) {
//			p = new Proprieta();
//			p.setKey(key);
//			p.setValue("test");
//			p = dao.inserisci(p);
//		}		
		return Arrays.asList("Sample item 1", "Sample item 2", "Sample item 3", "Sample item 4", "Sample item 5");
	}
}