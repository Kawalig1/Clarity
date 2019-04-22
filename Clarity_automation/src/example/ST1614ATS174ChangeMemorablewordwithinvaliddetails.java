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

public class ST1614ATS174ChangeMemorablewordwithinvaliddetails {
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
  public void testST1614ATS174ChangeMemorablewordwithinvaliddetails() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description  -Trustee/Governance change Memorable word with invalid details
    // Trustee logs into Trustee Site
    driver.get("http:clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("TTrustee16.");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    //driver.findElement(By.xpath("//a[2]")).click();
  //driver.findElement(By.linkText("Options")).click();
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/span/a")).click();
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/ul/li[2]/a")).click();
    //driver.findElement(By.linkText("Options")).click();
    Thread.sleep(1000);
    //driver.findElement(By.linkText("Change memorable word")).click();
    //driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/ul/li[2]/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).sendKeys("password1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).sendKeys("11111111");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).sendKeys("11111111");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ResetButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or new memorable word is invalid\\.Your new memorable word should contain numbers\\. It should be between 8 and 15 characters in length\\.[\\s\\S]*$"));
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or new memorable word is invalid.Your new memorable word should contain numbers. It should be between 8 and 15 characters in length.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).sendKeys("12345678");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).sendKeys("1234567");
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*New memorable word and confirmed new memorable word should be the same.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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