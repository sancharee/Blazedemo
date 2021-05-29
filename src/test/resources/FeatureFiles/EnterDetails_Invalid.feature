Feature: Verify the PurchaseFlight is denied if user enters insufficient or invalid details
Scenario Outline: Validate that user is required to enter all passenger details

Given User is on the reservation page "https://blazedemo.com/purchase.php" of BlazeDemo website
When User enters passenger details like Name <name>, Address <address>, City <city>,State <state>, pincode <zipcode>
And User does not enter payment details
Then PurchaseFlight button should be disabled.


Examples:
|name          |address         |city         |state|zipcode|cardType|ccNum             |month|year |nameCard|
|"reese lancer"| "123 Cheeni St"|"Santa Clara"|"CA" |"634252"|"Visa" |"1234567876542341" |"11"|"2026"|"reese"|

