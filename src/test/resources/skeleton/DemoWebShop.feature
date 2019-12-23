Feature: demo_login
This is the demo webshop login

Scenario: Valid login page
Given The user is on the demowebshop login page
When the user enters the id and password
Then the demowebshop page is displayed

Scenario: Registration details
Given The user is on the demowebshop login page
When the user clicks on the register page
Then the user can enter the valid registration details


