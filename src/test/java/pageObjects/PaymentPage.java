package pageObjects;

import org.openqa.selenium.By;

import baseTest.BaseTest;

public class PaymentPage extends BaseTest{
	
	
public By PaymentPage = By.xpath("//*[@text='Credit/Debit Card']");
public By CardNo = By.xpath("//*[@id='cardNo']");
public By Expiry = By.xpath("//*[@id='expiry']");
public By Cvv = By.xpath("//*[@id='cvv']");
public By Paynow = By.xpath("//*[@text='PAY NOW']");
public By Popup = By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@id='error_msg_lyt']]");
public By PopupText = By.xpath("//*[@text='Invalid card details ']");

	public boolean verify_Popup() throws Exception {
	return verify(Popup);
	}
	
	public void GetPopupText() throws Exception {
		verify(PopupText);
		System.out.println("Error Message is: "+driver.findElement(PopupText).getText());
	}

	public boolean verify_PaymentPage() throws Exception {
		return verify(PaymentPage);
	}
	
	public void Enter_cardNumber() throws Exception {
		enterText(CardNo, "4088790615102587");
	}

	public void Enter_Expiry() throws Exception {
		enterText(Expiry, "05 2022");
	}
	
	public void Enter_Cvv() throws Exception {
		enterText(Cvv, "555");
	}
	
	public void Click_Paynow() throws Exception {
		click(Paynow);
	}
	
}
