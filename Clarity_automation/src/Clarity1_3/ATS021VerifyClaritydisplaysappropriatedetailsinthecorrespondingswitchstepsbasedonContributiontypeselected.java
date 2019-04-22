package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATS021VerifyClaritydisplaysappropriatedetailsinthecorrespondingswitchstepsbasedonContributiontypeselected {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1502ATS021VerifyClaritydisplaysappropriatedetailsinthecorrespondingswitchstepsbasedonContributiontypeselected() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    driver.get("http://Clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("SWD");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[4]/span/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Move money between funds")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StartNavigationTemplateContainerID_StartNextLinkButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_optNormalFunds")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Here are the funds in which you currently have money saved from your normal contributions only\\. Please choose which one\\(s\\) you would like to move money out of\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Total current value to be moved so far: £1,159.66[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step3Row1']/td[2]")).getText(), "SwitchFund H");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // ERROR: Caught exception [ERROR: Unsupported command [isEditable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_chkStep3Row1 | ]]
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*These are the funds into which you want to move money accrued from normal contributions you have already paid\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_chkStep3Row2")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_TEXTStep4Row0")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_TEXTStep4Row0")).sendKeys("100");
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*For each of the funds you are moving money into, please enter the percentage of the total amount you want to move into the fund.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[4]/span/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Move money between funds")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StartNavigationTemplateContainerID_StartNextLinkButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_optAVCFunds")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard']/tbody/tr[1]/td/p")).getText(), "Here are the funds in which you currently have money saved from your AVCs only. Please choose which one(s) you would like to move money out of.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_chkStep1Row1")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard']/tbody/tr[1]/td/p[1]")).getText(), "For each of the funds you have chosen, please enter the percentage of the fund that you would like to move out.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_TEXTStep2Row0")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_TEXTStep2Row0")).sendKeys("100");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepPreviousLinkButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Total current value to be moved so far: £537.87[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_chkStep3Row2")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_chkStep3Row3")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_TEXTStep4Row0")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_TEXTStep4Row0")).sendKeys("50");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_TEXTStep4Row1")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_TEXTStep4Row1")).sendKeys("50");
    Thread.sleep(1000);
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard']/tbody/tr[1]/td/ul/li[1]")).getText(), "These are the funds into which you want to move money accrued from AVCs you have already paid.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*The transfer you wish to make is summarised below. Please check it carefully and confirm that you wish to proceed.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_CancelLinkButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
    Thread.sleep(1000);
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
