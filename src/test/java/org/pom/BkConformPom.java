package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.baseclass;

public class BkConformPom extends baseclass {
 public BkConformPom() {

PageFactory.initElements(driver, this);
}
 
 @FindBy(xpath="//*[@id='order_no']")
 private WebElement orderid;
 public WebElement getOrderid() {
		return orderid;
	}
 
 @FindBy(id="logout")
 private WebElement logout;
 public WebElement getLogout() {
	return logout;
}
	


}
