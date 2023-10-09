@f.myntra
Feature: To validate login functionality of myntra application
Scenario: To validate login with valid mobile number and password
Given To launch the firefox browser and maximize the window
When To launch the url of the myntra application
And To pass the valid mobile number in mobile number field
And To passs the valid password in password field
And To click the login button
And To  check whether navigate to the homepage or not
Then To close the browser