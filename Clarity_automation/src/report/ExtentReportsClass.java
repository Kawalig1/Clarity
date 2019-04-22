package report;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class ExtentReportsClass 
{
	ExtentReports extent;
	 ExtentTest logger;
	 
	 @BeforeTest
	 public void startReport(){
		 extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
		 extent.addSystemInfo("HostName", "Gopal");
		 
	 }
	 

}
