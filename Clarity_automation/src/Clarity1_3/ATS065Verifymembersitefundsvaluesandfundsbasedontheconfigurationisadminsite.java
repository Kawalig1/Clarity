package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ATS065Verifymembersitefundsvaluesandfundsbasedontheconfigurationisadminsite {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1502ATS065Verifymembersitefundsvaluesandfundsbasedontheconfigurationisadminsite() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    driver.get("http://clarity/pages/static/Login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("SWU");
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
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*SwitchFund A[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row1']/td[3]")).getText(), "£626.60");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row1']/td[4]")).getText(), "01/01/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row2']/td[3]")).getText(), "£24.44");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepPreviousLinkButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_optAVCFunds")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row1']/td[2]")).getText(), "SwitchFund B");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row1']/td[3]")).getText(), "£6.60");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row1']/td[4]")).getText(), "01/01/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row2']/td[2]")).getText(), "SwitchFund C");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row2']/td[3]")).getText(), "£225.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row2']/td[4]")).getText(), "01/01/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
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
    driver.findElement(By.id("ctl00_MenuTreeViewn5")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_ConfigAreaDropDown"))).selectByVisibleText("Services");
    driver.findElement(By.xpath("//option[@value='Services']")).click();
    Thread.sleep(1000);
    
    //driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_btnEdit")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl09_btnEdit")).click();
    Thread.sleep(1000);
    //driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_txtConfigItemValue")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl09_txtConfigItemValue")).clear();
    Thread.sleep(1000);
    //driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_txtConfigItemValue")).sendKeys("'EEAVC','EEEAVCPOST'");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl09_txtConfigItemValue")).sendKeys("EEAVC,EEEAVCPOST");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl09_btnUpdate")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_MenuTreeViewn1")).click();
    Thread.sleep(1000);
    
    driver.get("http://clarity/pages/static/Login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("SWU");
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
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Here are the funds in which you currently have money saved from your normal contributions only\\. Please choose which one\\(s\\) you would like to move money out of\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row1']/td[3]")).getText(), "£626.60");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row1']/td[4]")).getText(), "01/01/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row2']/td[3]")).getText(), "£31.04");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row2']/td[4]")).getText(), "01/01/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row3']/td[3]")).getText(), "£385.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row3']/td[4]")).getText(), "01/01/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
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
    driver.findElement(By.id("ctl00_MenuTreeViewn5")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_ConfigAreaDropDown"))).selectByVisibleText("Services");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//option[@value='Services']")).click();
    Thread.sleep(1000);
    // Removing the whole AVC form the list
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_btnEdit")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_txtConfigItemValue")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_txtConfigItemValue")).sendKeys("");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_btnUpdate")).click();
    Thread.sleep(1000);
    driver.get("http://clarity/pages/static/Login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("SWU");
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
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Here are the funds in which you currently have money saved from your normal contributions only\\. Please choose which one\\(s\\) you would like to move money out of\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row1']/td[3]")).getText(), "£626.60");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row1']/td[4]")).getText(), "01/01/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row2']/td[3]")).getText(), "£31.04");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row2']/td[4]")).getText(), "01/01/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row3']/td[3]")).getText(), "£385.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row3']/td[4]")).getText(), "01/01/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
    // Entering whole catid in the avc code
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
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
    driver.findElement(By.id("ctl00_MenuTreeViewn5")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_ConfigAreaDropDown"))).selectByVisibleText("Services");
    driver.findElement(By.xpath("//option[@value='Services']")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_btnEdit")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_txtConfigItemValue")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_txtConfigItemValue")).sendKeys("EEEREGPRE,EEEPRPRE,EERREGPRE,EERADDPRE,EERPRPRE,EEEREGPOST,EEEPRPOST,EERREGPOST,EERADDPOST,EERPRPOST,FSAVC,DSSADDIT,DSSINCENT,DSSTAXREL,DSSARR,ERNPR,EENPR,EENPRTR,SALRYFORGN,BONUS01,ALL,EMPLOYER,EMPLOYEE,EEREGPRE97,EEAVCMF,ERREGPRE97,ER2P5PC,EEREGPST97,ERREGPST97,ARR,INDVADPR97,INDVADPS97,EMPLMTPR97,EMPLMTPS97,EMPLSPCPST,EMPLSPPR97,EMPLTRPR97,EMPLTRPS97,EMPLYEXCSS,INDVMTPR97,INDVMTPS97,INDVSPPR97,INDVSPPS97,INDVTRPR97,INDVTRPS97,INDVXCSS01,OPENINGBAL,B2EEEAVC,B2EERADD,B2AVCLOI,B2EMPRLOI,EEAVC,EEEAVCPOST,EEEAVCPRE");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_btnUpdate")).click();
    Thread.sleep(1000);
    driver.get("http://clarity/pages/static/Login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("SWU");
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
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_optNormalFunds")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Here are the funds in which you currently have money saved from your AVCs only\\. Please choose which one\\(s\\) you would like to move money out of\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row1']/td[3]")).getText(), "£626.60");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row1']/td[4]")).getText(), "01/01/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row2']/td[3]")).getText(), "£31.04");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row2']/td[4]")).getText(), "01/01/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row3']/td[3]")).getText(), "£385.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_Step1Row3']/td[4]")).getText(), "01/01/2009");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
    driver.get("http://clarityadmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
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
    driver.findElement(By.id("ctl00_MenuTreeViewn5")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_ConfigAreaDropDown"))).selectByVisibleText("Services");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//option[@value='Services']")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_btnEdit")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_txtConfigItemValue")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_txtConfigItemValue")).sendKeys("EEAVC,EEEAVCPOST,EEEAVCPRE");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_btnUpdate")).click();
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
