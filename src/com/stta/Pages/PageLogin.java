package com.stta.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageLogin
{
	WebDriver driver;

	@FindBy(xpath="//input[contains(@id,'UserNameTextBox')]") WebElement txtUsername;
	@FindBy(xpath="//input[contains(@id,'PasswordTextBox')]") WebElement txtpassword;
	@FindBy(id="LoginButton") WebElement btnlogin;
	@FindBy(id="ctl00_ContentPlaceHolder_LoginButton") WebElement btnMemberlogin;
	
	public PageLogin(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);		//This initElements method will create  all WebElements
	}
	
	//Set user name in textbox
	public void setUserName(String strUserName)
	{
		txtUsername.sendKeys(strUserName);
	}
	
	//Set password in password textbox
	public void setPassword(String strPassword)
	{
		txtpassword.sendKeys(strPassword);
	}
	
	//Click on login button
	public void clickLogin()
	{
		btnlogin.click();
	}

	public void clickLoginMember()
	{
		btnMemberlogin.click();
	}
	
	/**
	 * This POM method will be exposed in test case to login in the application
	 * @param strUserName
	 * @param strPasword
	 * @return
	 */
	public void loginToSalesForce(String strUserName,String strPasword)
	{
		System.out.println("Inside PageLogin1");
		this.setUserName(strUserName);
		System.out.println("Inside PageLogin2");
		this.setPassword(strPasword);
		System.out.println("Inside PageLogin3");
		this.clickLogin();
//		/*if(driver.findElement(By.id("LoginButton")).equals(null)){
//			WebElement BtnLogin=driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton"));
//			
//			BtnLogin.click();                                             
//		}
//		
//		else{
//			if(driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).equals(null)){
//				WebElement BtnLogin=driver.findElement(By.id("LoginButton"));
//				BtnLogin.click();
//			}
//		}*/
		
		System.out.println("Inside PageLogin4");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void loginToMember(String strUserName,String strPasword)
	{
		System.out.println("Inside PageLogin1");
		this.setUserName(strUserName);
		System.out.println("Inside PageLogin2");
		this.setPassword(strPasword);
		System.out.println("Inside PageLogin3");
		this.clickLoginMember();
//		/*if(driver.findElement(By.id("LoginButton")).equals(null)){
//			WebElement BtnLogin=driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton"));
//			
//			BtnLogin.click();                                             
//		}
//		
//		else{
//			if(driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).equals(null)){
//				WebElement BtnLogin=driver.findElement(By.id("LoginButton"));
//				BtnLogin.click();
//			}
//		}*/
		
		System.out.println("Inside PageLogin4");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
