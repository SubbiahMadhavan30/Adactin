package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.baseclass;

public class SearchPom extends baseclass {
	public SearchPom() {
     PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//*[@name='location']")
	private WebElement location;
	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(id="hotels")
	private WebElement hotels;
	public WebElement getHotels() {
		return hotels;
	}
	
	@FindBy(xpath="//*[@name='room_type']")
	private WebElement roomtype;
	public WebElement getRoomtype() {
		return roomtype;
	}
	
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	public WebElement getRoomno() {
		return roomno;
	}
	
	@FindBy(xpath="//*[@value='24/05/2024']")
	private WebElement checkin;
	public WebElement getCheckin() {
		return checkin;
	}
	
	
	@FindBy(name="datepick_out")
	private WebElement checkout;
	public WebElement getCheckout() {
		return checkout;
	}
	

	@FindBy(xpath="//*[@name='adult_room']")
	private WebElement adultroom;
	public WebElement getAdultroom() {
		return adultroom;
	}
	
	@FindBy(id="child_room")
	private WebElement childroom;
	public WebElement getChildroom() {
		return childroom;
	}
	
	@FindBy(name="Submit")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}

	

	

	

	

	

	
	

}
