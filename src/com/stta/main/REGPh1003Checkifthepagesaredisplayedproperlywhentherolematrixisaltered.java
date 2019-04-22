package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPh1003Checkifthepagesaredisplayedproperlywhentherolematrixisaltered {
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
  public void testREGPh1003Checkifthepagesaredisplayedproperlywhentherolematrixisaltered() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    driver.get("http://clarityAdmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_MenuTreeViewn6")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_MatrixPanel")).click();
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_AdminContainer_MatrixPanel")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_MatrixPanel_drpSchemes"))).selectByVisibleText("Phase one Testing");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_MatrixPanel_RoleMatrixGridView_ctl02_btnEdit")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_MatrixPanel_RoleMatrixGridView_ctl02_ActiveRoleDropDownList"))).selectByVisibleText("rolepres");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_MatrixPanel_RoleMatrixGridView_ctl02_btnUpdate")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_MatrixPanel_RoleMatrixGridView_ctl03_btnEdit")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_MatrixPanel_RoleMatrixGridView_ctl03_ActiveRoleDropDownList"))).selectByVisibleText("roleactive");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_MatrixPanel_RoleMatrixGridView_ctl03_btnUpdate")).click();
    driver.findElement(By.id("ctl00_MenuTreeViewn1")).click();
    driver.get("http://clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("Rolematrix1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    driver.findElement(By.linkText("Select")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Role Matrix Testing phase1[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Role Matrix Testing phase1")).click();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("rolepreserved1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    driver.findElement(By.linkText("Select")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Role Matrix Testing phase1[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
