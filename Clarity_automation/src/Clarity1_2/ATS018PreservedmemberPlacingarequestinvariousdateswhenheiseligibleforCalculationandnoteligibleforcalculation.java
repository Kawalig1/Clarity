package Clarity1_2;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ATS018PreservedmemberPlacingarequestinvariousdateswhenheiseligibleforCalculationandnoteligibleforcalculation {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test0109ATS018PreservedmemberPlacingarequestinvariousdateswhenheiseligibleforCalculationandnoteligibleforcalculation() throws Exception {
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
	new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl04_drpCalcTypes"))).selectByVisibleText("ERETILL");
	Thread.sleep(1000);
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl04_txtCalcWebDesc")).clear();
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl04_txtCalcWebDesc")).sendKeys("Ill Health Retirement");
	Thread.sleep(1000);
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl04_btnInsert")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("ctl00_MenuTreeViewn1")).click();
	Thread.sleep(2000);
    driver.get("http://clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("E0002");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    //driver.findElement(By.linkText("Select")).click();
    driver.findElement(By.linkText("My quotations")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_txtDate")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_txtDate")).sendKeys("19/07/2024");
    Thread.sleep(1000);
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
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_FinishNavigationTemplateContainerID_FinishButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("My quotations")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Not Eligible[\\s\\S]*[\\s\\S]*[\\s\\S]*$"));
      boolean str = driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Not Eligible[\\s\\S]*[\\s\\S]*[\\s\\S]*$");
      System.out.println("String is: "+str);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("E0002");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    //driver.findElement(By.linkText("Select")).click();
    driver.findElement(By.linkText("My quotations")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_txtDate")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_txtDate")).sendKeys("11/05/2021");
    new Select(driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_drpCalcType"))).selectByVisibleText("Ill Health Retirement");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_StartNavigationTemplateContainerID_StartNextButton")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_AVCFundValue#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_AVCFundValue#1#ALL")).sendKeys("150");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_CashOverride#4#ALL")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_ImposeIR#4#ALL")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_RetirementCash#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_RetirementCash#1#ALL")).sendKeys("250");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_FinishNavigationTemplateContainerID_FinishButton")).click();
    driver.findElement(By.linkText("My quotations")).click();
    driver.findElement(By.linkText("My quotations")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*View[\\s\\S]*$"));
      boolean str = driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*View[\\s\\S]*$");
      System.out.println("String is: "+str);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("My quotations")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_txtDate")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_txtDate")).sendKeys("11/05/2015");
    new Select(driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_drpCalcType"))).selectByVisibleText("Ill Health Retirement");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_StartNavigationTemplateContainerID_StartNextButton")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_AVCFundValue#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_AVCFundValue#1#ALL")).sendKeys("150");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_CashOverride#4#ALL")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_ImposeIR#4#ALL")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_RetirementCash#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_RetirementCash#1#ALL")).sendKeys("250");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_FinishNavigationTemplateContainerID_FinishButton")).click();
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
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl04_rdoSelectCalcType")).click();
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvCalcSetup_ctl04_btnDelete")).click();
    Thread.sleep(1000);
    assertTrue(closeAlertAndGetItsText().matches("^OK to Delete[\\s\\S]$"));
    driver.findElement(By.id("ctl00_MenuTreeViewn1")).click();
  }

  private String closeAlertAndGetItsText() {
	  boolean acceptNextAlert = false;
	  try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	// TODO Auto-generated method stub
	      return alertText;
}
	  finally {
	      acceptNextAlert = true;
	  }
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