package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ATS041VerifyclaritythrowsanerrorifthereisnothingconfiguredforAVCNonAVC {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1501ATS041VerifyclaritythrowsanerrorifthereisnothingconfiguredforAVCNonAVC() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
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
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl09_btnEdit")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl09_txtConfigItemValue")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl09_txtConfigItemValue")).sendKeys("");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl09_btnUpdate")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_btnEdit")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_txtConfigItemValue")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_txtConfigItemValue")).sendKeys("");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_btnUpdate")).click();
    Thread.sleep(1000);
    
    driver.get("http://clarity/Pages/Static/Login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("CAL");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[4]/span/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Redirect my contributions")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StartNavigationTemplateContainerID_StartNextLinkButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*There is no existing contribution allocation\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchSelect_ctl02_chkFundSelect")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Percentage of normal contributions[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*0.00%[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextNotPresent may require manual changes
    try {
      assertFalse(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Percentage of AVC contributions[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchSelect.2.2 | ]]
    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*0.00%[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertEquals(driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchSelect']/tbody/tr[2]/td[3]")).getText(), "0.00%");
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchSelect.3.2 | ]]
    try {
        assertEquals(driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchSelect']/tbody/tr[3]/td[3]")).getText(), "0.00%");
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchSelect.4.2 | ]]
    try {
        assertEquals(driver.findElement(By.xpath(".//*[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchSelect']/tbody/tr[4]/td[3]")).getText(), "0.00%");
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchSelect.6.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchSelect.7.2 | ]]
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
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl09_btnEdit")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl09_txtConfigItemValue")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl09_txtConfigItemValue")).sendKeys("EERREGPRE");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl09_btnUpdate")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_btnEdit")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_txtConfigItemValue")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_txtConfigItemValue")).sendKeys("'EEAVC','EEEAVCPOST','EEEAVCPRE");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_ConfigurationTabPanel_gvConfigItems_ctl08_btnUpdate")).click();
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
