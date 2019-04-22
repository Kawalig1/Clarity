package com.stta.Pages;
//import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageEditAccount {

	WebDriver driver;
	
	@FindBy(name="save")
	public WebElement accntSaveButton;
	
	@FindBy(xpath="(//input[@name='edit'])[2]")
	WebElement accntEditButton;
	
	@FindBy(xpath = "//input[@name='edit']")
	public WebElement atulEditButton;
	
	@FindBy(xpath="//input[@name='save_new']")
	WebElement accntSaveAndNewButton;
	
	@FindBy(xpath="//input[@name='cancel']")
	WebElement accntCancelButton;
		
	@FindBy(xpath="//div[@id='head_1_ep']/h3]")
	WebElement accntInfoSection;
	
	@FindBy(id="acc2")
	public WebElement accntEditName;
	
	@FindBy(id="acc2_ileinner")
	WebElement accntInlineName;
	
	@FindBy(id="acc23")
	WebElement accntEditSite;
	
	@FindBy(id="//div[@id='ep']/div[2]/div[3]/table/tbody/tr/td[4]")
	WebElement accntEditStatus;
	
	@FindBy(xpath="//div[@id='00Nw0000003PEry_ileinner']")
	WebElement accntInlineStatus;

	@FindBy(id="acc10")
	WebElement accntEditPhone;
	

	@FindBy(id="acc11")
	WebElement accntEditFax;
	

	@FindBy(id="acc12")
	WebElement accntEditWebsite;
	

	@FindBy(id="acc24")
	WebElement accntEditCurrency;
	
	@FindBy(id="acc3")
	WebElement accntEditParentaccnt;
	
	@FindBy(id="00Nw0000008CtEq")
	WebElement accntEditShortName;
	
	@FindBy(id="00N20000003NLqm")
	WebElement accntEditTradeAs;
	
	@FindBy(id="00Nw0000008CtE7")
	WebElement accntEditAnonyEntity;
	
	@FindBy(xpath="//div[@id='head_2_ep']/h3")
	WebElement accntAddressSection;
	
	@FindBy(id="00Nw0000003PErv")
	public WebElement accntEditCopyAddrs;
	
	@FindBy(id="acc18country")
	WebElement accntEditCorrsCountry;
	
	@FindBy(id="acc18street")
	WebElement accntEditCorrsStreet;
	
	@FindBy(id="acc18city")
	WebElement accntEditCorrsCity;
	
	
	@FindBy(id="acc18state")
	WebElement accntEditCorrsState;
	
	@FindBy(id="acc18zip")
	WebElement accntEditCorrsZip;
	
	@FindBy(id="acc18_ilecell")
	WebElement accntInlineCorrAddrs;
	
	
	@FindBy(id="CF00Nw0000007JBlA")
	WebElement accntEditRegOffice;
	

	@FindBy(id="00Nw0000007JBl9_ileinner")
	WebElement accntInlineRegAddrs;
	
	@FindBy(id="00Nw0000008CtE6")
	WebElement accntEditAddrsSync;
	
	@FindBy(id="acc17country")	
	WebElement accntEditBillCountry;
	
	@FindBy(id="acc17street")
	WebElement accntEditBillStreet;
	
	@FindBy(id="acc17city")
	WebElement accntEditBillCity;
		
	@FindBy(id="acc17state")
	WebElement accntEditBillState;
	
	@FindBy(id="acc17zip")
	WebElement accntEditBillZip;
	
	@FindBy(id="acc17_ileinner")
	WebElement accntInlineBillAddrs;
	
	@FindBy(xpath="//div[@id='head_3_ep']/h3")
	WebElement accntApprovalSection;
	
	@FindBy(id="//div[@id='ep']/div[2]/div[7]/table/tbody/tr/td[2]")
	WebElement accntEditAuthStatus;
	
	/*@FindBy(id="00Nw0000008CtEf")
	WebElement accntEditPEP;*/
	
	@FindBy(xpath="//div[@id='head_1_ep']/h3]")
	WebElement accntProfileSection;
	
	//@FindBy(id="acc7")
	//WebElement accntEditIndustry;
	
	@FindBy(id="00Nw0000008CtEV")
	WebElement accntEditJVClient;
	
	@FindBy(id="00Nw0000003PaNL")
	WebElement accntEditInsurer;
	
	@FindBy(id="00Nw0000003PaNL_chkbox")
	WebElement accntInlineInsurer;
	
	@FindBy(id="acc8")
	WebElement accntEditAnualRev;
	
	@FindBy(id="acc8_ileinner")
	WebElement accntInlineAnualRev;
	
	@FindBy(id="acc15")
	WebElement accntEditNoOfEmp;
	
	@FindBy(id="acc15_ileinner")
	WebElement accntInlineNoOfEmp;
		
	@FindBy(id="00Nw0000003PKQ3")
	WebElement accntEditNetAssets;
	
	@FindBy(id="00Nw0000003PKQ3_ileinner")
	WebElement accntInlineNetAssets;
	
	@FindBy(xpath="//div[@id='00Nw0000003PQZ7_ileinner']")
	WebElement accntInlinePolicyHolderType;
	
	@FindBy(id="00Nw0000008CtEa")
	WebElement accntEditNAIC;
	
	@FindBy(xpath="//div[@id='head_5_ep']/h3")
	WebElement accntDescSection;
	
	@FindBy(id="acc20")
	WebElement accntEditDesc;
	

	@FindBy(xpath="//div[@id='head_6_ep']/h3")
	WebElement accntApprovalInfoSection;

	@FindBy(id="00Nw0000003PaNN")
	WebElement accntBlock;
	
	@FindBy(id="00Nw0000008CtEA")
	WebElement accntEditCsdTrade;
	
		
	@FindBy(id="//div[@id='ep']/div[2]/div[13]/table/tbody/tr[3]/td[2]")
	WebElement accntEditCsdTradeAuditDate;
	
	@FindBy(xpath="//div[@id='00Nw0000008CtE9_ileinner']")
	WebElement accntInlineCsdTradeAuditDate;
	
	@FindBy(id="00Nw0000008CtEN")
	WebElement accntEditFATCA;
	
	@FindBy(id="00Nw0000008CtEO")
	WebElement accntEditFATCAExpiry;
	/*
	@FindBy(xpath="//div[@id='head_7_ep']/h3")
	WebElement accntNameUpdateSection;
	
	@FindBy(id="00Nw0000008CtEd")
	public WebElement accntEditNameChange;
		
	
	@FindBy(id="00Nw0000008CtEe")
	public WebElement accntEditNameCorrection;
	
	@FindBy(id="00Nw0000008CtEb")
	WebElement accntEditNameChangeDate;
	
	@FindBy(xpath="//div[15]/table/tbody/tr[3]/td[2]")
	WebElement accntEditPrevName;
	
	@FindBy(id="00Nw0000008CtEh_ileinner")
	WebElement accntInlinePrevName;
	
	@FindBy(id="//div[15]/table/tbody/tr[3]/td[4]")
	WebElement accntEditNameChangeEffecDate;
	*/
	
	@FindBy(xpath="//div[@id='head_8_ep']/h3")
	WebElement accntSystemInfoSection;
	
	@FindBy(id="//span[@id='j_id0:j_id2']/div/span")
	WebElement accntHierarchy;
	
	@FindBy(id="RecordType_ileinner")
	WebElement recordType;
	
	@FindBy(xpath="//td[@id='bodyCell']/div/div/div/h1")
	WebElement saveAccountType;
	
	@FindBy(xpath="//td[@id='bodyCell']/div/div/div/h2")
	WebElement saveAccountName;

	@FindBy(xpath="//div[@id='errorDiv_ep']")
	WebElement accntSaveError;
	
	// person account
	
	@FindBy(xpath="//div[@id='ep']/div[2]/div[3]/table/tbody/tr/td[2]/div")
	WebElement PersonFNameSaveError;
	
	@FindBy(xpath="//div[@id='ep']/div[2]/div[3]/table/tbody/tr[2]/td[2]/div/div[2]")
	WebElement PersonLNameSaveError;
	
	//person acc ends
	
	@FindBy(xpath="//div[@id='ep']/div[2]/div[5]/table/tbody/tr[4]/td[2]/div")
	WebElement accntCorrStreetError;
	
		
	@FindBy(xpath="//div[@id='ep']/div[2]/div[5]/table/tbody/tr[5]/td[2]/div")
	WebElement accntCorrCityError;
	
	@FindBy(xpath="//div[@id='ep']/div[2]/div[5]/table/tbody/tr[4]/td[4]/div")
	WebElement accntBillStreetError;
	
	@FindBy(xpath="//div[@id='ep']/div[2]/div[5]/table/tbody/tr[5]/td[4]/div")
	WebElement accntBillCityError;
	
	
	@FindBy(name="new_contact")
	WebElement accntNewContactBtn;
	
	@FindBy(xpath="//div[contains(@id,'_RelatedContactList_body')]/table/tbody/tr[2]/th/a")
	WebElement contactNameOnRelatedList;
	
    @FindBy(xpath="//div[contains(@id,'_RelatedContactList_body')]/table/tbody/tr[2]/td[2]")
    WebElement contactStatusOnRelatedList;
    
    @FindBy(name="newOpp")
    WebElement accntNewOpptyBtn;
    

    @FindBy(xpath="//div[contains(@id,'_RelatedOpportunityList_body')]/table/tbody/tr[2]/th/a")
    WebElement opptytNameOnRelatedList;
    
    @FindBy(xpath="//div[contains(@id,'_RelatedOpportunityList_body')]/table/tbody/tr[2]/td[3]")
    WebElement opptytTypeOnRelatedList;
    
    @FindBy(xpath="//div[contains(@id,'_RelatedOpportunityList_body')]/table/tbody/tr[2]/td[4]")
    WebElement opptytSalesStageOnRelatedList;
    
    @FindBy(name="add")
    WebElement accntNewAccntTeamBtn;
    
    @FindBy(name="cancel")
    WebElement accntTeamCancelBtn;
    
    @FindBy(id="td0_4")
    WebElement accntTeamRole;
    
    @FindBy(name="newRole")
    WebElement accntNewContRoleBtn;
    
    @FindBy(id="Contact")
    WebElement accntContForContRole;
    
    
    @FindBy(xpath="//div[@id='Contact_autoCompleteRowId_0']/strong")
    WebElement accntContForContRoleSel;
    
    
    @FindBy(id="Role")
    WebElement accntContRole;
    
    @FindBy(id="IsPrimary")
    WebElement accntContRolePrimaryCheck;
    
  
    @FindBy(name="save")
    WebElement accntContRoleSaveBtn;
    
    @FindBy(xpath="//div[contains(@id,'_RelatedAccountContactRoleList_body')]/table/tbody/tr[2]/th/a")
    WebElement accntContNameOnContRoleRL;
    
    @FindBy(xpath="//div[contains(@id,'_RelatedAccountContactRoleList_body')]/table/tbody/tr[2]/td[5]")
    WebElement accntContRoleOnRL;
    
    @FindBy(xpath="//div[contains(@id,'_RelatedAccountContactRoleList_body')]/table/tbody/tr[2]/td[6]/img")
    WebElement accntContRolePrimary;
    
    
	//Person Account fields 
	
	@FindBy(id="name_salutationacc2")
	WebElement accEditSalutation;
	
	@FindBy(id="name_firstacc2")
	WebElement accEditFirstName;
	
	@FindBy(id="name_lastacc2")
	WebElement accEditLastName;
	
	@FindBy(id="PersonTitle")
	WebElement accEditJobTitle;
	
	@FindBy(id="00Nm0000000swin")
	WebElement accEditIndustryPrac;
	
	@FindBy(id="PersonMobilePhone")
	WebElement accEditPersonMobilePhone;
	
	@FindBy(id="PersonEmail")
	WebElement accEditPersonEmail;

	@FindBy(id="00Nw0000008CtEz")
	WebElement optOutPersonAll;	
	
	@FindBy(id="PersonDoNotCall")
	WebElement optOutPersonDNC;
	
	@FindBy(id="PersonHasOptedOutOfEmail")
	WebElement optOutPersonEmail;
	
	@FindBy(id="PersonHasOptedOutOfFax")
	WebElement optOutPersonFax;
	
	@FindBy(id="00Nw0000003PEs6")
	WebElement optOutPersonDirectMail;	
	
	@FindBy(id="00Nw0000003PEs8")
	WebElement optOutPersonSMS;	
	
	@FindBy(id="00N20000001hTiT")
	WebElement OptOutPersonPrefMthd;	
	
	@FindBy(id="00N20000001hTis_unselected")
	WebElement accEditPersonHobbyIntrst;
	
	@FindBy(id="00N200000025wNJ_unselected")
	WebElement accEditPersonSubscrips;
	
	@FindBy(id="PersonLeadSource")
	WebElement accEditPersonLeadSrc;
	
	@FindBy(id="00Nw0000008CtEp")
	WebElement accntEditSalChange;
	
	@FindBy(id="00Nw0000008CtER")
	WebElement accntEditFNameChange;
	
	@FindBy(id="00Nw0000008CtEW")
	WebElement accntEditLNameChange;
	
	//@FindBy(xpath="//div[@id='ep']/div[2]/div[15]/table/tbody/tr[2]/td[2]/div")
	/*@FindBy(css = "div.errorMsg")
	public WebElement accntNameChangeDateErr;*/
	
	
	//Relationship Landscape fields
	
	@FindBy(xpath="//div[contains(@id,'_00Nw0000003PErt_body')]/table/tbody/tr[2]/th/a")
	WebElement accntViewRelationship;
	
	
	@FindBy(xpath="//div[contains(@id,'_00Nw0000003PErt_body')]/table/tbody/tr[2]/td/a")
	WebElement accntEditRelationship;
	
	//div[@id='001m000000NFeCR_00Nw0000003PErt_body']/table/tbody/tr[2]/th/a
		
	@FindBy(xpath="//a[contains(@id,'00Nw0000003PErt')]")
	WebElement accntRelClient;
	
	@FindBy(id="00Nw0000003PEtd_ileinner")
	WebElement accntRelOpptyType;
		
		
	@FindBy(id="00Nw0000003PEtk_ileinner")
	WebElement accntRelStatus;
		
	@FindBy(id="00Nw0000003PEte_ileinner")
	WebElement accntRelCOB;
	
	@FindBy(xpath="//div[contains(@id,'a2P')]/table/tbody/tr[2]/td[2]")
	WebElement accntRelLOB;
	
	@FindBy(xpath="//div[contains(@id,'a2P')]/table/tbody/tr[2]/th/a")
	WebElement accntRelProd;

	@FindBy(id="00Nw0000008oU1a")
	WebElement accntRelAbandCheckbox;
		
	@FindBy(name="save")
	WebElement accntRelSave;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw0000003PErt_body')]/table/tbody/tr[2]/td[8]/img")
	WebElement accntRelAbandValue;
	
	//Aditya
	@FindBy(xpath="//div[contains(@id,'_00Nw0000003PErt_body')]/table/tbody/tr[2]/td[9]/img")
	WebElement accntRelManCreatedValue;
	
	//Aditya
	@FindBy(xpath="//div[contains(@id,'_00Nw0000003PErt_body')]/table/tbody/tr[2]/td[5]")
	WebElement accntRelationshipStatusValue;
	
	//Aditya
	@FindBy(xpath="//div[contains(@id,'_00Nw0000003PKQF_body']/table/tbody/tr[2]/th/a")
	WebElement accntApprovalOrgValue;
	
	//Aditya
	@FindBy(xpath="//div[contains(@id,'_00Nw0000003PKQF_body']/table/tbody/tr[2]/th/a")
	WebElement accntRoleNameValue;
	
	//Member & Mutual Account fields
	
	@FindBy(id="acc6")
	public WebElement mType;
	
	@FindBy(xpath="//div[@id='ep']/div[2]/div[3]/table/tbody/tr[5]/td[2]/div/div[2]")
	public WebElement searchMemberTypeError;
	
	@FindBy(xpath="//div[@id='ep']/div[2]/div[3]/table/tbody/tr/td[2]/div/div[2]")
	public WebElement searchMemberAccNameError;
	
	@FindBy(id="errorDiv_ep")
	public WebElement MemberTopError;
	
	@FindBy(id = "acc18_ileinner")
	public WebElement accntCorrsAddress;
	
	@FindBy(name="add")
	public WebElement accntroleadd;
	
	@FindBy(id = "td0_4")
	public WebElement accntteamrole;
	
	@FindBy(id = "acc7")
	public WebElement accntindustry;
	
	@FindBy(id = "acc7_ileinner")
	public WebElement accntinlineindustry;
	
