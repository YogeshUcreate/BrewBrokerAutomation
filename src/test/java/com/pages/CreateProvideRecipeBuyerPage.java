		package com.pages;
		
		import java.io.IOException;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.CacheLookup;
		import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.How;
		
		public class CreateProvideRecipeBuyerPage {
		
		WebDriver driver;
		//--------------------------------------------------------------------------------------------------------------------
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[2]/span")
		@CacheLookup
		WebElement openTender;
			
		public void ClickTender() {
			openTender.click();
		}
		//-----------------------------------------------------------------------------------------------------------------------
		
		@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr/td[2]/span")
		@CacheLookup
		WebElement statusToReview;
		public void clickStatus() {
			statusToReview.click(); 
		}
		//---------------------------------------------------------------------------------------------------------------------
		
		@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div[3]/div[25]/input[2]")
		@CacheLookup
		WebElement approveandproviderecipe;
		public void approveAndProvideRecipe() {
			approveandproviderecipe.click();
		}
		//-----------------------------------------------------------------------------------------------------------------------
		
		@FindBy(how=How.XPATH,using="//*[@id=\"test\"]")
		@CacheLookup
		WebElement textmethodsInstructions;
		public void textMethodsInstructions() {
			textmethodsInstructions.sendKeys("QA UI testing methods and instructions");
		}
		
		//-------------------------------------------------------------------------------------------------------------------------------

		@FindBy(how=How.XPATH,using="//*[@id=\"recipeFiles\"]")
		@CacheLookup
		WebElement uploadrecipe;
		public void UploadRecipeFiles() throws IOException {
			uploadrecipe.click();
			Runtime.getRuntime().exec("C:\\Autoit\\uploadrecipe.exe");
		}
		
		//-------------------------------------------------------------------------------------------------------------------------
		
		@FindBy(how=How.XPATH,using="//*[@id=\"ingredientsFiles\"]")
		@CacheLookup
		WebElement ingredientfile;
		public void UploadIngredientFiles() throws IOException {
			ingredientfile.click(); 
			Runtime.getRuntime().exec("c:\\Autoit\\uploadingredient.exe");
		}
		
		//--------------------------------------------------------------------------------------------------------------------------
		
		@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div[3]/div[2]/button")
		@CacheLookup
		WebElement sendtosupplier;
		public void SendToSupplier() {
			sendtosupplier.click();
		}
		
		//---------------------------------------------------------------------------------------------------------------------------
}
		
