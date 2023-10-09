$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Myntra.feature");
formatter.feature({
  "name": "To validate login functionality of myntra application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@f.myntra"
    }
  ]
});
formatter.scenario({
  "name": "To validate login with valid mobile number and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@f.myntra"
    }
  ]
});
formatter.step({
  "name": "To launch the firefox browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "Myntralogin.to_launch_the_firefox_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of the myntra application",
  "keyword": "When "
});
formatter.match({
  "location": "Myntralogin.to_launch_the_url_of_the_myntra_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid mobile number in mobile number field",
  "keyword": "And "
});
formatter.match({
  "location": "Myntralogin.to_pass_the_valid_mobile_number_in_mobile_number_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To passs the valid password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Myntralogin.to_passs_the_valid_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Myntralogin.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To  check whether navigate to the homepage or not",
  "keyword": "And "
});
formatter.match({
  "location": "Myntralogin.to_check_whether_navigate_to_the_homepage_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Myntralogin.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});