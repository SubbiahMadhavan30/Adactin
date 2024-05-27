Feature: To Valiate the booking page in Adactin Application
@sanity
Scenario: User want to fill the manditatory fields in the booking page

 When user want to fill the firstname , lastname, Bill Address, credit card number
 And user select the credit card type and select month and year in the dropdown menu
 And user want to fill the cvv number 
 Then user click the book Now button
 And verify the order generate or not and print the order number in excel sheet

