package base;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Hooks extends BasePage {
	

	public Hooks() throws IOException {
		super();
		
	}

	@BeforeClass
	public void setUp()
	{
		
		getDriver().get(getURL());
	}
	
	@AfterClass
	public void tearDown()
	{
		WebDriverInstance.CleanUpDriver();
	}

}
