package example;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario5ST1605ATS001EnteraneventinthepastLeavedescriptionblankEnddateislessthanstartdate {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    baseUrl = "http://change-this-to-the-site-you-are-testing/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testScenario5ST1605ATS001EnteraneventinthepastLeavedescriptionblankEnddateislessthanstartdate() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    driver.get("http://clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("tm");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
   // driver.findElement(By.xpath("//a[2]")).click();
    driver.findElement(By.linkText("Event calendar")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_eventscalendar_ctl00_NextMonth")).click();
    driver.findElement(By.linkText("06")).click();
    //driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_AddLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_InsertLinkButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    boolean str1=  driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"); 
    System.out.println("str1:"+str1);	
    } catch (Error e) {
      verificationErrors.append(e.toString());
    } 
    // Warning: verifyTextPresent may require manual changes
    try {
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    	boolean str1=  driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"); 
        System.out.println("str1:"+str1);
      
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
      boolean str1=  driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"); 
      System.out.println("str1:"+str1);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_CancelLinkButton")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.id("ctl00_ContentPlaceHolder_EventFormView_AddLinkButton"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_eventscalendar_ctl00_NextMonth")).click();
    driver.findElement(By.linkText("06")).click();
    //driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_AddLinkButton")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_StartDateTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_StartDateTextBox")).sendKeys("31/12/2008");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_EndDateTextBox")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_EndDateTextBox")).sendKeys("31/12/2008");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_InsertLinkButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
    	boolean str1=  driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"); 
        System.out.println("str1:"+str1);
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_CancelLinkButton")).click();
    
    
    driver.findElement(By.id("ctl00_ContentPlaceHolder_eventscalendar_ctl00_NextMonth")).click();
    driver.findElement(By.linkText("06")).click();
    
    //driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_AddLinkButton")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_StartDateTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_StartDateTextBox")).sendKeys("31/12/2008");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_TitleTextBox")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_TitleTextBox")).sendKeys("abcd");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_InsertLinkButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
    	boolean str1=  driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"); 
        System.out.println("str1:"+str1);
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_CancelLinkButton")).click();
    
    
    driver.findElement(By.id("ctl00_ContentPlaceHolder_eventscalendar_ctl00_NextMonth")).click();
    driver.findElement(By.linkText("06")).click();
    
    //driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_AddLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_StartDateTextBox")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_StartDateTextBox")).sendKeys("01/12/2008");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_EndDateTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_EndDateTextBox")).sendKeys("02/12/2008");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_TitleTextBox")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_TitleTextBox")).sendKeys("abcd");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_DescriptionTextBox")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_DescriptionTextBox")).sendKeys("defg");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_InsertLinkButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
    	boolean str1=  driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Start date cannot be in the past\\.[\\s\\S]*$"); 
        System.out.println("str1:"+str1);
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Start date cannot be in the past\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_CancelLinkButton")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
