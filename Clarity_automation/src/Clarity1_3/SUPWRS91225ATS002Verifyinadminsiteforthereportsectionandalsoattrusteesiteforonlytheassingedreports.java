package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SUPWRS91225ATS002Verifyinadminsiteforthereportsectionandalsoattrusteesiteforonlytheassingedreports {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSUPWRS91225ATS002Verifyinadminsiteforthereportsectionandalsoattrusteesiteforonlytheassingedreports() throws Exception {
	  driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fProfundWebAdminRegressionTest%2fTrustReportManagement.aspx");
	  driver.findElement(By.name("UserNameTextBox")).clear();
	  driver.findElement(By.name("UserNameTextBox")).sendKeys("sm");
	  driver.findElement(By.name("PasswordTextBox")).clear();
	  driver.findElement(By.name("PasswordTextBox")).sendKeys("password");
	  driver.findElement(By.id("LoginButton")).click();
	  driver.findElement(By.id("ddlMemWordFirst")).sendKeys("0");
	  driver.findElement(By.id("ddlMemWordMiddle")).sendKeys("0");
	  driver.findElement(By.id("ddlMemWordLast")).sendKeys("0");
	  driver.findElement(By.name("btnLogin")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("ctl00_SecretaryMenuTreeViewn6")).click();
	  Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Permissions[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_SecretaryMenuTreeViewn10")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_drpRoles"))).selectByVisibleText("Permissions");
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReportDetailsView_lnkClearAll")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=ctl00_ContentPlaceHolder1_ReportDetailsView_ReportsListBox | label=Impending Retirements]]
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReportDetailsView_ReportsListBox"))).selectByVisibleText("Impending Retirements");
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=ctl00_ContentPlaceHolder1_ReportDetailsView_ReportsListBox | label=Member Details]]
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReportDetailsView_ReportsListBox"))).selectByVisibleText("Member Details");
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=ctl00_ContentPlaceHolder1_ReportDetailsView_ReportsListBox | label=Member Statistics]]
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReportDetailsView_ReportsListBox"))).selectByVisibleText("Member Statistics");
    Thread.sleep(1000);
    driver.findElement(By.linkText("Update")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_SecretaryMenuTreeViewn0")).click();
    Thread.sleep(1000);
    
    driver.get("http://clarity/pages/static/Login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("greport");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    Thread.sleep(1000);
    //driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_formcontainer']/table/tbody/tr[2]/td[3]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[4]/span/a")).click();
    driver.findElement(By.linkText("Reports")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Member Details Impending Retirements Member Statistics[\\s\\S]*$"));
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
}
