package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_BorrowingEstCalc {


	public WebElement button(WebDriver driver) {
		return driver.findElement(By.id(""));
	}
	
		// Elements on the BorrowingEstCalc page
	    @FindBy(id = "//*[@id=\"main-container\"]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/div/div[1]/div/div[1]/ul/li[1]/label")
	    private WebElement applicationTypeSingle;

	    @FindBy(id = "borrow_type_home")
	    private WebElement borrowTypeHome;

	    @FindBy(id = "num_dependants")
	    private WebElement numberOfDependants;

	    @FindBy(id = "income")
	    private WebElement income;

	    @FindBy(id = "other_income")
	    private WebElement otherIncome;

	    @FindBy(id = "living_expenses")
	    private WebElement livingExpenses;

	    @FindBy(id = "current_home_loan_repayments")
	    private WebElement currentHomeLoanRepayments;

	    @FindBy(id = "other_loan_repayments")
	    private WebElement otherLoanRepayments;

	    @FindBy(id = "other_commitments")
	    private WebElement otherCommitments;

	    @FindBy(id = "credit_card_limits")
	    private WebElement creditCardLimits;

	    @FindBy(css = "button[type='submit']")
	    private WebElement submitButton;

	    @FindBy(css = "button[type='reset']")
	    private WebElement resetButton;

	    @FindBy(css = ".borrow__result__text__amount")
	    private WebElement borrowingEstimate;

		private WebDriver driver;

	    // Constructor
	    public Page_BorrowingEstCalc(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Methods to interact with elements on the ANZ borrowing power calculator page
	    public void selectApplicationTypeSingle() {
	        applicationTypeSingle.click();
	    }

	    public void selectBorrowTypeHome() {
	        borrowTypeHome.click();
	    }

	    public void enterNumberOfDependants(String numberOfDependantsValue) {
	        numberOfDependants.clear();
	        numberOfDependants.sendKeys(numberOfDependantsValue);
	    }

	    public void enterIncome(String incomeValue) {
	        income.clear();
	        income.sendKeys(incomeValue);
	    }

	    public void enterOtherIncome(String otherIncomeValue) {
	        otherIncome.clear();
	        otherIncome.sendKeys(otherIncomeValue);
	    }

	    public void enterLivingExpenses(String livingExpensesValue) {
	        livingExpenses.clear();
	        livingExpenses.sendKeys(livingExpensesValue);
	    }

	    public void enterCurrentHomeLoanRepayments(String currentHomeLoanRepaymentsValue) {
	        currentHomeLoanRepayments.clear();
	        currentHomeLoanRepayments.sendKeys(currentHomeLoanRepaymentsValue);
	    }

	    public void enterOtherLoanRepayments(String otherLoanRepaymentsValue) {
	        otherLoanRepayments.clear();
	        otherLoanRepayments.sendKeys(otherLoanRepaymentsValue);
	    }

	    public void enterOtherCommitments(String otherCommitmentsValue) {
	        otherCommitments.clear();
	        otherCommitments.sendKeys(otherCommitmentsValue);
	    }

	    public void enterCreditCardLimits(String creditCardLimitsValue) {
	        creditCardLimits.clear();
	        creditCardLimits.sendKeys(creditCardLimitsValue);
	    }

	    public void clickSubmitButton() {
	        submitButton.click();
	    }

	    public void clickResetButton() {
	        resetButton.click();
	    }

	    public String getBorrowingEstimate() {
	        return borrowingEstimate.getText();
	    }

	}

