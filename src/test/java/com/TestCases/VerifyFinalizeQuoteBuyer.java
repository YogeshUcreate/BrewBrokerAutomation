package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pages.BuyerSignInPage;
import com.pages.CreateFinalizeQuoteBuyerPage;
import com.pages.CreateQuoteSupplierPage;

import utility.BrowserFactory;

public class VerifyFinalizeQuoteBuyer {
 
	WebDriver driver;
	@Test
	public void createRecipebyBuyer() throws Exception
	{
	
	
	//Start the browser.
	driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
	
	
	/*====================================================login BrewBroker Buyer ===================================================================*/
	
	//Created Page Object using Page Factory for Login.
	BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
	
	//signup.clickonProfileinfo();
	
	/*===========================Supplier Login====================================================*/
	signin.clickonLoginhomepage();	
	signin.enterEmail("buyer082@mailinator.com");
	signin.enterPassword("@Test1234");
	signin.clickLoginButton();		
	Thread.sleep(3000);
	Reporter.log("Buyer logged in to his account");

	//driver.get("http://brewbroker-react.herokuapp.com/create-tender");
	CreateQuoteSupplierPage quote=PageFactory.initElements(driver, CreateQuoteSupplierPage.class);
	/*======================================= Step One ==============================================================*/
	quote.supplier_logo(); Thread.sleep(8000); 
	quote.dashboard_supplier(); Thread.sleep(8000);
	Reporter.log("Buyer moved to his dashboard");
	
	CreateFinalizeQuoteBuyerPage fiz = PageFactory.initElements(driver, CreateFinalizeQuoteBuyerPage.class);
	Thread.sleep(4000); fiz.ClickFinalizing(); Thread.sleep(4000);
	Thread.sleep(4000); fiz.ClickFinalize(); Thread.sleep(4000);
	fiz.TermsAndConditions(); Thread.sleep(4000);
	Reporter.log("Buyer accepted the terms and conditions");
	
	fiz.AcceptFinalize(); Thread.sleep(4000);
	fiz.PayNow(); Thread.sleep(4000); 
	Reporter.log("Buyer accepted and finalized the payement successfully");
	
}
	
}
