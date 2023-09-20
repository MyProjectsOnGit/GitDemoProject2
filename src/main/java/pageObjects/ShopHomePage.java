package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopHomePage extends BasePage {
	
	public WebDriver driver;
	
	By productOne = By.cssSelector("img[alt='Hummingbird printed t-shirt']");
	By productTwo = By.cssSelector("img[alt='Brown bear printed sweater']");
	By productThree = By.cssSelector("[alt='The best is yet to come\\' Framed poster']");
	By productFour = By.cssSelector("img[alt='The adventure begins Framed poster']");
	By productFive = By.cssSelector("img[alt='Today is a good day Framed poster']");
	By productSix = By.cssSelector("img[alt='Mug The best is yet to come']");
	By productSeven = By.cssSelector("img[alt='Mug The adventure begins']");
	By productEight = By.cssSelector("img[alt='Mug Today is a good day']");
	
	public ShopHomePage() throws IOException
	{
		super();
	}
	
	public WebElement getProductOne()
	{
		this.driver = getDriver();
		return driver.findElement(productOne);
	}
	public WebElement getProductTwo()
	{
		this.driver = getDriver();
		return driver.findElement(productTwo);
	}
	public WebElement getProductThree()
	{
		this.driver = getDriver();
		return driver.findElement(productThree);
	}
	public WebElement getProductFour()
	{
		this.driver = getDriver();
		return driver.findElement(productFour);
	}
	public WebElement getProductFive()
	{
		this.driver = getDriver();
		return driver.findElement(productFive);
	}
	public WebElement getProductSix()
	{
		this.driver = getDriver();
		return driver.findElement(productSix);
	}
	public WebElement getProductSeven()
	{
		this.driver = getDriver();
		return driver.findElement(productSeven);
	}
	public WebElement getProductEight()
	{
		this.driver = getDriver();
		return driver.findElement(productEight);
	}


}
