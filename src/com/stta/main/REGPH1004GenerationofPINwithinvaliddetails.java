package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1004GenerationofPINwithinvaliddetails {
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
  public void testREGPH1004GenerationofPINwithinvaliddetails() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    driver.get("http://clarityAdmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_MenuTreeViewn12")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel")).click();
    // Warning: waitForTextPresent may require manual changes
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Add New Employers[\\s\\S]*$")) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Add New Employers[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterEmployerDropDownList"))).selectByVisibleText("Annuity Employer");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterForeNameTextBox")).sendKeys("asd");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterSurNameTextBox")).sendKeys("asd");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterForeNameTextBox")).sendKeys("dsd");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterSurNameTextBox")).sendKeys("sdf");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterTitleTextBox")).sendKeys("");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterTitleTextBox")).sendKeys("asd");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterForeNameTextBox")).sendKeys("asd");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_MenuTreeViewn7")).click();
    // Warning: waitForTextPresent may require manual changes
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Add New Admins[\\s\\S]*$")) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterTitleTextBox")).sendKeys("vre");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterTitleTextBox")).sendKeys("xzf");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterSurNameTextBox")).sendKeys("sdf");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterForeNameTextBox")).sendKeys("dfgh");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterSurNameTextBox")).sendKeys("dfg");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterTitleTextBox")).sendKeys("sadf");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterForeNameTextBox")).sendKeys("sdf");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_MenuTreeViewn1")).click();
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
