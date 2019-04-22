package example;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ST1614ATS111UpdateaddressforSecretarywithoutenteringmandatorydetails {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testST1614ATS111UpdateaddressforSecretarywithoutenteringmandatorydetails() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Story 16.14 - Trustee PIN Generation
    // Prepared by - Yusoof - Date - 13/12/2008
    // Description  - Update address for Secretary without entering mandatory details
    // admin log into the admin site
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.name("UserNameTextBox")).clear();
    driver.findElement(By.name("UserNameTextBox")).sendKeys("admin");
    driver.findElement(By.name("PasswordTextBox")).clear();
    driver.findElement(By.name("PasswordTextBox")).sendKeys("admin");
    driver.findElement(By.id("LoginButton")).click();
    driver.findElement(By.id("ddlMemWordFirst")).sendKeys("0");
    driver.findElement(By.id("ddlMemWordMiddle")).sendKeys("0");
    driver.findElement(By.id("ddlMemWordLast")).sendKeys("0");
    driver.findElement(By.name("btnLogin")).click();
    Thread.sleep(1000);

    // Updating the Address with the address name already exist
    driver.findElement(By.id("ctl00_MenuTreeViewn24")).click();
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_drpTrustAdd"))).selectByVisibleText("Modify Trust");
    Thread.sleep(2000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDropDownList"))).selectByVisibleText("16.14_trust2");
   // driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.xpath(" .//*[@id='ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView']/tbody/tr[10]/td/a[1]")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView_txtAddressName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView_txtAddressName")).sendKeys("");
    driver.findElement(By.linkText("Update")).click();
    Thread.sleep(5000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView_txtAddressName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView_txtAddressName")).sendKeys("16.14_trust1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView_txtAddressLine1")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView_txtAddressLine1")).sendKeys("");
    driver.findElement(By.linkText("Update")).click();
    Thread.sleep(5000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView_txtAddressLine1")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView_txtAddressLine1")).sendKeys("Address1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView_txtAddressCity")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView_txtAddressCity")).sendKeys("");
    driver.findElement(By.linkText("Update")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView_txtAddressCity")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView_txtAddressCity")).sendKeys("City1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView_txtAddressPostCode")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView_txtAddressPostCode")).sendKeys("");
    driver.findElement(By.linkText("Update")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView_txtAddressPostCode")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginGenerationContainer_AdminAddressPanel_TrusteeAddressDetailsView_txtAddressPostCode")).sendKeys("post");
    driver.findElement(By.linkText("Cancel")).click();
    Thread.sleep(5000);
    // Logging out of Admin Site
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
