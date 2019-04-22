package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1002GenerationofPINforadminuser {
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
  public void testREGPH1002GenerationofPINforadminuser() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Employer and Admin Pin generation_02
    // Author : Harish , Date:27/05/2008
    // Generate Pin For a Admin 
    // Log In to admin site as super admin
    driver.get("http://clarityAdmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_MenuTreeViewn7")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel")).click();
    // Warning: waitForTextPresent may require manual changes
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Add New Admins[\\s\\S]*$")) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    // Generate Pin For a Admin 
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterTitleTextBox")).sendKeys("Mr");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterForeNameTextBox")).sendKeys("PG201");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterSurNameTextBox")).sendKeys("Dark");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterAddNewLinkButton")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView.1.1 | ]]
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_GenerateAdminPinsButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Login generated successfully\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Generate Pin For Multiple Admin 
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterTitleTextBox")).sendKeys("MR");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterForeNameTextBox")).sendKeys("PG202");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterSurNameTextBox")).sendKeys("Matt");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterTitleTextBox")).sendKeys("Mr");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterForeNameTextBox")).sendKeys("PG203");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterSurNameTextBox")).sendKeys("Sil");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl05_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl05_FooterTitleTextBox")).sendKeys("Ms");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl05_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl05_FooterForeNameTextBox")).sendKeys("PG204");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl05_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl05_FooterSurNameTextBox")).sendKeys("Soft");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl05_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl05_RemoveLinkButton")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl05_FooterTitleTextBox"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_GenerateAdminPinsButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Login generated successfully\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
