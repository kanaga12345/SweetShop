package org.execution;

import org.global.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.manager.PageManager;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebElement;

public class LoginPageValidation extends BaseClass {
	
		public static BaseClass baseClass = new BaseClass();
		public static PageManager pageManager = new PageManager();
		@BeforeClass
		public static void lounchBrowser() {
			try {
				baseClass.getDriver(baseClass.readExcel(1, 0));
				baseClass.windowsMax();
				
			} catch (SessionNotCreatedException e) {

				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
				System.out.println("Check Browser Version and Dependecncy");

			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
			
		}
		@Before
		public void loginPageValidation() {
			try {
				baseClass.getUrl(baseClass.readExcel(1, 1));
				
			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
			
		}
		
		
		@Test
		public void EnterLoginCredentials() {
			try {
				WebElement login = pageManager.getLoginPage().getLogin();
				baseClass.clickButton(login);
				
				Thread.sleep(2000);
				
				if(pageManager.getLoginPage().getLogintext().isDisplayed()){
					System.out.println("user in login page");
				}else {
					System.out.println("user not in login page");
				}
				
			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
		}
		
		
		@After
		public void LoginButtonValidation() {
			try {
				WebElement emailAddress = pageManager.getLoginPage().getEmailAddress();
				baseClass.sendKeys(emailAddress, baseClass.readExcel(1, 2));
				
				WebElement password = pageManager.getLoginPage().getPassword();
				baseClass.sendKeys(password, baseClass.readExcel(1, 3));
				
			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
		}
		
		
		@AfterClass
		public static void loginSuccessfullvalidation() {
			try {
				
				WebElement loginButton = pageManager.getLoginPage().getLoginButton();
				baseClass.clickButton(loginButton);
				
				if (pageManager.getSweetsPage().getBaseketButton().isDisplayed()) {
					System.out.println("user successfully login ");
				}else {
					System.out.println("user successfully not login ");
				}
				
			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
		}
		
		
		
	

}
