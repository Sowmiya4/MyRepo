Feature: Login functionality of adactin application 

Background:
    Given User launch url of adactin application 
	When User enters "SowmiyaSri" as username 
	And User enters "Sowmiya05" as password 
	And User click login button 
	Then User validate login button
	
@Login
Scenario: User enters valid username and password 
	Given User launch url of adactin application 
	When User enters "SowmiyaSri" as username 
	And User enters "Sowmiya05" as password 
	And User click login button 
	Then User validate login button
	
