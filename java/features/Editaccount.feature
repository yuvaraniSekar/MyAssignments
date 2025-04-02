Feature: Edit Account functionality in leaf taps application

#Background:
#Given load the url and launch the browser

Scenario: Edit account by providing valid details


When Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
And click on login button
And click on crmsfa link
And Click on accounts tab
And Click on find account 
And Enter the account name to search
And Click on search account
And Select the desired account
And Click on edit button
And Clear the name 
And enter the name in edit field
And Clear the description
And enter the descriiption 
And click on save
