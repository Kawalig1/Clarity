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

public class ST1614ATS101CreateTrustwithoutmandatorydetails {
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
  public void testST1614ATS101CreateTrustwithoutmandatorydetails() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description - Verify that admin with admin role is not able to create Trust without mandatory details
    // admin log into the admin site
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.name("UserNameTextBox")).clear();
    driver.findElement(By.name("UserNameTextBox")).sendKeys("admin");
    driver.findElement(By.name("PasswordTextBox")).clear();
    driver.findElement(By.name("PasswordTextBox")).sendKeys("admin");
    driver.findElement(By.id("LoginButton")).click();
    driver.findElement(By.id("ddlMemWordFirst")).sendKeys("0");
    driver.findElement(By.id("ddlMemWordMiddle")).sendKeys("0");
    driver.findElement(By.id("ddlMemWordLast")).sendKeys("0");
    driver.findElement(By.name("btnLogin")).click();
    Thread.sleep(1000);

    // Clicking on Trusts Link
    
    driver.findElement(By.linkText("Trusts")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Trusts[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Clicking on New button to create Trust
    driver.findElement(By.linkText("New")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_NameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_NameTextBox")).sendKeys("without mandatory details");
    // Clicking on Insert without entering Description
    driver.findElement(By.linkText("Insert")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_DescriptionTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_DescriptionTextBox")).sendKeys("Description");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_NameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_NameTextBox")).sendKeys("");
    driver.findElement(By.linkText("Insert")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_NameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TrustsDetailsView_NameTextBox")).sendKeys("Pre-Requiste");
    driver.findElement(By.linkText("Insert")).click();
    Thread.sleep(5000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please select at least one scheme[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Clicking on Logout button
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
