package com.TestCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pages.BuyerSignInPage;
import com.pages.CreateEditSupplierPage;

import utility.BrowserFactory;

public class VerifyEditSupplierProfile {
	WebDriver driver;
	@Test
	public void EditSupplierPage() throws Exception
	{
	
	//Start the browser.
	driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
	driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
	
	/*====================================================login BrewBroker Buyer ===================================================================*/
	
	//Created Page Object using Page Factory for Login.
	BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
	
	/*===========================Supplier Login====================================================*/
	signin.clickonLoginhomepage();	
	
	signin.enterEmail("supplier055@mailinator.com"); Thread.sleep(4000);
	signin.enterPassword("@Test1234"); Thread.sleep(4000);
	signin.clickLoginButton(); Thread.sleep(4000);
	Reporter.log("Supplier logged in to his account");
	
	CreateEditSupplierPage edit=PageFactory.initElements(driver, CreateEditSupplierPage.class);
	edit.SummaryEdit(); Thread.sleep(4000);
	edit.SummaryEditTextField(); Thread.sleep(4000);
	edit.saveUpdatedSummary(); Thread.sleep(4000);
	Reporter.log("Supplier profile summary edited");
	
	edit.EditStandard(); Thread.sleep(4000);
	edit.Standard(); Thread.sleep(4000);
	edit.Qualification(); Thread.sleep(4000);
	edit.SaveStandardQualification(); Thread.sleep(4000);
	Reporter.log("Supplier profile standards qualification edited");
	
	edit.EditAwards(); Thread.sleep(4000);
	edit.deleteAward(); Thread.sleep(4000);
	edit.addAward(); Thread.sleep(4000);
	edit.SaveAward(); Thread.sleep(4000);
	Reporter.log("Supplier profile awards edited");
	
	edit.EditServices(); Thread.sleep(4000);
	edit.ChooseServices(); Thread.sleep(4000);
	edit.saveService(); Thread.sleep(4000);
	Reporter.log("Supplier profile services edited");
	
	edit.EditLogistics(); Thread.sleep(4000);
	edit.ChooseLogistics(); Thread.sleep(4000);
	edit.saveLogistics(); Thread.sleep(4000);
	Reporter.log("Supplier profile logistics edited");
	
	edit.ProfileEdit(); Thread.sleep(4000);
	edit.CompanyProfile();Thread.sleep(4000);
	edit.SaveProfile(); Thread.sleep(4000);
	Reporter.log("Supplier profile company field edited");
	
	edit.AnnualCapacityEdit(); Thread.sleep(4000);
	Reporter.log("Supplier profile annual brew length edited");
	
	edit.EditOrderVolume(); Thread.sleep(4000);
	Reporter.log("Supplier profiles min/max brew length edited");
	
	edit.EditStyles(); Thread.sleep(4000);
	Reporter.log("Supplier profiles styles edited");
	//edit.EditOnsitePackaging(); Thread.sleep(4000);
}
}