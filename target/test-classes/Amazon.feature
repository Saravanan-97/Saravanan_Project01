Feature: To validate login with functionality of amazon application

  Scenario: To validate login with valid email and valid password in sign up page
    Given To launch the firefox browser and maximise the window
    When To launch the amazon url
    And To pass the valid email or mobile number in email field
      #|mobile no 1|mobile no 2|mobile no 3|
      | 9829674523 | 9345236544 | 8328213009 |
    And To click the continue button
    And To pass the valid password in password field
      #|password 1|password 2|
      | inmakes | infotech |
      | pass2   | gvjhvk   |
    And To click the sign up button
    Then To close the entire browser
