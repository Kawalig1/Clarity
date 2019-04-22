package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1037VerifyingWhatIpaidpageformemberformemberwithonebenefitsanduserisactive {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://change-this-to-the-site-you-are-testing/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testREGPH1037VerifyingWhatIpaidpageformemberformemberwithonebenefitsanduserisactive() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Author : Harish , Date : 15/07/2008
    // verifing if the 'What have I Paid' page displayess the data from the database correctly
    driver.get("http://clarity/pages/static/login.aspx");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("".equals(driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    // LOgin as member with Member With only Employer contribution
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("dynamic03");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    driver.findElement(By.xpath("//a[2]")).click();
    driver.findElement(By.linkText("What have I paid so far?")).click();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate")).sendKeys("01/01/1997");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_goButton")).click();
    driver.findElement(By.cssSelector("td.dxgv > img")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXMainTable.1.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXMainTable.1.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXMainTable.1.3 | ]]
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_col0']/table/tbody/tr/td[1]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_col0']/table/tbody/tr/td[1]")).getText(), "Amount paid");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_col1']/table/tbody/tr/td[1]")).getText(), "Fund");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_col2']")).getText(), "Unit price");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_col3']/table/tbody/tr/td[1]")).getText(), "Units bought");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_DXDataRow0']/td[1]")).getText(), "£4,870.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_DXDataRow0']/td[2]")).getText(), "Web Managed Fund");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_DXDataRow0']/td[3]")).getText(), "£2.1200");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_DXDataRow0']/td[4]")).getText(), "2286.3848");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXMainTable.3.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXMainTable.3.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXMainTable.3.3 | ]]
    driver.findElement(By.cssSelector("#ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXDataRow1 > td.dxgv > img")).click();
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_col0']/table/tbody/tr/td[1]")).getText(), "Amount paid");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_col1']/table/tbody/tr/td[1]")).getText(), "Fund");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_col2']/table/tbody/tr/td[1]")).getText(), "Unit price");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_col3']/table/tbody/tr/td[1]")).getText(), "Units bought");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_DXDataRow0']/td[1]")).getText(), "£45,875.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_DXDataRow0']/td[2]")).getText(), "Web Managed Fund");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_DXDataRow0']/td[3]")).getText(), "£2.1200");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_DXDataRow0']/td[4]")).getText(), "21537.5589");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.id("ctl00_ContentPlaceHolder_UserNameTextBox"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("dynamic05");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    // verifing if the 'How much is my account worth' page displays the data from the database correctly
    driver.findElement(By.xpath("//a[2]")).click();
    driver.findElement(By.linkText("What have I paid so far?")).click();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_StartDate")).sendKeys("29/07/1900");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_goButton")).click();
    driver.findElement(By.cssSelector("td.dxgv > img")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*xpath=\\.//[\\s\\S]*\\[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXDataRow0'\\]/td\\[2\\][\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*xpath=\\.//[\\s\\S]*\\[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXDataRow0'\\]/td\\[3\\][\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*xpath=\\.//[\\s\\S]*\\[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXDataRow0'\\]/td\\[4\\][\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*xpath=\\.//[\\s\\S]*\\[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_col0'\\]/table/tbody/tr/td\\[1\\][\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*xpath=\\.//[\\s\\S]*\\[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_col1'\\]/table/tbody/tr/td\\[1\\][\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*xpath=\\.//[\\s\\S]*\\[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_col2'\\]/table/tbody/tr/td\\[1\\][\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*xpath=\\.//[\\s\\S]*\\[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_col3'\\]/table/tbody/tr/td\\[1\\][\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_DXMainTable.1.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_DXMainTable.1.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_DXMainTable.1.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_DXMainTable.1.3 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_DXMainTable.2.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_DXMainTable.2.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_DXMainTable.2.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_DXMainTable.2.3 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_DXMainTable.3.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_DXMainTable.3.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_DXMainTable.3.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt0_detailGrid_DXMainTable.3.3 | ]]
    driver.findElement(By.cssSelector("#ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXDataRow1 > td.dxgv > img")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("#ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXDataRow1 > td.dxgv > img"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXMainTable.3.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXMainTable.3.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_DXMainTable.3.3 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_DXMainTable.1.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_DXMainTable.1.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_DXMainTable.1.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_DXMainTable.1.3 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_DXMainTable.2.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_DXMainTable.2.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_DXMainTable.2.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_DXMainTable.2.3 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_DXMainTable.3.0 | ]]
    try {
      assertEquals(driver.findElement(By.xpath("//tr[@id='ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_DXDataRow2']/td[2]")).getText(), "Managed fund");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_DXMainTable.3.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_grid_dxdt1_detailGrid_DXMainTable.3.3 | ]]
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
