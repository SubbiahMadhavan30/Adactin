package org.stepdefinition;

import java.io.IOException;

import org.pom.LoginPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinLogin extends baseclass{
	
	LoginPom l;

	@Given("User launch the Adactin Hotel Application Page")
	public void user_launch_the_adactin_hotel_application_page() {
            launchbrowser("chrome");
            launchurl("http://adactinhotelapp.com/");
            maximize();

	}
	@When("user pass the valid user name and invalid password")
	public void user_pass_the_valid_user_name_and_invalid_password() throws IOException {
		l = new LoginPom();
		sendvalue(l.getUsername(), readData("Adactinhotel", "Sheet1", 0, 2) );
		sendvalue(l.getPassword(), readData("Adactinhotel", "Sheet1", 1, 2));
	
		
	    
	}
	@Then("user click the login button")
	public void user_click_the_login_button() {
	  clickable(l.getLogin());
	}
	@Then("verify the login page whether the error message is showing or not")
	public void verify_the_login_page_whether_the_error_message_is_showing_or_not() {


	}

	

	@When("user pass the valid user name and valid password")
	public void user_pass_the_valid_user_name_and_valid_password() throws IOException {
		l= new LoginPom();
       sendvalue(l.getUsername(), readData("Adactinhotel", "Sheet1", 0, 1));
       sendvalue(l.getPassword(), readData("Adactinhotel", "Sheet1", 1, 1));

	}
	@Then("user click the login btn")
	public void user_click_the_login_btn() {
     clickable(l.getLogin());

	}
	
	@Then("verify user can login to the next page")
	public void verify_user_can_login_to_the_next_page() {


	}









}
