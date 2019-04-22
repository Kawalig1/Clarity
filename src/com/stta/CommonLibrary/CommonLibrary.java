package com.stta.CommonLibrary;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;
import com.stta.Pages.PageLogin;
import com.stta.util.Keywords;
import com.stta.utility.Read_XLS;
import com.stta.utility.SuiteUtility;

public class CommonLibrary {

	
	
	public static Read_XLS TestSuiteListExcel = null;
	public static Read_XLS AccountTestCaseList = null;
	
	public static Logger Add_Log = null;
	public boolean BrowseralreadyLoaded = false;
	public static Properties Param = null;
	public static Properties Object = null;
	public static Properties OR=null;
	public static Properties ENV=null;
	public static WebDriver driver = null;
	

	public static WebDriver ExistingchromeBrowser;
	public static WebDriver ExistingmozillaBrowser;
	public static WebDriver ExistingIEBrowser;
	public static WebDriver ExistingIEBrowser1;

	public static int accountobject;
	public long starttime, endtime;
	// For Before Test
	public long ExecTime;
	public String obj = null;

	protected Read_XLS FilePath = null;
	protected String SheetName = null;
	protected String TestCaseName = null;
	protected String ToRunColumnNameTestCase = null;
	protected String ToRunColumnNameTestData = null;
	protected String TestDataToRun[] = null;
	protected static boolean TestCasePass = true;
	protected static int DataSet = -1;
	static boolean Testskip = false;
	static boolean Testfail = false;
	SoftAssert s_assert;
	Keywords k = Keywords.getInstance();
	//CreateResult r;
	static CommonLibrary c;
	static int Num=1;
	public String strScenarioName = "Scenario";
	public String strExpectedResult = "Expected";
	public String strActualResult = "Actual";
	public String result ="result";

	// PageEditOppty objEditOppty = new PageEditOppty(driver);
	// PageHome objPageHome = new PageHome(driver);

	/*
	 * public CommonLibrary(WebDriver driver2) { // TODO Auto-generated
	 * constructor stub }
	 * 
	 * CommonLibrary cl=new CommonLibrary(driver);
	 */

	public static CommonLibrary getInstance(){
		if(c==null)
			c=new CommonLibrary();
		
		return c;
	}
	
	
	public void init() throws IOException {
		System.out.println("init starts");
		starttime = System.currentTimeMillis();
		Add_Log = Logger.getLogger("rootLogger"); // To Initialize logger
		TestSuiteListExcel = new Read_XLS(
				System.getProperty("user.dir") + "\\src\\com\\stta\\ExcelFiles\\TestSuiteList.xls");
		System.out.println("TestSuiteListExcel: "+TestSuiteListExcel);
		
		//AccountTestCaseList = new Read_XLS(
				//System.getProperty("user.dir") + "\\src\\com\\stta\\ExcelFiles\\Clarity.xls");
		Add_Log.info("All Excel Files Initialised successfully"); // Inserts log67j
		Param = new Properties(); // Initialize Param.properties file
		FileInputStream fip = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//stta//property//Param.properties");
		Param.load(fip);
		Add_Log.info("Param.properties file loaded successfully");
		Object = new Properties(); // Initialize Objects.properties file
		fip = new FileInputStream(System.getProperty("user.dir") + "//src//com//stta//property//Objects.properties");
		Object.load(fip);
		Add_Log.info("Objects.properties file loaded successfully");

		endtime = System.currentTimeMillis();
		System.out.println("\n------------------------------------------------------");
		System.out.println("Execution Time: " + (endtime - starttime) / 60000 + " min "
				+ ((endtime - starttime) / 1000) % 60 + " sec");
		ExecTime = (endtime - starttime);
		Add_Log.info("Time for init():" + ExecTime);
		
		OR= new Properties();
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//com//stta//property//OR.properties");
		OR.load(fs);
		
		// init env
		ENV=new Properties();
		String fileName=OR.getProperty("environment")+".properties";
		System.out.println("***"+ fileName);
		fs = new FileInputStream(System.getProperty("user.dir")+"//src//com//stta//property//"+fileName);
		ENV.load(fs);
	}

