Feature: Create Account functionality in leaf taps application

#Background:
#Given load the url and launch the browser

Scenario: Create account by providing valid details


When Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
And click on login button
And click on crmsfa link
And Click on accounts tab
And click on create account button
And enter the account name as 'Yuvadevesh'
And enter the description as 'Selenium Automation Tester'
And enter the no of employees '5'
And enter the site name as 'Leaftaps'
And click on create account 
Then Verify the account created page  
