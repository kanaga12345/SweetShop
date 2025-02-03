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

public class SweetPageValidation extends BaseClass {
	
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
			try {
				baseClass.getUrl(baseClass.readExcel(1, 1));
				
			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
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
			try {
				WebElement emailAddress = pageManager.getLoginPage().getEmailAddress();
				baseClass.sendKeys(emailAddress, baseClass.readExcel(1, 2));
				
				WebElement password = pageManager.getLoginPage().getPassword();
				baseClass.sendKeys(password, baseClass.readExcel(1, 3));
				
			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
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
		@Before
		public void SweetValidation() {
			try {
				WebElement sweets = pageManager.getSweetsPage().getSweets();
				baseClass.clickButton(sweets);
				
			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
			
		}
		
		
		@Test
		public void EnterSweetPageCredentials() {
			try {
				WebElement addItem1 = pageManager.getSweetsPage().getAddItem1();
				baseClass.clickButton(addItem1);
				
				WebElement addItem2 = pageManager.getSweetsPage().getAddItem2();
				baseClass.clickButton(addItem2);
				
				WebElement addItem3 = pageManager.getSweetsPage().getAddItem3();
				baseClass.clickButton(addItem3);
				
			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
		}
		
		
		@After
		public void LoginButtonValidation() {
			try {
				WebElement baseketButton = pageManager.getSweetsPage().getBaseketButton();
				baseClass.clickButton(baseketButton);
				
			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
		}
		
		
		@AfterClass
		public static void loginSuccessfullvalidation() {
			try {
				if (pageManager.getSweetsPage().getAddToCardPageText().isDisplayed()) {
					System.out.println("user in Add to Card page");
				}else {
					System.out.println("user not in Add to Card page");
				}
				
			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
		}
		
		
		
	

}
