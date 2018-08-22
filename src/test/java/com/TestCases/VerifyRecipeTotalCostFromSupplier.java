package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pages.BuyerSignInPage;
import com.pages.CreateRecipeFinalCostSupplierPage;
import com.pages.CreateTenderfromBuyerPage;

import utility.BrowserFactory;

public class VerifyRecipeTotalCostFromSupplier {
	
	WebDriver driver;
	@Test
	public void RecipeTotalCostSupplier() throws Exception
	{
	
	//Start the browser.
	driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
	
	
	/*====================================================login BrewBroker Buyer ===================================================================*/
	
	//Created Page Object using Page Factory for Login.
	BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
	
	//signup.clickonProfileinfo();
	
	/*===========================Supplier Login====================================================*/
	signin.clickonLoginhomepage();	
	
	signin.enterEmail("supplier082@mailinator.com");
	signin.enterPassword("@Test1234");
	signin.clickLoginButton();		
	Thread.sleep(3000);
	Reporter.log("Supplier logged in to review recipe");
	
	
	//driver.get("http://brewbroker-react.herokuapp.com/create-tender");
	CreateTenderfromBuyerPage quote=PageFactory.initElements(driver, CreateTenderfromBuyerPage.class);
	/*======================================= Step One ==============================================================*/
	quote.brewbroker_logo(); Thread.sleep(8000); 
	quote.dashboard_link(); Thread.sleep(8000);
	Reporter.log("Supplier moved to dashboard");
	
	CreateRecipeFinalCostSupplierPage recipe = PageFactory.initElements(driver, CreateRecipeFinalCostSupplierPage.class);
	recipe.SubmitFinalCost(); Thread.sleep(5000);
	recipe.IngredientCost(); Thread.sleep(5000);
	Reporter.log("Supplier added ingredients cost");
	
	recipe.TotalCost(); Thread.sleep(4000);
	Reporter.log("Supplier added total cost in milestone");
	
	recipe.AddYourComment(); Thread.sleep(5000);
	Reporter.log("Supplier added comments");
	
	recipe.SendToBuyer(); Thread.sleep(5000);
	Reporter.log("Supplier sent the recipe back to buyer successfully");
}

}
