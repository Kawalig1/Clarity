package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SUPWRS91628ATS004Verifyadminusernotabletogenerateloginforsupportrole {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSUPWRS91628ATS004Verifyadminusernotabletogenerateloginforsupportrole() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    // WRS 91628_Scenario002
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
    driver.findElement(By.id("ctl00_MenuTreeViewn7")).click();
    Thread.sleep(1000);
    // Warning: verifyTextNotPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Admin Login Generation[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextNotPresent may require manual changes
    try {
    	assertFalse(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterRoleDropDownList")).getText().matches("SupportRole2"));
      //assertFalse(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*id=ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminLoginGenerationPanel_AdminPinAddGridView_ctl03_FooterRoleDropDownList[\\s\\S]*$"));
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
