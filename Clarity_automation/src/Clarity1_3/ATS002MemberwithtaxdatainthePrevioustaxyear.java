package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATS002MemberwithtaxdatainthePrevioustaxyear {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test0202ATS002MemberwithtaxdatainthePrevioustaxyear() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    driver.get("http://clarity/Pages/Static/Login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("02.08.39");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    Thread.sleep(1000);
  //driver.findElement(By.linkText("Select")).click();
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/span/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("What pension did I receive in the last year?")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*What pension did I receive in the last year[\\s\\S][\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*The information on this page will give you immediate access to the details normally provided in a document known as a P60\\. This page does not replace the P60 the payroll team will send you\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_dvInfoOnP60.0.0 | ]]
    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Tax year ending[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_dvInfoOnP60.0.1 | ]]
    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*5th April 2018[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_dvInfoOnP60.1.0 | ]]
    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Employer name[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_dvInfoOnP60.1.1 | ]]
    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*02.08Empolyer[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_dvInfoOnP60.2.0 | ]]
    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Employer PAYE reference[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_dvInfoOnP60.2.1 | ]]
    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Payroll reference[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*123 / 123456[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_dvInfoOnP60.3.0 | ]]
    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*02.08.39[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_dvInfoOnP60']/tbody/tr[5]/td[1]")).getText(), "Final tax code/basis");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_dvInfoOnP60.4.1 | ]]
    try {
      assertEquals(driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_fvInfoOnP60Tax_payLabel")).getText(), "Pay or pension");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_fvInfoOnP60Tax']/tbody/tr[1]/td[3]")).getText(), "Tax deducted");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_fvInfoOnP60Tax_thisEmploymentLabel")).getText(), "This employment");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_fvInfoOnP60Tax']/tbody/tr[2]/td[2]")).getText(), "£1,076.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_fvInfoOnP60Tax']/tbody/tr[2]/td[3]")).getText(), "£1,117.00 R");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Â£124.00".equals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_fvInfoOnP60Tax']/tbody/tr[3]/td[2]")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_fvInfoOnP60Tax']/tbody/tr[3]/td[3]")).getText(), "£1,241.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.id("ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_fvInfoOnP60Tax_grossToDateTotalLabel")).getText(), "£1,200.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_fvInfoOnP60Tax']/tbody/tr[4]/td[3]")).getText(), "£124.00");
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
