package com.abruno.rough;


import org.testng.Assert;

import com.abruno.base.Page;
import com.abruno.errorcollectors.ErrorCollector;
import com.abruno.pages.actions.Homepage;

public class FlightSearchTest {
	public static void main(String[] args) {
			
			Page.initConfiguration();
			Homepage hp = new Homepage();
			//Assert.assertEquals(hp.findTabCount(), "6");
			//ErrorCollector.verifyEquals(hp.findTabCount(), 7);
			hp.gotToFlights().bookaFlight("San Diego, CA (SAN-San Diego Intl.)", "Tampa, FL (TPA-Tampa Intl.)", "07/28/2020", "08/10/2020", "2", "2", "11", "11");
			Page.quitBrowser();

	}
}
