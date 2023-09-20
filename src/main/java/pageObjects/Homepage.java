package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Homepage extends BasePage {
	
	public WebDriver driver;
	
	By toggle = By.cssSelector(".toggle");
	By HomepageLink = By.linkText("HOMEPAGE");
	By AccordianLink = By.linkText("ACCORDION");
	By ActionsLink = By.linkText("ACTIONS");
	By BrowserTabsLink = By.linkText("BROWSER TABS");
	By ButtonsLink = By.linkText("BUTTONS");
	By ContactLink = By.linkText("CONTACT US FORM TEST");
	By DataPickerLink = By.linkText("DATE PICKER");
	By DropdownLink = By.linkText("DROPDOWN CHECKBOX RADIO");
	By FileUploadLink = By.linkText("FILE UPLOAD");
	By IFramesLink = By.linkText("HIDDEN ELEMENTS");
	By HiddenElementLink = By.linkText("IFRAMES");
	By LoaderLink = By.linkText("LOADER");
	By LoaderTwoLink = By.linkText("LOADER TWO");
	By LoginPortalLink = By.linkText("LOGIN PORTAL TEST");
	By MouseMovementLink = By.linkText("MOUSE MOVEMENT");
	By PopUpsLink = By.linkText("POP UPS & ALERTS");
	By SearchLink = By.linkText("PREDICTIVE SEARCH");
	By TablesLink = By.linkText("TABLES");
	By TestStoreLink = By.linkText("TEST STORE");
	By AboutMeLink = By.linkText("ABOUT ME");
	By cookie = By.cssSelector(".close-cookie-warning > span");
	
	
	public Homepage() throws IOException
	{
		super();
	}
	
	public WebElement getHomepageLink()
	{
		this.driver= getDriver();
		
		return driver.findElement(HomepageLink);
	}
	
	public WebElement getAccordianLink()
	{
		this.driver= getDriver();
		return driver.findElement(AccordianLink);
	}
	
	public WebElement getActionsLink()
	{
		this.driver= getDriver();
		return driver.findElement(ActionsLink);
	}
	
	public WebElement getBrowserTabsLink()
	{
		this.driver= getDriver();
		return driver.findElement(BrowserTabsLink);
	}
	
	public WebElement getButtonsLink()
	{
		this.driver= getDriver();
		return driver.findElement(ButtonsLink);
	}
	
	public WebElement getContactLink()
	{
		this.driver= getDriver();
		return driver.findElement(ContactLink);
	}
	
	public WebElement getDataPickerLink()
	{
		this.driver= getDriver();
		return driver.findElement(DataPickerLink);
	}
	
	public WebElement getDropdownLink()
	{
		this.driver= getDriver();
		return driver.findElement(DropdownLink);
	}
	
	public WebElement getFileUploadLink()
	{
		this.driver= getDriver();
		return driver.findElement(FileUploadLink);
	}
	
	public WebElement geLoginPortalLink()
	{
		this.driver= getDriver();
		return driver.findElement(LoginPortalLink);
	}
	public WebElement getHiddenElementLink()
	{
		this.driver= getDriver();
		return driver.findElement(HiddenElementLink);
	}
	
	public WebElement getLoaderLink()
	{
		this.driver= getDriver();
		return driver.findElement(LoaderLink);
	}
	public WebElement getLoaderTwoLink()
	{
		this.driver= getDriver();
		return driver.findElement(LoaderTwoLink);
	}
	public WebElement getMouseMovementLink()
	{
		this.driver= getDriver();
		return driver.findElement(MouseMovementLink);
	}
	public WebElement getPopUpsLink()
	{
		this.driver= getDriver();
		return driver.findElement(PopUpsLink);
	}
	public WebElement getSearchLink()
	{
		this.driver= getDriver();
		return driver.findElement(SearchLink);
	}
	public WebElement getTablesLink()
	{
		this.driver= getDriver();
		return driver.findElement(TablesLink);
	}
	public WebElement getTestStoreLink()
	{
		this.driver= getDriver();
		return driver.findElement(TestStoreLink);
	}
	public WebElement getAboutMeLink()
	{
		this.driver= getDriver();
		return driver.findElement(AboutMeLink);
	}
	
	public WebElement getCookie() throws IOException {
		this.driver= getDriver();
		return driver.findElement(cookie);
	}
	
	
	
	
	
	
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
