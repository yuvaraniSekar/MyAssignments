Feature: Delete Account functionality in leaf taps application

#Background:
#Given load the url and launch the browser

Scenario: Create account by providing valid details


When Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
And click on login button
And click on crmsfa link
And Click on accounts tab
And Click on find account
And Enter the account name to search
And Click on find account
And Select the desired account
And Click on Delete button
And handle alert message
