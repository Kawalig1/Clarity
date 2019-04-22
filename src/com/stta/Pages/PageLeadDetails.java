package com.stta.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLeadDetails {

	
	
            WebDriver driver;
            @FindBy(className="pageDescription")
            WebElement LeadName;
                
            @FindBy(name="new")
            WebElement btnNew;
            
            @FindBy(name="edit")
            WebElement btnEdit;
            
            @FindBy(xpath="//span[@id='showFeedLink']/a/span")
            WebElement showFeed;
            
         //@FindBy(xpath="//div[starts-with(@id,'0D57E000006')]/div/div/div/div/span/span[2]")
            
            @FindBy(className= "feedTrackedChangePreambleMessage")
             WebElement lblstatusChanMessage;
                                  
            
            @FindBy(id="lookupa2Nm0000000L8gq00Nw0000003PEsn")
            WebElement lbl_organisation;
            
            @FindBy(id="lookupa2Lm0000000H3QM00Nw0000003PEsf")
            WebElement lbl_Geography;
            
            @FindBy(id ="00Nw0000008CtHV_ileinner")
            WebElement lbl_Timeframe;
            
           @FindBy(id="00Nw0000008CtHP_ileinner")
             WebElement lbl_authStatus;
            
            @FindBy(id="00Nw0000008CtHS_ileinner")
            WebElement chk_pep_status;
            
            @FindBy(id="lea16_ileinner")
            WebElement chk_billing_country;
            
            @FindBy(id="lea27_chkbox")
            WebElement chk_do_not_call;
            
            @FindBy(id="lea22_chkbox")
            WebElement chk_email_opt_out;

            @FindBy(id="lea28_chkbox")
            WebElement chk_fax_opt_out;            

            @FindBy(id="00Nw0000003PEsc_chkbox")
            WebElement chk_direct_email_out;
            
            @FindBy(id="00Nw0000003PEsr_chkbox")
            WebElement chk_sms_opt_out;
                        
            @FindBy(name="convert")
            WebElement convertbtn1;
            
           // @FindBy(id="j_id0:leadForm:leadBlock:leadSection:j_id6:j_id7:j_id8:j_id9:0:j_id10:j_id11:j_id13")
            //WebElement converterror;
            
            @FindBy(name="save")
            WebElement convertbtn2;
            
            @FindBy(id="accid")
            WebElement selectaccnt;
            
            @FindBy(xpath="//tr[5]/td[2]/div/div[2]")
            WebElement converterror2;
            
            
            
            @FindBy(name="add_competitor_leads")
            WebElement addBrokerBtn;
            
            @FindBy(name="j_id0:j_id5:pgBlk:j_id37:0:j_id39")
            WebElement competitor;
            
            
            @FindBy(xpath="//div[@id='j_id0:j_id5:pgBlk:j_id37:0:j_id39_autoCompleteRowId_0']/strong")
            WebElement selCompetitor;
            
            @FindBy(name="j_id0:j_id5:pgBlk:j_id37:0:j_id50")
            WebElement compComments;
            
            @FindBy(name="j_id0:j_id5:pgBlk:j_id33:j_id34")
            WebElement saveCompititor;
            
            @FindBy(xpath="//div[contains(@id,'_00Nw0000008cp4b_body')]/table/tbody/tr[2]/th/a")
            WebElement compOnRelLst;
                                 
            @FindBy(xpath="//div[contains(@id,'_00Nw0000008cp4b_body')]/table/tbody/tr[2]/td[2]")
            WebElement compRoleOnRelLst;
            
            @FindBy(xpath="//div[contains(@id,'_00Nw0000008cp4b_body')]/table/tbody/tr[2]/td[6]")
            WebElement compComntsOnRelLst;
            
            
                                
            
            public PageLeadDetails(WebDriver driver){
                        this.driver = driver;
                        //This initElements method will create  all WebElements
                        PageFactory.initElements(driver, this);
            }
            
            //Get the User name from Home Page
                        public String getleadName()
                        {
                                    try {
                                                return LeadName.getText();
                                                }
                                    catch(Throwable t)
                                                {
                                                //If element not found on page then It will return null.
                                                System.out.println("Object not found for custom Lead Name on Lead Details Page");
                                                return null;
                                                }
                        }
                        
            public void edit_click()
            
            
            {
                        btnEdit.click();
                        
            }
            
         
            
            public String get_status_change_confirm()
            
            {
            	
            	String lblmsg = null;
            	
            	if (showFeed.isDisplayed()) 
                 {
            		showFeed.click();   
            		
		       		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);        	
		       		lblmsg= lblstatusChanMessage.getText();
            		          		
                 }
            	
            	else 
            	{
            	
            		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
            		lblmsg= lblstatusChanMessage.getText();
            		          		
            		
            	}
            	
            	return lblmsg;
            }
            public String get_Organisation()
            
            {
                        return lbl_organisation.getText();
            }
            
            public String get_Geography()
            
            {
                        return lbl_Geography.getText();
                        
            }
            
            public String get_LeadAuthStatus()
            
            {
                        return lbl_authStatus.getText();
            }
            
            
            public String get_PEPsFound()
            
            {
                        if (chk_pep_status.getText().equals("") )
                        
                        {
                                    return ("PEP Not Found");
                                    
                        }
                        
                        else
                        {
                                    return chk_pep_status.getText();
                                    
                        }
            }
            
            
            public String get_Timeframe()
            
            {
                        
                        return lbl_Timeframe.getText();
            }
            
            
            
            public String get_BillingCountry()
            
            {
                        
                        return chk_billing_country.getText();
            }

			
			public String getChk_do_not_call() 
			{
				return chk_do_not_call.getAttribute("title");
			}

			public String getChk_email_opt_out() {
				return chk_email_opt_out.getAttribute("title");
			}

			public String getChk_fax_opt_out() {
				return chk_fax_opt_out.getAttribute("title");
			}

			public String getChk_direct_email_out() {
				return chk_direct_email_out.getAttribute("title");
			}

			public String getChk_sms_opt_out() {
				return chk_sms_opt_out.getAttribute("title");
			}

			public String getConverterror() {
				
				if (driver.findElements(By.xpath("//tr[5]/td[2]/div/div[2]")).size() != 0)
				{
				return converterror2.getText();
				}
				
				else
					
				{
					return "No errror msg";
				}
			}
			
		//	public String getConverterror2() 
		//	{return converterror2.getText();}

			public void clickConvertbtn1() {
				convertbtn1.click();
				}
                        
			public void clickConvertbtn2() {
				convertbtn2.click();;
			}
			
			
			  public void setaccnt(String straccnt)
              {
                     Select dropdown = new Select (selectaccnt) ;
                     
                     dropdown.selectByVisibleText(straccnt);                                        
                     
              }

			public void clickAddBrokerBtn() 
			{
				addBrokerBtn.click();
			}

			public void setCompetitor(String strcompetitor)
			{
				WebDriverWait wait = new WebDriverWait(driver,40);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("j_id0:j_id5:pgBlk:j_id37:0:j_id39")));
				competitor.sendKeys(strcompetitor);
				//selCompetitor.click();
				
				Boolean isPresent = driver.findElements(By.xpath("//div[@id='j_id0:j_id5:pgBlk:j_id37:0:j_id39_autoCompleteRowId_0']/strong")).size() > 0;
				System.out.println("isPresent:"+isPresent);
				if(isPresent==false)
				{
				System.out.println("Inside if1");
				
				}
				else if(isPresent==true) 
				{
					System.out.println("Inside else1");
					
					selCompetitor.click();
				}
				//competitor.sendKeys(strcompetitor);
			}

			

			public void setCompComments(String strcompComments)
			{
				compComments.sendKeys(strcompComments);
			}

			public void setSaveCompititor()
			{
				saveCompititor.click();
			}

			public String getCompOnRelLst() {
				WebDriverWait wait = new WebDriverWait(driver,40);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_00Nw0000008cp4b_body')]/table/tbody/tr[2]/th/a")));
				
				return compOnRelLst.getText();
			}

			public String getCompRoleOnRelLst() {
				return compRoleOnRelLst.getText();
			}

			public String getCompComntsOnRelLst() {
				return compComntsOnRelLst.getText();
			}

			public void showFeed_click() {
				// TODO Auto-generated method stub
				
				if (driver.findElements(By.xpath("//span[@id='showFeedLink']/a/span")).size() != 0)
				{
				showFeed.click();
				}
				
				
			}

			 public void clickonNewlead(){
                 btnNew.click();
                 }
			  		

			  
            }
            
            
                        
                        
