package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATS002Verifyappropriateerrormessageisdisplayedwhennodataisavailableforfiltercriteria {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test10020ATS002Verifyappropriateerrormessageisdisplayedwhennodataisavailableforfiltercriteria() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
	  driver.get("http://Clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("02.08.08");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    //driver.findElement(By.linkText("Select")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/span/a")).click();
    driver.findElement(By.linkText("What pension did I receive in the last year?")).click();
    Thread.sleep(1000);
    try {
        assertFalse(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Tax year ending[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
     }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_dvInfoOnP60.1.1 | ]]
    try {
        assertFalse(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*5th April 2018[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
     }
    try {
        assertFalse(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Employer name[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
     }
    try {
        assertFalse(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*02.08Empolyer[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
     }
    try {
        assertFalse(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Employer PAYE reference[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
     }
    try {
        assertFalse(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*123 / 123456[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
     }
    try {
        assertFalse(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Payroll reference[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
     }
    try {
        assertFalse(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*02.08.08[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
     }
    try {
        assertFalse(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Final tax code/basis[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
     }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*This employment[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Previous employment[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Total for year[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Pay or pension[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Tax deducted[\\s\\S]*$"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_fvInfoOnP60Tax']/tbody/tr[2]/td[2]")).getText(), "£0.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_fvInfoOnP60Tax']/tbody/tr[2]/td[3]")).getText(), "£0.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
   
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_fvInfoOnP60Tax']/tbody/tr[3]/td[2]")).getText(), "£0.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_fvInfoOnP60Tax']/tbody/tr[3]/td[3]")).getText(), "£0.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_fvInfoOnP60Tax']/tbody/tr[4]/td[2]")).getText(), "£0.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//table[@id='ctl01_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_fvInfoOnP60Tax']/tbody/tr[4]/td[3]")).getText(), "£0.00");
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
