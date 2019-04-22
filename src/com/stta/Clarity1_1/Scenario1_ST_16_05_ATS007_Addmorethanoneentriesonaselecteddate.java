package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario1ST1605ATS007Addmorethanoneentriesonaselecteddate {
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
  public void testScenario1ST1605ATS007Addmorethanoneentriesonaselecteddate() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    driver.get("http://clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("tm");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    driver.findElement(By.xpath("//a[2]")).click();
    driver.findElement(By.linkText("Event calendar")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_eventscalendar_ctl00_NextMonth")).click();
    driver.findElement(By.linkText("01")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_TitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_TitleTextBox")).sendKeys("testingauto");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_DescriptionTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_DescriptionTextBox")).sendKeys("testing automation");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_InsertLinkButton")).click();
    driver.findElement(By.linkText("01")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_EndMinsDropDownList"))).selectByVisibleText("30");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_EndHoursDropDownList"))).selectByVisibleText("20");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_TitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_TitleTextBox")).sendKeys("automation");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_DescriptionTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_DescriptionTextBox")).sendKeys("automation testing1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_InsertLinkButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*automation testing1[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("testingauto")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*testingauto[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_DeleteLinkButton")).click();
    assertTrue(closeAlertAndGetItsText().matches("^Are you sure you want to delete this item[\\s\\S]$"));
    driver.findElement(By.linkText("automation")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_DeleteLinkButton")).click();
    assertTrue(closeAlertAndGetItsText().matches("^Are you sure you want to delete this item[\\s\\S]$"));
    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
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
