package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		//	Chrome Launch
		System.out.println("This is Before Suite");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
	}
	
	@AfterSuite
	public void tearDown() {
		// Chrmoe Kill
		System.out.println("This is After Suite");
		
		driver.quit();
	}

	/*
	 * Before Suite
	 * Before Test
	 * Before Method
	 * Test
	 * AFter Method
	 * After Test
	 * After Suite 
	 * 
	 * */

}
