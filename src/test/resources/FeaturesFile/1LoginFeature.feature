Feature: To Validate the Login Functionality

Background:
 Given User launch the Adactin Hotel Application Page

@smoke
Scenario: To Validate the Correct User name With Wrong Password 
 
 #Given  User launch the Adactin Hotel Application Page
 When user pass the valid user name and invalid password
 Then user click the login button
# And verify the login page whether the error message is showing or 

 @sanity
 Scenario: To Validate the correct user name with correct password
 #Given  User launch the Adactin Hotel Application Page
 When user pass the valid user name and valid password
 Then user click the login btn
 #And verify user can login to the next page
  
 
 
   
