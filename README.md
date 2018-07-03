# Katalon Studio Samples
Katalon Studio is a free and easy-to-use automated functional and regression testing platform. It provides users the ability to implement full automated testing solutions for their application projects with minimal engineering and programming skill requirements.
______
The **jira-ui-tests** performs UI functional automation test on Jira Web Application using Katalon Studio. The examples in this project range from common to advanced test cases.
## Getting Started
These instructions will get you a copy of the project up and running on your local machine.
### Prerequisites
- [Katalon Studio](https://www.katalon.com/) - [Installation and Setup](https://docs.katalon.com/x/HwAM)
- Permission access to [Jira System](https://katalon.atlassian.net) (provided in the sample code)
- Application Under Test (AUT):
     + Jira cloud: https://katalon.atlassian.net/
     + Account: demo@katalon.com/8eml3nBz19rJ6kP8oCYK
### Setting Up
- [Check out](https://git-scm.com/book/en/v2/Git-Basics-Getting-a-Git-Repository) the code from this .git
- [Open the project](https://docs.katalon.com//display/KD/Manage+Test+Project) from Katalon Studio
### Executing a Test Case
![Execute a simple test case](https://github.com/katalon-studio-samples/jira-ui-tests/blob/master/Tutorials/Figures/Execute%20a%20simple%20test%20case.png?raw=true)
1. Expand the Test Cases structure, where all the test cases are stored.
2. Select the test case you want to execute
3. Choose the browser for executing the test case

## Test Scenarios
### Story: Login feature
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
          
### Story: Create ticket
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
          
## Test Cases
Below is the list of all the avaible test cases in this project. Simply select the test case you want to run in Katalon Studio and execute accordingly. You can also make additional changes in these test cases to get familiar with automation testing and specifically Katalon Studio. 
### Common Test Cases 
- Create test case with hard coding test data
- Create test case with encrypted test data
- Create test case with test data from GlobalVariable (Profiles)
- Create test dase with data-driven approach
- Create test case with test steps calling other test cases
- Create test case with test steps calling custom keywords

### Advanced Test Cases
- Follow [Page Object Design Pattern](https://www.seleniumhq.org/docs/06_test_design_considerations.jsp#page-object-design-pattern) 
- Test cases are set up to be reusable
- Test steps are readable with BDD mindset

## See Also
Update configuration for integration: [Jira](https://docs.katalon.com/x/7oEw), [Katalon Analytics](https://docs.katalon.com/x/KRhO)

Katalon Documentation: http://docs.katalon.com/

Katalon Forum: https://forum.katalon.com/

Katalon Business Support: https://www.katalon.com/support-service-options/
