package businessLogics;

import org.openqa.selenium.WebDriver;

import pageObjects.Page_01;

public class CalcOperations {
	
	Page_01 objPage_01 = new Page_01();
	
	public void add(WebDriver driver) {
		objPage_01.button(driver).click();
	}

}
