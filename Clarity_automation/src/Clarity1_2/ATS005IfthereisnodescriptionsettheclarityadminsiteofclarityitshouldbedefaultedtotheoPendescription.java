package Clarity1_2;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ATS005IfthereisnodescriptionsettheclarityadminsiteofclarityitshouldbedefaultedtotheoPendescription {
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
  public void test0109ATS005IfthereisnodescriptionsettheclarityadminsiteofclarityitshouldbedefaultedtotheoPendescription() throws Exception {
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
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkAddNew")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl03_drpCalcTypes"))).selectByVisibleText("DBRDEP");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl03_btnInsert")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Pres Mem Dies B/Ret - Deps[\\s\\S]*$"));
      boolean str = driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Pres Mem Dies B/Ret - Deps[\\s\\S]*$");
      System.out.println("String is: "+str);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Pres Mem Dies B/Ret - Deps[\\s\\S]*$"));
      boolean str1 = driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Pres Mem Dies B/Ret - Deps[\\s\\S]*$");
      System.out.println("String is: "+str1);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl03_rdoSelectCalcType")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkSetupAssumption")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAssumptions_ctl02_txtMemberDesc")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAssumptions_ctl02_txtMemberDesc")).sendKeys("");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkSave")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Assumptions are successfullly saved[\\s\\S]*$"));
      boolean str2 = driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Assumptions are successfullly saved[\\s\\S]*$");
      System.out.println("String is: "+str2);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl03_btnDelete")).click();
    assertTrue(closeAlertAndGetItsText().matches("^OK to Delete[\\s\\S]$"));
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
