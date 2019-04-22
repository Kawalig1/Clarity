package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ST1614ATS103Modifyexistingtrustdetails {
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
  public void testST1614ATS103Modifyexistingtrustdetails() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description - Verify that admin with admin role is not able to update trust without mandatory details and duplicate role.
    // admin log into the admin site
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // Clicking on Trusts Link
    driver.findElement(By.linkText("Trusts")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Trusts[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Clicking on Edit button to modify the trust
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_drpSelectTrusts"))).selectByVisibleText("Modify Trust");
    driver.findElement(By.linkText("Edit")).click();
    // Updating the trust without entering mandatory fields
    // Deleting the name of trust
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_DescriptionTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_DescriptionTextBox")).sendKeys("");
    // Warning: assertTextPresent may require manual changes
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_DescriptionTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_DescriptionTextBox")).sendKeys("Creating trust to test Modify existing trust");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_NameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_NameTextBox")).sendKeys("");
    // Deleting the Description of trust
    // Warning: assertTextPresent may require manual changes
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    // Removing the scheme from the trust
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_NameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_NameTextBox")).sendKeys("Modifyingexsitingtrust");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_SchemeEditListBox")).click();
    // Updating the trust with the trust name already exist
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_NameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_NameTextBox")).sendKeys("Duplicate");
    driver.findElement(By.linkText("Update")).click();
    // clicking on Cancel button
    driver.findElement(By.linkText("Cancel")).click();
    // Logout of Admin site
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
