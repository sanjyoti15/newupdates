Feature:
As a admin user Validate Add Employee Module

Scenario Outline:
Validate Add employee with multiple data
Given user navigates URL in chrome browser
When user enters username as "Admin" and password as "Qedge123!@#"
When user click Login button
When user click PIM and Click Add button.
When user enter firstname "<FirstName>"
When user enter midname "<MiddleName>"
When user enter lastname "<LastName>"
When user capture EId before
When user click Save button
When user capture Eid after
Then user validates Eid
Then user close browser
Examples:
|FirstName|MiddleName|LastName|
|geeta|seeta|meeta|
|leeta|peeta|babita|
|Aasha|usha|Nisha|