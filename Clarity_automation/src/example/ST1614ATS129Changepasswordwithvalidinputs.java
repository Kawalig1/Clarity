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

public class ST1614ATS129Changepasswordwithvalidinputs {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    baseUrl = "http://change-this-to-the-site-you-are-testing/";
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testST1614ATS129Changepasswordwithvalidinputs() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description  - Change password with valid details
    // secretary logs into the admin site
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
    // Change password with valid details
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_PasswordTextBox")).sendKeys("password1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_NewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_NewPasswordTextBox")).sendKeys("Password#2");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_ConfirmNewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_ConfirmNewPasswordTextBox")).sendKeys("Password#2");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_ChangePasswordButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Your password has been changed successfully[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    //driver.findElement(By.id("ctl00_SecretaryMenuTreeViewn0")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // Warning: assertTextPresent may require manual changes
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*View Trust[\\s\\S]*$"));
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
