package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATS006Verifymemberisabletoseethesummarypagewiththefundsandpercentagesgivenbefore {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1501ATS006Verifymemberisabletoseethesummarypagewiththefundsandpercentagesgivenbefore() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    driver.get("http://clarity/Pages/Static/Login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("CAC");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_formcontainer']/table/tbody/tr[2]/td[2]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[4]/span/a")).click();
    driver.findElement(By.linkText("Redirect my contributions")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StartNavigationTemplateContainerID_StartNextLinkButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Contribution Fund A[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*100.00%[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchSelect_ctl03_chkFundSelect")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchSelect_ctl04_chkFundSelect")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchSelect_ctl05_chkFundSelect")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchSelect_ctl06_chkFundSelect")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchSelect_ctl08_chkFundSelect")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchSelect_ctl07_chkFundSelect")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl02_txtnormalval")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl02_txtnormalval")).sendKeys("10");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl03_txtnormalval")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl03_txtnormalval")).sendKeys("10");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl04_txtnormalval")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl04_txtnormalval")).sendKeys("10.00");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl05_txtnormalval")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl05_txtnormalval")).sendKeys("10.00");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl06_txtnormalval")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl06_txtnormalval")).sendKeys("1");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl07_txtnormalval")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl07_txtnormalval")).sendKeys("59");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl02_txtavcval")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl02_txtavcval")).sendKeys("1");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl03_txtavcval")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl03_txtavcval")).sendKeys("1");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl04_txtavcval")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl04_txtavcval")).sendKeys("1");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl05_txtavcval")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl05_txtavcval")).sendKeys("10.00");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl06_txtavcval")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl06_txtavcval")).sendKeys("1");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl07_txtavcval")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep2_ctl07_txtavcval")).sendKeys("86");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_StepNavigationTemplateContainerID_StepNextLinkButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Fund name[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Percentage of normal contributions[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Percentage of AVC[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_GridView1']/tbody/tr[2]/td[1]")).getText(), "Contribution Fund A");
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_GridView1']/tbody/tr[2]/td[2]")).getText(), "100.00%");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[2]/td[1]")).getText(), "Contribution Fund C");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[2]/td[2]")).getText(), "10.00%");
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[2]/td[3]")).getText(), "1.00%");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[3]/td[1]")).getText(), "Contribution Fund B");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[3]/td[2]")).getText(), "10.00%");
    assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[3]/td[3]")).getText(), "1.00%");
    assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[4]/td[1]")).getText(), "Contribution Fund D");
    assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[4]/td[2]")).getText(), "10.00%");
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[4]/td[3]")).getText(), "1.00%");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[5]/td[1]")).getText(), "Contribution Fund E");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[5]/td[2]")).getText(), "10.00%");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[5]/td[3]")).getText(), "10.00%");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Contribution Fund F".equals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[6]/td[1]")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[6]/td[2]")).getText(), "1.00%");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[6]/td[3]")).getText(), "1.00%");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[7]/td[1]")).getText(), "Contribution Fund G");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[7]/td[2]")).getText(), "59.00%");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SwitchWizard_grdSwitchStep3']/tbody/tr[7]/td[3]")).getText(), "86.00%");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Step 4 of 4[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
