Feature: Test CogmentoCRM Application

  Scenario: Validate Login Functionality
    Given user is on Login Page
    When user enter username and password
    Then user click on login button

  Scenario: Validate Home Page Functionality
    Given user is on home page Validate homeLogo
    Then user Validate HomePage Text
    * user validate HomePage Title
    And user validate HomePage Url

  Scenario: Validate contact page Functionality
    Given user click on contact link
    Then user click on create button
    And user create contact enter firstname,lastname and status
      | Shloka  | Gupta   | On Hold  |
     
    And user click on save button
    
    Scenario: Validate company page Functionality
    
    Given user click on company Link 
    And user click on company createe button
    * enter company details "HSBC","hsbc@gmail.com","Pune" and "hsbc123@yahoo.com"
    Then user click on comSave Button
    
