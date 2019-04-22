package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1016VerifyingHowmuchismyaccountworthformemberWithoneschemeTwoBenefitsOnepreserved {
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
  public void testREGPH1016VerifyingHowmuchismyaccountworthformemberWithoneschemeTwoBenefitsOnepreserved() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Dynamic Page - Account worth_08
    // Author: Harish , Date:19/05/2008
    // Log in as a Member With one scheme,two  Benefits - One preserved
    driver.get("http://clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("dynamic08");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    driver.findElement(By.cssSelector("td.big2")).click();
    // select the first account
    driver.findElement(By.linkText("How much is my account worth?")).click();
    // Verify the account details are displayed correctly
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*How much is my account worth[\\s\\S][\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.1.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.1.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_GridView1.1.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table[3]/tbody/tr/td/table.0.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | //table[3]/tbody/tr/td/table.0.1 | ]]
    driver.findElement(By.linkText("Change account")).click();
    // select the second account
    driver.findElement(By.xpath("//tr[3]/td[1]/a[2]")).click();
    // Verify the account details are displayed correctly
    driver.findElement(By.linkText("How much is my account worth?")).click();
    driver.findElement(By.linkText("Logout")).click();
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
