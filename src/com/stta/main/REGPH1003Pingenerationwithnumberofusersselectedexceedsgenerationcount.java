package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1003Pingenerationwithnumberofusersselectedexceedsgenerationcount {
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
  public void testREGPH1003Pingenerationwithnumberofusersselectedexceedsgenerationcount() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Auhor: Harish , Date:25/04/2008
    // Bulk Pin generation Scenario 9
    // Verify pin generation is not done if the number of users selected exceeds the generation count
    driver.get("http://clarityAdmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_MenuTreeViewn5")).click();
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel")).click();
    // Create a password policy and update settings with generation count 2
    driver.findElement(By.linkText("New")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView_ctl06")).click();
    driver.findElement(By.linkText("Insert")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel")).click();
    driver.findElement(By.linkText("Edit")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.linkText("Update")).click();
    // verify Pin generation is not doen
    driver.findElement(By.id("ctl00_MenuTreeViewn4")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_PinGenerationGridView_ctl02_SelectCheck")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_PinGenerationGridView_ctl03_SelectCheck")).click();
    driver.findElement(By.linkText("2")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_PinGenerationGridView_ctl03_SelectCheck")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnGeneratePin")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Logins Generated Successfully\\.[\\s\\S]*$"));
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
