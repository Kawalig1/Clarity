package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1005CheckingAddressNameUniqueness {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://change-this-to-the-site-you-are-testing/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testREGPH1005CheckingAddressNameUniqueness() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    driver.get("http://clarityAdmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_MenuTreeViewn12")).click();
    driver.findElement(By.xpath(".//*[@id='__tab_ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel']")).click();
    driver.findElement(By.linkText("New")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_EmployerDropDownList"))).selectByVisibleText("Automation Employer");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressName")).sendKeys("Test Same Name");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressLine1")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressLine1")).sendKeys("Addressline1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressLine2")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressLine2")).sendKeys("line2");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressLine3")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressLine3")).sendKeys("line3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressLine4")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressLine4")).sendKeys("line4");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressCity")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressCity")).sendKeys("city");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressCountry")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressCountry")).sendKeys("UK");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressPostCode")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressPostCode")).sendKeys("bse 1ER");
    driver.findElement(By.linkText("Insert")).click();
    driver.findElement(By.linkText("New")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_EmployerDropDownList"))).selectByVisibleText("Test Automation");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressName")).sendKeys("Test Same Name");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressLine1")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressLine1")).sendKeys("ADDRESS");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressLine1")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressLine1")).sendKeys("100");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressLine2")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressLine2")).sendKeys("horfeild");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressCity")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressCity")).sendKeys("bris");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressCountry")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressCountry")).sendKeys("Ireland");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressPostCode")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerAddressPanel_AddressDetailsView_txtEmpAddressPostCode")).sendKeys("bse 098");
    driver.findElement(By.linkText("Insert")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*An address with same name already exists, please rename and try again\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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