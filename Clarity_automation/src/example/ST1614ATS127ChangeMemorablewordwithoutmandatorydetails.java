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

public class ST1614ATS127ChangeMemorablewordwithoutmandatorydetails {
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
  public void testST1614ATS127ChangeMemorablewordwithoutmandatorydetails() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description  - Change Memorable word without entering mandatory details
    // Secretary logs into the admin site
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.name("UserNameTextBox")).clear();
    driver.findElement(By.name("UserNameTextBox")).sendKeys("SSprint16.14");
    driver.findElement(By.name("PasswordTextBox")).clear();
    driver.findElement(By.name("PasswordTextBox")).sendKeys("password1");
    driver.findElement(By.id("LoginButton")).click();
    driver.findElement(By.id("ddlMemWordFirst")).sendKeys("0");
    driver.findElement(By.id("ddlMemWordMiddle")).sendKeys("0");
    driver.findElement(By.id("ddlMemWordLast")).sendKeys("0");
    driver.findElement(By.name("btnLogin")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_SecretaryMenuTreeViewn8")).click();
    // without entering password - mandatory details
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_PasswordTextBox")).sendKeys("");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).sendKeys("password");
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ChangeMemorableWordButton")).click();
    // without entering New memorable word- mandatory details
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).sendKeys("");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).sendKeys("password");
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ChangeMemorableWordButton")).click();
    // without entering Confirm New memorable word- mandatory details
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).sendKeys("");
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ChangeMemorableWordButton")).click();
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
