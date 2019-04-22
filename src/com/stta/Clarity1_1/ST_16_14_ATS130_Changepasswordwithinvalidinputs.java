package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ST1614ATS130Changepasswordwithinvalidinputs {
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
  public void testST1614ATS130Changepasswordwithinvalidinputs() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description  - Change password with invalid details
    // Secretary logs into the admin site
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // Warning: waitForTextPresent may require manual changes
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*View Trust[\\s\\S]*$")) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("ctl00_SecretaryMenuTreeViewn8")).click();
    // Entering invalid password while changing password for secretary
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_PasswordTextBox")).sendKeys("password1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_NewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_NewPasswordTextBox")).sendKeys("Password#123");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_ConfirmNewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_ConfirmNewPasswordTextBox")).sendKeys("Password#123");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_ChangePasswordButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or new password is invalid\\. Your new password should contain numbers, lower-case characters, upper-case characters, symbols, 8 to 15 characters \\(inclusive\\); and it should be different from your previous password\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // New memorable word and confirm new password mismatch
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).sendKeys("12345678");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_NewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_NewPasswordTextBox")).sendKeys("password1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_ConfirmNewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_ConfirmNewPasswordTextBox")).sendKeys("password12");
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*New password and confirmed new password should be the same\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