	public void loadWebBrowser() throws IOException {
		// Check If any previous webdriver browser Instance exists, then run new
		// test in that existing webdriver browser instance.
		starttime = System.currentTimeMillis();
		
		//Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
		
		if (Param.getProperty("testBrowser").equalsIgnoreCase("Mozilla") && ExistingmozillaBrowser != null) {
			driver = ExistingmozillaBrowser;
			return;
		} else if (Param.getProperty("testBrowser").equalsIgnoreCase("chrome") && ExistingchromeBrowser != null) {
			driver = ExistingchromeBrowser;
			return;
		} else if (Param.getProperty("testBrowser").equalsIgnoreCase("IE") && ExistingIEBrowser != null) {
			
			System.out.println("Inside existingdriver");
			driver = ExistingIEBrowser;
			return;
		}
		
		/*else if(Param.getProperty("testBrowser").equalsIgnoreCase("IE") && ExistingIEBrowser1 != null) 
		{
			
			System.out.println("Inside existingdriver1");

			driver1 = ExistingIEBrowser1;
			return;
		}*/

		if (Param.getProperty("testBrowser").equalsIgnoreCase("Mozilla")) // To
		// Load
		// Firefox
		// driver
		// Instance
		{
			driver = new FirefoxDriver();
			ExistingmozillaBrowser = driver;
			Add_Log.info("Firefox Driver Instance loaded successfully.");
		} else if (Param.getProperty("testBrowser").equalsIgnoreCase("Chrome")) // To
		// Load
		// Chrome
		// driver
		// Instance
		{
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//BrowserDrivers//IEDriverServer.exe");
			driver = new ChromeDriver();
			ExistingchromeBrowser = driver;
			Add_Log.info("Chrome Driver Instance loaded successfully.");
		}

		if (Param.getProperty("testBrowser").equalsIgnoreCase("IE")) // To
		// Load
		// IE
		// driver
		// Instance
		{

			System.setProperty("webdriver.ie.driver", "C:\\Program Files\\BrowserDrivers\\IEDriverServer.exe");
			//System.setProperty("webdriver.ie.driver1", "C:\\Program Files\\BrowserDrivers\\IEDriverServer.exe");


			DesiredCapabilities DCIE = new DesiredCapabilities();
			System.out.println("Inside loadb4");
			DCIE = DesiredCapabilities.internetExplorer();
			DCIE.setCapability("ignoreProtectedModeSettings", true);
			DCIE.setCapability("ie.ensureCleanSession", true);
			DCIE.setCapability("enablePersistentHover", true);
			DCIE.setCapability("nativeEvents", false);

			driver = new InternetExplorerDriver(DCIE);
			//driver1= new InternetExplorerDriver(DCIE);
			// Add_Log.info("IE Driver Instance loaded successfully.");
			// driver1 = new InternetExplorerDriver(DCIE);
			// InternetExplorerOptions ieOptions = new
			// InternetExplorerOptions();
			// options.IntroduceInstabilityByIgnoringProtectedModeSettings =
			// true;
			// Clean the session before launching the browser
			// options.EnsureCleanSession = true;
			ExistingIEBrowser = driver;
			//ExistingIEBrowser1 = driver1;

			
			Add_Log.info("IE Driver Instance loaded successfully.");
		}
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver1.manage().window().maximize();

		endtime = System.currentTimeMillis();
		System.out.println("\n------------------------------------------------------");
		System.out.println("Execution Time: " + (endtime - starttime) / 60000 + " min "
				+ ((endtime - starttime) / 1000) % 60 + " sec");
		ExecTime = (endtime - starttime);
		Add_Log.info("Time for loadWebBrowser():" + ExecTime);
	}

	public void closeWebBrowser() {
		starttime = System.currentTimeMillis();

		driver.close();
		//driver1.close();
		// null browser instance when close
		driver.quit();
		//driver1.quit();

		ExistingchromeBrowser = null;
		ExistingmozillaBrowser = null;
		ExistingIEBrowser = null;
		ExistingIEBrowser1=null;
		endtime = System.currentTimeMillis();
		System.out.println("\n------------------------------------------------------");
		System.out.println("Execution Time: " + (endtime - starttime) / 60000 + " min "
				+ ((endtime - starttime) / 1000) % 60 + " sec");
		ExecTime = (endtime - starttime);
		Add_Log.info("Time for closeWebBrowser():" + ExecTime);
	}

