package org.stepdefinition;

import org.pom.SelectPom;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinSelect extends baseclass {

SelectPom se;

	@When("user want to select the hotel creek in")
	public void user_want_to_select_the_hotel_creek_in() {
       se = new SelectPom();
      clickable(se.getSelectButton());
       

	}
	@Then("user click the continue button")
	public void user_click_the_continue_button() {
         clickable(se.getContinue());

		
	}
	@Then("to verify it moves to book a hotel page or not")
	public void to_verify_it_moves_to_book_a_hotel_page_or_not() {


		
	 
	}



}
