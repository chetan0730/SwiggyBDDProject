Feature: find restaurants and order food on swiggy 

@sanity 
Scenario: enter location and find restaurants 
	Given User Launch Chrome browser 
	When User opens URL "https://www.swiggy.com/" 
	And User enter location 
	And User search for restaurants 
	And I am on Irani cafe restaurant page 
	And I add food items to cart 
	And I remove some items from cart 
	Then I check the bill to be paid 
   