package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormPersInfo extends BasePage {
	
	public WebDriver driver;
	
	By genderMr = By.cssSelector("[class] .radio-inline:nth-of-type(1) [name]");
	By genderMrs = By.cssSelector("[class] .radio-inline:nth-of-type(2) [name]");
	By firstNameField = By.cssSelector("input[name='firstname']");
	By lastNameField = By.cssSelector("input[name='lastname']");
	By emailField = By.cssSelector("form#customer-form > section input[name='email']");
	By passwordField = By.cssSelector("form#customer-form > section input[name='password']");
	By birthdayField = By.cssSelector("input[name='birthday']");
	By receiveOfferCheckbox = By.cssSelector("input[name='optin']");
	By signUpCheckbox = By.cssSelector("input[name='newsletter']");
	By termsCheckBox = By.cssSelector("input[name='psgdpr']");
	By continueBtn = By.cssSelector("form#customer-form  button[name='continue']");
	
	public OrderFormPersInfo() throws IOException
	{
		super();
	}
	
	public WebElement getgenderMr()
	{
		this.driver = getDriver();
		return driver.findElement(genderMr);
	}
	public WebElement getgenderMrs()
	{
		this.driver = getDriver();
		return driver.findElement(genderMrs);
	}
	public WebElement getfirstNameField()
	{
		this.driver = getDriver();
		return driver.findElement(firstNameField);
	}
	public WebElement getlastNameField()
	{
		this.driver = getDriver();
		return driver.findElement(lastNameField);
	}
	public WebElement getemailField()
	{
		this.driver = getDriver();
		return driver.findElement(emailField);
	}
	public WebElement getpasswordField()
	{
		this.driver = getDriver();
		return driver.findElement(passwordField);
	}
	public WebElement getbirthdayField()
	{
		this.driver = getDriver();
		return driver.findElement(birthdayField);
	}
	public WebElement getreceiveOfferCheckbox()
	{
		this.driver = getDriver();
		return driver.findElement(receiveOfferCheckbox);
	}
	public WebElement getsignUpCheckbox()
	{
		this.driver = getDriver();
		return driver.findElement(signUpCheckbox);
	}
	public WebElement gettermsCheckBox()
	{
		this.driver = getDriver();
		return driver.findElement(termsCheckBox);
	}
	public WebElement getcontinueBtn()
	{
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}
	

}
