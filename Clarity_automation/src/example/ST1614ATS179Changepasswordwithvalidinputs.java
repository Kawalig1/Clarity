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

public class ST1614ATS179Changepasswordwithvalidinputs {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    baseUrl = "http://change-this-to-the-site-you-are-testing/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testST1614ATS179Changepasswordwithvalidinputs() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description  - Change password by entering valid details
    // Trustee logs into Trustee Site
    driver.get("http://clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("TTrustee16.3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    //driver.findElement(By.xpath("//a[2]")).click();
    //driver.findElement(By.linkText("Options")).click();
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/span/a")).click();
    //driver.findElement(By.linkText("Change password")).click();
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/ul/li[1]/a")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_NewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_NewPasswordTextBox")).sendKeys("Password#1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_ConfirmNewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_ConfirmNewPasswordTextBox")).sendKeys("Password#1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_ChangePasswordButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Your password has been changed successfully[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Logout")).click();
    // Log into the Trustee Site to verify whether password has changed.
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("TTrustee16.3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("Password#1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    //driver.findElement(By.xpath("//a[2]")).click();
  //driver.findElement(By.linkText("Options")).click();
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/span/a")).click();
    //driver.findElement(By.linkText("Change password")).click();
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/ul/li[1]/a")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_PasswordTextBox")).sendKeys("Password#1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_NewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_NewPasswordTextBox")).sendKeys("Password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_ConfirmNewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_ConfirmNewPasswordTextBox")).sendKeys("Password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_ChangePasswordButton")).click();
    Thread.sleep(1000);
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