package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.baseclass;

public class LoginPom extends baseclass{
	public LoginPom() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	
	@FindBy(id="login")
	private WebElement login;
    public WebElement getLogin() {
		return login;
	}

}
