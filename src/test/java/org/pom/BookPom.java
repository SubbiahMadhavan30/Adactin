package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.baseclass;

public class BookPom extends baseclass {
public BookPom() {
	PageFactory.initElements(driver, this);
}

@FindBy(id="first_name")
private WebElement firstname;
public WebElement getFirstname() {
	return firstname;
}

@FindBy(id="last_name")
private WebElement lastname;
public WebElement getLastname() {
	return lastname;
}


@FindBy(id="address")
private WebElement address;
public WebElement getAddress() {
	return address;
}

@FindBy(id="cc_num")
private WebElement ccnum;
public WebElement getCcnum() {
	return ccnum;
}

@FindBy(id="cc_type")
private WebElement cctype;
public WebElement getCctype() {
	return cctype;
}

@FindBy(name="cc_exp_month")
private WebElement expmonth;
public WebElement getExpmonth() {
	return expmonth;
}

@FindBy(id="cc_exp_year")
private WebElement expyear;
public WebElement getExpyear() {
	return expyear;
}

@FindBy(name="cc_cvv")
private WebElement cvvNumber;
public WebElement getCvvNumber() {
	return cvvNumber;
}

@FindBy(name="book_now")
private WebElement booknow;
public WebElement getBooknow() {
	return booknow;
}
}
