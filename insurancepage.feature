# BDD Framework feature file 
# GoCompare insurance page 
Feature: Verify insurance page 
	As a gocompare site customer
I should be able to navigate to the insurance page
So that I can find the stuff I need

Background: 
	Given I am on the insurance page 
	
Scenario: Verify insurance page 
	Given I am on the home page 
	And I click on "/html/body/header/div/nav/ul/li[1]/a" button 
	Then I should see "Compare Cheap Insurance Quotes Today at GoCompare" title 
	
	#Not working see insurancegluecode class
Scenario: Verify get quotes button 
	Given I am on the insurance page 
	When I click on "//div[@class='feature_item_1']//a[@class='get_quotes']//img" button 
	Then I should see "car insurance [about the car]" title 
	And I enter wrong car registration "//*[@id="AboutCarPanel_RegNumber"]"as LA 112 G 
	And I click on find car "//*[@id="about-car-panel"]/div[2]/div[2]/a" button 
	Then I should see an error message 
	
	
	#Covered mag given error ONLY 
Scenario Outline: Verify tabs in the insurance page 
	Given I am on the insurance page 
	When I click on "<locator>" button 
	Then the page url should contain "<path>" 
	Examples: 
		|                    locator                                                           |  path     |
		| //a[contains(text(),'Money')]                                                        |  money    |
		| //a[@class='menu_item'][contains(text(),'Broadband')]                                | broadband |
		| //a[@class='menu_item'][contains(text(),'Business')]                                 | business  |
		| //li[@class='highlight extra']//a[@class='menu_item'][contains(text(),'Covered mag')]| covered mag|
		
		#passed 
Scenario: Locate Motorbike insurance link on the insurance page 
	Given  I am on the insurance page 
	Then  I should see "//h2[contains(text(),'Motorbike insurance')]" button 
	
	#passed
Scenario: Locate Gas and Electricity on the insurance page 
	When I click on "//h2[contains(text(),'Gas and electricity')]" link 
	Then  I should see "Energy Comparison - Compare Gas and Electricity Prices at GoCompare" link 
	
	
Scenario: Locate travel insurance on the insurance page 
	When I click on "//h2[contains(text(),'Travel insurance')]" link 
	Then I should see "Compare Holiday & Travel Insurance at GoCompare™" link 
	
	
Scenario: Locate student insurance on the insurance page 
	Then I should see "//ul//li[3]//a[1]//h4[1]" button 
	
	
	
Scenario: Locate careers at the footer of the insurance page 
	Given I am on the insurance page 
	When I click on  the link "//a[contains(text(),'Careers')]" 
	
@run 
Scenario: Latest features from Covered mag 
	When I click on "//h3[contains(text(),'The perils of overestimating your EHIC')]" 
	Then I should be able to see "The perils of overestimating your EHIC - Covered mag, presented by Gocompare.com" title of the page 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
