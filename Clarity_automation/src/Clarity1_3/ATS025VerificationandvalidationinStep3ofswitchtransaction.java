package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATS025VerificationandvalidationinStep3ofswitchtransaction {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1502ATS025VerificationandvalidationinStep3ofswitchtransaction() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    driver.get("http://clarity/pages/static/Login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("SWD");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    //Select Account
  	Thread.sleep(1000);
    //driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_formcontainer']/table/tbody/tr[2]/td[2]")).click();
    Thread.sleep(1000);
    //Select Account Details Link
  	driver.findElement(By.xpath(".//*[@id='navigation']/li[4]/span/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Move money between funds")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StartNavigationTemplateContainerID_StartNextLinkButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_optNormalFunds")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row1']/td[2]")).getText(), "SwitchFund H");
    
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_chkStep1Row1")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_TEXTStep2Row0")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_TEXTStep2Row0")).sendKeys("100");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepPreviousLinkButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    try {
      assertEquals(driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_LabelStep3Row1")).getText(), "You already have �1,118.87 saved in this fund.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_chkStep3Row2")).click();
    Thread.sleep(1000);
    // ERROR: Caught exception [ERROR: Unsupported command [isEditable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_chkStep3Row1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [isEditable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_chkStep3Row2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [isEditable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_chkStep3Row3 | ]]
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
