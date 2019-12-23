Feature: login
This is the first script
The first script consists a number of documents
Scenario Outline: Valid Multiple login 
Given The user is on the demowebshop homepage
When the user gives a "<Email>" and "<password>"
Then the relevant login is displayed

Examples: 

|Email|password|
|mnm@gmail.com|nitin123|
|klm123@gmail.com|klm123|
|hira@gmail.com|hira123|
