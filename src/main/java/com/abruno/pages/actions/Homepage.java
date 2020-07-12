package com.abruno.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.abruno.base.Page;
import com.abruno.pages.locators.HomePageLocators;

public class Homepage extends Page{

	public HomePageLocators home;
	
	public Homepage() {
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);
	}
	
	
	public Homepage gotToFlights(){
		click(home.flightTab);

		return this;
	}
	
	public void gotToHotels(){
		
	}
	

	public void gotToCars(){
		
	}
	
	
	public void gotToCruises(){
		
	}
	
	
	public void bookaFlight(String from, String to, String departDate, String returnDate, String noOfAdults, String noOfChildren, String ageChild1, String ageChild2) {
		type(home.fromCity, from);
		type(home.toCity, to);
		type(home.departFlight, departDate);
		type(home.returnFlight, returnDate);
		type(home.adultCount, noOfAdults);
		type(home.childCount, noOfChildren);
		type(home.firstAge, ageChild1);
		type(home.secondAge, ageChild2);
		click(home.search);
	}

	
	public int findTabCount() {
		return home.tabCount.size();
	}
}

