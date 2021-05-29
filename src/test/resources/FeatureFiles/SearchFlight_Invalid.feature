Feature: Enter Passenger Details and book the flight

Scenario Outline: Verify that user should enter both the from and to cities to be able to search for a flight

Given User is on the homepage "https://blazedemo.com/" of BlazeDemo website
When User chooses the departurecity <fromCity> and does not enter destination
Then FindFlights Button should be disabled
Examples:
|fromCity|
|"Paris"| 