	/*public void datePicker() {
		starttime = System.currentTimeMillis();
		// driver.findElement(By.id("datepicker")).click(); //click field
		driver.findElement(By.linkText("Next")).click(); // click next month
		driver.findElement(By.linkText("28")).click();

		endtime = System.currentTimeMillis();
		System.out.println("\n------------------------------------------------------");
		System.out.println("Execution Time: " + (endtime - starttime) / 60000 + " min "
				+ ((endtime - starttime) / 1000) % 60 + " sec");
		ExecTime = (endtime - starttime);
		Add_Log.info("Time for datePicker():" + ExecTime);
	}*/

	public void login() throws IOException // to login -- Details are in Param file
, AWTException
	{
		starttime = System.currentTimeMillis();

		PageLogin objLogin;
		objLogin = new PageLogin(driver);
		objLogin.loginToSalesForce(Param.getProperty("username"), Param.getProperty("password"));

		endtime = System.currentTimeMillis();
		System.out.println("\n------------------------------------------------------");
		System.out.println("Execution Time: " + (endtime - starttime) / 60000 + " min "
				+ ((endtime - starttime) / 1000) % 60 + " sec");
		ExecTime = (endtime - starttime);
		Add_Log.info("Time for login():" + ExecTime);
		String path = System.getProperty("user.dir") + "\\src\\com\\stta\\Results\\";
		//TakeScreenShot(strScenarioName,path);
		//CreateResult.StepGenerator("Step"+Num,true);
		//Num=Num+1;
	}

	public void loginMember() throws IOException // to login -- Details are in Param file
	, AWTException
		{
			starttime = System.currentTimeMillis();

			PageLogin objLogin;
			objLogin = new PageLogin(driver);
			objLogin.loginToMember(Param.getProperty("username"), Param.getProperty("password"));

			endtime = System.currentTimeMillis();
			System.out.println("\n------------------------------------------------------");
			System.out.println("Execution Time: " + (endtime - starttime) / 60000 + " min "
					+ ((endtime - starttime) / 1000) % 60 + " sec");
			ExecTime = (endtime - starttime);
			Add_Log.info("Time for login():" + ExecTime);
			String path = System.getProperty("user.dir") + "\\src\\com\\stta\\Results\\";
			//TakeScreenShot(strScenarioName,path);
			//CreateResult.StepGenerator("Step"+Num,true);
			//Num=Num+1;
		}
	
	

	public void logout() throws IOException {

		starttime = System.currentTimeMillis();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		getElementByID("ctl00_MenuTreeViewn1").click();
		//getElementByXPath("div[@id='ctl00_MenuTreeView']/tr[1]/td[1]/a[@id='ctl00_MenuTreeViewn1']").click();

		endtime = System.currentTimeMillis();
		System.out.println("\n------------------------------------------------------");
		System.out.println("Execution Time: " + (endtime - starttime) / 60000 + " min "
				+ ((endtime - starttime) / 1000) % 60 + " sec");
		ExecTime = (endtime - starttime);
		Add_Log.info("Time for logout():" + ExecTime);
		//CreateResult.StepGenerator("Step"+Num,true);
		//Num++;

	}
	

	
	// getElementByXPath function for static xpath
	public WebElement getElementByXPath(String Key) {
		try {
			// This block will find element using Key value from web page and
			// return It.
			return driver.findElement(By.xpath(Object.getProperty(Key)));
		} catch (Throwable t) {
			// If element not found on page then It will return null.
			Add_Log.info("Object not found for key --" + Key);
			return null;
		}
	}

	// getElementByXPath function for dynamic xpath
	public WebElement getElementByXPath(String Key1, int val, String key2) {
		try {
			// This block will find element using values of Key1, val and key2
			// from web page and return It.
			return driver.findElement(By.xpath(Object.getProperty(Key1) + val + Object.getProperty(key2)));
		} catch (Throwable t) {
			// If element not found on page then It will return null.
			Add_Log.info("Object not found for custom xpath");
			return null;
		}
	}

	// Call this function to locate element by ID locator.
	public WebElement getElementByID(String Key) {
		try {
			return driver.findElement(By.id(Object.getProperty(Key)));
		} catch (Throwable t) {
			Add_Log.info("Object not found for key --" + Key);
			return null;
		}
	}

	// Call this function to locate element by Name Locator.
	public WebElement getElementByName(String Key) {
		try {
			return driver.findElement(By.name(Object.getProperty(Key)));
		} catch (Throwable t) {
			Add_Log.info("Object not found for key --" + Key);
			return null;
		}
	}

