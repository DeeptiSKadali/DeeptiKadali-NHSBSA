package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DentalPracticePage extends BasePage {
	
		@FindBy(how = How.ID, using = "label-wales")
		private WebElement walesRadioButton;
		
		
		public DentalPracticePage(WebDriver driver) 
		{
			super(driver);
		}

	    public void clickOnWalesRadioBtn() 
		{
			walesRadioButton.click();
	    }
}