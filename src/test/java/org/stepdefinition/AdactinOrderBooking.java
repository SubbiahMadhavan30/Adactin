package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.pom.BkConformPom;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinOrderBooking extends baseclass {
        BkConformPom bk;
	@When("user want to print the conformation booking order in console")
	public void user_want_to_print_the_conformation_booking_order_in_console() throws InterruptedException, IOException {
         bk = new BkConformPom();
         applywaitsToAllElements();
        System.out.println(getattributeValue(bk.getOrderid(), "value"));
        createcell("Adactinhotel", "Sheet1", 18, 1,getattributeValue(bk.getOrderid(), "value"));
	}
	
	@Then("user want to logout the Adactin application")
	public void user_want_to_logout_the_adactin_application() {
         clickable(bk.getLogout());
	}



}
