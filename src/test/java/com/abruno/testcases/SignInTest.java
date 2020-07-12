package com.abruno.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.abruno.base.Page;
import com.abruno.pages.actions.SignInPage;
import com.abruno.utilities.Utilities;

public class SignInTest {
	
	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void SignInTestTest(Hashtable<String, String> data) {
		if(data.get("runmode").equalsIgnoreCase("N")) {
			throw new SkipException("skipping the test as the runmode is N");
		}
		Page.initConfiguration();
		SignInPage signin = Page.topNav.gotToAccount();
		signin.doLogin(data.get("username"), data.get("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		if(Page.driver!=null) {
			Page.quitBrowser();
		}
	}
}
