package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1041VerifyingWhatIpaidpageformemberwithtwobenefitswithdifferentschemes {
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
  public void testREGPH1041VerifyingWhatIpaidpageformemberwithtwobenefitswithdifferentschemes() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Author : Harish , Date : 15/07/2008
    // verifing if the 'What Have I Paid' page displayess the data from the database correctly
    driver.get("http://clarity/pages/static/login.aspx");
    // LOgin as a Member With one scheme,two  Benefits - One preserved
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("dynamic07");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    driver.findElement(By.xpath("//a[2]")).click();
    driver.findElement(By.linkText("What have I paid so far?")).click();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_ButtonSearch")).click();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate")).sendKeys("17/07/1990");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_goButton")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXMainTable.1.1 | ]]
    driver.findElement(By.linkText("Change account")).click();
    driver.findElement(By.xpath("//tr[3]/td[1]/a[2]")).click();
    driver.findElement(By.linkText("What have I paid so far?")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXMainTable.1.1 | ]]
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate")).sendKeys("17/07/1990");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_goButton")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXMainTable.1.1 | ]]
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
