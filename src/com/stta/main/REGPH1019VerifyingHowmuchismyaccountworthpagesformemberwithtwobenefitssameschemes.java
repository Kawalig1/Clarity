package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1019VerifyingHowmuchismyaccountworthpagesformemberwithtwobenefitssameschemes {
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
  public void testREGPH1019VerifyingHowmuchismyaccountworthpagesformemberwithtwobenefitssameschemes() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Author : Harish , Date : 24/04/2008
    // verifing if the 'How much is my account worth' page displayess the data from the database correctly
    driver.get("http://clarity/pages/static/login.aspx");
    // Login as a user with 2 benefits
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.id("ctl00_ContentPlaceHolder_UserNameTextBox"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("dynamic02");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    driver.findElement(By.xpath("//a[2]")).click();
    // verifing if the 'How much is my account worth' page displayess the data from the database correctly
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.linkText("How much is my account worth?")).getText().matches("^exact:How much is my account worth[\\s\\S]$")) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.linkText("How much is my account worth?")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.0.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.0.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.0.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.1.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.1.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.1.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.2.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.2.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.2.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=myAccountMoneyTobeInvested.0.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=myAccountMoneyTobeInvested.0.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=myAccountTotal.0.1 | ]]
    // Change account
    driver.findElement(By.linkText("Change account")).click();
    driver.findElement(By.xpath("//tr[3]/td[1]/a[2]")).click();
    // verifing if the 'How much is my account worth' page displayess the data from the database correctly
    driver.findElement(By.linkText("How much is my account worth?")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.1.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.1.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.1.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.2.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.2.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.2.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=myAccountTotal.0.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=myAccountTotal.0.1 | ]]
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
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
