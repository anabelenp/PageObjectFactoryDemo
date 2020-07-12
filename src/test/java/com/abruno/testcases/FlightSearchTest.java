package com.abruno.testcases;


import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.abruno.base.Page;
import com.abruno.pages.actions.Homepage;
import com.abruno.utilities.Utilities;

public class FlightSearchTest {

	public void setUp() {
		Page.initConfiguration();
	}

	
	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void flighSearchTest(Hashtable<String, String> data) {
		if(data.get("runmode").equalsIgnoreCase("N")) {
			throw new SkipException("skipping the test as the runmode is N");
		}
			Homepage hp = new Homepage();
			hp.gotToFlights().bookaFlight(data.get("fromCity"), data.get("toCity"), data.get("fromDate"), data.get("toDate"), data.get("noOfAdults"), data.get("noOfChildren"), data.get("firstAge"), data.get("secondAge"));
			
	}
	
	public void tearDown() {
		Page.quitBrowser();
	}
}

