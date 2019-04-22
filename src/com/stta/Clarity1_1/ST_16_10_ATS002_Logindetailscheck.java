package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ST1610ATS002Logindetailscheck {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = ""></link><title>ST_16.10_ATS002_Login details check.html</title></head><body><table cellpadding="1" cellspacing="1" border="1"><thead><tr><td rowspan="1" colspan="3";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testST1610ATS002Logindetailscheck() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_SecretaryMenuTreeViewn9")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_PasswordTextBox")).sendKeys("pass");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordTextBox")).sendKeys("P4ssword#1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordConfirmTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordConfirmTextBox")).sendKeys("P4ssword#1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SaveZipPasswordButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Invalid login password\\.[\\s\\S]*$"));
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
