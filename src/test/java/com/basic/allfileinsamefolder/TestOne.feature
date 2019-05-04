Feature: Facebook login
As a fb user, I want to enter username and password

Scenario: valid fb login scenario1
Given the user is on facebook login page
When he enter "anil" as user name
When he enter "pwd" as password
Then check username is present in textbox
Then i am check facebook login page
