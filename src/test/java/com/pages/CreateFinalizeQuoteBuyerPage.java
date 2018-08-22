package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateFinalizeQuoteBuyerPage {

	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[2]/span")
	@CacheLookup
	WebElement clickfinalizing;
	
	public void ClickFinalizing() {
		clickfinalizing.click();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/table/tbody/tr/td[2]/span")
	@CacheLookup
	WebElement clicktofinalize; 
	
	public void ClickFinalize() {
		clicktofinalize.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"finalCosts\"]")
	@CacheLookup
	WebElement termscheckbox; 
	
	public void TermsAndConditions() {
		termscheckbox.click();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div[3]/div[2]/section[4]/div[2]/input")
	@CacheLookup
	WebElement acceptandfinalize;
	
	public void AcceptFinalize() {
		acceptandfinalize.click();
	} 
	
	//-------------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div[3]/div[2]/div[3]/button")
	@CacheLookup
	WebElement paynow;
	
	public void PayNow() {
		paynow.click();
	}
}
