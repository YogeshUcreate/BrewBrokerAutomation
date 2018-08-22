package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pages.BuyerSignInPage;
import com.pages.CreateProvideRecipeBuyerPage;
import com.pages.CreateQuoteSupplierPage;

import utility.BrowserFactory;

public class VerifyCreateRecipeFromBuyer {
	
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
	Reporter.log("Buyer logged in to his account to create recipe");

	//driver.get("http://brewbroker-react.herokuapp.com/create-tender");
	CreateQuoteSupplierPage quote=PageFactory.initElements(driver, CreateQuoteSupplierPage.class);
	/*======================================= Step One ==============================================================*/
	quote.supplier_logo(); Thread.sleep(4000); 
	quote.dashboard_supplier(); Thread.sleep(8000);
	Reporter.log("Buyer moved to his dashboard");
	
	CreateProvideRecipeBuyerPage recipe = PageFactory.initElements(driver, CreateProvideRecipeBuyerPage.class);
	/*======================================= Step One ==============================================================*/
	recipe.ClickTender(); Thread.sleep(4000); 
	recipe.clickStatus();Thread.sleep(8000); 
	recipe.approveAndProvideRecipe(); Thread.sleep(8000); 
	Reporter.log("Buyer clicked on approve and provide recipe");
	/*===========================================Step Two ================================================================*/
	recipe.textMethodsInstructions(); Thread.sleep(10000); 
	Reporter.log("Buyer added methods and instructions");
	
	recipe.UploadRecipeFiles(); Thread.sleep(10000); 
	Reporter.log("Buyer uploaded recipe file");
	
	recipe.UploadIngredientFiles(); Thread.sleep(15000); 
	Reporter.log("Buyer uploaded ingredients file");
	
	recipe.SendToSupplier(); Thread.sleep(4000); 
	Reporter.log("Buyer sent recipe to supplier successfully");
	
	}
	
	}
