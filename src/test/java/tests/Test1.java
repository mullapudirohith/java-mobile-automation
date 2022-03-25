package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pageObjects.HotelsPage;
import pageObjects.PaymentPage;
import pageObjects.SearchPage;

public class Test1 extends BaseTest{
	
	private HotelsPage hotels;
	private SearchPage search;
	private PaymentPage payment;
	
	public Test1(){
		hotels = new HotelsPage();
		search = new SearchPage();
		payment = new PaymentPage();
	}
	@Test(priority=1)
	public void SelectCity() {
		try {
			wait_High();
			hotels.click_Destination();
			hotels.searchCity("Pondicherry");
			hotels.click_Pondicherry();
			wait_Low();
			assertEquals(hotels.verify_HotelsPage(), true);
			Logpass("TC1", "user click pondicherry", "Pondicherry selected");
		} catch (Exception e) {
			e.printStackTrace();
			LogFail("TC2", "user click pondicherry", "ERROR", e);
		}
	}
	
	@Test(priority=2)
	public void SelectDates() {
		try {
			hotels.click_TravelDates();
			hotels.select_Dates();
			wait_Low();
			assertEquals(hotels.verify_HotelsPage(), true);
			Logpass("TC2", "user select dates", "dates selected");
		} catch (Exception e) {
			e.printStackTrace();
			LogFail("TC2", "user select dates", "ERROR", e);
		}
	}
	
	@Test(priority=3)
	public void SelectGuests() {
		try {
			hotels.click_Travellers();
			hotels.click_AddChildren();
			hotels.click_DoneButton();
			wait_Low();
			assertEquals(hotels.verify_HotelsPage(), true);
			Logpass("TC3", "user select guests", "guests selected");
		} catch (Exception e) {
			e.printStackTrace();
			LogFail("TC3", "user select guests", "ERROR", e);
		}
	}
	
	@Test(priority=4)
	public void Click_ShowHotels() {
		try {
			hotels.click_ShowHotels();
			wait_High();
			wait_Medium();
			search.verifyAndClickOkayPopup();
			assertEquals(search.verify_FilterButton(), true);
			Logpass("TC4", "user click search", "search results appeared");
		} catch (Exception e) {
			e.printStackTrace();
			LogFail("TC4", "user click search", "ERROR", e);
		}
	}
	
	@Test(priority=5)
	public void Click_LeastHotel() {
		try {
			search.SelectLeastPrice();
			assertEquals(search.verify_Price(), true);
			Logpass("TC5", "user select hotel", "hotel selected");
		} catch (Exception e) {
			e.printStackTrace();
			LogFail("TC5", "user select hotel", "ERROR", e);
		}
	}
	
	@Test(priority=6)
	public void Click_LeastRoom() {
		try {
			search.click_SelectRoomButton();
			wait_Low();
			search.click_BookRoomButton();
			wait_Low();
			assertEquals(search.verify_CancellationStatus(), true);
			Logpass("TC6", "user select room", "room selected");
		} catch (Exception e) {
			e.printStackTrace();
			LogFail("TC6", "user select room", "ERROR", e);
		}
	}
	
	@Test(priority=7)
	public void Enter_Details() {
		try {
			search.Enter_FirstName("Rohith");
			search.Enter_LastName("Chowdary");
			search.Enter_PhoneNumber("9995554446");
			search.Enter_Email("rohith@rnl.lc");
			search.Select_Nationality();
			search.click_ContinueBooking();
			assertEquals(payment.verify_PaymentPage(),true);
			Logpass("TC7", "user fill contact details", "contact details filled");
		} catch (Exception e) {
			e.printStackTrace();
			LogFail("TC7", "user fill contact details", "ERROR", e);
		}
	}
	
	@Test(priority=8)
	public void Enter_CardDetails() {
		try {
			payment.Enter_cardNumber();
			wait_Low();
			payment.Enter_Expiry();
			wait_Low();
			payment.Enter_Cvv();
			wait_Low();
			assertEquals(payment.verify_PaymentPage(),true);
			Logpass("TC8", "user fill card details", "card details filled");
		} catch (Exception e) {
			e.printStackTrace();
			LogFail("TC8", "user fill card details", "ERROR", e);
		}
	}
	
	@Test(priority=9)
	public void Alert_verify() {
		try {
			payment.Click_Paynow();
			wait_Low();
			payment.GetPopupText();
			Logpass("TC9", "user get error message", "error captured");
		} catch (Exception e) {
			e.printStackTrace();
			LogFail("TC9", "user get error message", "ERROR occured during capture", e);
		}
	}
		
	}


