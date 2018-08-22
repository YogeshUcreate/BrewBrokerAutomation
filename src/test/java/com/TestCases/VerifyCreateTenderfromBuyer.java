/**
 * 
 */
package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pages.BuyerSignInPage;
import com.pages.CreateTenderfromBuyerPage;

import utility.BrowserFactory;

public class VerifyCreateTenderfromBuyer 
{
	
	WebDriver driver;
	
	@Test
	public void createTenderbyBuyer() throws Exception
	{
		
		//Start the browser.
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
		Reporter.log("Browser launched");
		
		/*====================================================login BrewBroker Buyer ===================================================================*/
		
		//Created Page Object using Page Factory for Login.
		BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
		
		/*===========================Buyer Login====================================================*/
		signin.clickonLoginhomepage();	
		Reporter.log("Login form opened");
		signin.enterEmail("buyer082@mailinator.com");
		signin.enterPassword("@Test1234");
		signin.clickLoginButton();		
		Thread.sleep(3000);
		Reporter.log("Buyer logged in to brewbroker");
		CreateTenderfromBuyerPage tender=PageFactory.initElements(driver, CreateTenderfromBuyerPage.class);
		
		/*===========================Step One ====================================================*/
		tender.brewbroker_logo(); Thread.sleep(8000);
		tender.dashboard_link(); Thread.sleep(8000);
		Reporter.log("Buyer moved to dashboard brewbroker");
		tender.newTender(); Thread.sleep(5000);
		tender.ServiceYouNeedBoth();
		tender.nameOfTender();
		tender.descriptionTender();
		tender.submitQuoteBy();
		tender.deliverContractBy();
		Reporter.log("Step one tender details are filled");
		tender.nextForm();  Thread.sleep(3000);
		
		/*============================================ Step Two ==============================================*/
		Reporter.log("Buyer moved to step two create tender");
		tender.brewingServices(); Thread.sleep(1000);
		tender.style_Ales();
		tender.ales_ABP();
		tender.ales_icanprovide();
		tender.style_lager();
		tender.lager_ABP();
		tender.lager_icanprovide();
		tender.next_Form_two();  Thread.sleep(2000);
		Reporter.log("Step two create tender form is filled");	
		
		/*===============================================Step Three =====================================================*/
		Reporter.log("Buyer entered step three create tender");
		tender.contract_type(); Thread.sleep(1000);
		tender.volume_ales(); Thread.sleep(1000);
		tender.container_type(); Thread.sleep(1000);
		tender.size_type(); Thread.sleep(1000); 
		tender.shape_type(); Thread.sleep(1000);
		tender.color_type(); Thread.sleep(1000);
		tender.shelflife_type(); Thread.sleep(1000);
		tender.labelling_type();
		tender.tickales();
	
		tender.volume_lager(); Thread.sleep(1000);
		tender.container_typelager(); Thread.sleep(1000);
		tender.size_typelager(); Thread.sleep(1000); 
		tender.shape_typelager(); Thread.sleep(1000);
		tender.color_typelager(); Thread.sleep(1000);
		tender.shelflife_typelager(); Thread.sleep(1000);
		tender.labelling_typelager();
		tender.ticklager();
		tender.continue_step_three(); Thread.sleep(3000);
		Reporter.log("Step three create tender form details are filled");
		
		/*=================================Step Four=========================================================================*/
		Reporter.log("Create tender step four buyer moved");
		tender.duty(); Thread.sleep(2000);
		tender.duty_continue(); Thread.sleep(2000);
		Reporter.log("Buyer completed create tender step four");
	
		
		/*====================================Step Five========================================================================*/
		tender.arrange_collection();
		tender.storage_click();
		tender.ambient_click();
		tender.duration_click();
		tender.stepfive_sontinue(); Thread.sleep(2000);
		Reporter.log("create tender step five complted");
		
		/*===============================================Step Six==================================================================*/
		Reporter.log("Buyer moved create tender step six");
		tender.standards();
		tender.qualifications();
		tender.communication();
		tender.stepsix_continue();
		tender.stepsix_continue(); Thread.sleep(3000);
		Reporter.log("Create tender step six completed");
		
		/*================================================Step Seven=====================================================*/		
		tender.continue_step_seven();Thread.sleep(5000);
		Reporter.log("create tender step seven completed");
		
		/*================================================Step Eight=====================================================*/	
		//tender.clicktext();Thread.sleep(5000);
		
		//tender.selectMoorhouseBrewery();Thread.sleep(3000);
		//tender.selectCreateBrwery();Thread.sleep(3000);
		//tender.selectBhopstuff();Thread.sleep(1000);
		Thread.sleep(35000);
		tender.submitTender();Thread.sleep(4000);
		tender.viewDashboard();	
		Reporter.log("Buyer created the tender successfully");
	}
	
}
