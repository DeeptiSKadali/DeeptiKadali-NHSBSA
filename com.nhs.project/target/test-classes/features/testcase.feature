@EndToEnd
Feature: NHS checker End to End journey

			To verrify the functionlaity of NHS cost checker tool
		
#		   There are so many different journeys
#		   For this test execution i have used the following operations.
#		   Country - Wales
#		   Gp Practice in Scotland or Wales - Yes
#		   Dental Practice - Wales
#		   DOB = 06, 08, 1986
#		   DoYouLiveWithAPartner - Yes
#		   DoYouOrYourPartnerCliamAnyBenefitsOrTaxCredits - No
#		   PregnantPage - Yes
#		   InjuryOrIllnessPage - Yes
#		   DiabetesPage - No
#		   GlaucomaPage - No
#		   CareHomePage - Yes
#		   PayCareHomeFromLocalCouncilPage - Yes
		 
      
  Background:
   
    Given I navigate to NHS cost checker tool

  @Sanity
  Scenario: UK Test Ticket - Acceptance Criteria
            
      Given I am a person from Wales
	  When I put my circumstances into the Checker tool
	  Then I should get a result of whether I will get help or not
	  
#	  For full test coverage, we can use example table to cover the above scenario for different countries in UK
	    
	   