Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens ilcarro Home Page
    And User clicks on Log in link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success log in
    And User quites browser

  @wrongPassword
  Scenario Outline: Login with valid email and wrong password
    Given User launches Chrome browser
    When User opens ilcarro Home Page
    And User clicks on Log in link
    And User enters valid email and wrong password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies error is displayed
    And User quites browser
    Examples:
      | email          | password    |
      | neuer+1@gm.com | Manuel12341 |
      | neuer+1@gm.com | manuel1234! |
      | neuer+1@gm.com | MANUEL1234! |
      | neuer+1@gm.com | Manuelllll! |