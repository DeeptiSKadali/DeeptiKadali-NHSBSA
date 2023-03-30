package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage 
{
	public WebDriver driver;
	
	@FindBy(how = How.ID, using = "next-button")
	private WebElement nextButton;
	
	@FindBy(how = How.ID, using = "label-yes")
	private WebElement yesRadioButton;
	
	@FindBy(how = How.ID, using = "label-no")
	private WebElement noRadioButton;
	
	public  BasePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public void clickOnYesRadioBtn() 
	{
    	yesRadioButton.click();
    }
	
	public void clickOnNoRadioBtn() 
	{
		noRadioButton.click();
    }
	
	public void clickOnNextButton()
	{
		nextButton.click();
	}


}
