package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1001Settingzippasswordwithvalidandinvalidconditions {
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
  public void testREGPH1001Settingzippasswordwithvalidandinvalidconditions() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Setting zip password
    driver.get("http://clarityAdmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_MenuTreeViewn5")).click();
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_ZipPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_ZipPasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_ZipPasswordConfirmTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_ZipPasswordConfirmTextBox")).sendKeys("passwo");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_SaveZipPasswordButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Zip Password and Confirm Zip Password should be the same\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_ZipPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_ZipPasswordTextBox")).sendKeys("1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_ZipPasswordConfirmTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_ZipPasswordConfirmTextBox")).sendKeys("1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_SaveZipPasswordButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or New Zip Password is invalid\\. Your New Zip Password should contain one of the following symbols: ! @ # \\$ % & [\\s\\S]* + - = [\\s\\S] / ~\\. It should be between 10 and 12 characters in length and it should be different from your previous password\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_ZipPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_ZipPasswordTextBox")).sendKeys("Password@123");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_ZipPasswordConfirmTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_ZipPasswordConfirmTextBox")).sendKeys("Password@123");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ZipPasswordSettingsPanel_SaveZipPasswordButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Zip password is modified successfully\\.[\\s\\S]*$"));
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
