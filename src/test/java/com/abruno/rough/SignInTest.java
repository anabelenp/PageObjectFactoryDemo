package com.abruno.rough;

import com.abruno.base.Page;
import com.abruno.pages.actions.SignInPage;

public class SignInTest {
	
	public static void main(String[] args) {
		Page.initConfiguration();
		SignInPage signin = Page.topNav.gotToAccount();
		signin.doLogin("someemail@email.com", "somepassword");
		Page.quitBrowser();
	}
	

}
