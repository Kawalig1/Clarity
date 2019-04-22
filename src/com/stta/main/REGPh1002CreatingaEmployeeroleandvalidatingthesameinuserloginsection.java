package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPh1002CreatingaEmployeeroleandvalidatingthesameinuserloginsection {
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
  public void testREGPh1002CreatingaEmployeeroleandvalidatingthesameinuserloginsection() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    driver.get("http://clarityAdmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_MenuTreeViewn6")).click();
    driver.findElement(By.linkText("New")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_RolePanel_RoleDetailsView_RoleTypeDDL"))).selectByVisibleText("Employer");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_RolePanel_RoleDetailsView_txtEditRoleName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_RolePanel_RoleDetailsView_txtEditRoleName")).sendKeys("Phase one Emp");
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=ctl00_ContentPlaceHolder1_AdminContainer_RolePanel_RoleDetailsView_RoleStringListBox | label=Training]]
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=ctl00_ContentPlaceHolder1_AdminContainer_RolePanel_RoleDetailsView_RoleStringListBox | label=Data Conversion]]
    driver.findElement(By.linkText("Insert")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_RolePanel_drpRoles"))).selectByVisibleText("Phase one Emp");
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_RolePanel_RoleDetailsView_txtEditRoleName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_RolePanel_RoleDetailsView_txtEditRoleName")).sendKeys("Phase one Emp cancel");
    driver.findElement(By.linkText("Update")).click();
    driver.findElement(By.id("ctl00_MenuTreeViewn6")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Phase one Emp cancel[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_MenuTreeViewn2")).click();
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
