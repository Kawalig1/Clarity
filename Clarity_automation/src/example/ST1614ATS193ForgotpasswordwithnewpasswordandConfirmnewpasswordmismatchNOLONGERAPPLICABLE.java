package example;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ST1614ATS193ForgotpasswordwithnewpasswordandConfirmnewpasswordmismatchNOLONGERAPPLICABLE {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    baseUrl = "http://change-this-to-the-site-you-are-testing/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testST1614ATS193ForgotpasswordwithnewpasswordandConfirmnewpasswordmismatchNOLONGERAPPLICABLE() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description  - Trustee forgot password with new password and Confirm new password mismatch
    // admin log into the admin site
    driver.get("http://clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("t4trustee");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_lnkForgotPassword")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_ForgotMemorableWordCheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_AnswerTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_AnswerTextBox")).sendKeys("answer");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_NewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_NewPasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_ConfirmPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ForgotPassword1_ConfirmPasswordTextBox")).sendKeys("passwordaa");
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*New password and confirmed new password should be the same\\.[\\s\\S]*$"));
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
