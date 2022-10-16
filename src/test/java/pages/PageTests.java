package pages;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseTest;
import POM.HomePage;
import POM.PassengerDetailsPage;
import POM.PaymentPage;
import POM.seatSelectPage;



public class PageTests extends BaseTest {
	

	@Test
	public void BusOnlineTicketBookingTest() throws InterruptedException, IOException {
		driver.get("https://www.busonlineticket.com/booking/bus-tickets.aspx");
		HomePage homePage = new HomePage(driver);
		homePage.enterOriginStation("Cameron Highlands");
		homePage.enterDestination("Kuala Lumpur");
		homePage.enterDate("20", "November 2022");
		// navigating to the seat selecting page
		seatSelectPage seatSelect = homePage.clickSearchButton();
		seatSelect.clickSelectButton();
		seatSelect.selectSeats();
		PassengerDetailsPage pd = seatSelect.clickProceedButton();
		pd.enterFullName();
		pd.enterPhoneNo();
		pd.enterEmailId();
		PaymentPage pp = pd.clickNextButton();
		pp.clickPaymentProccedBtn();
		
		
		
	}
	
	
}
