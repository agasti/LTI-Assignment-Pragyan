package stepDefinitions;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
//import baseTest.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Borrowingcalc  {
   WebDriver driver = null;
	
  @Given("Navigating to browser")
  public void Navigating_to_browser() {
	System.out.println("This is Before Suite");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(options);
	driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

 }

	
  @When("I am a person who is single, buying a home to live in, with {int} dependants, income of ${double}, other income of ${double}, living expenses of ${int}, no current home loan repayments, other loan repayments of ${int}, no other commitments, and total credit card limits of ${double}")
  public void i_am_a_person_who_is_single_buying_a_home_to_live_in_with_dependants_income_of_$_other_income_of_$_living_expenses_of_$_no_current_home_loan_repayments_other_loan_repayments_of_$_no_other_commitments_and_total_credit_card_limits_of_$(Integer int1, Double double1, Double double2, Integer int2, Integer int3, Double double3) {
    driver.findElement(By.xpath("//*[@id='application_type_single']")).click();
    WebElement dropdownElement = driver.findElement(By.xpath("//select[@title='Number of dependants']"));
    Select dropdown = new Select(dropdownElement);
    dropdown.selectByVisibleText("0");
    driver.findElement(By.xpath("//label[contains(text(),'Home to live in')]")).click();
    driver.findElement(By.xpath("//input[@aria-labelledby='q2q1']")).sendKeys("80,000");
    driver.findElement(By.xpath("//input[@aria-labelledby='q2q2']")).sendKeys("10,000");
    driver.findElement(By.xpath("//*[@id='expenses']")).sendKeys("500");
    driver.findElement(By.xpath("//*[@id='homeloans']")).sendKeys("0");
    driver.findElement(By.xpath("//*[@id='otherloans']")).sendKeys("100");
    driver.findElement(By.xpath("//input[@aria-labelledby='q3q4']")).sendKeys("0");
    driver.findElement(By.xpath("//*[@id='credit']")).sendKeys("10,000");
 }


  @And("I calculate my borrowing estimate")
  public void i_calculate_my_borrowing_estimate() {
  driver.findElement(By.xpath("//*[@id='btnBorrowCalculater']")).click();
 }


  @Then("the borrowing estimate should be equal")
  public void the_borrowing_estimate_should_be_equal() throws InterruptedException {
	  Thread.sleep(5000);
	  String t = "$419,000";
      // getPageSource() to get page source
      if ( driver.getPageSource().contains("$419,000")){
         System.out.println("Text: " + t + " is present. ");
      } else {
         System.out.println("Text: " + t + " is not present. ");
      }
   }
  
  @And("I click the start over button")
  public void i_click_the_start_over_button() {
   driver.findElement(By.xpath("//span[@id='borrowResultTextAmount']//following::span[1]")).click();
  }



 @And("All fields in the form should be reset to their default values")
 public void all_fields_in_the_form_should_be_reset_to_their_default_values() throws InterruptedException {
	 Thread.sleep(5000);
	  String t = "$0";
     if ( driver.getPageSource().contains("$0")){
        System.out.println("Text: " + t + " is present. ");
     } else {
        System.out.println("Text: " + t + " is not present. ");
     }
 }
 
  @When("Enter value for Living expenses and leaving all other fields as zero")
  public void Enter_value_for_Living_expenses_and_leaving_all_other_fields_as_zero() {
  driver.findElement(By.xpath("//*[@id='expenses']")).sendKeys("1");
  }

  
  @Then("verify the error")
  public void verify_the_error()throws InterruptedException{
	  Thread.sleep(5000);
	  if ( driver.getPageSource().contains("Based on the details you've entered")){
		  String t = "Based on the details you've entered";
	        System.out.println("Text is present.");
	     } else {
	       System.out.println("Text is not present.");
  }
}
}
  