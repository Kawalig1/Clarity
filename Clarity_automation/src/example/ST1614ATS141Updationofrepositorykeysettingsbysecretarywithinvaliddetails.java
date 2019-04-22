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

public class ST1614ATS141Updationofrepositorykeysettingsbysecretarywithinvaliddetails {
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
  public void testST1614ATS141Updationofrepositorykeysettingsbysecretarywithinvaliddetails() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // 16.14_ Trustee PIN Generation
    // Repository key settings with invalid details
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.name("UserNameTextBox")).clear();
    driver.findElement(By.name("UserNameTextBox")).sendKeys("sm");
    driver.findElement(By.name("PasswordTextBox")).clear();
    driver.findElement(By.name("PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("LoginButton")).click();
    driver.findElement(By.id("ddlMemWordFirst")).sendKeys("0");
    driver.findElement(By.id("ddlMemWordMiddle")).sendKeys("0");
    driver.findElement(By.id("ddlMemWordLast")).sendKeys("0");
    driver.findElement(By.name("btnLogin")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_SecretaryMenuTreeViewn11")).click();
    // Repository Key missing mandatroy details
    // Repository Key missing mandatory details - Confirm Repository Key
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginPasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_NewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_NewPasswordTextBox")).sendKeys("password123");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SaveRepositoryKeyButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*[\\s\\S]*[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Repository Key missing mandatory details - New Repository key
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ConfirmPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ConfirmPasswordTextBox")).sendKeys("password123");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_NewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_NewPasswordTextBox")).sendKeys("");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SaveRepositoryKeyButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*[\\s\\S]*[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Repository Key missing mandatory details - Login Password
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_NewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_NewPasswordTextBox")).sendKeys("password123");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginPasswordTextBox")).sendKeys("");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SaveRepositoryKeyButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*[\\s\\S]*[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Confirm Repository key does not match repository key
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginPasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ConfirmPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ConfirmPasswordTextBox")).sendKeys("password@123");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SaveRepositoryKeyButton")).click();
    // Warning: assertTextPresent may require manual changes
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*New Repository Key and Confirm Repository Key should be same\\.[\\s\\S]*$"));
    // Incorrect login details other details are valid
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginPasswordTextBox")).sendKeys("passwor");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_NewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_NewPasswordTextBox")).sendKeys("Password@123");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ConfirmPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ConfirmPasswordTextBox")).sendKeys("Password@123");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SaveRepositoryKeyButton")).click();
    // Warning: assertTextPresent may require manual changes
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Invalid login password or Repository Key\\.[\\s\\S]*$"));
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
