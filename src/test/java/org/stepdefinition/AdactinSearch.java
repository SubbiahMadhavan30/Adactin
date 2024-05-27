package org.stepdefinition;

import java.io.IOException;

import org.pom.LoginPom;
import org.pom.SearchPom;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinSearch extends baseclass {
	SearchPom s;

	@When("user want to fill the fields like location,hotels, Room type, No of rooms type")
	public void user_want_to_fill_the_fields_like_location_hotels_room_type_no_of_rooms_type() throws IOException {
		s = new SearchPom();
		sendvalue(s.getLocation(), readData("Adactinhotel", "Sheet1", 2, 1));
		sendvalue(s.getHotels(), readData("Adactinhotel", "Sheet1", 2, 1));
		sendvalue(s.getRoomtype(), readData("Adactinhotel", "Sheet1", 3, 1));
		sendvalue(s.getRoomno(), readData("Adactinhotel", "Sheet1", 4, 2));
		
		
		
	}
	
	@When("user send the value in check in date and check out date")
	public void user_send_the_value_in_check_in_date_and_check_out_date() throws IOException {
		s = new SearchPom();
		//sendvalue(s.getCheckin(), readData("Adactinhotel", "Sheet1", 6, 1));
		//sendvalue(s.getCheckout(),readData("Adactinhotel", "Sheet1", 7, 2));
	clean(s.getCheckin());
		
		s.getCheckin().sendKeys("18/07/2024");
		clean(s.getCheckout());
		s.getCheckout().sendKeys("19/07/2024");
	
	
		
	}
	
	@When("user want to fill the fields like Adults per room and Children per room")
	public void user_want_to_fill_the_fields_like_adults_per_room_and_children_per_room() throws IOException {
		//s = new SearchPom();
		
		sendvalue(s.getAdultroom(), readData("Adactinhotel", "Sheet1", 8, 4));
		sendvalue(s.getChildroom(),readData("Adactinhotel", "Sheet1", 9, 3));
	}
	
	@Then("user click the search button")
	public void user_click_the_search_button() {
		clickable(s.getSubmit());
           
		
		
		
	}



}
