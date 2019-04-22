package example;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario1ST1605ATS002ATrusteeAddmultipleentries {
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
  public void testScenario1ST1605ATS002ATrusteeAddmultipleentries() throws Exception {
	  Thread.sleep(5000);
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    driver.get("http://clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("tm");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    //driver.findElement(By.xpath("//a[2]")).click();
    driver.findElement(By.linkText("Event calendar")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_eventscalendar_ctl00_NextMonth")).click();
    driver.findElement(By.linkText("01")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_TitleTextBox")).clear();
    Thread.sleep(5000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_TitleTextBox")).sendKeys("auto");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_DescriptionTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_DescriptionTextBox")).sendKeys("auto");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_InsertLinkButton")).click();
    Thread.sleep(5000);
   // driver.findElement(By.id("ctl00_ContentPlaceHolder_eventscalendar_ctl06_EventLinkButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_eventscalendar_ctl00_NextMonth")).click();
    driver.findElement(By.linkText("01")).click();
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ContentPlaceHolder_EventFormView']/tbody/tr/td/table/tbody/tr[4]/td")).getText(), "Title");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_DescriptionTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_DescriptionTextBox")).sendKeys("autotest");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_TitleTextBox")).sendKeys("autotest");
    //driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_EventFormView_AddLinkButton']")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_EventFormView_InsertLinkButton")).click();
    Thread.sleep(2000);
    //driver.findElement(By.id("ctl00_ContentPlaceHolder_eventscalendar_ctl80_EventLinkButton")).click();
   driver.findElement(By.linkText("autotest")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*auto[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Delete")).click();
    assertTrue(closeAlertAndGetItsText().matches("^Are you sure you want to delete this item[\\s\\S]$"));
    driver.findElement(By.linkText("auto")).click();
    driver.findElement(By.linkText("Delete")).click();
    assertTrue(closeAlertAndGetItsText().matches("^Are you sure you want to delete this item[\\s\\S]$"));
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