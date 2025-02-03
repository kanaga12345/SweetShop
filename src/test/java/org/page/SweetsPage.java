package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SweetsPage extends BaseClass {
	public SweetsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Sweets']")
	private WebElement sweets;
	
	public WebElement getSweets() {
		return sweets;
	}
	@FindBy(xpath="//a[@data-name='Chocolate Cups']")
	private WebElement addItem1;
	
	public WebElement getAddItem1() {
		return addItem1;
	}
	
	@FindBy(xpath="//a[@data-name='Sherbert Straws']")
	private WebElement addItem2;
	
	public WebElement getAddItem2() {
		return addItem2;
	}
	@FindBy(xpath="//a[@data-name='Sherbet Discs']")
	private WebElement addItem3;
	
	public WebElement getAddItem3() {
		return addItem3;
	}
	@FindBy(xpath="//a[@href='/basket']")
	private WebElement baseketButton;
	
	public WebElement getBaseketButton() {
		return baseketButton;
	}
	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement addToCardPageText;
	
	public WebElement getAddToCardPageText() {
		return addToCardPageText;
	}

}
