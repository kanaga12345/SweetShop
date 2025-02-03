package org.manager;

import org.global.BaseClass;
import org.page.BasketPage;
import org.page.LoginPage;
import org.page.SweetsPage;

public class PageManager extends BaseClass{
	private LoginPage loginPage;
	private SweetsPage sweetsPage;
	private BasketPage basketPage;
	
	public LoginPage getLoginPage() {
		return(loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}
	public SweetsPage getSweetsPage() {
		return(sweetsPage == null) ? sweetsPage = new SweetsPage() : sweetsPage;
	}
	public BasketPage getBasketPage() {
		return(basketPage == null) ? basketPage = new BasketPage() : basketPage;
	}
	

}
