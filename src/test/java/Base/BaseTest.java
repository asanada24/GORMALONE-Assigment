package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class BaseTest {
	 protected WebDriver driver;
	 
	 @BeforeTest
		public void startDriver() {
		 driver = new DriverManager().intializeDriver();
	 }
	 @AfterTest
	 public void quitDriver() {
		 driver.quit();
	 }
}
