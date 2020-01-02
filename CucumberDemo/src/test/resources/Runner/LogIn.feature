Feature: Login into Rediff Money App

  @Login
  Scenario Outline: Login in App
    Given User launches <Browser> browser
    And User navigates to loginURL
    And User enters valid Username and valid Password 
      | Username | miraalmamun |
      | Password | Mimo949658  |
    And User clicks on log in button
    Then User should be on homepage and Login should be <Result>

    Examples: 
      | Browser | Result  |
      | Chrome  | success |
      | Mozilla | success |