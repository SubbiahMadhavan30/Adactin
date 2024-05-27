Feature: To Validate the Search Functionality
@sanity
Scenario: User fill the red Asterix mark as mandatory

When user want to fill the fields like location,hotels, Room type, No of rooms type
#And user send the value in check in date and check out date
And user want to fill the fields like Adults per room and Children per room
Then user click the search button

    