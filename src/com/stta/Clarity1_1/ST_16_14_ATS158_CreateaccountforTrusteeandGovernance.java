package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ST1614ATS158CreateaccountforTrusteeandGovernance {
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
  public void testST1614ATS158CreateaccountforTrusteeandGovernance() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description  - Create account for Trustee and Governance
    // admin log into the admin site
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
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
    driver.findElement(By.id("ctl00_SecretaryMenuTreeViewn7")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl03_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl03_FooterTitleTextBox")).sendKeys("Mr");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl03_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl03_FooterForeNameTextBox")).sendKeys("TrusteeLogin4");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl03_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl03_FooterSurNameTextBox")).sendKeys("trusteelogin4");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl03_FooterAddressDropDownList"))).selectByVisibleText("TrusteeAddressA");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl03_FooterRoleDropDownList"))).selectByVisibleText("TrusteeRole12");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl03_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl04_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl04_FooterTitleTextBox")).sendKeys("Mr");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl04_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl04_FooterForeNameTextBox")).sendKeys("GovernanceLogin4");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl04_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl04_FooterSurNameTextBox")).sendKeys("GovernanceLogin4");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl04_FooterAddressDropDownList"))).selectByVisibleText("TrusteeAddressA");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl04_FooterRoleDropDownList"))).selectByVisibleText("GovernanceRole12");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTrusteeGridView_ctl04_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_GenerateTrusteePinsButton")).click();
    // Warning: waitForTextPresent may require manual changes
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Login generated successfully\\.[\\s\\S]*$")) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Login generated successfully\\.[\\s\\S]*$"));
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
