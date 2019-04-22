package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1030VerifyingmydetailsformemberwithTwoSchemesOnebenefiteachOnePreserved {
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
  public void testREGPH1030VerifyingmydetailsformemberwithTwoSchemesOnebenefiteachOnePreserved() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Dynamic Pages, MY Details and MY Membership
    // Author : harish , Date : 19-05-2008
    // Log in as member with Two Schemes, One benefit each -One Preserved
    driver.get("http://clarity/pages/static/login.aspx");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("".equals(driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("dynamic07");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    // select the first account
    driver.findElement(By.xpath("//a[2]")).click();
    driver.findElement(By.linkText("About me")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*About me[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.0.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.0.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.1.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.1.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.2.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.2.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.3.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.3.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.4.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.4.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.5.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.5.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.6.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.6.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.7.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.7.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.8.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.8.1 | ]]
    // verify the details in My Account page are displayed correctly
    driver.findElement(By.linkText("About my membership")).click();
    // verify the details in 'My MEmbership' page are displayed correctly
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Scheme name[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Staff C/O Money Purchase Schm[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Joining date[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*01/01/1990[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Membership number[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*test1[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Scheme retirement date[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*01/01/2035[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Employer's name[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Web 3 Employer 1[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Change account")).click();
    // select the second account
    driver.findElement(By.xpath("//tr[3]/td[1]/a[2]")).click();
    driver.findElement(By.linkText("About me")).click();
    // verify the details in My Account page are displayed correctly
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*About me[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.0.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.0.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.1.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.1.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.2.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.2.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.3.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.3.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.4.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.4.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.5.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.5.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.6.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.6.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.7.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.7.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.8.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table.8.1 | ]]
    driver.findElement(By.linkText("About my membership")).click();
    // verify the details in My Membership page are displayed correctly
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Scheme name[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Web 3 Money Purchase Scheme[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Joining date[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*01/01/1995[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Membership number[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*test2[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Scheme retirement date[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*01/01/2035[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Employer's name[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Web 3 Employer 1[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
