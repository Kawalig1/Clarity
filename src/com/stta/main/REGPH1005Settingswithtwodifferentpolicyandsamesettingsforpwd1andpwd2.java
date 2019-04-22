package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1005Settingswithtwodifferentpolicyandsamesettingsforpwd1andpwd2 {
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
  public void testREGPH1005Settingswithtwodifferentpolicyandsamesettingsforpwd1andpwd2() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Update the existing password policy for password1 and password2. Verify system updates the message accordingly
    // CreatedDate: 14/05/2008 Prepared By: Mohmed Yusoof
    // User logged into Admin Site
    driver.get("http://clarityAdmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // User trying to create a password policy Testing01 with all criteria checked.
    driver.findElement(By.id("ctl00_MenuTreeViewn5")).click();
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel")).click();
    driver.findElement(By.linkText("New")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView_txtPasswordPolicyNameValue")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView_txtPasswordPolicyNameValue")).sendKeys("Testing03");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    if (!driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView_ctl07")).isSelected()) {
      driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView_ctl07")).click();
    };
    driver.findElement(By.linkText("Insert")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView.0.1 | ]]
    // User trying to create Password policyTesting 02
    driver.findElement(By.linkText("New")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView_txtPasswordPolicyNameValue")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView_txtPasswordPolicyNameValue")).sendKeys("Testing04");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    if (!driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView_ctl07")).isSelected()) {
      driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView_ctl07")).click();
    };
    driver.findElement(By.linkText("Insert")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView.0.1 | ]]
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel")).click();
    driver.findElement(By.linkText("Edit")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel_SettingsDetailsView.0.1 | ]]
    // User trying to set password policy for both password1 and password2
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel_SettingsDetailsView_drpSettingsPassword1Policy"))).selectByVisibleText("Testing03");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel_SettingsDetailsView_drpSettingsPassword2Policy"))).selectByVisibleText("Testing04");
    driver.findElement(By.linkText("Update")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel")).click();
    // User trying to log into Member site with User test02
    driver.get("http://clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("test01");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    driver.findElement(By.xpath("//a[2]")).click();
    driver.findElement(By.linkText("Change password")).click();
    // Defect No: 68 User trying to change password which does not matches password policy
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_ChangePassword1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_ChangePassword1_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_ChangePassword1_NewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_ChangePassword1_NewPasswordTextBox")).sendKeys("password1");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_ChangePassword1_ConfirmNewPasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_ChangePassword1_ConfirmNewPasswordTextBox")).sendKeys("password1");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_ChangePassword1_ChangePasswordButton")).click();
    // Defect No: 67 System displays appropriate message
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or new password is invalid\\. Your new password should contain symbols, 10 to 12 characters \\(inclusive\\); and it should be different from your previous password\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Change memorable word")).click();
    // User trying to change passphrase which does not matches password policy
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).sendKeys("password1");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).sendKeys("password1");
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_ChangeMemorableWord1_ResetButton")).click();
    // System displays appropriate message
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or new memorable word is invalid\\. Your new memorable word should contain symbols, 8 to 10 characters \\(inclusive\\)\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Logout")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("test01");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_lnkForgotPassword")).click();
    // Reset Testing01 and Testing02 password policy.
    driver.get("http://clarityAdmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // User trying to update Testing03 policy
    driver.findElement(By.id("ctl00_MenuTreeViewn5")).click();
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_drpPasswordPolicy"))).selectByVisibleText("Testing03");
    // Warning: waitForTextPresent may require manual changes
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Edit[\\s\\S]*$")) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[2]")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.linkText("Update")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView.0.1 | ]]
    // User trying to update Testing04 policy
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_drpPasswordPolicy"))).selectByVisibleText("Testing04");
    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[2]")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.linkText("Update")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView.0.1 | ]]
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel")).click();
    driver.findElement(By.linkText("Edit")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel_SettingsDetailsView.0.1 | ]]
    // User trying to set password policy for both password1 and password2
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel_SettingsDetailsView_drpSettingsPassword1Policy"))).selectByVisibleText("Testing03");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel_SettingsDetailsView_drpSettingsPassword2Policy"))).selectByVisibleText("Testing04");
    driver.findElement(By.linkText("Update")).click();
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
