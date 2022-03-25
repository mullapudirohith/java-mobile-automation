package pageObjects;

import org.openqa.selenium.By;

import baseTest.BaseTest;

public class SearchPage extends BaseTest{

	public By FilterButton = By.xpath("//*[@id='fab_filter_search_list']");
	public By OkayPopup = By.xpath("//*[@text='OKAY, GOT IT']");
	public By LeastHotel = By.xpath("(//*[@id='recycler_view_hotel_list']/*/*[@id='tvHotelName'])[1]");
	public By SelectRoomButton = By.xpath("//*[@text='SELECT ROOM']");
	public By BookRoomButton = By.xpath("(//*[@text='BOOK'])[1]");
	public By FirstName = By.xpath("//*[@id='nameTxt']");
	public By LastName = By.xpath("//*[@id='lastNameTxt']");
	public By PhoneNumber = By.xpath("//*[@id='phoneTxt']");
	public By Email = By.xpath("//*[@id='emailTxt']");
	public By Nationality = By.xpath("//*[@id='nationality']");
	public By CancellationStatus = By.xpath("//*[@id='cancellation']");
	public By ContinueBooking = By.xpath("//*[@text='CONTINUE BOOKING']");
	public By FiveStar = By.xpath("//*[@id='checkbox_star_filter_hotel' and (./preceding-sibling::* | ./following-sibling::*)[@text='5']]");
	public By Apply = By.xpath("//*[@text='APPLY']");
	public By Price = By.xpath("//*[@id='hotelPrice']");
	
	public boolean verify_Price() throws Exception {
		return verify(Price);
	}
	
	public void verifyAndClickOkayPopup() throws Exception {
		if (verifyElementExists(OkayPopup)) {
			click(OkayPopup);
		}
	}

	public void click_ContinueBooking() throws Exception {
		Scroll_Till_ObjVisible(ContinueBooking);
		click(ContinueBooking);
	}

	public void Enter_FirstName(String name) throws Exception {
		Scroll_Till_ObjVisible(FirstName);
		enterText(FirstName, name);
	}

	public void Enter_LastName(String name) throws Exception {
		Scroll_Till_ObjVisible(LastName);
		enterText(LastName, name);
	}

	public void Enter_PhoneNumber(String name) throws Exception {
		Scroll_Till_ObjVisible(PhoneNumber);
		enterText(PhoneNumber, name);
	}

	public void Enter_Email(String name) throws Exception {
		Scroll_Till_ObjVisible(Email);
		enterText(Email, name);
	}

	public void Select_Nationality() throws Exception {
		Scroll_Till_ObjVisible(Nationality);
		enterText(Nationality, "India");
	}

	public boolean verify_CancellationStatus() throws Exception {
		return verify(CancellationStatus);
	}

	public void click_SelectRoomButton() throws Exception {
		click(SelectRoomButton);
	}

	public void click_BookRoomButton() throws Exception {
		Scroll_Till_ObjVisible(BookRoomButton);
		click(BookRoomButton);
	}

	public void SelectLeastPrice() throws Exception {
		wait_Medium();
		click(FilterButton);
		wait_Low();
		click(FiveStar);
		wait_Low();
		click(Apply);
		wait_High();
		click(LeastHotel);
	}

	public boolean verify_FilterButton() throws Exception {
		return verify(FilterButton);
	}
}
