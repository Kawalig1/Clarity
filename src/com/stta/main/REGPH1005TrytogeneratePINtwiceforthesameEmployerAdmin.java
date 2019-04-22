package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1005TrytogeneratePINtwiceforthesameEmployerAdmin {
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
  public void testREGPH1005TrytogeneratePINtwiceforthesameEmployerAdmin() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Employer and Admin Pin generation_05
    // Author : Harish , Date:27/05/2008
    // Try to generate Pin twice for the same Employer/Admin
    // Log In to admin site
    driver.get("http://clarityAdmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_MenuTreeViewn12")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel")).click();
    // Try to add the same employer details  twice to generate pin for employer
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Add New Employers[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterEmployerDropDownList"))).selectByVisibleText("Annuity Employer");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterTitleTextBox")).sendKeys("MR");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterForeNameTextBox")).sendKeys("PG401");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterSurNameTextBox")).sendKeys("duplicate");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl03_FooterAddNewLinkButton")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl04_FooterEmployerDropDownList"))).selectByVisibleText("Annuity Employer");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl04_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl04_FooterTitleTextBox")).sendKeys("MR");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl04_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl04_FooterForeNameTextBox")).sendKeys("PG401");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl04_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl04_FooterSurNameTextBox")).sendKeys("duplicate");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_EmployerLoginGenerationPanel_AddEmployersGridView_ctl04_FooterAddNewLinkButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*There is already an entry in the current list which matches the description you just entered\\. Please ensure that duplicates are not being added and try again\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Try to add the same Admin details  twice to generate pin for admin
    driver.findElement(By.id("ctl00_MenuTreeViewn7")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterTitleTextBox")).sendKeys("Mr");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterForeNameTextBox")).sendKeys("duplicate");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterSurNameTextBox")).sendKeys("duplicate");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterAddNewLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterTitleTextBox")).sendKeys("mr");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterForeNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterForeNameTextBox")).sendKeys("duplicate");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterSurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterSurNameTextBox")).sendKeys("duplicate");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl04_FooterAddNewLinkButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*There is already an entry in the current list which matches the description you just entered\\. Please ensure that duplicates are not being added and try again\\.[\\s\\S]*$"));
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
