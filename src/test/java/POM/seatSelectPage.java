package POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BasePage;

public class seatSelectPage extends BasePage {

	By SelectButton = By.xpath("//tbody/tr[1]/td[6]/a[1]");
	By selectingSeats = By.xpath("//table[@class='seat_panel1']//tbody//tr//td");
	By proceedButton = By.xpath("//input[@value='Proceed']");
	public seatSelectPage(WebDriver driver) {
		super(driver);
		
	}
	public void clickSelectButton()  {
		driver.findElement(SelectButton).click();
		
	}
	public void selectSeats () throws InterruptedException{ 
		Thread.sleep(2000);
		List<WebElement> seats = driver.findElements(selectingSeats);
		for(WebElement seat : seats) {
			seat.click();
		}
	}
	public PassengerDetailsPage clickProceedButton() {
		driver.findElement(proceedButton).click();
		return new PassengerDetailsPage(driver);
		
	}
	
	

}
