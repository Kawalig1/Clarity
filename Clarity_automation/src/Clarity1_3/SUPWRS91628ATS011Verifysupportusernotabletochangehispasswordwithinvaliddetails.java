package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SUPWRS91628ATS011Verifysupportusernotabletochangehispasswordwithinvaliddetails {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSUPWRS91628ATS011Verifysupportusernotabletochangehispasswordwithinvaliddetails() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    // WRS 91628_Scenario004
	  driver.get("http://clarityadmin/Login.aspx");
	    driver.findElement(By.name("UserNameTextBox")).clear();
	    driver.findElement(By.name("UserNameTextBox")).sendKeys("SScenario13");
	    driver.findElement(By.name("PasswordTextBox")).clear();
	    driver.findElement(By.name("PasswordTextBox")).sendKeys("password");
	    driver.findElement(By.id("LoginButton")).click();
	    driver.findElement(By.id("ddlMemWordFirst")).sendKeys("0");
	    driver.findElement(By.id("ddlMemWordMiddle")).sendKeys("0");
	    driver.findElement(By.id("ddlMemWordLast")).sendKeys("0");
	    driver.findElement(By.name("btnLogin")).click();
	    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_MenuTreeViewn5")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_PasswordTextBox")).sendKeys("password1");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_NewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_NewPasswordTextBox")).sendKeys("password");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_ConfirmNewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_ConfirmNewPasswordTextBox")).sendKeys("password");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangePasswordControl_ChangePasswordButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or new password is invalid. Your new password should contain lower-case characters. It should be between 6 and 15 characters in length and it should be different from your previous password.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_PasswordTextBox")).sendKeys("password1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).sendKeys("22222");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).sendKeys("22222");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ChangeMemorableWordButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
    	assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or new password is invalid. Your new password should contain lower-case characters. It should be between 6 and 15 characters in length and it should be different from your previous password.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_MenuTreeViewn0")).click();
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