	// Call this function to locate element by cssSelector Locator.
	public WebElement getElementByCSS(String Key) {
		try {
			return driver.findElement(By.cssSelector(Object.getProperty(Key)));
		} catch (Throwable t) {
			Add_Log.info("Object not found for key --" + Key);
			return null;
		}
	}

	// Call this function to locate element by ClassName Locator.
	public WebElement getElementByClass(String Key) {
		try {
			return driver.findElement(By.className(Object.getProperty(Key)));
		} catch (Throwable t) {
			Add_Log.info("Object not found for key --" + Key);
			return null;
		}
	}

	// Call this function to locate element by tagName Locator.
	public WebElement getElementByTagName(String Key) {
		try {
			return driver.findElement(By.tagName(Object.getProperty(Key)));
		} catch (Throwable t) {
			Add_Log.info("Object not found for key --" + Key);
			return null;
		}
	}

	// Call this function to locate element by link text Locator.
	public WebElement getElementBylinkText(String Key) {
		try {
			return driver.findElement(By.linkText(Object.getProperty(Key)));
		} catch (Throwable t) {
			Add_Log.info("Object not found for key --" + Key);
			return null;
		}
	}

	// Call this function to locate element by partial link text Locator.
	public WebElement getElementBypLinkText(String Key) {
		try {
			return driver.findElement(By.partialLinkText(Object.getProperty(Key)));
		} catch (Throwable t) {
			Add_Log.info("Object not found for key --" + Key);
			return null;
		}
	}

	// Function to capture screenshot
	public void TakeScreenShot(String testname, String destination) {

		System.out.println("Inside TakeScreenShot1:" + testname + "" + destination);
		// String destDir = new String(System.getProperty("user.dir"));
		String destDir = "";
		System.out.println("Inside TakeScreenShot2 ");
		String passfailMethod = testname;
		System.out.println("Inside TakeScreenShot3:" + passfailMethod);
		// To capture screenshot.
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println("Inside TakeScreenShot4:" + scrFile);
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		// If status = fail then set folder name "screenshots/Failures"
		System.out.println("Inside TakeScreenShot5:" + dateFormat);
		// destDir = "C:\\Users\\deepali.kadu\\Desktop\\screenshots\\" +
		// destination;
		destDir = new String(System.getProperty("user.dir")) + "\\screenshots\\" + destination;
		System.out.println("Inside TakeScreenShot6:" + destDir);
		// To create folder to store screenshots
		new File(destDir).mkdirs();
		System.out.println("Inside TakeScreenShot7:" + destDir);
		// Set file name with combination of test class name + date time.
		String destFile = passfailMethod + " - " + dateFormat.format(new Date()) + ".png";
		System.out.println("Inside TakeScreenShot8:" + destFile);

		try {
			// Store file at destination folder location
			System.out.println("Inside TakeScreenShot9_try:");
			FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
			// FileUtils.copyFile(scrFile, new File(destination + "/" +
			// destFile));
			// FileUtils.copyFile(scrFile, new
			// File("C:\\Users\\deepali.kadu\\Desktop\\screenshots\\1.png"));
		} catch (IOException e) {
			System.out.println("Inside TakeScreenShot10_catch:");
			e.printStackTrace();

		}
	}

	// Function for @BeforeTest
	public String[] checkCaseToRunMethod(String SheetName, String TestCaseName, Read_XLS FilePath,
			String ToRunColumnNameTestCase, String ToRunColumnNameTestData) throws IOException, InterruptedException {

		System.out.println("Inside run");

		if (!SuiteUtility.checkToRunUtility(FilePath, SheetName, ToRunColumnNameTestCase, TestCaseName)) {

			// To throw skip exception for this test case.
			throw new SkipException(
					TestCaseName + "'s CaseToRun Flag Is 'N' Or Blank. So Skipping Execution Of " + TestCaseName);

		}

		// To retrieve DataToRun flags of all data set lines from related
		// test data sheet.

		TestDataToRun = SuiteUtility.checkToRunUtilityOfData(FilePath, TestCaseName, ToRunColumnNameTestData);
		System.out.println("Inside TestDataToRun");

		return TestDataToRun;

	}

