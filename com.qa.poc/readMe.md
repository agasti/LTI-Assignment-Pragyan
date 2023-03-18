The project should have clear instructions on how to build and run tests and to specify where to find results.

Answer to this is as follows:

click on Run/Run configurations
Under Maven build/Main - Name is given as Pragya-Maven-run.
 Base directory is - ${workspace_loc:/com.qa.poc} 
 Goals- clean test
 click on Run
 
 For reports please check inside target folder under cucumber reports.
 
 Note - For the step 1 the borrowing estimate is showing different amount in the production url provided as $419,000 different than than the one that is provided to me in the assignment document i.e $479,000. 


 1.	What other tests would you suggest could be written? You do not need to write them out in detail or code them.
 
 (i)A person with the following details: 
a.	Joint, 
b.	0 dependants, 
c.	buying a home to live in, 
d.	with income of $80,000, 
e.	other income $10,000, 
f.	living expenses $500, 
g.	current home loan repayments $0,
h.	other loan repayments $100, 
i.	other commitments $0 
j.	and total credit card limits $10,000 and check the borrowing estimates
(ii) Tooltip of each text box can be checked in order to check whether the message is displayed correctly or not.
(iii) We can enter random number and check whether the calculation is proper or not or throwing error.
(iv)Once we enter all the fields with some values and click on start over and see whether the fields are getting properly reset or not.
(v)Test different numbers of dependents
(vi)Test different credit card limits
(vii)Test different income and expenses amounts
(viii)Test different interest rates


 
 
2.	If this test was part of a much larger test set, how would you speed it up?
Parallel Execution: One way to speed up testing is to execute tests in parallel. Instead of running one test at a time, multiple tests can be executed simultaneously, which can significantly reduce the overall testing time.

Test Automation: Another way to speed up testing is to automate the test cases. Test automation involves using testing tools to run the tests, which can significantly reduce the amount of time required to execute the tests. Automated tests can be executed more frequently and reliably than manual tests.

Prioritize Tests: Prioritizing the tests based on their importance can also help to speed up testing. The critical tests that are most likely to fail or have a higher risk can be executed first. This approach ensures that the most important tests are completed first, and if any issues are found, they can be addressed immediately.

Use Test Data Management: Test data management can also help to speed up testing by providing test data quickly and accurately. It is important to ensure that the test data used is realistic and covers a range of scenarios, so the tests provide comprehensive coverage.



3.	Sometimes UI tests can fail unpredictably. For example, the page may not have fully loaded before test automation attempts to click a button on a webpage. How would you improve reliability of these tests?
Use explicit wait statements
Use page object pattern:
Use stable locators
Use headless browsers
Use realistic test data
Run tests on clean