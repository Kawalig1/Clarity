package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1003Adminaddresseditionandcancelation {
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
  public void testREGPH1003Adminaddresseditionandcancelation() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    driver.get("http://clarityAdmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_MenuTreeViewn7")).click();
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel")).click();
    driver.findElement(By.linkText("New")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressName")).sendKeys("Test Automation1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressLine1")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressLine1")).sendKeys("Editing address");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressCity")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressCity")).sendKeys("city edit");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressPostCode")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressPostCode")).sendKeys("edit ing");
    driver.findElement(By.linkText("Insert")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDropDownList"))).selectByVisibleText("Test Automation1");
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressName")).sendKeys("Test Automation1 edit");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressLine1")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressLine1")).sendKeys("edit 1again");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressCity")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressCity")).sendKeys("city1 edit again");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressPostCode")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressPostCode")).sendKeys("edit1 post");
    driver.findElement(By.linkText("Update")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Test Automation1 edit[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*edit 1again[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*edit1 pos[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*city1 edit again[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressName")).sendKeys("cancel");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressLine1")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressLine1")).sendKeys("add");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressCity")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressCity")).sendKeys("city cancel");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressPostCode")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_AdminAddressDetailsView_txtAdminAddressPostCode")).sendKeys("can cel");
    driver.findElement(By.linkText("Cancel")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Test Automation1 edit[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*edit 1again[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*city1 edit again[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*edit1 pos[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
