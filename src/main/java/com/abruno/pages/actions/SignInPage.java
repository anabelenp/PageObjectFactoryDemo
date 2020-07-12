package com.abruno.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.abruno.base.Page;
import com.abruno.pages.locators.SignInPageLocators;

public class SignInPage extends Page {
	
public SignInPageLocators signinPage;
	
	public SignInPage(){
		
		this.signinPage = new SignInPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.signinPage);
		
	}
	
	public void doLogin(String username, String password) {
		type(signinPage.emailField, username);
		type(signinPage.emailPassword, password);
		click(signinPage.emailSubmitButton);
	}
		
}


