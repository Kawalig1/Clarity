package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SUPWRS91665ATS007Verifythatthesecretaryisloggedoutifhelockshisaccountduringchangezippassword {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSUPWRS91665ATS007Verifythatthesecretaryisloggedoutifhelockshisaccountduringchangezippassword() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
	driver.get("http://clarityAdmin");
	driver.findElement(By.id("UserNameTextBox")).clear();
	driver.findElement(By.id("UserNameTextBox")).sendKeys("WSecretary2");
	driver.findElement(By.id("PasswordTextBox")).clear();
	driver.findElement(By.id("PasswordTextBox")).sendKeys("password");
	driver.findElement(By.id("LoginButton")).click();
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("ctl00_SecretaryMenuTreeViewn9")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_PasswordTextBox")).sendKeys("password1");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordTextBox")).sendKeys("Password1!");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordConfirmTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordConfirmTextBox")).sendKeys("Password1!");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SaveZipPasswordButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
    	assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Invalid login password.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_PasswordTextBox")).sendKeys("password2");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordTextBox")).sendKeys("Password1!");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordConfirmTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordConfirmTextBox")).sendKeys("Password1!");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SaveZipPasswordButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
    	assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Invalid login password.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_PasswordTextBox")).sendKeys("password3");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordTextBox")).sendKeys("Password1!");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordConfirmTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordConfirmTextBox")).sendKeys("Password1!");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SaveZipPasswordButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
    	assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Invalid login password.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_PasswordTextBox")).sendKeys("password4");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordTextBox")).sendKeys("Password1!");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordConfirmTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipPasswordConfirmTextBox")).sendKeys("Password1!");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SaveZipPasswordButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
    	assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Account is locked out. Please try logging in after 30 minutes.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get("http://clarityAdmin");
    driver.findElement(By.id("UserNameTextBox")).clear();
	driver.findElement(By.id("UserNameTextBox")).sendKeys("superadmin");
	driver.findElement(By.id("PasswordTextBox")).clear();
	driver.findElement(By.id("PasswordTextBox")).sendKeys("password");
	driver.findElement(By.id("LoginButton")).click();
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("ctl00_MenuTreeViewn3")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_txtUserName")).sendKeys("WSecretary2");
	
	new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_drpStatuses"))).selectByVisibleText("Locked");
	Thread.sleep(100);
	new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_drpRoleType"))).selectByVisibleText("Secretary");
	Thread.sleep(1000);
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
