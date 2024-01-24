Feature: Home page

  @navigate
  Scenario: Verify Home Page is displayed
    Given User launches Chrome browser
    When User opens ilcarro Home Page
    Then User verifies Home page title is displayed
    And User quites browser