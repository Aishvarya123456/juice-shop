package org.utilities;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJVMReport(String json) {
		File loc= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReports");
		
		Configuration con = new Configuration(loc, "JuiceShop");
		con.addClassifications("BrowserName", "Chrome");
		con.addClassifications("OS", "Window 11");
		con.addClassifications("Tester", "Aishvarya");
		con.addClassifications("Env", "QA");
		
		List<String> jsonFiles= new LinkedList<String>();
		jsonFiles.add(json);
		ReportBuilder r= new ReportBuilder(jsonFiles, con);
		r.generateReports();
	

	}


}
