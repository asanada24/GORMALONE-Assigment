package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class HomePage extends BasePage{
	By orginBox = By.id("txtOriginGeneral");
	By orginList = By.xpath("//div[@id='divFromList']/ul[1]/li[1]/ul/li");
	By destinationBox = By.xpath("//input[@id='txtDestinationGeneral']");
	By DestinationList = By.xpath("//div[@id='divToList']//li[1]//ul[1]//li");
	By searchButton = By.xpath("//input[@id='btnBusSearchNewGeneral']");
	By dateBOX = By.xpath("//input[@id='txtDepartDateBooking']");
    By calanderArrow = By.xpath("//a[@title='Next']");
	By calander  = By.xpath("//tbody/tr//td");
	By monthName = By.xpath("//div[@class='ui-datepicker-title']");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	// entering the orgin station
	public void enterOriginStation(String orgin) {
		try {
		driver.findElement(orginBox).click();
		List<WebElement> source  = driver.findElements(orginList);
		for(WebElement e : source) {
			if(e.getText().equalsIgnoreCase(orgin)) {
				e.click();
			}
		}
		}
		catch(Exception e) {
			e.getMessage();
		}
		
	}
	
	//entering the destination station
	public void enterDestination(String desti) {
		try {
			driver.findElement(destinationBox).click();
			List<WebElement> destination  = driver.findElements(DestinationList);
			
			for(WebElement f : destination) {
				if(f.getText().equalsIgnoreCase(desti)) {
					f.click();
				}
			}
			}
			catch(Exception e) {
				e.getMessage();
			}
			
	}
	public void enterDate(String day , String month){
		driver.findElement(dateBOX).click();
		
		while(true) {
			String mon = driver.findElement(monthName).getText();
			if(mon.equalsIgnoreCase(month)) {
				break;
			}else {
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		
		}
		try {
		

		List<WebElement> dates = driver.findElements(calander);
		for(WebElement d : dates) {
			if(d.getText().equals(day)) {
				d.click();
			}
		}
		}catch(StaleElementReferenceException e) {
		
		}
	}
	
	public seatSelectPage clickSearchButton() {
		driver.findElement(searchButton).click();
		return new seatSelectPage(driver);
	}
	

	
	
}
