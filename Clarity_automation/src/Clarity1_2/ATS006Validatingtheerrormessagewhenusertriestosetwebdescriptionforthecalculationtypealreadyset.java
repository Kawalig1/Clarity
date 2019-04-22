package Clarity1_2;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ATS006Validatingtheerrormessagewhenusertriestosetwebdescriptionforthecalculationtypealreadyset {
  private WebDriver driver;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test0109ATS006Validatingtheerrormessagewhenusertriestosetwebdescriptionforthecalculationtypealreadyset() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
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
    driver.findElement(By.id("ctl00_MenuTreeViewn18")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please select the calculation type and click on setup assumptions.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkAddNew")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl03_drpCalcTypes"))).selectByVisibleText("DEPDTH");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl03_btnInsert")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkAddNew")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl04_drpCalcTypes"))).selectByVisibleText("DEPDTH");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl04_txtCalcWebDesc")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl04_txtCalcWebDesc")).sendKeys("depdth test");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl04_btnInsert")).click();
    Thread.sleep(1000);
    try {
      assertEquals(driver.findElement(By.id("ctl00_ContentPlaceHolder1_lblCalcSetupStatus")).getText(), "The selected calculation type or web description are already exists.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl03_btnDelete")).click();
    
    assertTrue(closeAlertAndGetItsText().matches("^OK to Delete[\\s\\S]$"));
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 30000 | ]]
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

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
