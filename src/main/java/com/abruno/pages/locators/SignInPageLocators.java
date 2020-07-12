package com.abruno.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageLocators {
	
	@FindBy(css ="#gss-signin-email")
	public WebElement emailField;
	
	@FindBy(css ="#gss-signin-password")
	public WebElement emailPassword;
	
	@FindBy(css ="#gss-signin-submit")
	public WebElement emailSubmitButton;
	

}
