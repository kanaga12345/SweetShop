package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage extends BaseClass {
	public BasketPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h1[text()='Your Basket']")
	private WebElement yourbasketText;
	
	public WebElement getYourbasketText() {
		return yourbasketText;
	}
	@FindBy(id="name")
	private WebElement firstName;
	
	public WebElement getFirstName() {
		return firstName;
	}
	@FindBy(xpath="(//input[@id='name'])[2]")
	private WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}
	@FindBy(id="email")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}
	@FindBy(id="address")
	private WebElement address;
	
	public WebElement getAddress() {
		return address;
	}
	@FindBy(id="address2")
	private WebElement address2;
	
	public WebElement getAddress2() {
		return address2;
	}
	@FindBy(id="country")
	public WebElement country;
	
	public WebElement getCountry() {
		return country;
	}
	@FindBy(id="city")
	private WebElement city;
	
	public WebElement getCity() {
		return city;
	}
	@FindBy(id="zip")
	private WebElement zipCode;
	
	public WebElement getZipCode() {
		return zipCode;
	}
	@FindBy(id="cc-name")
	private WebElement nameofCard;
	
	public WebElement getNameofCard() {
		return nameofCard;
	}
	@FindBy(id="cc-number")
	private WebElement creditCardNumber;
	
	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}
	@FindBy(id="cc-expiration")
	private WebElement expiration;
	
	public WebElement getExpiration() {
		return expiration;
	}
	@FindBy(id="cc-cvv")
	private WebElement cvvNumber;
	
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	@FindBy(xpath="//input[@placeholder='Promo code']")
	private WebElement promoCode;
	
	public WebElement getPromoCode() {
		return promoCode;
	}
	@FindBy(xpath="//button[text()='Continue to checkout']")
	private WebElement continueButton;
	
	public WebElement getContinueButton() {
		return continueButton;
	}
	@FindBy(xpath="//h4[text()='Billing address']")
	private WebElement billingaddressText;
	
	public WebElement getBillingaddressText() {
		return billingaddressText;
	}
	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement logoutText;
	
	public WebElement getLogoutText() {
		return logoutText;
	}
	
	
	

}
