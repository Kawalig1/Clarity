package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ST9901ATS001Adminsitesetup {
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
  public void testST9901ATS001Adminsitesetup() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_MenuTreeViewn22")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_drpTrust"))).selectByVisibleText("Sitemap Test A");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_SiteMapTreeViewn1CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_SiteMapTreeViewn3CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_SiteMapTreeViewn5CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_SiteMapTreeViewn9CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_SiteMapTreeViewn13CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_SaveButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_SiteMapTreeViewt0")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_MenuItemDetailsView_NewMenuItemLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_MenuItemDetailsView_EditTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_MenuItemDetailsView_EditTitleTextBox")).sendKeys("New Root Node");
    driver.findElement(By.linkText("Insert")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_SiteMapTreeViewt15")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_MenuItemDetailsView_EditTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_MenuItemDetailsView_EditTitleTextBox")).sendKeys("New Root Node Edit");
    driver.findElement(By.linkText("Update")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_SiteMapTreeViewt15")).click();
    driver.findElement(By.linkText("New")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_MenuItemDetailsView_EditTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_MenuItemDetailsView_EditTitleTextBox")).sendKeys("new Sub node");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_MenuItemDetailsView_EditURLTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_MenuItemDetailsView_EditURLTextBox")).sendKeys("test1.aspx");
    driver.findElement(By.linkText("Insert")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_SiteMapTreeViewn15CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_SiteMapTreeViewt15")).click();
    driver.findElement(By.linkText("New")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_MenuItemDetailsView_EditTitleTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_MenuItemDetailsView_EditTitleTextBox")).sendKeys("new sub node");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_MenuItemDetailsView_EditURLTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_MenuItemDetailsView_EditURLTextBox")).sendKeys("test2.aspx");
    driver.findElement(By.linkText("Insert")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_SiteMapTreeViewn15CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminSiteMapViewerControl1_SaveButton")).click();
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