package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;


public class ShopProductPage extends BasePage {
	
	public WebDriver driver;
	
	By sizeSelect = By.cssSelector("select[name='group[1]']");
	By upButton = By.cssSelector(".touchspin-up");
	By downButton = By.cssSelector(".touchspin-down");
	By addToCartBtn = By.cssSelector("[data-button-action]");
	By HomeBtnLink = By.xpath("//span[text() = 'Home']");
	
	public ShopProductPage() throws IOException
	{
       super();
	}
	

	public WebElement getsizeSelect()
	{
		this.driver = getDriver();
		return driver.findElement(sizeSelect);
	}
	public WebElement getupButton()
	{
		this.driver = getDriver();
		return driver.findElement(upButton);
	}
	public WebElement getdownButton()
	{
		this.driver = getDriver();
		return driver.findElement(downButton);
	}
	public WebElement getaddToCartBtn()
	{
		this.driver = getDriver();
		return driver.findElement(addToCartBtn);
	}
	public WebElement getHomeBtnLink()
	{
		this.driver = getDriver();
		return driver.findElement(HomeBtnLink);
	}
}
