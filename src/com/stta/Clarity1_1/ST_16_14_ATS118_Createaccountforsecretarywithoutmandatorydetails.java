package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ST1614ATS118Createaccountforsecretarywithoutmandatorydetails {
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
  public void testST1614ATS118Createaccountforsecretarywithoutmandatorydetails() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description  - Create account for secretary without mandatory details
    // admin log into the admin site
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_MenuTreeViewn24")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_drpTrust"))).selectByVisibleText("TestTrust For Sprint3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterTitleTextBox")).sendKeys("Mr");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterForeNameTextBox")).sendKeys("Forenamw");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterAddNewLinkButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterTitleTextBox")).sendKeys("Mr");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterSurNameTextBox")).sendKeys("surname");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterAddNewLinkButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl04_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl04_FooterForeNameTextBox")).sendKeys("Forename");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl04_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl04_FooterSurNameTextBox")).sendKeys("Surname");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl04_FooterAddNewLinkButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
