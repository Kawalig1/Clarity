package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ST1614ATS175ChangeMemorablewordwithoutmandatorydetails {
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
  public void testST1614ATS175ChangeMemorablewordwithoutmandatorydetails() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description  -Trustee/Governance change Memorable word without entering mandatory details
    // Trustee logs into Trustee Site
    driver.get(baseUrl + "http:clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("TTrustee16.");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    driver.findElement(By.xpath("//a[2]")).click();
    driver.findElement(By.linkText("Options")).click();
    driver.findElement(By.linkText("Change Memorable Word")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).sendKeys("");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).sendKeys("1111111111");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).sendKeys("1111111111");
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*[\\s\\S]*[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).sendKeys("");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).sendKeys("1111111111");
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*[\\s\\S]*[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*New memorable word and confirmed new memorable word should be the same\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).sendKeys("1111111111");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).sendKeys("2222222222");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ResetButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*New memorable word and confirmed new memorable word should be the same\\. [\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).sendKeys("11111111");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).sendKeys("");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ResetButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*[\\s\\S]*[\\s\\S]*$"));
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
