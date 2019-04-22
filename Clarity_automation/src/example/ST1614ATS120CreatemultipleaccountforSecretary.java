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

public class ST1614ATS120CreatemultipleaccountforSecretary {
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
  public void testST1614ATS120CreatemultipleaccountforSecretary() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description  - Create multiple account for Secretary
    // admin log into the admin site
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // Creation of Login for Secretary with same details
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
    driver.findElement(By.id("ctl00_MenuTreeViewn24")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_drpTrust"))).selectByVisibleText("SecretaryAccount");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterTitleTextBox")).sendKeys("MR");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterForeNameTextBox")).sendKeys("MultipleLogin");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterSurNameTextBox")).sendKeys("Login");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl03_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl04_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl04_FooterTitleTextBox")).sendKeys("Mr");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl04_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl04_FooterForeNameTextBox")).sendKeys("LoginGeneration");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl04_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl04_FooterSurNameTextBox")).sendKeys("LoginGeneration1");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl04_FooterRoleDropDownList"))).selectByVisibleText("GovernanceRole2");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AddTrusteeGridView_ctl04_FooterAddNewLinkButton")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_GenerateTrusteePinsButton")).click();
    Thread.sleep(3000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Login generated successfully\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Logging out of Admin Site
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
