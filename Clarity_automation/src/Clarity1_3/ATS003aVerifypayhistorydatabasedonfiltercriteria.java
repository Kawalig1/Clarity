package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATS003aVerifypayhistorydatabasedonfiltercriteria {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test10020ATS003aVerifypayhistorydatabasedonfiltercriteria() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
	driver.get("http://Clarity/Pages/Static/Login.aspx");
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
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate")).sendKeys("26/07/2013");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_EndDate")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_EndDate")).sendKeys("26/07/2018");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_goButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Date pension paid[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Pension before tax[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Tax[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Pension after tax[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvPayHistory']/tbody/tr[2]/td[1]")).getText(), "07/07/2014");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvPayHistory']/tbody/tr[2]/td[2]")).getText(), "£27.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvPayHistory']/tbody/tr[2]/td[3]")).getText(), "£12.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvPayHistory']/tbody/tr[2]/td[4]")).getText(), "£15.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
	try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvPayHistory']/tbody/tr[3]/td[1]")).getText(), "01/01/2014");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvPayHistory']/tbody/tr[3]/td[2]")).getText(), "£25.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvPayHistory']/tbody/tr[3]/td[3]")).getText(), "£12.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvPayHistory']/tbody/tr[3]/td[4]")).getText(), "£13.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvPayHistory']/tbody/tr[4]/td[1]")).getText(), "01/01/2014");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvPayHistory']/tbody/tr[4]/td[2]")).getText(), "£26.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvPayHistory']/tbody/tr[4]/td[3]")).getText(), "£12.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvPayHistory']/tbody/tr[4]/td[4]")).getText(), "£14.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate")).sendKeys("01/03/2011");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_goButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*No records exist, please amend your filter criteria\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
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
