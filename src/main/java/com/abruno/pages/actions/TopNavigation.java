package com.abruno.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.abruno.base.Page;
import com.abruno.pages.locators.TopNavigationLocators;

public class TopNavigation {

	public TopNavigationLocators topNavigation;
	
	public TopNavigation() {
		this.topNavigation = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(Page.driver, 10);
		PageFactory.initElements(factory, this.topNavigation);
	}
	
	
	public SignInPage gotToAccount() {
		Page.click(topNavigation.account);
		Page.click(topNavigation.signInBtn);
		
		return new SignInPage();
	}
	
	
	public void gotToMyLists() {
		
	}
	

	public void gotToMyTrips() {
	
	}

	
	public void gotToSupport() {
	
	}


	
}
