Feature: Search
 
 Background: Below are the common steps for each scenario
 	Given User Launch Chrome browser
 	Then User opens URL "www.youtube.com"
 	
@sanity
	Scenario: Search on the search bar
		When User click on search bar
		And enter the keywords "This is it song"
		Then click on the search button
		And play the first vedio
		Then hit like button
		And close browser