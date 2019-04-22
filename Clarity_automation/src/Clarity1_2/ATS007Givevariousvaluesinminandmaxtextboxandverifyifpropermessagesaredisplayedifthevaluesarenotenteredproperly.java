package Clarity1_2;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ATS007Givevariousvaluesinminandmaxtextboxandverifyifpropermessagesaredisplayedifthevaluesarenotenteredproperly {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test0109ATS007Givevariousvaluesinminandmaxtextboxandverifyifpropermessagesaredisplayedifthevaluesarenotenteredproperly() throws Exception {
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
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkSetupAssumption")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please select the calculation type to setup assumptions.[\\s\\S]*$"));
      boolean str = driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please select the calculation type to setup assumptions.[\\s\\S]*$");
      System.out.println("String is: "+str);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkAddNew")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl03_drpCalcTypes"))).selectByVisibleText("ERETILL");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl03_btnInsert")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl03_rdoSelectCalcType")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkSetupAssumption")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAssumptions_ctl02_txtMinValue")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAssumptions_ctl02_txtMinValue")).sendKeys("100");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAssumptions_ctl02_txtMaxValue")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAssumptions_ctl02_txtMaxValue")).sendKeys("200");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAssumptions_ctl05_txtMinValue")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAssumptions_ctl05_txtMinValue")).sendKeys("200");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAssumptions_ctl05_txtMaxValue")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAssumptions_ctl05_txtMaxValue")).sendKeys("3000");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkSave")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Assumptions are successfullly saved[\\s\\S]*$"));
      boolean str = driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Assumptions are successfullly saved[\\s\\S]*$");
      System.out.println("String is: "+str);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_MenuTreeViewn1")).click();
    driver.get("http://Clarity/Pages/Static/Login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("demoscheme004");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    Thread.sleep(1000);
    //driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_formcontainer']/table/tbody/tr[2]/td[2]")).click();
    //Thread.sleep(1000);
    driver.findElement(By.linkText("My quotations")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_drpCalcType"))).selectByVisibleText("Ill Health Retirement");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_StartNavigationTemplateContainerID_StartNextButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_AVCFundValue#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_AVCFundValue#1#ALL")).sendKeys("200");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_RetirementCash#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_RetirementCash#1#ALL")).sendKeys("3001");
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter a value between 200 and 3000[\\s\\S]*$"));
      boolean str = driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter a value between 200 and 3000[\\s\\S]*$");
      System.out.println("String is: "+str);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_YTDConts#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_YTDConts#1#ALL")).sendKeys("650");
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter a value between 300 and 400[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_FinishNavigationTemplateContainerID_FinishButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
    
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
