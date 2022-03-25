package pageObjects;

import org.openqa.selenium.By;

import baseTest.BaseTest;

public class HomePage extends BaseTest{
	//sample page object located by xpath
	public By HomePage = By.xpath("//*[@text='Home']");
	
//##########################methods for page objects##########################//
	//method to verify home button
	public boolean verify_HomePage() throws Exception {
		return verify(HomePage);
	}
	//method to click home button
	public void click_HomePage() throws Exception {
		click(HomePage);
	}
}