//	@FindBy(id = "00Nm0000000uzeE")
//	public WebElement accntausregion;
	
	@FindBy(id = "00Nw0000008cwGN")
	public WebElement accntausregion;
	
	@FindBy(name = "new00Nw0000003PEuE")
	public WebElement accntmutualmemb;
	
	@FindBy(name = "new00Nw0000003PEuD")
	public WebElement accntmutualmembmutu;
	
	@FindBy(id = "CF00Nw0000003PEuD")
	public WebElement accntmutualmutuaccnt;
	
	@FindBy(id = "CF00Nw0000003PEuE")
	public WebElement accntmutualmembaccnt;
	
	//@FindBy(xpath = "//a[contains(text(),'Create Regional Risk Manager Event')]")
	//public WebElement accntregriskevent;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw0000003PEuE_body')]/table/tbody/tr[2]/td[6]/a")
	public WebElement accntregriskevent;
	
	@FindBy(css = "#evt5")
	public WebElement accntregriskeventsub;
	
	@FindBy(id = "00Nw0000003PMXE")
	public WebElement accntregriskroletype;
	
	/*@FindBy(id = "00Nw0000003PKQ8")
	public WebElement accntregriskmutname;
	
	@FindBy(id = "00Nw0000003PKQ7")
	public WebElement accntregriskmutid;*/
	
	@FindBy(id = "CF00Nw0000008v2eW")
	public WebElement accntregriskmutaccnt;
	
		
	@FindBy(id = "00Nw0000003PKQ9")
	public WebElement accntregriskprojtype;
	
	@FindBy(id = "reminder_select_check")
	public WebElement accntregriskreminder;
	
	@FindBy(xpath = "//a[contains(text(),'Create Regional Risk Manager Task')]")
	public WebElement accntregrisktask;
	
	@FindBy(css = "#tsk5")
	public WebElement accntregrisktasksub;
	
	@FindBy(name = "new00Nw0000003PKQA")
	public WebElement accntnewriskmgmtprjbtn;
	
	@FindBy(xpath = "//div[contains(@id,'_00Nw0000003PKQA_body')]/table/tbody/tr[2]/th/a")
	public WebElement accntRLRiskMngtCampName;
	
	//Deepali
	@FindBy(xpath = "//td[@id='bodyCell']/div[3]/div/div/div[2]/table/tbody/tr[2]/th/a")
	public WebElement clickRecentRecordLink;
					
	// Aditya
	@FindBy(xpath="//input[@name='new00Nw0000003PErt']")
	WebElement accntNewRelationshipLandscape;
		
	@FindBy(xpath="//input[@name='save']")
	WebElement accntNewRLPageSave;
	
	@FindBy(xpath="//input[@name='cancel']")
	WebElement accntNewRLPageCancel;
	
	@FindBy(id="00Nw0000003PEte")
	WebElement accntNewRLPageCOB;
	
	@FindBy(id="00Nw0000003PEtd")
	WebElement accntNewRLPageOppType;
		
	@FindBy(id="00Nw0000003PaOs")
	WebElement accntNewRLPageExpiryDate;
	
	@FindBy(xpath="//div[@id='errorDiv_ep']")
	WebElement rlSaveError;
	
	@FindBy(xpath="//input[@name='add_account_approval']")
	WebElement addAccntApprovalButton;
	
	@FindBy(xpath = "//select[@name='j_id0:j_id1:pblock:pbTable:0:j_id42']")
	WebElement selectRoleOnAcctApprovalPage;
	
	@FindBy(xpath = "//img[@alt='Organisation Lookup (New Window)']")
	WebElement orgLookUpOnAcctApprovalPage;
	
	@FindBy(xpath = "//input[@id='lksrch']")
	WebElement orgLookUpSearchBox;
	
	@FindBy(xpath = "//input[@id='j_id0:j_id1:pblock:pbTable:0:j_id48']")
	public WebElement clickOrglink;
	
	@FindBy(xpath = "//input[@id='j_id0:j_id1:pblock:pbTable:0:j_id48']")
	public WebElement clickSaveOnAccntApprovalPage;
	
	//Deepali added blank Relationship Landscape element
	@FindBy(xpath = "//div[contains(@id,'_00Nw0000003PErt_body')]/table/tbody/tr/th")
	public WebElement blankRL;
	
	//Account Target 
	
	@FindBy(name = "new00Nw0000009Dp9M")
	public WebElement newAcntTrgtBtn;
		
	@FindBy(id = "CF00Nw0000009Dp9N")
	public WebElement newAcntTrgtCamp;
	
	@FindBy(id = "00Nw0000009Dp9Q")
	public WebElement newAcntTrgtStatusNote;
	
	@FindBy(id = "00Nw0000009Dp9R")
	public WebElement newAcntTrgtStatus;
	
	@FindBy(id = "00Nw0000009Dp9O")
	public WebElement newAcntTrgtPriorityChk;
	
	@FindBy(id = "00Nw0000009Dp9P")
	public WebElement newAcntTrgtRenewalDate;
	
	@FindBy(name = "save")
	public WebElement newAcntTrgtSaveBtn;
	
	@FindBy(xpath = "//td[@id='bodyCell']/div/div/div/h2")
	public WebElement newAcntTrgtSaveName;
	
	@FindBy(xpath = "//div[contains(@id,'_00Nw0000009Dp9M_body')]/table/tbody/tr[2]/th/a")
	public WebElement newAcntTrgtRLId;

	@FindBy(xpath = "//div[contains(@id,'_00Nw0000009Dp9M_body')]/table/tbody/tr[2]/td[2]/a")
	public WebElement newAcntTrgtRLCamp;
	
	@FindBy(xpath="//a[contains(@id,'00Nw0000009Dp9M')]")
	public WebElement newAcntTrgtAccntLnk;
	
	//Deepali added element for multiple Campaign error on Account
    @FindBy(xpath="//div[@id='ep']/div[2]/div[3]/table/tbody/tr[2]/td[2]/div/div[2]")
    WebElement multipleCampErr;
    
    @FindBy(id="CF00Nw0000009Dp9N_lkid")
    WebElement multipleCampDrpDown;
    
    //Opportunity Relationships on Account
    
    @FindBy(xpath="//div[contains(@id,'_00Nw0000003PKQY_body')]/table/tbody/tr[2]/th/a")
    WebElement ORNameOnRelatedList;
    
    
    //Meeting Report related liost on account
    
    @FindBy(name="new00Nw0000009ELBB")
    WebElement accntNewMRBtn;
    
  //Deepali added Current Broker fields
    @FindBy(name="add_current_broker_service_provider")
    WebElement addCurrentBrokerBtn;
    
    @FindBy(id="j_id0:j_id5:pgBlk:j_id76:0:j_id78")
    WebElement competitor;
    
    @FindBy(xpath="//div[@id='j_id0:j_id5:pgBlk:j_id76:0:j_id78_autoCompleteRowId_0']/strong")
    WebElement selCompetitor;
    
    @FindBy(id="j_id0:j_id5:pgBlk:j_id76:0:j_id80")
    WebElement renewalDate;
    
    @FindBy(id="j_id0:j_id5:pgBlk:j_id76:0:j_id82")
    WebElement LOB;
    
    @FindBy(id="j_id0:j_id5:pgBlk:j_id76:0:j_id87")
    WebElement estimatedRev;
    
    @FindBy(id="j_id0:j_id5:pgBlk:j_id76:0:j_id89")
    WebElement compComments;
    
    
    @FindBy(xpath="//div[contains(@id,'_00Nw0000008lyPG_body')]/table/tbody/tr[2]/th/a")
    WebElement compOnRelLst;
                         
    @FindBy(xpath="//div[contains(@id,'_00Nw0000008lyPG_body')]/table/tbody/tr[2]/td[2]")
    WebElement compRoleOnRelLst;
    
    @FindBy(xpath="//div[contains(@id,'_00Nw0000008lyPG_body')]/table/tbody/tr[2]/td[6]")
    WebElement compComntsOnRelLst;

    
    @FindBy(xpath="//div[contains(@id,'_00Nw0000008lyPG_body')]/table/tbody/tr[2]/td[4]")
    WebElement compLobOnRelLst;
    
    @FindBy(xpath="//div[contains(@id,'_00Nw0000008lyPG_body')]/table/tbody/tr[2]/td[5]")
    WebElement compRevOnRelLst;
    
    
    @FindBy(name="j_id0:j_id5:pgBlk:j_id33:j_id34")
    WebElement saveCompititor;
    
    
    //External System Reference Information elements
    
    @FindBy(name="new00Nw0000008cp4c")
    WebElement newExtSysRefBtn;
    
    @FindBy(id="CF00Nw0000008cp4g")
    WebElement extSysOpco;
    
    @FindBy(id="00Nw0000008cp4f")
    WebElement extSysName;
    
    @FindBy(id="Name")
    WebElement extSysUniqueId;
    
    @FindBy(id="00Nw0000008cp4h")
    WebElement extSysOtherInfo;
    
    @FindBy(xpath="//div[@id='CF00Nw0000008cp4c_ileinner']/a")
    WebElement extSysAccntLookup;
    
    @FindBy(xpath="//div[contains(@id,'_00Nw0000008cp4c_body')]/table/tbody/tr[2]/th/a")
    WebElement extSysUniqueIdRL;
    
    @FindBy(xpath="//div[contains(@id,'_00Nw0000008cp4c_body')]/table/tbody/tr[2]/td[2]")
    WebElement extSysNameRL;
    
    @FindBy(xpath="//div[contains(@id,'_00Nw0000008cp4c_body')]/table/tbody/tr[2]/td[3]/a")
    WebElement extSysOpcoRL;
    
    @FindBy(xpath="//div[contains(@id,'_00Nw0000008cp4c_body')]/table/tbody/tr[2]/td[4]")
    WebElement extSysInfoRL;
    
