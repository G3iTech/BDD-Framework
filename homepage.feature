# BDD Framework feature file 
# GoCompare HOME PAGE 
Feature: Verify home page 
	As a gocompare site customer
I should be able to navigate through the home page
So that I can find the stuff I need


Background: 
	Given I am on the home page 
	
Scenario: Verify home page title 
	Given I am on the home page 
	Then I should see "GoCompare™ - The Go To Comparison Website - Official Website" title 
	
	
Scenario: Verify search for a car using car registration 
	Given I am on the home page 
	When I click on "//a[@alt='Get Quotes']" button 
	Then I should see "car insurance [about the car]" title 
	
	
Scenario: Verify insurance tab in the home page 
	When I click on "//nav[@class='main']/ul/li[1]/a" button 
	Then the page url should contain "insurance" 
	
	
Scenario: Verify GET QUOTE button 
	When I click on "//a[@class='button get-quote car']//span[@class='label'][contains(text(),'Get quotes')]" button 
	Then I should see "car insurance [about the car]" title 
	
	
	
Scenario Outline: Verify tabs in the home page 
	When I click on "<locator>" button 
	Then the page url should contain "<path>" 
	Examples: 
		|                    locator                            |  path     |
		| //a[@class='menu_item'][contains(text(),'Insurance')] | insurance |
		| //nav[@class='main']/ul/li[2]/a                       | money     |
		| //nav[@class='main']/ul/li[3]/a                       | motoring  |
		| //a[@class='menu_item'][contains(text(),'Travel')]    |  travel   |
		| //a[contains(text(),'Energy')]                        |  energy   |
		
#Passed		
Scenario: Verify retrieve quotes button 
	When I click on "//article[@class='car active']//span[@class='label'][contains(text(),'Retrieve quotes')]" buton 
	Then I should see "Retrieve a quote from Gocompare.com" title 
	
#passed 
Scenario: Verify signin button on the home page 
	And  I click on "//li[@class='account']/a[text()='Sign in']" button 
	Then I should see "Retrieve a quote from Gocompare.com" title 
	
#passed		
Scenario: Verify gas and electricity button on the home page 
	When I click on "/html/body/section[1]/div[1]/nav/ul/li[3]/a/span" button 
	Then I should see "GoCompare™ - The Go To Comparison Website - Official Website" title 
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    