package uk.co.automationtesting;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.Hooks;

import org.testng.Assert;
import pageObjects.Homepage;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomePage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;

@Listeners(resources.Listeners.class)

public class AddRemoveItemBasketTest extends Hooks {
	

	public AddRemoveItemBasketTest() throws IOException {
		super();
	
		
	}
	
	@Test
	public void addRemoveItem() throws IOException, InterruptedException
	{
		Homepage home = new Homepage();
		home.getCookie().click();
		home.getTestStoreLink().click();
		
		ShopHomePage shop = new ShopHomePage();
		shop.getProductOne().click();
		
		ShopProductPage product = new ShopProductPage();
		Select sel = new Select(product.getsizeSelect());
		sel.selectByVisibleText("M");
		product.getupButton().click();
		product.getaddToCartBtn().click();
		Thread.sleep(3000);
		
		ShopContentPanel cpanel = new ShopContentPanel();
		cpanel.getContinueShoppingBtn().click();
		product.getHomeBtnLink().click();
		shop.getProductTwo().click();
		product.getaddToCartBtn().click();
		cpanel.getCheckOutBtn().click();
		
		Thread.sleep(3000);
		
		ShoppingCart cart = new ShoppingCart();
		cart.getdeleteBtnTwo().click();
		
		//WebDriverWait wait = new WebDriverWait(getDriver(), 120);
		//wait.until(ExpectedConditions.invisibilityOf(cart.getdeleteBtnTwo()));
		waitForElementInvisible(cart.getdeleteBtnTwo(), 120);
	    System.out.println(cart.gettotalvalue().getText());
		Assert.assertEquals(cart.gettotalvalue().getText(),"$45.24" );
		

}
}
