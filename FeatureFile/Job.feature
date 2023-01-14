Feature:
As a admin user Validate Add Employee Module

Scenario Outline:
Validate Add employee with multiple data
Given user navigates URL in chrome browser
When user enters username as "Admin" and password as "Qedge123!@#"
When user click Login button
When user moves mouse to Admin and moves mouse to Job
When user click Job Title
When user click to Add button
When user enter Job Title"<jobtitle>"
When user enter Job Description"<jobdesc>"
When user enter Note"<note>"
When user click Save button
Then user close browser
Examples:
|jobtitle|jobdesc|note|
|Tester|testing|work from home|
|QA Assistant|qualityanalysis|work from office|  
