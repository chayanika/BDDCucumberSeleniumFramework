Feature: SplashMath login 

Scenario: SplashMath login as parent 
	Given user is already on Splash Math Login Page 
	When title of login page is Splash Math 
	Then user clicks on option button 
	Then user clicks on Sign In button 
	Then user chooses Parent option 
	And user is lands on home page 
	Then Close the current browser 
	
	
