package com.abruno.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {
	
	@FindBy(css ="#header-account-menu")
	public WebElement account;
	
	@FindBy(css ="#header-account-signin-button")
	public WebElement signInBtn;
	
	

}
