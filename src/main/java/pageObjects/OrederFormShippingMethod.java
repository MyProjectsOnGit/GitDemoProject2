package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrederFormShippingMethod extends BasePage {
	
public WebDriver driver;
	
	By deliveryMsgTextbox = By.cssSelector("#delivery_message");
	By continueBtn = By.cssSelector("[name='confirmDeliveryOption']");

	public OrederFormShippingMethod() throws IOException {
		super();
	}
	
	public WebElement getDeliveryMsgTextbox() {
		this.driver = getDriver();
		return driver.findElement(deliveryMsgTextbox);
	}
	
	public WebElement getContinueBtn() {
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}

}
