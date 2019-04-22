package Clarity1_2;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ATSUploadmemberswithsingleidentifiers {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test0126007ATSUploadmemberswithsingleidentifiers() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    driver.get("http://ClarityAdmin/Pages/Static/Login.aspx");
    driver.findElement(By.name("UserNameTextBox")).clear();
	driver.findElement(By.name("UserNameTextBox")).sendKeys("superadmin");
	driver.findElement(By.name("PasswordTextBox")).clear();
	driver.findElement(By.name("PasswordTextBox")).sendKeys("password");
	driver.findElement(By.id("LoginButton")).click();
	driver.findElement(By.id("ddlMemWordFirst")).sendKeys("0");
	driver.findElement(By.id("ddlMemWordMiddle")).sendKeys("0");
	driver.findElement(By.id("ddlMemWordLast")).sendKeys("0");
	driver.findElement(By.name("btnLogin")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("ctl00_MenuTreeViewn14")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentSession_txtSessionName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentSession_txtSessionName")).sendKeys("Test Session 2");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentSession_txtSessionDescription")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentSession_txtSessionDescription")).sendKeys("Surname Identifier Only");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentSession_txtSessionFTPFolder")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentSession_txtSessionFTPFolder")).sendKeys("SurnameOnly");
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentSession_drpDocumentCategory"))).selectByVisibleText("Expression of Wish");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentSession_txtDocumentDate")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentSession_txtDocumentDate")).sendKeys("05/01/2010");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentSession_btnAddSession")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentSession_FilterGridView_ctl02_SelectCheck")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentValidateUpload")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentValidateUpload_btnVerify")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentValidateUpload_btnRefresh")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*BREWER.pdf[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*BRIGHT.pdf[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*COOPER.pdf[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*REID.pdf[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*VINTY.pdf[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentValidateUpload_btnUpload")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentValidateUpload_btnRefresh")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabMemberDocuments_pnlDocumentValidateUpload_drpResultFilter"))).selectByVisibleText("UPLOADED");
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*BRIGHT.pdf[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*COOPER.pdf[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*REID.pdf[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*VINTY.pdf[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
}
