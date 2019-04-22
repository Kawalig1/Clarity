
package com.stta.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.stta.CommonLibrary.CommonLibrary;


public class ScreenshotUtility implements ITestListener{	
	//This method will execute before starting of Test suite.
	@Override
	public void onStart(ITestContext tr) {	
		
	}

	//This method will execute, Once the Test suite is finished.
	@Override
	public void onFinish(ITestContext tr) {
		
	}

	//This method will execute only when the test is pass.
	@Override
	public void onTestSuccess(ITestResult tr) {
		//If screenShotOnPass = yes, call captureScreenShot.
		if(CommonLibrary.Param.getProperty("screenShotOnPass").equalsIgnoreCase("yes"))
		{
			captureScreenShot(tr,"pass");
		}
	}

	//This method will execute only on the event of fail test.
	@Override
	public void onTestFailure(ITestResult tr) {		
		//If screenShotOnFail = yes, call captureScreenShot.
		if(CommonLibrary.Param.getProperty("screenShotOnFail").equalsIgnoreCase("yes"))
		{
			captureScreenShot(tr,"fail");
		}
	}

	// This method will execute before the main test start (@Test)
	@Override
	public void onTestStart(ITestResult tr) {
		
	}

	// This method will execute only if any of the main test(@Test) get skipped
	@Override
	public void onTestSkipped(ITestResult tr) {		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult tr) {
	}
	
	//Function to capture screenshot.
	public void captureScreenShot(ITestResult result, String status){	
		String destDir = "";
		String passfailMethod = result.getMethod().getRealClass().getSimpleName() + "." + result.getMethod().getMethodName();
		//To capture screenshot.
		File scrFile = ((TakesScreenshot) CommonLibrary.driver).getScreenshotAs(OutputType.FILE);
    	DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
    	//If status = fail then set folder name "screenshots/Failures"
    	if(status.equalsIgnoreCase("fail")){
    		destDir = "C:\\Users\\deepali.kadu\\Desktop\\screenshots\\Failures";
    		//destDir = "screenshots/Failures";
    		
    	}
    	//If status = pass then set folder name "screenshots/Success"
    	else if (status.equalsIgnoreCase("pass")){
    		destDir = "C:\\Users\\deepali.kadu\\Desktop\\screenshots\\Success";
    		//destDir = "screenshots/Success";
    	}
    	
    	//To create folder to store screenshots
    	new File(destDir).mkdirs();
    	//Set file name with combination of test class name + date time.
    	String destFile = passfailMethod+" - "+dateFormat.format(new Date()) + ".png";
    	
        try {
        	//Store file at destination folder location
     	   FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
        }
        catch (IOException e) {
             e.printStackTrace();
        }
   } 
}