package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ST1614ATS172QAchangewithoutmandatorydetailsNOLONGERAPPLICABLE {
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
  public void testST1614ATS172QAchangewithoutmandatorydetailsNOLONGERAPPLICABLE() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description  - Governance change Question and Answer without mandatory details
    // admin log into the admin site
    driver.get(baseUrl + "http:clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("g7governanc");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    driver.findElement(By.xpath("//a[2]")).click();
    driver.findElement(By.linkText("Change Security Question")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeQuestionAnswer1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeQuestionAnswer1_PasswordTextBox")).sendKeys("");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeQuestionAnswer1_QuestionTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeQuestionAnswer1_QuestionTextBox")).sendKeys("what");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeQuestionAnswer1_AnswerTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeQuestionAnswer1_AnswerTextBox")).sendKeys("answer");
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeQuestionAnswer1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeQuestionAnswer1_PasswordTextBox")).sendKeys("PASSWORD");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeQuestionAnswer1_QuestionTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeQuestionAnswer1_QuestionTextBox")).sendKeys("");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeQuestionAnswer1_SaveButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeQuestionAnswer1_QuestionTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeQuestionAnswer1_QuestionTextBox")).sendKeys("WHAT");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeQuestionAnswer1_AnswerTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeQuestionAnswer1_AnswerTextBox")).sendKeys("");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeQuestionAnswer1_SaveButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
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
