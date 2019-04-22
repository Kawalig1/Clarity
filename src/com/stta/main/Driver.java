package com.stta.main;


import java.awt.AWTException;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeSuite;

import com.stta.CommonLibrary.CommonLibrary;
import com.stta.utility.Read_XLS;
import com.stta.utility.SuiteUtility;
import com.stta.util.CreateResult;

public class Driver extends CommonLibrary {
	
	Read_XLS FilePath = null;
	String SheetName = null;
	String SuiteName = null;
	String ToRunColumnName = null;
	public static Logger Add_Log = null;
	public static long starttime;
	public static long endtime;
	
	public Driver() {
		// TODO Auto-generated constructor stub
	}
 
	
	//String Result="result";
	@BeforeSuite
	public void checkSuiteToRun() throws IOException, InterruptedException, AWTException{
		//Called init() function from SuiteBase class to Initialize .xls Files
		//System.out.println("checkSuiteToRun starts and Execution Begins");
		starttime = System.currentTimeMillis();
		Add_Log = Logger.getLogger("rootLogger");
		Add_Log.info("Execution Begins");
		//CreateResult.reportGenerator(Result);
		init();
		 FilePath = TestSuiteListExcel;
		 SheetName = "SuitesList";
		 SuiteName = "SuiteName";	
		 ToRunColumnName = "SuiteToRun";
		 Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
		 Runtime.getRuntime().exec("taskkill /F /IM iexplorer.exe");
		//To set TestSuiteList.xls file's path In FilePath Variable
		loadWebBrowser();
		// loading the page again
		//System.out.println("Before Launching Browser");
		driver.get(Param.getProperty("siteURL"));
		//System.out.println("After Launching Browser");
		//CreateResult.reportGenerator(Result);
		//logging in to the Salesforce Website
		//login();
		loginMember();
		CheckMemorableWord();
		Thread.sleep(2000);
		
		//If SuiteToRun !== "y" then SuiteTwo will be skipped from execution.
		SuiteUtility.checkToRunUtility(FilePath, SheetName,ToRunColumnName,SuiteName);	
			//It will throw SkipException to skip test suite's execution and suite will be marked as skipped In testng report
				
		Add_Log.info("End of Execution");
		endtime = System.currentTimeMillis();
		System.out.println("Execution Start Time: "+starttime);
		System.out.println("Execution End Time: "+endtime);
		System.out.println("\n------------------------------------------------------");
		System.out.println("Execution Time: " + (endtime - starttime) / 60000 + " min "
				+ ((endtime - starttime) / 1000) % 60 + " sec");
		ExecTime = (endtime - starttime);
		Add_Log.info("Time for init():" + ExecTime);
		//CreateResult.EndReport();
	}
	
}
