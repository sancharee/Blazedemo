@BookFlight
Feature: Verify the steps needed to book a flight successfully

Scenario Outline: Verify that on entering to and from cities users should be able to search for flight, 
                  validate search results and select a flight

Given User is on the homepage "https://blazedemo.com/" of BlazeDemo website
When User chooses the departurecity <fromCity> and destinationcity <toCity>
And User clicks on FindFlights button
Then User should be able to search for a flight and view the search results from departurecity <fromCity> to destinationcity <toCity>
And  User should be able to choose a flight

Examples:
|fromCity|toCity|
|"Paris"| "Cairo"|

Scenario Outline: Validate that on entering passenger details user should be successfully able to book the flight

Given User is on the reservation page "https://blazedemo.com/purchase.php" of BlazeDemo website
When User enters passenger details like Name <name>, Address <address>, City <city>,State <state>, pincode <zipcode>
And User enters payment details like CardType <cardType>, CardNumber <ccNum>,expiry month <month> and year <year> and name on card <nameCard>
And User clicks on Purchase Flight button
Then User should be redirected to the booking confirmation screen


Examples:
|name          |address         |city         |state|zipcode|cardType|ccNum             |month|year |nameCard|
|"reese lancer"| "123 Cheeni St"|"Santa Clara"|"CA" |"634252"|"Visa" |"1234567876542341" |"11"|"2026"|"reese"|


Scenario: Validate that after purchasing the flight the reservation is confirmed

Given User is on the confirmation page "https://blazedemo.com/confirmation.php" of BlazeDemo website
Then User should be able to verify the confirmation message and the confirmation id




