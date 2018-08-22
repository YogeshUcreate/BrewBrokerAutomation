package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateEditSupplierPage {
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[3]/button")
	@CacheLookup
	WebElement summaryeditbutton;
	
	public void SummaryEdit() {
		summaryeditbutton.click();
	}
	
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/textarea")
	@CacheLookup
	WebElement summarytextfield;
	
	public void SummaryEditTextField() {
		summarytextfield.clear();
		summarytextfield.sendKeys("Testing New content and updateing the existing text with new text");
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement savebuttonsummary;
	
	public void saveUpdatedSummary() {
		savebuttonsummary.click();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div[1]/div[1]/div/button")
	@CacheLookup
	WebElement editstandard;
	
	public void EditStandard() {
		editstandard.click();
	}
	
	@FindBy(how=How.XPATH, using="//*[@id=\"standard1\"]")
	@CacheLookup
	WebElement SALSA;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"standard2\"]")
	@CacheLookup
	WebElement BRC;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"standard3\"]")
	@CacheLookup
	WebElement SibaSSFQ;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"qualification1\"]")
	@CacheLookup
	WebElement gencerti;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"qualification2\"]")
	@CacheLookup
	WebElement diplomabrew;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"qualification3\"]")
	@CacheLookup
	WebElement masterbrew;
	
	public void Standard() {
		SALSA.click();
		BRC.click();
		SibaSSFQ.click();
	}
	
	public void Qualification() {
		gencerti.click();
		diplomabrew.click();
		masterbrew.click();
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement savestandquali;
	
	public void SaveStandardQualification() {
		savestandquali.click();
	}
	//-----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div[2]/div[1]/div/button")
	@CacheLookup
	WebElement editawards;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/div[1]/a")
	@CacheLookup
	WebElement delete;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/button")
	@CacheLookup
	WebElement addawards; 
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/div/input")
	@CacheLookup
	WebElement writeawardname; 
	
	public void EditAwards() {
		editawards.click();
	}
		public void deleteAward() {
		delete.click();
	}
	public void addAward() {
		addawards.click();
		writeawardname.sendKeys("DKFJGHK345TKFDH");
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement saveawards; 
	public void SaveAward() {
		saveawards.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div[1]/div/div[1]/div/button")
	@CacheLookup
	WebElement editServices; 
	@FindBy(how=How.XPATH, using="//*[@id=\"service_list0\"]")
	@CacheLookup
	WebElement servicesone; 
	@FindBy(how=How.XPATH, using="//*[@id=\"service_list1\"]")
	@CacheLookup
	WebElement servicetwo; 
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement saveService; 
	
	public void EditServices() {
		editServices.click();
		
	}
	public void ChooseServices() {
		servicesone.click();
		servicetwo.click();	
	}
	public void saveService() {
		saveService.click();
	}
	//----------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div[2]/div[1]/div/button")
	@CacheLookup
	WebElement editlogistics; 
	@FindBy(how=How.XPATH, using="//*[@id=\"delivery\"]")
	@CacheLookup
	WebElement deliverycheckbox; 
	@FindBy(how=How.XPATH, using="//*[@id=\"warehousing\"]")
	@CacheLookup
	WebElement warehousingcheckbox;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement savelogistics;
	@FindBy(how=How.XPATH, using="//*[@id=\"warehousingType1\"]")
	@CacheLookup
	WebElement ambient;
	
	public void EditLogistics() {
		editlogistics.click();
	}
	public void ChooseLogistics() {
		deliverycheckbox.click();
		//warehousingcheckbox.click();
		//ambient.click();
	}
	public void saveLogistics() {
		savelogistics.click();
	}
	//---------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[1]/div/div[3]/button")
	@CacheLookup
	WebElement profileedit;
	public void ProfileEdit() {
		profileedit.click();
	}
	
	@FindBy(how=How.XPATH, using="//*[@id=\"edit_companyName\"]")
	@CacheLookup
	WebElement company;
	
	public void CompanyProfile() {
		company.clear();
		company.sendKeys("TestingFour4");
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement saveprofile;
	public void SaveProfile() {
		saveprofile.click();
	}
	//--------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div[1]/div[1]/div/button")
	@CacheLookup
	WebElement editcapacity;
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/div/input")
	@CacheLookup
	WebElement editcapacityfield;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement savecapacity;
	
	public void AnnualCapacityEdit() {
	editcapacity.click();
	editcapacityfield.clear();
	editcapacityfield.sendKeys("500");
	savecapacity.click();
	}
	//-------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div[2]/div[1]/div/button")
	@CacheLookup
	WebElement editordervolume;
	@FindBy(how=How.XPATH, using="//*[@id=\"minCapacity\"]")
	@CacheLookup
	WebElement minbrewlength;
	@FindBy(how=How.XPATH, using="//*[@id=\"maxCapacity\"]")
	@CacheLookup
	WebElement maxbrewlength;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement saveordervolume;
	
	public void EditOrderVolume() throws Exception {
		editordervolume.click();
		minbrewlength.clear();
		minbrewlength.sendKeys("5000");Thread.sleep(4000);
		maxbrewlength.clear();
		maxbrewlength.sendKeys("8000");Thread.sleep(4000);
		saveordervolume.click();
	}
	//----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div[1]/div[1]/div/button")
	@CacheLookup
	WebElement editstyle;
	@FindBy(how=How.XPATH, using="//*[@id=\"style7\"]")
	@CacheLookup
	WebElement style7;
	@FindBy(how=How.XPATH, using="//*[@id=\"style7\"]")
	@CacheLookup
	WebElement style8;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement savestyle;
	
	public void EditStyles() {
		editstyle.click();
		style7.click();
		style8.click();
		savestyle.click();
	}
	//------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div[2]/div[1]/div/button")
	@CacheLookup
	WebElement editonsite;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/label")
	@CacheLookup
	WebElement bottleing0;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/label")
	@CacheLookup
	WebElement bottleing1;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/div/div[2]/div[2]/div[1]/label")
	@CacheLookup
	WebElement canning0;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/label")
	@CacheLookup
	WebElement canning1;
	@FindBy(how=How.XPATH, using="//*[@id=\"Bottling-3\"]")
	@CacheLookup
	WebElement minqualtitybottleing;
	@FindBy(how=How.XPATH, using="//*[@id=\"Canning-4\"]")
	@CacheLookup
	WebElement minqualtitycanning;
	@FindBy(how=How.XPATH, using="//*[@id=\"signup-submit-btn\"]")
	@CacheLookup
	WebElement saveonsite;
	
	public void EditOnsitePackaging() throws Exception {
		editonsite.click(); Thread.sleep(4000);
		bottleing0.click(); Thread.sleep(4000);
		bottleing1.click(); Thread.sleep(4000);
		canning0.click(); Thread.sleep(4000);
		canning1.click(); Thread.sleep(4000);
		minqualtitybottleing.click(); 
		minqualtitycanning.sendKeys("1000");
		saveonsite.click(); Thread.sleep(4000);
		
	}
}