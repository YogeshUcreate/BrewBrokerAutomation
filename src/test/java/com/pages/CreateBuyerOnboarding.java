package com.pages;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateBuyerOnboarding { 
@FindBy(how=How.XPATH,using="//*[@id=\"buyerType0\"]") 
@CacheLookup 
WebElement brewerytype; 
public void BreweryType() {
	brewerytype.click(); 
}
//------------------------------------------------------------------------
@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div/div[2]/div/div[2]/div/div/div[8]/input")
@CacheLookup 
WebElement continueone; 
public void ContinueOne() { 
	continueone.click();
}
//------------------------------------------------------------------------------------------------------------------
@FindBy(how=How.XPATH,using="//*[@id=\"firstname\"]")
@CacheLookup 
WebElement fname; 
public void FirstName() {
	fname.sendKeys("Testing");
}  
//---------------------------------------------------------------------------------------------------------------------------
@FindBy(how=How.XPATH,using="//*[@id=\"lastname\"]")
@CacheLookup
WebElement lname;
public void LastName() {
	lname.sendKeys("SQA");
}
//--------------------------------------------------------------------------------------------------------------------------
@FindBy(how=How.XPATH,using="//*[@id=\"brewery\"]")
@CacheLookup
WebElement companyname;
public void CompanyName() {
	companyname.sendKeys("ucreate");
}
//------------------------------------------------------------------------------------------------------------------------------
@FindBy(how=How.XPATH,using="//*[@id=\"emailId\"]")
@CacheLookup
WebElement email;
public void Emailid() {
	Random randomGenerator = new Random(); 
	int randomInt = randomGenerator.nextInt(1000);  
	email.sendKeys("buyeruser"+ randomInt +"@mailinator.com"); 
}
//----------------------------------------------------------------------------------------------------------------
@FindBy(how=How.XPATH,using="//*[@id=\"password\"]")
@CacheLookup
WebElement password;
public void Password() {
	password.sendKeys("@Test1234");
}
//---------------------------------------------------------------------------------------------------------------------

@FindBy(how=How.XPATH,using="//*[@id=\"signup-form\"]/div[7]/input")
@CacheLookup
WebElement continuetwo;
public void ContinueTwo() {
	continuetwo.click();
}
//-----------------------------------------------------------------------------------------------------------------
@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]")
@CacheLookup
WebElement logobuyer;
public void profilePictureBuyer() throws IOException, Exception {
	logobuyer.click(); Thread.sleep(4000); 
	Runtime.getRuntime().exec("C:\\Autoit\\logofile.exe"); Thread.sleep(4000);	
}
//----------------------------------------------------------------------------------------------------------------------

@FindBy(how=How.XPATH,using="//*[@id=\"PlacesAutocomplete__root\"]/input")
@CacheLookup
WebElement location;
public void LocationBuyer() {
	location.sendKeys("123 Oxford Street, London, UK");
}
//-------------------------------------------------------------------------------------------------------------------
@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div/div[2]/div/div[2]/div/div/div[4]/textarea")
@CacheLookup
WebElement summary;
public void SummaryBuyer() {
	summary.sendKeys("Similique sit et. Congue, exercitationem. Reiciendis. scelerisque vehicula, sapiente maiores iste leo, nam "
			+ "nemo vitae voluptas Vehicula proident dolores natoque, et modi? Nisi, voluptatum scelerisque vehicula, sapiente "
			+ "maiores iste leo, nam nemo vitae voluptas? ");
}
//-----------------------------------------------------------------------------------------------------------------------------
@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div/div[2]/div/div[2]/div/div/div[5]/input")
@CacheLookup
WebElement continuefour;
public void ContinueFour() {
	continuefour.click();	
}
















}
