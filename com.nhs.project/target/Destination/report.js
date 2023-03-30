$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testcase.feature");
formatter.feature({
  "line": 2,
  "name": "NHS checker End to End journey",
  "description": "\n\tTo verrify the functionlaity of NHS cost checker tool",
  "id": "nhs-checker-end-to-end-journey",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@EndToEnd"
    }
  ]
});
formatter.before({
  "duration": 2568198300,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 6,
      "value": "#\t\t   There are so many different journeys"
    },
    {
      "line": 7,
      "value": "#\t\t   For this test execution i have used the following operations."
    },
    {
      "line": 8,
      "value": "#\t\t   Country - Wales"
    },
    {
      "line": 9,
      "value": "#\t\t   Gp Practice in Scotland or Wales - Yes"
    },
    {
      "line": 10,
      "value": "#\t\t   Dental Practice - Wales"
    },
    {
      "line": 11,
      "value": "#\t\t   DOB \u003d 06, 08, 1986"
    },
    {
      "line": 12,
      "value": "#\t\t   DoYouLiveWithAPartner - Yes"
    },
    {
      "line": 13,
      "value": "#\t\t   DoYouOrYourPartnerCliamAnyBenefitsOrTaxCredits - No"
    },
    {
      "line": 14,
      "value": "#\t\t   PregnantPage - Yes"
    },
    {
      "line": 15,
      "value": "#\t\t   InjuryOrIllnessPage - Yes"
    },
    {
      "line": 16,
      "value": "#\t\t   DiabetesPage - No"
    },
    {
      "line": 17,
      "value": "#\t\t   GlaucomaPage - No"
    },
    {
      "line": 18,
      "value": "#\t\t   CareHomePage - Yes"
    },
    {
      "line": 19,
      "value": "#\t\t   PayCareHomeFromLocalCouncilPage - Yes"
    }
  ],
  "line": 22,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 24,
  "name": "I navigate to NHS cost checker tool",
  "keyword": "Given "
});
formatter.match({
  "location": "EndToEndJourney.i_navigate_to_NHS_cost_checker_tool()"
});
formatter.result({
  "duration": 701395700,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "UK Test Ticket - Acceptance Criteria",
  "description": "",
  "id": "nhs-checker-end-to-end-journey;uk-test-ticket---acceptance-criteria",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "I am a person from Wales",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I put my circumstances into the Checker tool",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "EndToEndJourney.i_am_a_person_from_Wales()"
});
formatter.result({
  "duration": 2579418800,
  "status": "passed"
});
formatter.match({
  "location": "EndToEndJourney.i_put_my_circumstances_into_the_Checker_tool()"
});
formatter.result({
  "duration": 6307513400,
  "status": "passed"
});
formatter.match({
  "location": "EndToEndJourney.i_should_get_a_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "duration": 14813300,
  "status": "passed"
});
formatter.after({
  "duration": 751411300,
  "status": "passed"
});
});