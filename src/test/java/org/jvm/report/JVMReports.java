package org.jvm.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
	 public static void generateJVMReport(String jsonReportFolderPath) {
	 
		  File f = new File("C:\\Users\\Maddy\\eclipse-workspace\\Adactin\\JVMReports");
	        
	        Configuration con = new Configuration(f, "Adactin");
	        con.addClassifications("platform Name", "windows");
	        con.addClassifications("platform Version", "10");
	        con.addClassifications("Browser Name", "Edge");
	        con.addClassifications("Browser version", "114");
	        con.addClassifications("Sprint No", "2");
	        
	        List<String> l = new ArrayList<String>();
	        l.add(jsonReportFolderPath);
		 
		 ReportBuilder rb = new ReportBuilder(l, con);
		 rb.generateReports();
		 
		 
	 }
	 
	 
}























