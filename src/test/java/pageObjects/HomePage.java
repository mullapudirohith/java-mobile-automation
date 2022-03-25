package pageObjects;

import org.openqa.selenium.By;

import baseTest.BaseTest;

public class HomePage extends BaseTest{

	
	//All page objects
	public By HomePage = By.xpath("//*[@text='Home']");
	
	
	//methods for page objects
	public boolean verify_HomePage() throws Exception {
		return verify(HomePage);
	}
	
}