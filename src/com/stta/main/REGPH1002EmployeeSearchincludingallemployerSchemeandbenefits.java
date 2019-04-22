package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1002EmployeeSearchincludingallemployerSchemeandbenefits {
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
  public void testREGPH1002EmployeeSearchincludingallemployerSchemeandbenefits() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Employee search and Blacklist_06
    // Author : Harish, date : 06-05-08
    // Do an Employee search with A member with two benefits and only one benefit Included 
    driver.get("http://clarityAdmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_MenuTreeViewn3")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_txtUserName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_txtUserName")).sendKeys("black01");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_drpRoleType"))).selectByVisibleText("Employer");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_btnFilter")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_FilterGridView_ctl02_SelectCheck")).click();
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_AdminContainer_UserPanel")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_UserPanel_AccountsGridView_ctl02_SelectAccountCheckBox")).click();
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_AdminContainer_EmployerBlackListPanel")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=ctl00_ContentPlaceHolder1_AdminContainer_EmployerBlackListPanel_ExcludeEmployerListBox | label=Web 3 Employer 1]]
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_EmployerBlackListPanel_RemoveSelectedEmployerButton")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=ctl00_ContentPlaceHolder1_AdminContainer_EmployerBlackListPanel_ExcludeSchemeListBox | label=Web 3 Money Purchase Scheme]]
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_EmployerBlackListPanel_RemoveSelectedSchemeButton")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=ctl00_ContentPlaceHolder1_AdminContainer_EmployerBlackListPanel_ExcludeBenefitListBox | label=Web 3 Money Purchase Benefit]]
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_EmployerBlackListPanel_RemoveSelectedBenefitButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_EmployerBlackListPanel_ButtonSaveBlackList")).click();
    driver.findElement(By.id("ctl00_MenuTreeViewn1")).click();
    driver.get("http://clarity/pages/static/login.aspx");
    // Login in as Black01 - Employer
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("black01");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    driver.findElement(By.xpath("//a[2]")).click();
    // Verify the employee is retrieved as per search criteria
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SurNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SurNameTextBox")).sendKeys("blacklisttwobenefits");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_MemberDetailsRadioButton")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("".equals(driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_MemberReferenceTextBox")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    new Select(driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SchemeDropDownList"))).selectByVisibleText("Web 3 Money Purchase Scheme");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SearchButton")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SearchResultsGridView.1.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SearchResultsGridView.1.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SearchResultsGridView.1.3 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SearchResultsGridView.1.12 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SearchResultsGridView.1.13 | ]]
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
    // Revert Employee search settings
    driver.get("http://clarityAdmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_MenuTreeViewn3")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_txtUserName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_txtUserName")).sendKeys("black01");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_drpRoleType"))).selectByVisibleText("Employer");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_btnFilter")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_FilterGridView_ctl02_SelectCheck")).click();
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_AdminContainer_UserPanel")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_UserPanel_AccountsGridView_ctl02_SelectAccountCheckBox")).click();
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_AdminContainer_EmployerBlackListPanel")).click();
    // Exclude all the schemes,benefits and employers for 'black01' user
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_EmployerBlackListPanel_AddAllEmployerButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_EmployerBlackListPanel_AddAllSchemeButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_EmployerBlackListPanel_AddAllBenefitButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_EmployerBlackListPanel_ButtonSaveBlackList")).click();
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
