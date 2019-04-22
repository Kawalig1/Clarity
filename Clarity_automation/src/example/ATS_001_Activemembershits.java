package example;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ATS_001_Activemembershits {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  
  @BeforeClass(alwaysRun = true)@Parameters("browser")
  
  public void setUp(String browser) throws Exception {
	driver = SelectBrowser.setup(driver,browser);
   // driver = SelectBrowser.setup(driver,browser);
	
    baseUrl = "http://change-this-to-the-site-you-are-testing/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  /*@BeforeTest(alwaysRun = true)
  public void setUp1() throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    baseUrl = "http://change-this-to-the-site-you-are-testing/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }*/

  @Test
  public void test1101ATS001Activemembershits() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
	 Thread.sleep(12000);
    driver.get("http://clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("demoscheme001");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    Thread.sleep(3000);
    //driver.findElement(By.linkText("Select")).click();
    driver.findElement(By.xpath("//*[@id='navigation']/li[2]/span/a")).click();
    driver.findElement(By.linkText("Change password")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='navigation']/li[2]/span/a")).click();
    driver.findElement(By.linkText("Change memorable word")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='navigation']/li[2]/span/a")).click();
    driver.findElement(By.linkText("Change account")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[4]/span/a")).click();
    driver.findElement(By.xpath(" .//*[@id='navigation']/li[4]/ul/li[1]/a")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[4]/span/a")).click();
    driver.findElement(By.xpath("//*[@id='navigation']/li[4]/ul/li[2]/a")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[4]/span/a")).click();
    driver.findElement(By.xpath(".//*[@id='navigation']/li[4]/span/a")).click();
    driver.findElement(By.xpath(".//*[@id='navigation']/li[6]/span/a")).click();
    driver.findElement(By.xpath(".//*[@id='navigation']/li[6]/span/a")).click();
    
    //my contributions options
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/span/a")).click();
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/ul/li[1]/a")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/span/a")).click();
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/ul/li[2]/a")).click();
    Thread.sleep(2000);
    //my details
    driver.findElement(By.xpath(".//*[@id='navigation']/li[6]/span/a")).click();
    driver.findElement(By.xpath(".//*[@id='navigation']/li[6]/ul/li[1]/a")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[6]/span/a")).click();
    driver.findElement(By.xpath(".//*[@id='navigation']/li[6]/ul/li[2]/a")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.linkText("Logout")).click();
	 Thread.sleep(3000);
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 30000 | ]]
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
