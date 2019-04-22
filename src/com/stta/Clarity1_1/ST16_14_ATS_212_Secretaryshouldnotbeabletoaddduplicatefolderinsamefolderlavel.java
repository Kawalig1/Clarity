package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ST1614ATS212Secretaryshouldnotbeabletoaddduplicatefolderinsamefolderlavel {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://uk-bri-dv-app1/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testST1614ATS212Secretaryshouldnotbeabletoaddduplicatefolderinsamefolderlavel() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description  -  Secretary should be able to add, edit and delete scheme folder
    // Secretary logs into Secretary Site
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_SecretaryMenuTreeViewn6")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_drpSelectScheme"))).selectByVisibleText("FrontierScheme2");
    driver.findElement(By.xpath("//img[@alt='Expand FrontierScheme2']")).click();
    driver.findElement(By.linkText("Automation")).click();
    driver.findElement(By.linkText("Add Folder")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ManageFolderControl_txtFolderName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ManageFolderControl_txtFolderName")).sendKeys("same folder");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ManageFolderControl_txtComments")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ManageFolderControl_txtComments")).sendKeys("same comments");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ManageFolderControl_btnOK")).click();
    driver.findElement(By.xpath("//img[@alt='Expand FrontierScheme2']")).click();
    driver.findElement(By.linkText("Automation")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ViewFilesControl1_btnCreateFolder")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ManageFolderControl_txtFolderName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ManageFolderControl_txtFolderName")).sendKeys("same folder");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ManageFolderControl_txtComments")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ManageFolderControl_txtComments")).sendKeys("same folder");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ManageFolderControl_btnOK")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Folder same folder already exists\\. Please select a unique name\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ManageFolderControl_btnCancel")).click();
    driver.findElement(By.linkText("same folder")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ViewFilesControl1_btnDeleteFolder")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ViewFilesControl1_btnOK")).click();
    driver.findElement(By.id("ctl00_SecretaryMenuTreeViewn0")).click();
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