	public boolean writeResult(String actualResult, String ExpectedResult, Read_XLS FilePath, String TestCaseName,
			int DataSet) {

		SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Actual", DataSet + 1, actualResult);

		Add_Log.info("Test fail value before comparing actual and expected " + Testfail);

		boolean decesion;
		decesion = false;
		decesion = actualResult.equalsIgnoreCase(ExpectedResult);
		Add_Log.info("decesion value --" + decesion);

		if (decesion == false) {
			// If expected and actual results not match, Set flag
			// Testfail=true.
			Add_Log.info("actual inside compare --" + actualResult);
			Add_Log.info("Expected inside compare --" + ExpectedResult);
			Testfail = true;
			// If result Is fail then test failure will be captured Inside
			// s_assert object reference.
			// This soft assertion will not stop your test execution.
			s_assert.assertEquals(actualResult, ExpectedResult, "ActualResult Value " + actualResult
					+ " And ExpectedResult Value " + ExpectedResult + " Not Match");
		}

		Add_Log.info("Test fail value after comparing actual and expected " + Testfail);

		if (Testfail) {
			// At last, test data assertion failure will be reported In
			// testNG reports and It will mark your test data, test case and
			// test suite as fail.
			s_assert.assertAll();
		}

		return Testfail;

	}

	//WebDriver driver_;

	/*public void waitForPageLoad() {

		WebDriverWait wait = new WebDriverWait( driver, 30);
		wait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				System.out.println("Current Window State       : "
						+ String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
				return String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
						.equals("complete");
			}
		});
	}*/

	/*
	 * public void reporterDataResultsMethod(boolean Testskip, Read_XLS
	 * FilePath,String TestCaseName, String DataSet, boolean TestCasePass) {
	 * System.out.println("Inside AfterMethod");
	 * 
	 * Add_Log.info("Test fail value in after method " + Testfail);
	 * 
	 * if (Testskip) // If found Testskip = true, Result will be reported as
	 * SKIP against // data set line In excel sheet.
	 * SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip",
	 * DataSet + 1, "SKIP"); else if (Testfail) {
	 * System.out.println("Inside aftermethodifelse"); TestCasePass = false; //
	 * If found Testfail = true, Result will be reported as FAIL against // data
	 * set line In excel sheet. SuiteUtility.WriteResultUtility(FilePath,
	 * TestCaseName, "Pass/Fail/Skip", DataSet + 1, "FAIL"); } else // If found
	 * Testskip = false and Testfail = false, Result will be // reported as PASS
	 * against data set line In excel sheet.
	 * System.out.println("Inside AfterMethod else"); TestCasePass = true;
	 * SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip",
	 * DataSet + 1, "PASS");
	 * 
	 * //logout(); // To Close the web browser at the end of test.
	 * //closeWebBrowser();
	 * 
	 * // At last make both flags as false for next data set. Testskip = false;
	 * Testfail = false;
	 * 
	 * }
	 */

