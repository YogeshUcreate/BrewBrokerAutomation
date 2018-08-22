package com.TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pages.CreateSupplierOnboarding;

import utility.BrowserFactory;

public class VerifySupplierOnboarding {
	WebDriver driver;
	@Test
	public void createSupplier() throws Exception
	{
	
	//Start the browser.
	driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
	CreateSupplierOnboarding supp = PageFactory.initElements(driver, CreateSupplierOnboarding.class);
	driver.navigate().to("http://brewbroker-react.herokuapp.com/supplier");
	supp.FirstName(); Thread.sleep(4000);
	supp.SurName(); Thread.sleep(4000);
	supp.Company(); Thread.sleep(4000);
	supp.EmailAddress(); Thread.sleep(4000);
	supp.Password(); Thread.sleep(4000);
	supp.ContractBrewer(); Thread.sleep(4000);
	supp.BrewingLicenceConfirm(); Thread.sleep(4000);
	Reporter.log("Supplier filled form one general information");
	supp.ContinueOne(); Thread.sleep(4000);
	//-----------------------------------------------Step 2---------------------------------------------//
	supp.CompanyAddress(); Thread.sleep(4000);
	Reporter.log("Supplier filled form two addess");
	supp.ContinueTwo(); Thread.sleep(4000);
	//----------------------------------------------------Step3---------------------------------------//
	supp.BrewingServices(); Thread.sleep(4000);
	supp.StylesBrewing(); Thread.sleep(4000);
	supp.BreweryVisit(); Thread.sleep(4000);
	Reporter.log("Supplier filled Brewing services and brewing styles");
	supp.ContinueThree(); Thread.sleep(4000);
	//--------------------------------------------------------Step 4-----------------------------------------//
	supp.AnnualCapacity(); Thread.sleep(4000);
	supp.MinimumBrewLength(); Thread.sleep(4000);
	supp.MaximumBrewLength(); Thread.sleep(4000);
	supp.ContractBuyers();Thread.sleep(4000);
	supp.FaciltateBrews(); Thread.sleep(4000);
	Reporter.log("Supplier filled Annual capacity, min/max brew length");
	supp.ContinueFour(); Thread.sleep(4000);
	//------------------------------------------------------------Step 5---------------------------------------//
	supp.OnsiteBottling(); Thread.sleep(4000);
	supp.BottleThirdParty(); Thread.sleep(4000);
	supp.detailsbottle(); Thread.sleep(4000);
	supp.CanningOnSite(); Thread.sleep(4000);
	supp.CanningThirdParty(); Thread.sleep(4000);
	supp.detailCanning(); Thread.sleep(4000);
	supp.KegsOnsite(); Thread.sleep(4000);
	supp.KegsThirdParty(); Thread.sleep(4000);
	supp.detailsKegs(); Thread.sleep(4000);
	supp.CasksOnSite(); Thread.sleep(4000);
	supp.CasksThirdParty(); Thread.sleep(4000);
	supp.detailscasks(); Thread.sleep(4000);
	supp.BulkContainer(); Thread.sleep(4000);
	supp.detailsBulkcontainer(); Thread.sleep(4000);
	Reporter.log("Supplier has chosen various onsite packaging and 3rd pary supplier");
	supp.continueFive(); Thread.sleep(4000);
	//------------------------------------------------------------Step 6-----------------------------------------//
	supp.OfferDelivery(); Thread.sleep(4000);
	supp.WarehousingServices(); Thread.sleep(4000);
	supp.BondedStorage(); Thread.sleep(4000);
	Reporter.log("Supplier has chosen delivery and warehousing services");
	supp.ContinueSix(); Thread.sleep(4000);
	//---------------------------------------------------------Step 7---------------------------------------------//
	supp.HMRCRegisterationNumber(); Thread.sleep(4000);
	supp.ClassABulkBeer(); Thread.sleep(4000);
	Reporter.log("Supplier has given his registration number and class cerificate");
	supp.ContinueSeven(); Thread.sleep(4000);
	//--------------------------------------------------------Step 8-----------------------------------------------//
	supp.Standard(); Thread.sleep(4000);
	supp.Qualifications(); Thread.sleep(4000);
	supp.Awards(); Thread.sleep(4000);
	Reporter.log("Supplier has created standards and qualifications");
	supp.ContinueEight(); Thread.sleep(4000);
	
	//-----------------------------------------------------------Step 9----------------------------------------------//
	supp.SummaryBusiness(); Thread.sleep(4000);
	Reporter.log("Supplier added summary business");
	supp.ContinueNine(); Thread.sleep(4000);
	//---------------------------------------------------------Step--------------------------------------------------//
	supp.LogoProfile(); Thread.sleep(10000);
	supp.DonelogoUpload(); Thread.sleep(10000);
	supp.UploadFile1(); Thread.sleep(10000);
	supp.UploadFile2(); Thread.sleep(10000);
	supp.UploadFile3(); Thread.sleep(10000);
	Reporter.log("Supplier added profile pic and profile photos");
	supp.onboardingFinish(); Thread.sleep(4000);
	Reporter.log("Supplier account created successfully");
	
	}
	
}
