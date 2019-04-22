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

public class ST9901ATS002Secretarysite {
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
  public void testST9901ATS002Secretarysite() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.name("UserNameTextBox")).clear();
    driver.findElement(By.name("UserNameTextBox")).sendKeys("SSitemapA");
    driver.findElement(By.name("PasswordTextBox")).clear();
    driver.findElement(By.name("PasswordTextBox")).sendKeys("dlkvsm");
    driver.findElement(By.id("LoginButton")).click();
    driver.findElement(By.id("ddlMemWordFirst")).sendKeys("0");
    driver.findElement(By.id("ddlMemWordMiddle")).sendKeys("0");
    driver.findElement(By.id("ddlMemWordLast")).sendKeys("0");
    driver.findElement(By.name("btnLogin")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_SecretaryMenuTreeViewn13")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_drpRoleTypes"))).selectByVisibleText("Governance");
    driver.findElement(By.xpath("//option[@value='Governance']")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_RolesListBox"))).selectByVisibleText("SitemapAGov");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SiteMapTreeViewn1CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SiteMapTreeViewn3CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SiteMapTreeViewn5CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SiteMapTreeViewn8CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SiteMapTreeViewn9CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SiteMapTreeViewn10CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SiteMapTreeViewn13CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SiteMapTreeViewn15CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SaveButton")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_drpRoleTypes"))).selectByVisibleText("Trustee");
    driver.findElement(By.xpath("//option[@value='Trustee']")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_RolesListBox"))).selectByVisibleText("Trustee");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SiteMapTreeViewn1CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SiteMapTreeViewn3CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SiteMapTreeViewn5CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SiteMapTreeViewn8CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SiteMapTreeViewn9CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SiteMapTreeViewn10CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SiteMapTreeViewn13CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SiteMapTreeViewn15CheckBox")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SiteMapViewerControl_SaveButton")).click();
    Thread.sleep(1000);
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