	/*public void setValue(String LinkExpiryDuration, String NoOfAttempts) {
		starttime = System.currentTimeMillis();
		PageHome pg;
		pg = new PageHome(driver);
		pg.setexpiryLinktext(LinkExpiryDuration);
		pg.setdaysExpirytext(NoOfAttempts);		
	}*/

public void navigate(String URLKey) throws IOException{ // load page
	System.out.println(ENV.getProperty(URLKey));
	
	    driver.get(ENV.getProperty(URLKey));
	    //CreateResult.StepGenerator("Step"+Num,true);
		//Num++;
}

public boolean navigateURL(String URL) throws IOException
{
	System.out.println(URL);
	driver.get(URL);
	return true;
	//CreateResult.StepGenerator("Step"+Num,true);
	//Num++;
}

public void CheckMemorableWord() throws IOException, InterruptedException{
	if(driver.findElement(By.id("btnLogin")).isDisplayed()){
		WebElement First = driver.findElement(By.id("lblMemWordFirst"));
		System.out.println("First Element is"+First.getText());
		int position=Integer.parseInt(First.getText());
		Select selectfirst=new Select(driver.findElement(By.id("ddlMemWordFirst")));
		String frstvalue=Param.getProperty("memorableword");
		String selectword = Character.toString(frstvalue.charAt(position-1));
		selectfirst.selectByValue(selectword);
		
		WebElement Second = driver.findElement(By.id("lblMemWordMiddle"));
		System.out.println("First Element is"+Second.getText());
		int Secondposition=Integer.parseInt(Second.getText());
		Select selectSecond=new Select(driver.findElement(By.id("ddlMemWordMiddle")));
		String Secondvalue=Param.getProperty("memorableword");
		String selectSecondword = Character.toString(Secondvalue.charAt(Secondposition-1));
		selectSecond.selectByValue(selectSecondword);
		
		WebElement Third = driver.findElement(By.id("lblMemWordLast"));
		System.out.println("First Element is"+Third.getText());
		int Thirdposition=Integer.parseInt(Third.getText());
		Select selectthird=new Select(driver.findElement(By.id("ddlMemWordLast")));
		String thirdvalue=Param.getProperty("memorableword");
		String selectthirdword = Character.toString(thirdvalue.charAt(Thirdposition-1));
		selectthird.selectByValue(selectthirdword);
		driver.findElement(By.id("btnLogin")).click();
		//CreateResult.StepGenerator("Step"+Num,true);
		//Num++;
		Thread.sleep(5000);
	}
}

public boolean click(String xpathKey) throws InterruptedException, IOException{ // click
	
	obj=OR.getProperty(xpathKey);
	String[] splitString = obj.split("\\|");
	String locator=splitString[1];
	String newxpathKey=splitString[0];
	
	Thread.sleep(1000);
	if (locator.equalsIgnoreCase("xpath")){
		System.out.println(driver);
		System.out.println(OR.getProperty(xpathKey));
		System.out.println(driver.findElement(By.xpath(newxpathKey)));
	driver.findElement(By.xpath(newxpathKey)).click();
	return true;
	//CreateResult.StepGenerator("Step"+Num,true);
	//Num++;
	}else if (locator.equalsIgnoreCase("id")){
		System.out.println(driver);
		System.out.println(OR.getProperty(newxpathKey));
		System.out.println(driver.findElement(By.id(newxpathKey)));
			driver.findElement(By.id(newxpathKey)).click();
			return true;
			//CreateResult.StepGenerator("Step"+Num,true);
			//Num++;
								
	}else if (locator.equalsIgnoreCase("name")){
			driver.findElement(By.name(newxpathKey)).click();
			return true;
			//CreateResult.StepGenerator("Step"+Num,true);
			//Num++;
			
		}
	else
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return false;
}


public boolean clearElement(String locator,String xpathKey) throws IOException{ // click
		
		if (locator.equalsIgnoreCase("xpath")){
		driver.findElement(By.xpath(OR.getProperty(xpathKey))).click();
		return true;
		//CreateResult.StepGenerator("Step"+Num,true);
		//Num++;
		}else if (locator.equalsIgnoreCase("id")){
				driver.findElement(By.id(OR.getProperty(xpathKey))).click();
				return true;
				//CreateResult.StepGenerator("Step"+Num,true);
				//Num++;
									
		}else if (locator.equalsIgnoreCase("name")){ 
				driver.findElement(By.name(OR.getProperty(xpathKey))).click();
				return true;
				//CreateResult.StepGenerator("Step"+Num,true);
				//Num++;
				
			}
		else
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return false;
}


public void clickSendMail()
{
	int count = 0; 
	while (count < 4){ 
	try { 
		 WebElement kancheck = driver.findElement(By.xpath(OR.getProperty("SelectCheck")));
	        if(!kancheck.isSelected())
		    kancheck.click();
		WebElement ele = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSendEmailActivationLink")); 
	    ele.click(); 
	
	} 
	
	catch (StaleElementReferenceException e){ 
	e.toString(); 
	System.out.println("Trying to recover from a stale element :" + e.getMessage()); 
	count = count+1; 
	} 
	count = count+4; 
	} 
	 
	//WebElement e = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSendEmailActivationLink")); 
	//(new WebDriverWait(driver, 5)).until(ExpectedConditions.stalenessOf(e)); 
	
}

public String getcelldata(int row, int col, String tablelocator, String key)
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement  tablename =driver.findElement(By.id(OR.getProperty(key)));	
	WebElement value = tablename.findElement(By.xpath("//tbody/tr[" + row +"]/td[" + col +"]"));
	System.out.println(value.getText());
	String celldata = value.getText();
	return celldata;
}
public boolean select(String xpathkey, String selectItem) throws InterruptedException
{
	obj=OR.getProperty(xpathkey);
	String[] splitString = obj.split("\\|");
	String locator=splitString[1];
	String newxpathKey=splitString[0];
	Thread.sleep(2000);
	
	if (locator.equalsIgnoreCase("id")){
		Select dropdown = new Select(driver.findElement(By.id(newxpathKey)));
		if (dropdown.isMultiple()){
			dropdown.deselectAll();
		}
		
		dropdown.selectByVisibleText(selectItem);
		Thread.sleep(2000);
		return true;
	}
	else if (locator.equalsIgnoreCase("xpath")){
		Select dropdown = new Select(driver.findElement(By.xpath(newxpathKey)));
		if (dropdown.isMultiple()){
			dropdown.deselectAll();
		}
		dropdown.selectByVisibleText(selectItem);
		Thread.sleep(2000);
		return true;
	}
	
	return false;
}

