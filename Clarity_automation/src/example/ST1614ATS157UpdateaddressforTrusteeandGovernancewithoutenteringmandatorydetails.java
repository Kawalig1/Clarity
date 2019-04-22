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

public class ST1614ATS157UpdateaddressforTrusteeandGovernancewithoutenteringmandatorydetails {
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
  public void testST1614ATS157UpdateaddressforTrusteeandGovernancewithoutenteringmandatorydetails() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description  - Update address for Trustee and Governance without entering mandatory details
    // admin log into the admin site
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.name("UserNameTextBox")).clear();
    driver.findElement(By.name("UserNameTextBox")).sendKeys("secretarylogin8");
    driver.findElement(By.name("PasswordTextBox")).clear();
    driver.findElement(By.name("PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("LoginButton")).click();
    driver.findElement(By.id("ddlMemWordFirst")).sendKeys("0");
    driver.findElement(By.id("ddlMemWordMiddle")).sendKeys("0");
    driver.findElement(By.id("ddlMemWordLast")).sendKeys("0");
    driver.findElement(By.name("btnLogin")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Governance[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*View Trust[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Address Management")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDropDownList"))).selectByVisibleText("TrusteeAddressA");
    driver.findElement(By.linkText("Edit")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDetailsView_txtAddressName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDetailsView_txtAddressName")).sendKeys("");
    driver.findElement(By.linkText("Update")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDetailsView_txtAddressName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDetailsView_txtAddressName")).sendKeys("TrusteeAddressA");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDetailsView_txtAddressLine1")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDetailsView_txtAddressLine1")).sendKeys("");
    driver.findElement(By.linkText("Update")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDetailsView_txtAddressLine1")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDetailsView_txtAddressLine1")).sendKeys("Address1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDetailsView_txtAddressCity")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDetailsView_txtAddressCity")).sendKeys("");
    driver.findElement(By.linkText("Update")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDetailsView_txtAddressCity")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDetailsView_txtAddressCity")).sendKeys("City");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDetailsView_txtAddressPostCode")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDetailsView_txtAddressPostCode")).sendKeys("");
    driver.findElement(By.linkText("Update")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDetailsView_txtAddressPostCode")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrusteeAddressDetailsView_txtAddressPostCode")).sendKeys("post");
    driver.findElement(By.linkText("Cancel")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*TrusteeAddress15[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Logging out of Admin Site
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