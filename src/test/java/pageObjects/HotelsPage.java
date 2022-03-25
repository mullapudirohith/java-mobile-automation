package pageObjects;

import org.openqa.selenium.By;

import baseTest.BaseTest;

public class HotelsPage extends BaseTest{

	public By HotelsPage = By.xpath("//*[@text='Search hotels']");
	public By Destination = By.xpath("//*[@id='txt_hotel_city']");
	public By TravelDates = By.xpath("//*[@id='txtDateOneLiner']");
	public By Travellers = By.xpath("//*[@id='txt_travellers_rooms']");
	public By SearchHotels = By.xpath("//*[@id='btn_search_hotels']");
	public By SearchCitiesTextBox = By.xpath("//*[@id='filter_edittext']");
	public By Pondicherry = By.xpath("//*[@text='Pondicherry, India']");
	public By Date1 = By.xpath("//*[@text='30' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='27']]]]");
	public By Date2 = By.xpath("//*[@text='31']");
	public By AddChildren = By.xpath("//*[@id='imvIncrementChildren']");
	public By AddChildrenAge = By.xpath("//*[@id='txtAgeOne']");
	public By DoneButton = By.xpath("//*[@text='DONE']");
	public By ShowHotels = By.xpath("//*[@id='btn_search_hotels']");
	public By FilterButton = By.xpath("//*[@id='fab_filter_search_list']");
	
	public boolean verify_FilterButton() throws Exception {
		return verify(FilterButton);
	}
	
	public void click_DoneButton() throws Exception {
		click(DoneButton);
	}
	
	public void click_AddChildren() throws Exception {
		verify(By.xpath("//*[@id='txtChildrenCount']"));
		if(driver.findElement(By.xpath("//*[@id='txtChildrenCount']")).getText().equals("0")) {
		click(AddChildren);
		enterText(AddChildrenAge, "5");
		}
	}
	
	public boolean verify_HotelsPage() throws Exception {
		return verify(HotelsPage);
	}
	
	public void select_Dates() throws Exception {
		Scroll_Till_ObjVisible(Date1);
		wait_Low();
		click(Date1);
		click(Date2);
	}
	
	public void click_Destination() throws Exception {
		click(Destination);
	}
	
	public void click_TravelDates() throws Exception {
		click(TravelDates);
	}
	
	public void click_Travellers() throws Exception {
		click(Travellers);
	}
	
	public void searchCity(String city) throws Exception {
		enterText(SearchCitiesTextBox, city);
	}
	
	public void click_Pondicherry() throws Exception {
		click(Pondicherry);
	}
	public void click_ShowHotels() throws Exception {
		click(ShowHotels);
	}
}
