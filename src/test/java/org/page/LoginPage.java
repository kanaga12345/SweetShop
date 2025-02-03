package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h1[text()='Login']")
	private WebElement logintext;
	
	public WebElement getLogintext() {
		return logintext;
	}
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}
	@FindBy(id="exampleInputEmail")
	private WebElement emailAddress;
	
	public WebElement getEmailAddress() {
		return emailAddress;
	}
	@FindBy(id="exampleInputPassword")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginButton;
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	@FindBy(xpath="//h1[text()='Browse sweets']")
	private WebElement browseSweet;
	
	public WebElement getBrowseSweet() {
		return browseSweet;
	}
	
	
	

}
