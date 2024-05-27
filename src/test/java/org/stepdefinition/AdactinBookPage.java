package org.stepdefinition;

import java.io.IOException;

import org.pom.BookPom;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinBookPage extends baseclass{
	BookPom b;
	

	@When("user want to fill the firstname , lastname, Bill Address, credit card number")
	public void user_want_to_fill_the_firstname_lastname_bill_address_credit_card_number() throws IOException {
         b =new BookPom();
         sendvalue(b.getFirstname(),readData("Adactinhotel", "Sheet1", 10, 1));
         sendvalue(b.getLastname(),readData("Adactinhotel", "Sheet1", 11, 1));
         sendvalue(b.getAddress(),readData("Adactinhotel", "Sheet1", 12, 1));
         sendvalue(b.getCcnum(),readData("Adactinhotel", "Sheet1", 13, 1));

	}
	@When("user select the credit card type and select month and year in the dropdown menu")
	public void user_select_the_credit_card_type_and_select_month_and_year_in_the_dropdown_menu() throws IOException {
           b = new BookPom();
           sendvalue(b.getCctype(), readData("Adactinhotel", "Sheet1", 14, 3));
           sendvalue(b.getExpmonth(), readData("Adactinhotel", "Sheet1", 15, 9));
           sendvalue(b.getExpyear(), readData("Adactinhotel", "Sheet1", 16, 5));

	}
	@When("user want to fill the cvv number")
	public void user_want_to_fill_the_cvv_number() throws IOException {
		b= new BookPom();
		sendvalue(b.getCvvNumber(), readData("Adactinhotel", "Sheet1", 17, 2));


	}
	@Then("user click the book Now button")
	public void user_click_the_book_now_button() {
      clickable(b.getBooknow());
      

	}
	@Then("verify the order generate or not and print the order number in excel sheet")
	public void verify_the_order_generate_or_not_and_print_the_order_number_in_excel_sheet() {
	   



	}

}
