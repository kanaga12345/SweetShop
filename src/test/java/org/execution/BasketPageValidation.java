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

public class BasketPageValidation extends BaseClass {
	
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
			try {
				WebElement sweets = pageManager.getSweetsPage().getSweets();
				baseClass.clickButton(sweets);
				
			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
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
			try {
				WebElement baseketButton = pageManager.getSweetsPage().getBaseketButton();
				baseClass.clickButton(baseketButton);
				
			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
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
		@Before
		public void YourBasketPageValidation() {
			try {
				if (pageManager.getBasketPage().getYourbasketText().isDisplayed()) {
					System.out.println("user in Basket page");
					
				}else {
					System.out.println("user not in Basket page");
				}
				
			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
			
		}
		
		
		@Test
		public void EnterBasketPageCredentials() {
			try {
				WebElement firstName = pageManager.getBasketPage().getFirstName();
				baseClass.sendKeys(firstName, baseClass.readExcel(1, 4));
				
				WebElement lastName = pageManager.getBasketPage().getLastName();
				baseClass.sendKeys(lastName, baseClass.readExcel(1, 5));
				
				WebElement email = pageManager.getBasketPage().getEmail();
				baseClass.sendKeys(email, baseClass.readExcel(1, 6));
				
				WebElement address = pageManager.getBasketPage().getAddress();
				baseClass.sendKeys(address, baseClass.readExcel(1, 7));
				
				WebElement address2 = pageManager.getBasketPage().getAddress2();
				baseClass.sendKeys(address2, baseClass.readExcel(1, 8));
				
				WebElement country = pageManager.getBasketPage().getCountry();
				baseClass.selectByVisibleText(country, baseClass.readExcel(1, 9));
				
				WebElement city = pageManager.getBasketPage().getCity();
				baseClass.selectByVisibleText(city, baseClass.readExcel(1, 10));
				
				WebElement zipCode = pageManager.getBasketPage().getZipCode();
				baseClass.sendKeys(zipCode, baseClass.readExcel(1, 11));
				
				WebElement nameofCard = pageManager.getBasketPage().getNameofCard();
				baseClass.sendKeys(nameofCard, baseClass.readExcel(1, 12));
				
				WebElement creditCardNumber = pageManager.getBasketPage().getCreditCardNumber();
				baseClass.sendKeys(creditCardNumber, baseClass.readExcel(1, 13));
				
				WebElement expiration = pageManager.getBasketPage().getExpiration();
				baseClass.sendKeys(expiration, baseClass.readExcel(1, 14));
				
				WebElement cvvNumber = pageManager.getBasketPage().getCvvNumber();
				baseClass.sendKeys(cvvNumber, baseClass.readExcel(1, 15));
				
				WebElement promoCode = pageManager.getBasketPage().getPromoCode();
				baseClass.sendKeys(promoCode, baseClass.readExcel(1, 16));
				
				
			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
		}
		
		
		@After
		public void ContinueButtonValidation() {
			try {
				WebElement continueButton = pageManager.getBasketPage().getContinueButton();
				baseClass.clickButton(continueButton);
				
			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
		}
		
		
		@AfterClass
		public static void loginSuccessfullvalidation() {
			try {
				if (pageManager.getBasketPage().getBillingaddressText().isDisplayed()) {
					System.out.println("user in successfully Added details");
					
				}else {
					System.out.println("user not in successfully Added details");
				}
				
				WebElement login = pageManager.getLoginPage().getLogin();	
				baseClass.clickButton(login);
				
				if (pageManager.getBasketPage().getLogoutText().isDisplayed()) {
					System.out.println("user successfully logout ");
				}else {
					System.out.println("user not successfully logout");
				}
								
				
			} catch (Exception e) {
				System.out.println("Error Message :" + e.getMessage());
				e.printStackTrace();
			}
		}
		
		
		
	

}