public boolean clickLink(String xpathkey) throws IOException, InterruptedException
{
	obj=OR.getProperty(xpathkey);
	String[] splitString = obj.split("\\|");
	String locator=splitString[1];
	String newxpathKey=splitString[0];
	if (locator.equalsIgnoreCase("id")){
		driver.findElement(By.id(newxpathKey)).click();
		Thread.sleep(10000);
		return true;
		//driver.wait();
		//CreateResult.StepGenerator("Step"+Num,true);
		//Num++;
	}
	else if (locator.equalsIgnoreCase("text")){
	driver.findElement(By.linkText(newxpathKey)).click();
	Thread.sleep(10000);
	return true;
	//driver.wait();
	//CreateResult.StepGenerator("Step"+Num,true);
	//Num++;
	}
	
	return false;
}

public boolean generateLogin(String xpathkey)
{
	int count = 0; 
	while (count < 4){ 
	try { 
		WebElement kancheck = driver.findElement(By.xpath(OR.getProperty("SelectCheck")));
        if(!kancheck.isSelected())
	    kancheck.click();
        WebElement generatelogin = driver.findElement(By.id(OR.getProperty("btnGeneratePin")));
        generatelogin.click();
        System.out.println(count);
        return true;
	}
	catch (StaleElementReferenceException e){ 
		e.toString(); 
		System.out.println("Trying to recover from a stale element :" + e.getMessage()); 
		count = count+1;
		//return false;
		} 
		count = count+4; 
		} 
	
	return false;
}

public boolean check(String xpathkey) throws InterruptedException
{
	obj=OR.getProperty(xpathkey);
	String[] splitString = obj.split("\\|");
	String locator=splitString[1];
	String newxpathKey=splitString[0];
	WebElement kancheck = null;
	Thread.sleep(5000);
	if (locator.equalsIgnoreCase("id")){
		System.out.println(driver);
		System.out.println(driver.findElement(By.id(newxpathKey)));
		kancheck = driver.findElement(By.id(newxpathKey));
		Thread.sleep(5000);
	}
	else if(locator.equalsIgnoreCase("xpath")){
		kancheck = driver.findElement(By.xpath(newxpathKey));
		Thread.sleep(5000);
	}
	else{
		return false;
	}
		//WebElement kancheck = driver.findElement(By.xpath(OR.getProperty(xpathkey)));
        if(!kancheck.isSelected())
        	Thread.sleep(5000);
	    kancheck.click();
	    return true;
        //System.out.println(kancheck.isSelected());
}

public boolean uncheck(String xpathkey)
{
	obj=OR.getProperty(xpathkey);
	String[] splitString = obj.split("\\|");
	String locator=splitString[1];
	String newxpathKey=splitString[0];
	WebElement kancheck = null;
	if (locator.equalsIgnoreCase("id")){
		kancheck = driver.findElement(By.id(OR.getProperty(newxpathKey)));
	}
	else if(locator.equalsIgnoreCase("xpath")){
		kancheck = driver.findElement(By.xpath(OR.getProperty(newxpathKey)));
	}
        if(kancheck.isSelected())
	    kancheck.click();
        System.out.println(kancheck.isSelected());
        return true;
}

public void rdnSelect(String xpathkey)
{
	obj=OR.getProperty(xpathkey);
	String[] splitString = obj.split("\\|");
	String locator=splitString[1];
	String newxpathKey=splitString[0];
	WebElement rdnSelect = driver.findElement(By.id(newxpathKey));
    if(!rdnSelect.isSelected())
    	rdnSelect.click();
}