//EB Contracts 
    @FindBy(id="00N20000002kyOL")
    WebElement RegistrationNumber;
    
      
	//Constructor
	public  PageEditAccount(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		//This initElements method will create all WebElements
	}
	
	public void saveAccnt()
	{
		accntSaveButton.click();
	}
	
	public void editAccnt()
	{
		accntEditButton.click();
	}
    
	public void cancelAccnt()
	{
    	accntCancelButton.click();
	}

	public void setAccntName(String strName)
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("acc2")));
		accntEditName.clear();
		accntEditName.sendKeys(strName);
	}
	
	public void setAccntSite(String strSite)
	{
		accntEditSite.sendKeys(strSite);
	}
	
	public void setAccntPhone(String strPhone)
	{
		accntEditPhone.clear();
		accntEditPhone.sendKeys(strPhone);
	}
	
	public void setAccntFax(String strFax)
	{
		accntEditFax.sendKeys(strFax);
	}
	
	public void setAccntWebsite(String strWebsite)
	{
		accntEditWebsite.sendKeys(strWebsite);
	}
	
	public void setAccntShortName(String strShortName)
	{
		accntEditShortName.sendKeys(strShortName);
	}
	
	public void setAccntTadeAs(String strTradeAs)
	{
		accntEditTradeAs.sendKeys(strTradeAs);
	}
	
	public void setAnonyEntity(String strAnonyEntity)
	{
		accntEditAnonyEntity.sendKeys(strAnonyEntity);
	}
	
	public void setAccntCurrency(String strAccntCurr)
	{
		
		Select currency = new Select(accntEditCurrency);
		currency.selectByVisibleText(strAccntCurr);
	}
	
	public boolean verifyCopyAddrs()
	{
	
		boolean copyAdrs = false;
		try
		{
			
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00Nw0000003PErv")));
			//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			copyAdrs=accntEditCopyAddrs.isSelected();
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return copyAdrs;
	}
	
	public void setCorrsCountry(String strCorrsCountry)
	{
		Select Country=new Select(accntEditCorrsCountry);
		Country.selectByVisibleText(strCorrsCountry);
	}
	
	public void setCorrsState(String strCorrsState)
	{
		Select State=new Select(accntEditCorrsState);
		State.selectByVisibleText(strCorrsState);
	}
	
	public void setCorrsStreet(String strCorrsStreet)
	{
		accntEditCorrsStreet.clear();
		accntEditCorrsStreet.sendKeys(strCorrsStreet);
	}
	
	public void setCorrsCity(String strCorrsCity)
	{
		accntEditCorrsCity.clear();
		accntEditCorrsCity.sendKeys(strCorrsCity);
	}
	
	
	public void setCorrsZip(String strCorrsZip)
	{
		accntEditCorrsZip.sendKeys(strCorrsZip);
	}
	
	public void setRegOffice(String strRegOffice)
	{
		accntEditRegOffice.sendKeys(strRegOffice);
	}
	
	public void setBillCountry(String strBillCountry)	
	{	
		Select Country=new Select(accntEditBillCountry);
		Country.selectByVisibleText(strBillCountry);
	}	
		
	public void setBillState(String strBillState)	
	{	
		Select State=new Select(accntEditBillState);
		State.selectByVisibleText(strBillState);
	}	
		
	public void setBillStreet(String strBillStreet)	
	{	
		accntEditBillStreet.clear();
		accntEditBillStreet.sendKeys(strBillStreet);
	}	
		
	public void setBillCity(String strBillCity)	
		
	{	
		accntEditBillCity.clear();
		accntEditBillCity.sendKeys(strBillCity);
		
	}	
		
	public void setBillZip(String strBillZip)	
	{	
		accntEditBillZip.sendKeys(strBillZip);
		
	}	
	
	public void setAnnualRevenue(String strAnnualRevenue)	
	{	
		accntEditAnualRev.clear();
		accntEditAnualRev.sendKeys(strAnnualRevenue);
	}
	
	public void setNo_Of_Employees(String strNoOfEmployees)	
	{	
		accntEditNoOfEmp.clear();
		accntEditNoOfEmp.sendKeys(strNoOfEmployees);
	}
	
	public void setNet_Assets(String strNetAssets)	
	{	
		accntEditNetAssets.clear();
		accntEditNetAssets.sendKeys(strNetAssets);
	}
	
	public void setInsurer()	
	{	
	
		accntEditInsurer.click();
	}

	public void clickAccntEditCsdTrade()
	{
		accntEditCsdTrade.click();
	}
	
	public String getAccountStatusOnEdit()
	{
		String status;
		status=accntEditStatus.getText();
		return status;
	}
	
	public String getAccountStatusOnSave()
	{
		String status;
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='00Nw0000003PEry_ileinner']")));
		status=accntInlineStatus.getText();
		return status;
	}
	
	public String getAccntAuthStatus()
	{
		String authStatus;
		authStatus= accntEditAuthStatus.getText();
		return authStatus;
	}
	
	public String getaccntHierarchy()
	{
		String accountHierarchy;
		accountHierarchy= accntHierarchy.getText();
		return accountHierarchy;
	}
	
	
	public String recordType()
	{
		String accntRecordType;
		accntRecordType= recordType.getText();
		return accntRecordType;
	}
	
	
	public String getAccountType()
	{
		String accntPageType1;
		accntPageType1 = saveAccountType.getText();
		return accntPageType1;
	}
	
	
	public String getAccountName()
	{
		String accntpageDesc;
		accntpageDesc= saveAccountName.getText();
		return accntpageDesc;
	}
	
	
	// Below are the additional get methods for Person Account
	public String getPerSalutation()
	{
		String perSalutation;
		perSalutation= accEditSalutation.getText();
		return perSalutation;
	}
	
	public String getPerFName()
	{
		String perFName;
		perFName= accEditFirstName.getText();
		return perFName;
	}
	
	public String getPerLName()
	{
		String perLName;
		perLName= accEditLastName.getText();
		return perLName;
	}
	
	public String getIndustryPractice()
	{
		String industryPractice;
		industryPractice= accEditIndustryPrac.getText();
		return industryPractice;
	}
	
	public String getPersonMobile()
	{
		String perMobile;
		perMobile = accEditPersonMobilePhone.getText();
		return perMobile;
	}
	
	public String getPersonEmail()
	{
		
		String perEmail;
		perEmail = accEditPersonEmail.getText();
		return perEmail;
	}
	
	public String getChangeSalutation()
	{
		String perChngSal;
		perChngSal = accntEditSalChange.getText();
		return perChngSal;
	}
	
	public String getChangeFName()
	{
		String changeFName;
		changeFName = accntEditFNameChange.getText();
		return changeFName;
	}
	
	public String getChangeLName()
	{
		String changeLName;
		changeLName = accntEditLNameChange.getText();
		return changeLName;
	}
	
	
	//Below are the additional set methods for Person Account
	
	public void setPerSalutation(String sal)
	{
		Select salutation =new Select(accEditSalutation);
		salutation.selectByVisibleText(sal);
	}
	
	//person account fname & lname set method starts
	
	public void setPerFName(String fName)
	{
		
		if (driver.findElements(By.id("name_firstacc2")).size() > 0) 
			{
			//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		    accEditFirstName.clear();
			accEditFirstName.sendKeys(fName);
			}
	}
		
	public void setPerLName(String lName)
	{
		
		if (driver.findElements(By.id("name_lastacc2")).size() > 0) 
			{
			accEditLastName.clear();
			accEditLastName.sendKeys(lName);   
			}
	}

	// person account ends
		
	public void setIndustryPractice(String industryPractice)
	{
		Select industryPrac =new Select(accEditIndustryPrac);
		industryPrac.selectByVisibleText(industryPractice);
	}
	
	public void setPersonMobile(String mobile)
	{
		accEditPersonMobilePhone.sendKeys(mobile);
	}
	
	public void setPersonEmail(String email)
	{
		accEditPersonEmail.sendKeys(email);
	}
	
	public void setChangeSalutation(String changeSal)
	{
		Select salutation =new Select(accEditSalutation);
		salutation.selectByVisibleText(changeSal);
	}
	
	public void setChangeFName(String fName)
	{
		accntEditFNameChange.sendKeys(fName);
	}
	
	public void setChangeLName(String lName)
	{
		accntEditLNameChange.sendKeys(lName);
	}
		
	
	public String getPolicyHolderType()
	{
		return accntInlinePolicyHolderType.getText();
	}
	
	
	public String getAccountSaveError()
	{			
		if (driver.findElements(By.xpath("//div[@id='errorDiv_ep']")).size() != 0) 
			return accntSaveError.getText();                
		else				
			return "Error text not present" ;
	}
	
	
	//Person account error for first name and last name save 
	
	public String getPersonFNameSaveError()
	{			
		if (driver.findElements(By.xpath("//div[3]/table/tbody/tr/td[2]/div")).size() != 0) 
			return PersonFNameSaveError.getText();                
		else				
			return "Error text not present" ;
	}
	
	public String getPersonLNameSaveError()
	{			
		if (driver.findElements(By.xpath("//tr[2]/td[2]/div/div[2]")).size() != 0) 
			return PersonLNameSaveError.getText();                
		else				
			return "Error text not present" ;
	}
		
	public String getCsdTradeAuditDateOnSave()
	{
		if (driver.findElements(By.xpath("//div[@id='00Nw0000008CtE9_ileinner']")).size() != 0) 
			return accntInlineCsdTradeAuditDate.getText();
		else				
			return null;
	}
	
	
	public void createNewContactFromAccnt()
	{
		accntNewContactBtn.click();
	}
	
	/*public void focusContactRelatedList()
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		String accntName= accntInlineName.getText();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='001m000000MiiU9_RelatedContactList']/div/div/div/table/tbody/tr/td")));
		//driver.findElement(By.id("name_firstcon2")).sendKeys(firstName);
		//contactRelatedList.click();
	}*/
	
	public String getContactNameOnRelatedList()
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_RelatedContactList_body')]/table/tbody/tr[2]/th/a")));
		String contactName=contactNameOnRelatedList.getText();
		return contactName;
	}
	
	public String getContactStatusOnRelatedList()
    {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_RelatedContactList_body')]/table/tbody/tr[2]/td[2]")));
           String contactStatus=contactStatusOnRelatedList.getText();
           return contactStatus;
    }
    
    public void createNewOpptyFromAccnt()
    {
      
    	accntNewOpptyBtn.click();
    }
    
    public String getOpptyNameOnRelatedList()
    {
    	WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_RelatedOpportunityList_body')]/table/tbody/tr[2]/th/a")));
    	String opptyName = opptytNameOnRelatedList.getText();
		return opptyName;
    }
    
    
    public void clickOpptyNameOnRelatedList()
    {
    	opptytNameOnRelatedList.click();
		
    }
    public String getOpptyTypeOnRelatedList()
    {
		String opptyType = opptytTypeOnRelatedList.getText();
		return opptyType;
    }
    
    public void viewRel()
    {
    	accntViewRelationship.click();
    }
    
    public void editRel()
    {
    	accntEditRelationship.click();
    }
    
    public String getRelClientName()
    {
    	String accntName=accntRelClient.getText();
    	return accntName;
    }
    
    //Deepali added method to click Client name on Relationship Landscape
    
    public void clickRelClientName()
    {
    	accntRelClient.click();
    	
    }
    
    public String getRelOpptyType()
    {
    	String opptyType=accntRelOpptyType.getText();
    	return opptyType;
    }
    
    public String getRelStatus()
    {
    	String status=accntRelStatus.getText();
    	return status;
    }

	public String getRelCOB() 
	{
		String COB=accntRelCOB.getText();
		return COB;
	}

	public String getRelLOB() 
	{
		String LOB=accntRelLOB.getText();
		return LOB;
	}

	public String getRelProd() 
	{
		String Prod=accntRelProd.getText();
		return Prod;
	}

	public String getAccntRelAbandValue()
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_00Nw0000003PErt_body')]/table/tbody/tr[2]/td[8]/img")));
		String value = accntRelAbandValue.getAttribute("title");
		return value;
	}
	
	//Aditya
	public String getAccntRelManCreatedValue()
	{	
		WebDriverWait wait = new WebDriverWait(driver, 40);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_00Nw0000003PErt_body')]/table/tbody/tr[2]/td[9]/img")));
	    String value = accntRelManCreatedValue.getAttribute("title");
	    System.out.println(value);
		return value;
	}
	
	//Aditya
	public String getAccntRelStatusValue()
	{	
		WebDriverWait wait = new WebDriverWait(driver, 40);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_00Nw0000003PErt_body')]/table/tbody/tr[2]/td[8]")));
	    String value = accntRelationshipStatusValue.getText();
	    
	    System.out.println(value + ": Account Status");
		return value;
	}
	
	//Aditya
	public String getApprovalOrgValue()
	{	
		WebDriverWait wait = new WebDriverWait(driver, 40);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_00Nw0000003PKQF_body']/table/tbody/tr[2]/th/a")));
	    String value = accntRelManCreatedValue.getAttribute("title");
	    System.out.println(value);
		return value;
	}

	public void clickAccntRelAband()
	{
		accntRelAbandCheckbox.click();
	}

	public void saveAccntRel() 
	{
		accntRelSave.click();
	}

	public void clickAccntRelClient()
	{
		accntRelClient.click();
	}

	public String getAccntCorrStreetError()
	{
		if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[5]/table/tbody/tr[4]/td[2]/div")).size() != 0) 
			return accntCorrStreetError.getText();                
		else				
			return "Error text not present" ;
	}

	public String getAccntCorrCityError() 
	{
		if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[5]/table/tbody/tr[4]/td[2]/div")).size() != 0) 
			return accntCorrCityError.getText();                
		else				
			return "Error text not present" ;
	}

	public String getAccntBillStreetError()
	{
		if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[5]/table/tbody/tr[4]/td[4]/div")).size() != 0) 
			return accntBillStreetError.getText();                
		else				
			return "Error text not present" ;
	}//div[@id='ep']/div[2]/div[5]/table/tbody/tr[4]/td[4]/div/strong

	public String getAccntBillCityError() 
	{
		if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[5]/table/tbody/tr[5]/td[4]/div")).size() != 0) 
			return accntBillCityError.getText();                
		else				
			return "Error text not present" ;
	}

	public String getAccntInlineCorrAddrs() 
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("acc18_ilecell")));
		return accntInlineCorrAddrs.getText();
		
	}

	public String getAccntInlineRegAddrs()
	{
		return accntInlineRegAddrs.getText();
	}

	public String getAccntInlineBillAddrs() 
	{
		return accntInlineBillAddrs.getText();
	}

	public void addAccntTeam() 
	{
		accntNewAccntTeamBtn.click();
	}

	public void cancelAccntTeam() 
	{
		
		accntTeamCancelBtn.click();
		
	}
	
	public void clickAccntTeamRole() 
	{
		accntTeamRole.click();
	}

	public void setAccntContForContRole(String contactName)
	{
		accntContForContRole.sendKeys(contactName);
		accntContForContRoleSel.click();
	}

	public void setAccntContRole(String role) 
	{
		Select rolevalue=new Select(accntContRole);
		rolevalue.selectByVisibleText(role);
	}

	public void setPrimaryContactRole() 
	{
		accntContRolePrimaryCheck.click();
	}
	
	public void clickAccntContRoleSaveBtn() 
	{
		accntContRoleSaveBtn.click();
	}
	
	public String getAccntContNameOnContRoleRL()
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_RelatedAccountContactRoleList_body')]/table/tbody/tr[2]/th/a")));
		return accntContNameOnContRoleRL.getText();
	}

	public String getAccntContRoleOnRL()
	{
		return accntContRoleOnRL.getText();
	}
	
	public String getContNameOnRelatedListRole()
	{
		return contactNameOnRelatedList.getText();
	}

	
	public void clickContNameOnRelatedListRole()
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_RelatedContactList_body')]/table/tbody/tr[2]/th/a")));
		contactNameOnRelatedList.click();
	}
	
	public String getContactRoleOnRelatedList() 
	{
		return contactStatusOnRelatedList.getText();
	}
	
	public String getAccntContRolePrimary() 
	{
		String value=accntContRolePrimary.getAttribute("title");
		return value;
	}
	
	public void clickAccntNewContRoleBtn()
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("newRole")));
		accntNewContRoleBtn.click();
	}

