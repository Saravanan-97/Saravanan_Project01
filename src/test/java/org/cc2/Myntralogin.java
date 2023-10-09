package org.cc2;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Myntralogin extends BaseClass {

	@Given("To launch the firefox browser and maximize the window")
	public void to_launch_the_firefox_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("To launch the url of the myntra application")
	public void to_launch_the_url_of_the_myntra_application() {

		driver.get("https://inmakeslh.in/login.php");

	}

	@When("To pass the valid mobile number in mobile number field")
	public void to_pass_the_valid_mobile_number_in_mobile_number_field() {

		driver.findElement(By.id("username")).sendKeys("08129739397");

	}

	@When("To passs the valid password in password field")
	public void to_passs_the_valid_password_in_password_field() {

		driver.findElement(By.name("password")).sendKeys("ieqbciQICY");
	}

	@When("To click the login button")
	public void to_click_the_login_button() {

		driver.findElement(By.id("loginBtn")).click();
	}

	@When("To  check whether navigate to the homepage or not")
	public void to_check_whether_navigate_to_the_homepage_or_not() {

		System.out.println("To  check whether navigate to the homepage or not");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	}

}
