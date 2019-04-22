package com.stta.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageReport {

            WebDriver driver;
            @FindBy(xpath="//input[@value='New Report...']")
            WebElement newReport;
            

            @FindBy(id="quickFindInput")
            WebElement reportTypeInput;
            
            @FindBy(xpath="//ul[@id='ext-gen10']/div/li[5]/ul/li/div/a/span")
            WebElement campReportName;
               
            @FindBy(id="thePage:rtForm:createButton")
            WebElement createReportbtn;
            
            @FindBy(id="extdd-153")
            WebElement CampHierarStats;
            
            @FindBy(id="extdd-156")
            WebElement TotalRespInHierar;
            
            @FindBy(id="extdd-159")
            WebElement TotalLeadsInHierar;
            
            @FindBy(id="extdd-162")
            WebElement TotalConvertdLeadsInHierar;
            
            @FindBy(id="extdd-165")
            WebElement TotalContactsInHierar;
            
            @FindBy(id="extdd-168")
            WebElement TotalOppsInHierar;
            
            @FindBy(id="extdd-171")
            WebElement TotalWonOppsInHierar;
            
            @FindBy(id="extdd-174")
            WebElement TotalValueWonOppInHierar;
            
            @FindBy(id="extdd-180")
            WebElement TotalValueOppInHierar;
            
            @FindBy(id="extdd-186")
            WebElement TotalNumSentInHierar;
            
            @FindBy(id="extdd-189")
            WebElement TotalExpRevInHierar;
            
            @FindBy(id="extdd-195")
            WebElement TotalBudgCstInHierar;
            
            @FindBy(id="extdd-201")
            WebElement TotalActlCstInHierar;
            
            public PageReport(WebDriver driver){
                        this.driver = driver;
                        //This initElements method will create  all WebElements
                        PageFactory.initElements(driver, this);
            }

			public String getCampHierarStats() {
				WebDriverWait wait = new WebDriverWait(driver,40);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("extdd-153")));
				return CampHierarStats.getText();
			}

			public String getTotalRespInHierar() {
				return TotalRespInHierar.getText();
			}

			public String getTotalLeadsInHierar() {
				return TotalLeadsInHierar.getText();
			}

			public String getTotalConvertdLeadsInHierar() {
				return TotalConvertdLeadsInHierar.getText();
			}

			public String getTotalContactsInHierar() {
				return TotalContactsInHierar.getText();
			}

			public String getTotalOppsInHierar() {
				return TotalOppsInHierar.getText();
			}

			public String getTotalWonOppsInHierar() {
				return TotalWonOppsInHierar.getText();
			}

			public String getTotalValueWonOppInHierar() {
				return TotalValueWonOppInHierar.getText();
			}

			public String getTotalValueOppInHierar() {
				return TotalValueOppInHierar.getText();
			}

			public String getTotalNumSentInHierar() {
				return TotalNumSentInHierar.getText();
			}

			public String getTotalExpRevInHierar() {
				return TotalExpRevInHierar.getText();
			}

			public String getTotalBudgCstInHierar() {
				return TotalBudgCstInHierar.getText();
			}

			public String getTotalActlCstInHierar() {
				return TotalActlCstInHierar.getText();
			}

			public void createNewReport() {
				newReport.click();;
			}

			public void setReportTypeInput(String strreportTypeInput) {
				WebDriverWait wait = new WebDriverWait(driver,40);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("quickFindInput")));
				reportTypeInput.sendKeys(strreportTypeInput);;
			}

			public void selCampReportName() {
				
				WebDriverWait wait = new WebDriverWait(driver,40);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ext-gen10']/div/li[5]/ul/li/div/a/span")));
				
				campReportName.click();
			}

			public void clickCreateReportbtn() {
				WebDriverWait wait = new WebDriverWait(driver,40);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("thePage:rtForm:createButton")));
				createReportbtn.click();
			}
            
         
                        
}
