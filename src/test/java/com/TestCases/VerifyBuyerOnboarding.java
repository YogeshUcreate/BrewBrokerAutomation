package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pages.CreateBuyerOnboarding;

import utility.BrowserFactory;

public class VerifyBuyerOnboarding {
	WebDriver driver;
	@Test
	public void createBuyer() throws Exception
	{
	
	//Start the browser.
	driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
	driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
	CreateBuyerOnboarding buyer = PageFactory.initElements(driver, CreateBuyerOnboarding.class);
	driver.navigate().to("http://brewbroker-react.herokuapp.com/buyer");
	buyer.BreweryType(); Thread.sleep(3000);
	Reporter.log("Buyer selected brewery type");
	buyer.ContinueOne(); Thread.sleep(3000);
	
	buyer.FirstName(); Thread.sleep(3000);
	Reporter.log("Buyer added first name");
	
	buyer.LastName(); Thread.sleep(3000);
	Reporter.log("Buyer added last name");
	
	buyer.CompanyName(); Thread.sleep(3000);
	Reporter.log("Buyer added company name");
	
	buyer.Emailid(); Thread.sleep(3000);
	Reporter.log("Buyer added email address");
	
	buyer.Password(); Thread.sleep(3000);
	Reporter.log("Buyer added general information");
	
	buyer.ContinueTwo(); Thread.sleep(3000);
	buyer.profilePictureBuyer(); Thread.sleep(5000);
	Reporter.log("Buyer added profile picture");
	
	
	buyer.LocationBuyer();  Thread.sleep(10000);
	Reporter.log("Buyer added his location");
	
	buyer.SummaryBuyer();  Thread.sleep(3000);
	Reporter.log("Buyer added summary");
	
	buyer.ContinueFour(); Thread.sleep(4000);
	Reporter.log("Buyer account created successfully");
}
}