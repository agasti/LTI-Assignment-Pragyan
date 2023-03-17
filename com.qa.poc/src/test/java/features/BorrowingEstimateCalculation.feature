Feature: Borrowing Estimate Calculation

  Scenario: Calculate borrowing estimate for a single person buying a home to live in
    Given Navigating to browser
    When I am a person who is single, buying a home to live in, with 0 dependants, income of $80,000, other income of $10,000, living expenses of $500, no current home loan repayments, other loan repayments of $100, no other commitments, and total credit card limits of $10,000
    And I calculate my borrowing estimate
    Then the borrowing estimate should be equal


  Scenario: Clicking the start over button clears the form
    Given Navigating to browser
    When I am a person who is single, buying a home to live in, with 0 dependants, income of $80,000, other income of $10,000, living expenses of $500, no current home loan repayments, other loan repayments of $100, no other commitments, and total credit card limits of $10,000
    And I calculate my borrowing estimate
    Then the borrowing estimate should be equal
    And I click the start over button
    And All fields in the form should be reset to their default values


  Scenario: Calculate borrowing estimate with low living expenses
    Given Navigating to browser
    When Enter value for Living expenses and leaving all other fields as zero
    And I calculate my borrowing estimate
    Then verify the error
    