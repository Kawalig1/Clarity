package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1001GenerationofPINforanemployer {
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
  public void testREGPH1001GenerationofPINforanemployer() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Employer and Admin Pin generation_01
    // Author : Harish , Date:27/05/2008
    // Generate Pin For an Employer
    // TFS DEfectID: 1712
    // Log In to admin site
    driver.get("http://clarityAdmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_MenuTreeViewn5")).click();
    driver.findElement(By.linkText("Edit")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.linkText("Update")).click();
    driver.findElement(By.id("ctl00_MenuTreeViewn12")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Add New Employers[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Generate Pin For a Employer
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterTitleTextBox")).sendKeys("Mr");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterForeNameTextBox")).sendKeys("PG101");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterSurNameTextBox")).sendKeys("Black");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterEmployerDropDownList"))).selectByVisibleText("Annuity Employer");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_GenerateEmployerPinsButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Login generated successfully\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Generate Pin For Multiple Employer
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterTitleTextBox")).sendKeys("Mr");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterForeNameTextBox")).sendKeys("PG102");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterSurNameTextBox")).sendKeys("Jack");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterEmployerDropDownList"))).selectByVisibleText("Annuity Employer");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterAddNewLinkButton")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView.1.1 | ]]
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl04_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl04_FooterTitleTextBox")).sendKeys("Mrs");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl04_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl04_FooterForeNameTextBox")).sendKeys("PG103");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl04_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl04_FooterSurNameTextBox")).sendKeys("Rose");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl04_FooterEmployerDropDownList"))).selectByVisibleText("Annuity Employer");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl04_FooterAddNewLinkButton")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView.2.1 | ]]
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_GenerateEmployerPinsButton")).click();
    // Defect - 303 - generate pin is changed to login generation
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Login generated successfully\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Defect - 206 - Verify newly generated employer is displayed in the filter
    driver.findElement(By.id("ctl00_MenuTreeViewn3")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("User Filter".equals(driver.findElement(By.xpath("//h3")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_txtUserName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_txtUserName")).sendKeys("PRose");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_drpRoleType"))).selectByVisibleText("Employer");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_btnFilter")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_FilterGridView.1.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_FilterGridView.1.2 | ]]
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
