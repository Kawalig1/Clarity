package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ATS002Verifymemberisabletoviewandfiltertherequestbydateandtransactiontype {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test10003ATS002Verifymemberisabletoviewandfiltertherequestbydateandtransactiontype() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    driver.get("http://Clarity/Pages/Static/Login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("SWA");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    //driver.findElement(By.linkText("Select")).click();
    driver.findElement(By.xpath(".//*[@id='navigation']/li[6]/span/a")).click();
    driver.findElement(By.linkText("My transaction details")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Transaction date[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Transaction name[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*29/09/2009[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_txtSubmittedDate")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_txtSubmittedDate")).sendKeys("29/09/2009");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_btnFilter")).click();
    Thread.sleep(1000);
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[2]/td[2]")).getText(), "ContactAdmin");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[3]/td[1]")).getText(), "29/09/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[3]/td[2]")).getText(), "ContactAdmin");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[4]/td[1]")).getText(), "29/09/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[4]/td[2]")).getText(), "SwitchRequest");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Filter based on Transaction type
    new Select(driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_drpTransName"))).selectByVisibleText("ContactAdmin");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_btnFilter")).click();
    Thread.sleep(1000);
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[2]/td[1]")).getText(), "29/09/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[2]/td[2]")).getText(), "ContactAdmin");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[3]/td[1]")).getText(), "29/09/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[3]/td[2]")).getText(), "ContactAdmin");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Filter based on Transaction type - Switch Request
    new Select(driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_drpTransName"))).selectByVisibleText("SwitchRequest");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_btnFilter")).click();
    Thread.sleep(1000);
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[2]/td[1]")).getText(), "29/09/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[2]/td[2]")).getText(), "SwitchRequest");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Filter based on Transaction type - Contribution Allocation
    new Select(driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_drpTransName"))).selectByVisibleText("ContributionAllocation");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_btnFilter")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*No transaction data exists[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_btnReset")).click();
    // Filtering whether reset functionality is working fine
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_txtSubmittedDate")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_txtSubmittedDate")).sendKeys("29/09/2009");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_btnFilter")).click();
    Thread.sleep(1000);
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[2]/td[1]")).getText(), "29/09/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[2]/td[2]")).getText(), "ContactAdmin");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[2]/td[1]")).getText(), "29/09/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[3]/td[2]")).getText(), "ContactAdmin");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[4]/td[1]")).getText(), "29/09/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[4]/td[2]")).getText(), "SwitchRequest");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Filter based on Date
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_txtSubmittedDate")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_txtSubmittedDate")).sendKeys("29/09/2009");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_btnFilter")).click();
    Thread.sleep(1000);
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[2]/td[1]")).getText(), "29/09/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[2]/td[2]")).getText(), "ContactAdmin");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[3]/td[1]")).getText(), "29/09/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[3]/td[2]")).getText(), "ContactAdmin");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[4]/td[1]")).getText(), "29/09/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[4]/td[2]")).getText(), "SwitchRequest");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_txtSubmittedDate")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_txtSubmittedDate")).sendKeys("29/09/2010");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_btnFilter")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*No transaction data exists[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Filtering based on transaction type date
    new Select(driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_drpTransName"))).selectByVisibleText("ContactAdmin");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_txtSubmittedDate")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_txtSubmittedDate")).sendKeys("29/09/2011");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_btnFilter")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_drpTransName"))).selectByVisibleText("SwitchRequest");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_txtSubmittedDate")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_txtSubmittedDate")).sendKeys("29/09/2009");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_btnFilter")).click();
    Thread.sleep(1000);
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[2]/td[1]")).getText(), "29/09/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_gvTransDetails']/tbody/tr[2]/td[2]")).getText(), "SwitchRequest");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
