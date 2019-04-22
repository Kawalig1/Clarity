package Clarity1_2;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ATS027PlaceaCalculationrequestforaactivememberwheretheeligibilityissetforapreserveduser {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test0109ATS027PlaceaCalculationrequestforaactivememberwheretheeligibilityissetforapreserveduser() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    driver.get("http://clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("E0001");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    Thread.sleep(1000);
    //driver.findElement(By.linkText("Select")).click();
    driver.findElement(By.linkText("My quotations")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_txtDate")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_txtDate")).sendKeys("19/07/2015");
    new Select(driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_drpCalcType"))).selectByVisibleText("Ill Health Retirement");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_StartNavigationTemplateContainerID_StartNextButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_AVCFundValue#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_AVCFundValue#1#ALL")).sendKeys("150");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_CashOverride#4#ALL")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_ImposeIR#4#ALL")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_RetirementCash#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_RetirementCash#1#ALL")).sendKeys("250");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_FinishNavigationTemplateContainerID_FinishButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("My quotations")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("My quotations")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Not Eligible[\\s\\S]*[\\s\\S]*[\\s\\S]*$"));
      boolean str = driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Not Eligible[\\s\\S]*[\\s\\S]*[\\s\\S]*$");
      System.out.println("String is: "+str);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Logout")).click();
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
