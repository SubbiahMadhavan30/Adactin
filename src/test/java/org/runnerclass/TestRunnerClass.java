package org.runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.report.JVMReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.ReportBuilder;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeaturesFile", glue ="org.stepdefinition", dryRun=false,tags="@sanity",
plugin={"html:target\\Reports.html",
"junit:JunitReport\\junit.xml",
"json:JsonReport\\jsonrep.json"})

public  class TestRunnerClass {
   
	@AfterClass
	public static void report() {
	JVMReports.generateJVMReport(System.getProperty("user.dir")+"JsonReport\\jsonrep.json");

	}
}
//  tags="@sanity"