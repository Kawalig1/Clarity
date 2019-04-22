package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATS001ValidationofDatefieldsinPayHistory {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test10020ATS001ValidationofDatefieldsinPayHistory() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    driver.get("http://Clarity");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("02.08.09");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    //driver.findElement(By.linkText("Select")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/span/a")).click();
    driver.findElement(By.linkText("How much is my pension?")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*How much is my pension[\\s\\S][\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate")).sendKeys("02/10/20");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_goButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Start date is later than end date\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/span/a")).click();
    driver.findElement(By.linkText("How much is my pension?")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate")).sendKeys("25/07/2017");
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_EndDate']")).clear();
    //driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_EndDate")).clear();
    //driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_EndDate")).sendKeys("02/10/2");
    driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_EndDate']")).sendKeys("02/10/2");
    //driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_goButton")).click();
    driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_goButton']")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*End Date is not recognized as a valid date\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/span/a")).click();
    driver.findElement(By.linkText("How much is my pension?")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate']")).clear();
    driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate']")).sendKeys("21221\"\"\"");
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_EndDate']")).clear();
    driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_EndDate']")).sendKeys("wewe\"\"\"");
    driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_goButton']")).click();
    Thread.sleep(1000);
    //try {
      //assertTrue(driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDateTypeValidator")).getText().matches("^exact:[\\s\\S]*$"));
    //} catch (Error e) {
    //  verificationErrors.append(e.toString());
    //}
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
