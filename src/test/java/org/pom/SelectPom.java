package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.baseclass;

public class SelectPom extends baseclass {
public SelectPom() {
PageFactory.initElements(driver, this);

}

@FindBy(xpath="//*[@id='radiobutton_2']")
private WebElement SelectButton;
public WebElement getSelectButton() {
	return SelectButton;
}

@FindBy(name="continue")
private WebElement Continue;
public WebElement getContinue() {
	return Continue;
}
}
