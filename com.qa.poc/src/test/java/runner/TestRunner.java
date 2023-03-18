package runner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import baseTest.TestBase;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinitions",
		plugin = { "pretty", "html:target/cucumber-reports/report.html" }
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	TestBase baseTest = new TestBase();
	private WebDriver driver;
	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
	@BeforeMethod
	public void setUp() {
		System.out.println("This is Before Method");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		baseTest.driver = driver;
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("This is After Method");
		driver.quit();
	}
}
