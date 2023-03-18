package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_01 {

	public WebElement button(WebDriver driver) {
		return driver.findElement(By.id(""));
	}

}