/*	public void setAccntEditNameChange(String name) 
	{
		accntEditNameChange.clear();
		accntEditNameChange.sendKeys(name);
	}
		
	public void setAccntEditNameChangeDate()
	{
		accntEditNameChangeDate.click();
		driver.findElement(By.xpath("//a[contains(text(),'Today')]")).click(); //click next month
	}

	public void setAccntEditNameChangeDateFuture()
	{
		accntEditNameChangeDate.click();
		driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click(); 
	}
	
	public void setAccntEditNameChangeDatePast()
	{
		accntEditNameChangeDate.click();
		driver.findElement(By.xpath("//img[@alt='Previous Month']")).click(); //click previous month
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click(); 
	}
	
	public void setAccntEditNameCorrection() 
	{
		accntEditNameCorrection.click();
	}

	public void checkAccntEditNameChangeEffecDate()
	{
		accntEditNameChangeEffecDate.getText();
	}
	
	public String getAccntInlineName()
	{
		return accntInlineName.getText();
	}
	
	public String getAccntInlinePrevName() 
	{
		return accntInlinePrevName.getText();
	}

	public String getAccntNameChangeDateErr()
	{
		return accntNameChangeDateErr.getText();
	}
    */
	public void setMemberTypeandSave(String MemberType) 
	{
		Select membType = new Select(mType);
		membType.selectByVisibleText(MemberType);
		accntSaveButton.click();
	}

	public void clickAccntindustry() 
	{
		accntindustry.click();
	}
	
	
	
	public String getOpptytSalesStageOnRelatedList()
	{
		return opptytSalesStageOnRelatedList.getText();
	}

	public String getAccntInlineAnualRev() {
		return accntInlineAnualRev.getText();
			
	}

	public String getAccntInlineNoOfEmp() {
		return accntInlineNoOfEmp.getText();
	}

	public String getAccntinlineindustry() {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("acc7_ileinner")));
		return accntinlineindustry.getText();
	}
	
	//Deepali
	public void clickRecentRecordlink()
	{
		clickRecentRecordLink.click();
	}
	
	//Aditya
	public void setCOBonRLPage(String strCOBonRLPage)
	{
		Select cob = new Select(accntNewRLPageCOB);
		cob.selectByVisibleText(strCOBonRLPage);
	}
	
	public void setOppTypeonRLPage(String strOppTypeonRLPage)
	{
		
		Select oppType = new Select(accntNewRLPageOppType);
		oppType.selectByVisibleText(strOppTypeonRLPage);
	}
	
	public void setExpiryDate()
	{	
		accntNewRLPageExpiryDate.click();
		driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click(); 			
	}		
	
	public void saveRL()
	{
		accntNewRLPageSave.click();
	}
	
	public void clickOnRL()
	{
		accntNewRelationshipLandscape.click();
	}
	
	public String getInvalidDataSaveErrorOnRLPage()
	{			
		if (driver.findElements(By.xpath("//div[@id='errorDiv_ep']")).size() != 0) 
			return rlSaveError.getText();                
		else				
			return "Error text not present" ;
	}
	
	public void clickOnAddAccountApproval()
	{
		addAccntApprovalButton.click();
	}
	
	public void setRoleTypeonAccountApprovals(String strRoleType)
	{
		
		Select roleType = new Select(selectRoleOnAcctApprovalPage);
		roleType.selectByVisibleText(strRoleType);
	}
	
	public void openOrgLookUp()
	{
		orgLookUpOnAcctApprovalPage.click();
	}
	
	public void searchOrgLookUp(String org)
	{
		orgLookUpSearchBox.clear();
		orgLookUpSearchBox.sendKeys(org);		
	}
	
	public void clickOrgLink()
	{
		clickOrglink.click();				
	}
	
	public void clickSaveonAccntAppPage()
	{
		clickSaveOnAccntApprovalPage.click();
	}
		
	
	public String getBlankRLtxt()
	{
		return blankRL.getText();
	}

	public void setAccntBlock() {
		accntBlock.click();
	}	
	
	public void setCopyAddress() 
	{
		
		accntEditCopyAddrs.click();
	}
	
	//Account Target get set methods
	
	public void clickNewAccntTargetBtn() 
	{
		
		newAcntTrgtBtn.click();
	}
	
	public void setAccntTrgtCamp(String camp) 
	{
		
		newAcntTrgtCamp.sendKeys(camp);
	}
	
	public void setAccntTrgtStatus(String status) 
	{
		
		Select statusvalue=new Select(newAcntTrgtStatus);
		statusvalue.selectByVisibleText(status);
	}
	
	public void setAccntTrgtStatusNote(String statusnote) 
	{
		
		newAcntTrgtStatusNote.sendKeys(statusnote);
	}
	
	public void setAcntTrgtPriority() 
	{
		
		newAcntTrgtPriorityChk.click();
	}
	
	public void setAccntTrgtRenewalDate() 
	{
		
		newAcntTrgtRenewalDate.click();
		driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click();
	}
	
	public void saveAccntTrgt() 
	{
		
		newAcntTrgtSaveBtn.click();
	}
	
	
	public String getAcntTrgtName()
	{
		return newAcntTrgtSaveName.getText();
	}
	
	public String getAcntTrgtRlId()
	{
		return newAcntTrgtRLId.getText();
	}
	
	public String getAcntTrgtRlCamp()
	{
		return newAcntTrgtRLCamp.getText();
	}
	
	public void clickAccntTrgtLnk() 
	{
		
		newAcntTrgtAccntLnk.click();
	}
	
	
	
	public String getMultipleCampErr() {
		
		if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr[2]/td[2]/div/div[2]")).size() != 0) 
		{	
			System.out.println("test2");
			String errmsg=multipleCampErr.getText();
			System.out.println("errmsg:"+errmsg);
		return errmsg;
		
		
		}
		else
			
		{
			
			return "Error text not present";
		}
	}
	
	
	public void selCamp(String Camptxt) {
		Select dropdown = new Select (multipleCampDrpDown) ;
        
        dropdown.selectByVisibleText(Camptxt);      
	}
	
	public void addNewRiskMgmtPrj() 
	{
		
		accntnewriskmgmtprjbtn.click();
	}
	
	public String getAccntRLRiskMngmtPrjName() 
	{
		
		return accntRLRiskMngtCampName.getText();
	}
	
	public void setIndustry(String industry)
	{
		
		if (driver.findElements(By.id("acc7")).size() != 0) 
		{
		Select industryvalue=new Select(accntindustry);
		industryvalue.selectByVisibleText(industry);
		}
		
		else
		{
			
			System.out.println("Industry field not present");
		}
	}
	
	public void clearIndustry()
	{
		Select industryvalue=new Select(accntindustry);
		industryvalue.deselectByVisibleText("Construction");
		
	}
	
	public void clickORNameOnRelatedList()
    {
		ORNameOnRelatedList.click();
		
    }
	
	
	//Create meeting report from account
	public void createNewMRFromAccnt()
    {
      
		accntNewMRBtn.click();
    }

	
	//methods for adding current broker
	
	public void setAddCurrentBrokerBtn() {
		addCurrentBrokerBtn.click();
	}

	
	public void setCompetitor(String strcompetitor)
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id0:j_id5:pgBlk:j_id76:0:j_id78")));
		competitor.sendKeys(strcompetitor);
		//selCompetitor.click();
		
		Boolean isPresent = driver.findElements(By.xpath("//div[@id='j_id0:j_id5:pgBlk:j_id76:0:j_id78_autoCompleteRowId_0']/strong")).size() > 0;
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

	public void setRenewalDate() {
		renewalDate.click();
		//driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
		//driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click(); 	
	
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				
		Date date = new Date();
		
		Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    cal.add(Calendar.DATE, 90); //minus number would decrement the days
	    Date date1= cal.getTime();
	        
	    String datetxt=dateFormat.format(date1);
	    renewalDate.sendKeys(datetxt);
		//date1= dateFormat.format(date);
		 System.out.println("Current date + 90 days is:" +datetxt);
	    //return date1;
	
	}

	public void setLOB(String lOBstr) {
		LOB.sendKeys(lOBstr);
	}

	public void setEstimatedRev(String estimatedRevstr) {
		estimatedRev.sendKeys(estimatedRevstr);
	}

	public void setCompComments(String compCommentsstr) {
		compComments.sendKeys(compCommentsstr);
	}
	
	public void setSaveCompititor()
	{
		saveCompititor.click();
	}
	
	
	public String getCompOnRelLst() {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'00Nw0000008lyPG_body')]/table/tbody/tr[2]/th/a")));
		
		return compOnRelLst.getText();
	}

	public String getCompRoleOnRelLst() {
		return compRoleOnRelLst.getText();
	}

	public String getCompComntsOnRelLst() {
		return compComntsOnRelLst.getText();
	}

	
	public String getCompLOB() {
		return compLobOnRelLst.getText();
	}

	public String getCompRev() {
		return compRevOnRelLst.getText();
	}

	//External System Reference Info methods
	
	public String getExtSysUniqueIdRL() {
		return extSysUniqueIdRL.getText();
	}

	public String getExtSysNameRL() {
		return extSysNameRL.getText();
	}

	public String getExtSysOpcoRL() {
		return extSysOpcoRL.getText();
	}

	public String getExtSysInfoRL() {
		return extSysInfoRL.getText();
	}

	public void clickNewExtSysRefBtn() {
		newExtSysRefBtn.click();
	}

	public void setExtSysOpco(String Opco) {
		extSysOpco.sendKeys(Opco);
	}

	public void setExtSysName(String extSysNamestr) {
		
		Select name=new Select(extSysName);
		name.selectByVisibleText(extSysNamestr);
	
	}

	public void setExtSysUniqueId(String extSysUniqueIdstr) {
		extSysUniqueId.sendKeys(extSysUniqueIdstr);
	}

	public void setExtSysOtherInfo(String extSysOtherInfostr) {
		extSysOtherInfo.sendKeys(extSysOtherInfostr);
	}

	public void clickExtSysAccntLookup() {
		extSysAccntLookup.click();
	}
	
	// For EB Contracts Account
	public void setRegistrationNumber(String Registrationnumber) {
		
		RegistrationNumber.sendKeys(Registrationnumber);
		}
	
	
}




