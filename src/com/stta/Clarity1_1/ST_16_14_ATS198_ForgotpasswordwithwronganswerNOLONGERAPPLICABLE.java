package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ST1614ATS198ForgotpasswordwithwronganswerNOLONGERAPPLICABLE {
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
  public void testST1614ATS198ForgotpasswordwithwronganswerNOLONGERAPPLICABLE() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description  -Trustee forgot password with wrong answer
    // admin log into the admin site
    driver.get("http://clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("t4trustee");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_lnkForgotPassword")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_AnswerTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_AnswerTextBox")).sendKeys("answers");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_NewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_NewPasswordTextBox")).sendKeys("Password\"123");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_ConfirmPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_ConfirmPasswordTextBox")).sendKeys("Password\"123");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_NewMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_NewMemorableWordTextBox")).sendKeys("1111111111");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_ConfirmMemorableWordTextBox")).sendKeys("1111111111");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_ResetPasswordButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Your answer is incorrect or your new password or your new memorable word is invalid\\. Your new password should contain numbers, lower-case characters, upper-case characters, symbols, 8 to 15 characters \\(inclusive\\); and it should be different from your previous password\\. Your new memorable word should contain numbers, 8 to 15 characters \\(inclusive\\)\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Back to login")).click();
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
