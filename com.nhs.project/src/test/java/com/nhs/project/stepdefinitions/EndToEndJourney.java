package com.nhs.project.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import envReader.EnvReader;
import pageObjects.*;


public class EndToEndJourney 
{
	WebDriver driver = Hooks.driver;
	
	@Given("^I navigate to NHS cost checker tool$")
	public void i_navigate_to_NHS_cost_checker_tool() throws Throwable 
	{
		 driver.get(EnvReader.getProperty("URL")); // Navigate to the NHS Checker tool
	}

	@Given("^I am a person from Wales$")
	public void i_am_a_person_from_Wales() throws Throwable 
	{
		NhsStartPage nhsStartPage = new NhsStartPage(driver);
		nhsStartPage.clickOnNextButton();
		CountryPage countryPage = new CountryPage(driver);
		countryPage.clickOnWalesRadioBtn();
		countryPage.clickOnNextButton();
		GpPracticePage gpPracticePage = new GpPracticePage(driver);
		gpPracticePage.clickOnYesRadioBtn();
		gpPracticePage.clickOnNextButton();
		DentalPracticePage dentalPracticePage = new DentalPracticePage(driver);
		dentalPracticePage.clickOnWalesRadioBtn();
		dentalPracticePage.clickOnNextButton();	
	}

	@When("^I put my circumstances into the Checker tool$")
	public void i_put_my_circumstances_into_the_Checker_tool() throws Throwable 
	{
		
		DateOfBirthPage dateOfBirthPage = new DateOfBirthPage(driver);
		dateOfBirthPage.enterdayofBirth("06", "08", "1986");
		dateOfBirthPage.clickOnNextButton();
		
		DoYouLiveWithAPartner doYouLiveWithAPartner = new DoYouLiveWithAPartner(driver);
		doYouLiveWithAPartner.clickOnYesRadioBtn();
		doYouLiveWithAPartner.clickOnNextButton();
		
		DoYouOrYourPartnerCliamAnyBenefitsOrTaxCredits doYouOrYourPartnerCliamAnyBenefitsOrTaxCredits = new DoYouOrYourPartnerCliamAnyBenefitsOrTaxCredits(driver);
		doYouOrYourPartnerCliamAnyBenefitsOrTaxCredits.clickOnNoRadioBtn();
		doYouOrYourPartnerCliamAnyBenefitsOrTaxCredits.clickOnNextButton();
		
		PregnantPage pregnantPage = new PregnantPage(driver);
		pregnantPage.clickOnYesRadioBtn();
		pregnantPage.clickOnNextButton();
		
		InjuryOrIllnessPage injuryOrIllnessPage = new InjuryOrIllnessPage(driver);
		injuryOrIllnessPage.clickOnYesRadioBtn();
		injuryOrIllnessPage.clickOnNextButton();
		
		DiabetesPage diabetesPage = new DiabetesPage(driver);
		diabetesPage.clickOnNoRadioBtn();
		diabetesPage.clickOnNextButton();
		
		GlaucomaPage glaucomaPage = new GlaucomaPage(driver);
		glaucomaPage.clickOnNoRadioBtn();
		glaucomaPage.clickOnNextButton();
		
		CareHomePage careHomePage = new CareHomePage(driver);
		careHomePage.clickOnYesRadioBtn();
		careHomePage.clickOnNextButton();
		
		PayCareHomeFromLocalCouncilPage payCareHomeFromLocalCouncilPage = new PayCareHomeFromLocalCouncilPage(driver);
		payCareHomeFromLocalCouncilPage.clickOnYesRadioBtn();
		payCareHomeFromLocalCouncilPage.clickOnNextButton();
		
	}

	@Then("^I should get a result of whether I will get help or not$")
	public void i_should_get_a_result_of_whether_I_will_get_help_or_not() throws Throwable 
	{
		String expectedTitle = "Because you get help from your local council to pay for your care home - Check what help you could get to pay for NHS costs - NHSBSA";
		
		Assert.assertTrue(expectedTitle.equalsIgnoreCase(driver.getTitle()), "Not Result Page");
	}	
}
