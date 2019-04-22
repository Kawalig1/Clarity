package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SUPWRS91648ATS004Verifythatthegovernanceuserisloggedoutifhelockshisaccountduringchangepassword {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSUPWRS91648ATS004Verifythatthegovernanceuserisloggedoutifhelockshisaccountduringchangepassword() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    driver.get("http://clarity");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("SGovenance");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    Thread.sleep(1000);
    //driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_formcontainer']/table/tbody/tr[2]/td[3]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/span/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/ul/li[1]/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_PasswordTextBox")).sendKeys("password1");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_NewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_NewPasswordTextBox")).sendKeys("Password1!");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_ConfirmNewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_ConfirmNewPasswordTextBox")).sendKeys("Password1!");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_ChangePasswordButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
    	assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or new password is invalid.Your new password should contain lower-case characters. It should be between 6 and 15 characters in length and it should be different from your previous password.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_PasswordTextBox")).sendKeys("password2");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_NewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_NewPasswordTextBox")).sendKeys("Password1!");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_ConfirmNewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_ConfirmNewPasswordTextBox")).sendKeys("Password1!");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_ChangePasswordButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
    	assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or new password is invalid.Your new password should contain lower-case characters. It should be between 6 and 15 characters in length and it should be different from your previous password.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_PasswordTextBox")).sendKeys("password3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_NewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_NewPasswordTextBox")).sendKeys("Password1!");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_ConfirmNewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_ConfirmNewPasswordTextBox")).sendKeys("Password1!");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangePassword1_ChangePasswordButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
    	assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*You have now made a number of unsuccessful attempts to log in. For security reasons you will be prevented temporarily from attempting to log in for the next 30 minutes.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    /*driver.get("http://clarityAdmin");
    driver.findElement(By.id("UserNameTextBox")).clear();
	driver.findElement(By.id("UserNameTextBox")).sendKeys("superadmin");
	driver.findElement(By.id("PasswordTextBox")).clear();
	driver.findElement(By.id("PasswordTextBox")).sendKeys("password");
	driver.findElement(By.id("LoginButton")).click();
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("ctl00_MenuTreeViewn3")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_txtUserName")).sendKeys("SGovenance");
	
	new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_drpStatuses"))).selectByVisibleText("Locked");
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_btnFilter")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_FilterGridView_ctl02_SelectCheck")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_AdminContainer_UserPanel")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Edit")).click();
	//driver.findElement(By.id(".//*[@id='ctl00_ContentPlaceHolder1_AdminContainer_UserPanel_UserDetailsView']/tbody/tr[4]/td/a")).click();
	Thread.sleep(1000);
	new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_UserPanel_UserDetailsView_UserStatusDropDownlist"))).selectByVisibleText("Active");
	Thread.sleep(1000);
	driver.findElement(By.linkText("Update")).click();
	Thread.sleep(1000);
	//driver.findElement(By.id(".//*[@id='ctl00_ContentPlaceHolder1_AdminContainer_UserPanel_UserDetailsView']/tbody/tr[4]/td/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("ctl00_MenuTreeViewn1")).click();*/
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