public boolean input(String xpathKey,String text) throws IOException, InterruptedException{// text fields
	
	obj=OR.getProperty(xpathKey);
	String[] splitString = obj.split("\\|");
	String locator=splitString[1];
	String newxpathKey=splitString[0];
	Thread.sleep(5000);
	if (locator.equalsIgnoreCase("xpath")){
		driver.findElement(By.xpath(newxpathKey)).clear();
		driver.findElement(By.xpath(newxpathKey)).sendKeys(text);
		return true;
	//	CreateResult.StepGenerator("Step"+Num,true);
	//	Num++;
	}else if (locator.equalsIgnoreCase("id")){
		driver.findElement(By.id(newxpathKey)).clear();
		driver.findElement(By.id(newxpathKey)).sendKeys(text);
		return true;
	//	CreateResult.StepGenerator("Step"+Num,true);
	//	Num++;
	}else if (locator.equalsIgnoreCase("name")){
		driver.findElement(By.name(newxpathKey)).clear();
		driver.findElement(By.name(newxpathKey)).sendKeys(text);
		return true;
	//	CreateResult.StepGenerator("Step"+Num,true);
	//	Num++;
	}
//	else{
	return false;
//	}
}

public String getText(String xpathkey)
{
	String mailContent = driver.findElement(By.xpath(OR.getProperty(xpathkey))).getText();
	return (mailContent);
}

public boolean validateTitle(String expectedTitleKey){
	
	String expectedTitle=OR.getProperty(expectedTitleKey);
	
	String actualTitle=driver.getTitle();
	
	if(expectedTitle.equals(actualTitle))
		return true;
	else
		return false;
	
}

public boolean validateText(String expectedText,String xpathKey) throws InterruptedException, IOException{
	
	obj=OR.getProperty(xpathKey);
	String[] splitString = obj.split("\\|");
	String locator=splitString[1];
	String newxpathKey=splitString[0];
	
	String actualText =null;
	Thread.sleep(2000);
	if (locator.equalsIgnoreCase("xpath"))
	actualText=driver.findElement(By.xpath(newxpathKey)).getText();
	else if (locator.equalsIgnoreCase("id"))
	actualText=driver.findElement(By.id(newxpathKey)).getText();
	System.out.println(actualText);
	if(actualText.equals(expectedText))
		{
		System.out.println("Pass");
		//CreateResult.StepGenerator("Step"+Num,true);
		//Num++;
		return true;
		}
	else{
		return false;
	}
}

public boolean UploadDoc(String path) throws InterruptedException, IOException{
	/*//driver.findElement(By.xpath("//input[@id='files']")).sendKeys(path);
			//Thread.sleep(5000);    
			//driver.findElement(By.xpath("//button[@id='Upload']")).click(); 
			//System.out.println("Page Title"+driver.getTitle());
			String webdriver = driver.getWindowHandle();
			System.out.println("webdriver: "+webdriver);
			//driver.switchTo().frame("Choose File to Upload");
			//driver.getTitle();
			System.out.println("Page Title"+driver.getTitle());*/
	String FileUploadpath = System.getProperty("user.dir") + "\\src\\com\\stta\\AutoIT\\DocUpload.exe";
	
	Runtime.getRuntime().exec(FileUploadpath);
	Thread.sleep(5000); 
	return true;
}

public boolean DeleteDoc(String path) throws InterruptedException, IOException{
	String FileUploadpath = System.getProperty("user.dir") + "\\src\\com\\stta\\AutoIT\\DeleteDoc.exe";
	Runtime.getRuntime().exec(FileUploadpath);
	Thread.sleep(5000); 
	return true;
}


public boolean isElementPresent(String xpathKey){
	
	int count= driver.findElements(By.xpath(OR.getProperty(xpathKey))).size();
	if(count>=1)
		return true;
	else
		return false;
	}




public String noSelectedMemberFound()
{
	  WebElement table = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PinGenerationGridView"));
	 // List<WebElement> row = table.findElements(By.tagName("tr"));
	  List<WebElement> coll = table.findElements(By.tagName("td"));
	  System.out.println(coll.size());
	  System.out.println(coll.get(0).getText());
	  return coll.get(0).getText();
}
}
