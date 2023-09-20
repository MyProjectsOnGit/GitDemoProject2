package uk.co.automationtesting;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import base.BasePage;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.OrderFormDelivery;
import pageObjects.OrderFormPayment;
import pageObjects.OrderFormPersInfo;
import pageObjects.OrederFormShippingMethod;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomePage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;

public class OrderCompleteTest extends Hooks {

	public OrderCompleteTest() throws IOException {
		super();
	}
	
	
	@Test
	public void endToEndTest() throws InterruptedException, IOException {
		Homepage home = new Homepage();

		//handles cookie prompt
		home.getCookie().click();

		home.getTestStoreLink().click();
		
		ShopHomePage shopHome = new ShopHomePage();
		shopHome.getProductOne().click();
		
		ShopProductPage shopProd = new ShopProductPage();
		Select option = new Select(shopProd.getsizeSelect());
		option.selectByVisibleText("M");
		shopProd.getupButton().click();
		shopProd.getaddToCartBtn().click();
		
		Thread.sleep(5000);
		
		ShopContentPanel cPanel = new ShopContentPanel();
		cPanel.getCheckOutBtn().click();
		
		ShoppingCart cart = new ShoppingCart();
		cart.getPromoCodeLink().click();
		cart.getPromoCode().sendKeys("20OFF");
		cart.getaddBtn().click();
		Thread.sleep(5000);
		cart.getcheckOutBtn().click();
		
		OrderFormPersInfo pInfo = new OrderFormPersInfo();
		pInfo.getgenderMr().click();
		pInfo.getfirstNameField().sendKeys("John");
		pInfo.getlastNameField().sendKeys("Smith");
		pInfo.getemailField().sendKeys("johnsmith123@test.com");
		pInfo.gettermsCheckBox().click();
		pInfo.getcontinueBtn().click();

		// creating an object of the order delivery info page
		OrderFormDelivery orderDelivery = new OrderFormDelivery();
		orderDelivery.getAddressField().sendKeys("123 Main Street");
		orderDelivery.getCityField().sendKeys("Houston");
		Select state = new Select(orderDelivery.getStateDropdown());
		state.selectByVisibleText("Texas");
		orderDelivery.getPostcodeField().sendKeys("77021");
		orderDelivery.getContinueBtn().click();

		// creating an object of the shipping method page
		OrederFormShippingMethod shipMethod = new OrederFormShippingMethod();
		shipMethod.getDeliveryMsgTextbox().sendKeys("If I am not in, please leave my delivery on my porch.");
		shipMethod.getContinueBtn().click();

		// creating an object of the payment options page
		OrderFormPayment orderPay = new OrderFormPayment();
		orderPay.getPayByCheckRadioBtn().click();
		orderPay.getTermsConditionsCheckbox().click();
		orderPay.getOrderBtn().click();
		
	}

}






