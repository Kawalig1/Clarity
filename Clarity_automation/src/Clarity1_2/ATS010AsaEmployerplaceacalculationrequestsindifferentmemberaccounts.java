package Clarity1_2;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATS010AsaEmployerplaceacalculationrequestsindifferentmemberaccounts {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test0109ATS010AsaEmployerplaceacalculationrequestsindifferentmemberaccounts() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    driver.get("http://clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("cEmp");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_formcontainer']/table/tbody/tr[2]/td[2]")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("My quotations")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_StartNavigationTemplateContainerID_StartNextButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_AVCFundValue#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_AVCFundValue#1#ALL")).sendKeys("200");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_RetirementCash#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_RetirementCash#1#ALL")).sendKeys("500");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_YTDConts#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_YTDConts#1#ALL")).sendKeys("350");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_YTDGrossEarns#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_YTDGrossEarns#1#ALL")).sendKeys("550");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_FinishNavigationTemplateContainerID_FinishButton")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Change account")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//tr[3]/td[1]/a[2]")).click();
    driver.findElement(By.cssSelector("td.SmallPrintGridsRows")).click();
    driver.findElement(By.linkText("My quotations")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_StartNavigationTemplateContainerID_StartNextButton")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_AVCFundValue#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_AVCFundValue#1#ALL")).sendKeys("150");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_RetirementCash#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_RetirementCash#1#ALL")).sendKeys("250");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_YTDConts#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_YTDConts#1#ALL")).sendKeys("350");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_YTDGrossEarns#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_YTDGrossEarns#1#ALL")).sendKeys("600");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_FinishNavigationTemplateContainerID_FinishButton")).click();
    driver.findElement(By.linkText("Employee search")).click();
    driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SearchResultsGridView']/tbody/tr[5]/td[1]/a")).click();
    driver.findElement(By.linkText("My quotations")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_StartNavigationTemplateContainerID_StartNextButton")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_AVCFundValue#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_AVCFundValue#1#ALL")).sendKeys("150");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_CashOverride#4#ALL")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_ImposeIR#4#ALL")).click();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_RetirementCash#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_RetirementCash#1#ALL")).sendKeys("250");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_YTDConts#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_YTDConts#1#ALL")).sendKeys("350");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_YTDGrossEarns#1#ALL")).clear();
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_YTDGrossEarns#1#ALL")).sendKeys("700");
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_Wizard1_FinishNavigationTemplateContainerID_FinishButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Thank you for using our automated quotation service\\. We’re preparing your quotation now\\. Please visit the Quotation History page after several minutes to find your quotation\\. [\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Employee search")).click();
    driver.findElement(By.xpath("//table[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_SearchResultsGridView']/tbody/tr[3]/td[1]/a")).click();
    driver.findElement(By.linkText("My quotations")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*View[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_linkOldCalc")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Ill Health Retirement[\\s\\S]*$"));
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
