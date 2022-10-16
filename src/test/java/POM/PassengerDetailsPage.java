package POM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;

public class PassengerDetailsPage extends BasePage {
	
	By FullName = By.xpath("//input[@class='payment_textName form-control pay-form-control']");
	By PhoneNo= By.xpath("//input[@class='payment_txtPhoneLogin form-control pay-form-control']");
	By EmailId= By.xpath("//input[@class='payment_txtEmail form-control pay-form-control']");
	By NextButton = By.xpath("//a[@id='btnNext']");
	public PassengerDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void enterFullName() {
		driver.findElement(FullName).sendKeys("sri");
	}
	public void enterPhoneNo() {
		driver.findElement(PhoneNo).sendKeys("0123456789");
	}
	public void enterEmailId() {
		driver.findElement(EmailId).sendKeys("tester@gmail.com");
}
	public PaymentPage clickNextButton() {
		driver.findElement(NextButton).click();
		return new PaymentPage(driver);
}
	

}
