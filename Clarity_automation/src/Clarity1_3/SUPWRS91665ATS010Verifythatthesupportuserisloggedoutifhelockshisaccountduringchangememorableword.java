package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SUPWRS91665ATS010Verifythatthesupportuserisloggedoutifhelockshisaccountduringchangememorableword {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSUPWRS91665ATS010Verifythatthesupportuserisloggedoutifhelockshisaccountduringchangememorableword() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    driver.get("http://ClarityAdmin");
    driver.findElement(By.id("UserNameTextBox")).clear();
	driver.findElement(By.id("UserNameTextBox")).sendKeys("WSupportUse1");
	driver.findElement(By.id("PasswordTextBox")).clear();
	driver.findElement(By.id("PasswordTextBox")).sendKeys("password");
	driver.findElement(By.id("LoginButton")).click();
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("ctl00_MenuTreeViewn5")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_PasswordTextBox")).sendKeys("password1");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).sendKeys("a");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).sendKeys("a");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ChangeMemorableWordButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
    	assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or new memorable word is invalid. Your new memorable word should contain numbers. It should be between 8 and 15 characters in length.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_PasswordTextBox")).sendKeys("password2");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).sendKeys("Memorable1");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).sendKeys("Memorable1");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ChangeMemorableWordButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
    	assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or new memorable word is invalid. Your new memorable word should contain numbers. It should be between 8 and 15 characters in length.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_PasswordTextBox")).sendKeys("password3");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).sendKeys("Memorable2");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).sendKeys("Memorable2");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ChangeMemorableWordButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    /*try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or new memorable word is invalid\\. Your new memorable word should contain numbers, 8 to 15 characters \\(inclusive\\)\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).sendKeys("Memorable3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).sendKeys("Memorable3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ChangeMemorableWordButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or new memorable word is invalid\\. Your new memorable word should contain numbers, 8 to 15 characters \\(inclusive\\)\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_PasswordTextBox")).sendKeys("password5");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_MemorableWordTextBox")).sendKeys("Memorable4");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ConfirmMemorableWordTextBox")).sendKeys("Memorable4");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ChangeMemorableWordControl_ChangeMemorableWordButton")).click();
    // Warning: verifyTextPresent may require manual changes*/
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
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_txtUserName")).sendKeys("WSupportUse1");
	
	new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_drpStatuses"))).selectByVisibleText("Locked");
	Thread.sleep(100);
	new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_FilterPanel_drpRoleType"))).selectByVisibleText("Support");
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