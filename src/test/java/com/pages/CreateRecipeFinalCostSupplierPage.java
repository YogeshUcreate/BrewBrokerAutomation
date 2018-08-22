package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateRecipeFinalCostSupplierPage {
	
	WebDriver driver;
	
	//-----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/span")
	@CacheLookup
	WebElement submitfinalcost;
	 public void SubmitFinalCost() {
		 submitfinalcost.click();
	 }
	 
	 //-----------------------------------------------------------------------------------------------------------------
	 @FindBy(how=How.XPATH,using="//*[@id=\"ingredients\"]")
	 @CacheLookup
	 WebElement ingredientcost;
	 public void IngredientCost() {
		 ingredientcost.sendKeys("100.00");
	 }
	 
	 //---------------------------------------------------------------------------------------------------------------------- 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[8]/div/div")
	 @CacheLookup
	 WebElement totalcost;
	 @FindBy(how=How.XPATH,using="//*[@id=\"amount1\"]")
	 @CacheLookup
	 WebElement amountpaymentmilestone;
	 public void TotalCost() {
		 String value = totalcost.getText();
		 System.out.println("Value total cost is:" +value);
		 value = value.replaceFirst("£ ", "");
		 System.out.println("Value total cost is:" +value);
		 amountpaymentmilestone.sendKeys(value);
		 
	 }
	
	 //--------------------------------------------------------------------------------------------------------------------
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[5]/textarea")
	 @CacheLookup
	 WebElement addyourcomments;
	 public void AddYourComment() {
		 addyourcomments.sendKeys("This is dummy comment on your add your comment field recipe final cost page");
	 }
	 
	 //----------------------------------------------------------------------------------------------------------------------
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[6]/input")
	 @CacheLookup
	 WebElement sendtobuyer;
	 public void SendToBuyer() {
		 sendtobuyer.sendKeys("This is dummy comment on your add your comment field recipe final cost page");
	 }
}
