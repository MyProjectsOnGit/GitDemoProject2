package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShoppingCart extends BasePage {
	
	public WebDriver driver;
	
	By promoCodeLink = By.linkText("Have a promo code?");
	By promoCode = By.cssSelector("input[name='discount_name']");
	By addBtn = By.cssSelector("form[method='post']  span");
	By checkOutBtn = By.linkText("PROCEED TO CHECKOUT");
	By deleteBtnOne = By.cssSelector(".cart-items .cart-item:nth-of-type(1) .float-xs-left");
	By deleteBtnTwo = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
	By totalvalue = By.cssSelector(".cart-total .value");
	By continueShopLink = By.cssSelector("[class] .label:nth-child(2)");
	
	
	public ShoppingCart() throws IOException
	{
		super();
	}
	
	public WebElement getPromoCodeLink()
	{
		this.driver = getDriver();
		return driver.findElement(promoCodeLink);
	}
	public WebElement getPromoCode()
	{
		this.driver = getDriver();
		return driver.findElement(promoCode);
	}
	public WebElement getaddBtn()
	{
		this.driver = getDriver();
		return driver.findElement(addBtn);
	}
	
	public WebElement getcheckOutBtn()
	{
		this.driver = getDriver();
		return driver.findElement(checkOutBtn);
	}
	
	public WebElement getdeleteBtnOne()
	{
		this.driver = getDriver();
		return driver.findElement(deleteBtnOne);
	}
	public WebElement getdeleteBtnTwo()
	{
		this.driver = getDriver();
		return driver.findElement(deleteBtnTwo);
	}
	
	public WebElement gettotalvalue()
	{
		this.driver = getDriver();
		return driver.findElement(totalvalue);
	}
	public WebElement getcontinueShopLink()
	{
		this.driver = getDriver();
		return driver.findElement(continueShopLink);
	}
	
	
	
	
	

}
