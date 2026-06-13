Feature: Amazon Product Search 
Scenario: Amazon Product Search 
	
	Given user is on the amazon page
	When user search product name
	|TV| Sony|
	|Laptop| ThinkPad|
	|Android| Samsung|
	|ios| apple|
	
	Then user should verify same product is listed