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


