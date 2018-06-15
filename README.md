# katalon-studio-samples
## Jira API
This project contains examples of verifying Jira API using Katalon Studio. The examples demonstrate:
- How to create different types of Web Service Request in Object Repository
- How to call Web Serivce Request from Test Cases
- How to verify the response in Test Cases
- Best practices in Web services end-point management, verification, and creating Test Case with BDD mindset
## Jira UI
This project contains examples of performing functional automation test on Jira UI using Katalon Studio. The examples demonstrate:
- UI functional test introduction
- Test object definition
- Test project structure
- Sample project
- Test scenarios
- Test scenario implementation

### Test scenarios
#### Story: Login feature
     User story
         As a Jira user, I would like to be able to login the Jira system, so that I could manage Jira tickets.
     
     Feature: Login 
         Scenario: Login successfully
          Given The Login page is loaded successfully
          When I login the system with a valid account
          Then The Dashboard Page is loaded successfully

         Scenario Outline: Login successfully
          Given The Login page is loaded successfully
          When I login the system with valid <username> and <password>
          Then The Dashboard Page is loaded successfully
         Examples:
          | username | password  |
          |	tom      | jira@2018 |
          |	jerry    | jira@2019 |
          
#### Story: Create ticket
     User story
         As a Jira user, I would like to be able to create a new ticket, so that I could manage my tasks.

     Feature: Create ticket
         Scenario Outline: Create ticket successfully
          Given I login the system with a valid account
          When I create a new ticket with below information
          Then the ticket is created successfully
         Examples:
          | project | issueType | priority | summary |
          |         |           |          |         |
          |         |           |          |         |
