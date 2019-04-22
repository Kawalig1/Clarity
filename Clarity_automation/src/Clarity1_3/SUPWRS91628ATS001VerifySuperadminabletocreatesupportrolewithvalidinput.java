package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SUPWRS91628ATS001VerifySuperadminabletocreatesupportrolewithvalidinput {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSUPWRS91628ATS001VerifySuperadminabletocreatesupportrolewithvalidinput() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    // WRS 91628_Scenario001_SUP_WRS91628_ATS001_Verify Superadmin able to create support role with valid input
	  driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fProfundWebAdminRegressionTest%2fTrustReportManagement.aspx");
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
    driver.findElement(By.id("ctl00_MenuTreeViewn6")).click();
    // Creation of support role
    driver.findElement(By.linkText("New")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_RolePanel_RoleDetailsView_txtEditRoleName")).sendKeys("CreationOfSupportrRole");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_RolePanel_RoleDetailsView_RoleTypeDDL"))).selectByVisibleText("Support");
    Thread.sleep(1000);
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=ctl00_ContentPlaceHolder1_AdminContainer_RolePanel_RoleDetailsView_RoleStringListBox | label=User1]]
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_RolePanel_RoleDetailsView_RoleStringListBox"))).selectByVisibleText("User1");
    Thread.sleep(1000);
    driver.findElement(By.linkText("Insert")).click(); 
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_RolePanel_drpRoles"))).selectByVisibleText("CreationOfSupportrRole");
    // Verify the support role is created
    driver.findElement(By.xpath("//option[@value='CreationOfSupportrRole']")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ContentPlaceHolder1_AdminContainer_RolePanel_RoleDetailsView.0.1 | ]]
    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*CreationOfSupportrRole[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ContentPlaceHolder1_AdminContainer_RolePanel_RoleDetailsView.1.1 | ]]
    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Support[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ContentPlaceHolder1_AdminContainer_RolePanel_RoleDetailsView.2.1 | ]]
    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User1[\\s\\S]*$"));
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
