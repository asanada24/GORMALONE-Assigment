package Base;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	public WebDriver intializeDriver() {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		return driver;
		
	}

}
