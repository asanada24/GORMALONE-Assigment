package POM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BasePage;

public class PaymentPage extends BasePage{
	By ProceedPytBtn = By.id("payment_btnProceedPayment");
	public PaymentPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void clickPaymentProccedBtn() throws IOException{
		driver.findElement(ProceedPytBtn).click();
		takeSnapShot();
		try {
		driver.switchTo().frame("ssIFrame_google");
		String popup = driver.findElement(By.xpath("//div[contains(text(),'Please select a payment method')]")).getText();
		System.out.println(popup);
		driver.findElement(By.xpath("//a[@id='btn-alert-okay']")).click();
		}catch(Exception e) {
		
		}
	}
	public static void takeSnapShot() throws IOException {
		TakesScreenshot image = (TakesScreenshot)(driver);
		File src = image.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\screenshots\\paymentPage.png");
		FileUtils.copyFile( src , target);
		
	}
	
}
