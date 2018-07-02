# Katalon Studio Samples
## JIRA UI TESTS
The **jira-ui-tests** is a testing project with examples of performing UI functional automation test on JIRA Web Application using Katalon Studio. The examples in this project are various from simple to advance tests
## Application Under Test (AUT)
- JIRA cloud: https://katalon.atlassian.net/
- Account: demo@katalon.com/8eml3nBz19rJ6kP8oCYK
## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.
### Prerequisites
What things you need to install the software and how to install them
- [Katalon Studio](https://www.katalon.com/) - [Installation and Setup](https://docs.katalon.com//display/KD/Installation+and+Setup)
- Permission access to [Jira System](https://katalon.atlassian.net) (provided in the sample code)
### Contents
#### Simple examples
- Create test case with hard coding test data
- Create test case with encrypted test data
- Create test case with test data from GlobalVariable (Profiles)
- Create test dase with data-driven approach
- Create test case with test steps calling other test cases
- Create test case with test steps calling custom keywords

#### Advance examples
- Follow [Page Object Design Pattern](https://www.seleniumhq.org/docs/06_test_design_considerations.jsp#page-object-design-pattern) 
- Test cases are set up to be reusable
- Test steps are readable with BDD mindset

### Installing
A step by step series of examples that tell you have to get a development env running
- [Check out](https://git-scm.com/book/en/v2/Git-Basics-Getting-a-Git-Repository) the code from this .git
- [Open the project](https://docs.katalon.com//display/KD/Manage+Test+Project) from Katalon Studio
- Update configuration for integration: [Jira](https://docs.katalon.com//display/KD/JIRA+Integration), [Katalon Analytics](https://docs.katalon.com//display/KD/Katalon+Analytics+%28Beta%29+Integration)

## Running the tests
### Execute a simple test case
![Execute a simple test case](https://github.com/katalon-studio-samples/jira-ui-tests/blob/master/Tutorials/Figures/Execute%20a%20simple%20test%20case.png?raw=true)
- **(1)** Expand the Test Cases structure, where all the test cases are stored.
- **(2)** Select the test case you want to execute
- **(3)** Choose the browser for executing the test case

### Execute an advance test case
![Execute an advance test case](https://github.com/katalon-studio-samples/jira-ui-tests/blob/master/Tutorials/Figures/Execute%20an%20advance%20test%20case.png?raw=true)
The advance test cases in this example repository demonstrate how to setup the test project with Page Object Design Pattern approach to reduce the maintenance cost as well as increase the reusability of testing scripts.
- **(1)** Tests is the place where actual test cases are stored and executed.
- **(2)** Pages is the place where Page Object are stored in Test case format. They could not be executed.
- **(3)** Select the test case you want to execute
- **(4)** Choose the browser for executing the test case

### Execute a test suite with data-driven
![Execute a test suite with data-driven](https://github.com/katalon-studio-samples/jira-ui-tests/blob/master/Tutorials/Figures/Execute%20a%20test%20suite%20with%20data-driven.png?raw=true)
This example demonstrates how to apply data-driven approach into test execution with Katalon Studio. 
- **(1)** Expand the Test Suites structure, where all the test suites are stored and select the test suite you want to execute
- **(2)** Select the test case you want to apply data-driven approach
- **(3)** Click Show/Hide Data Binding to open Test Data and Variable Binding feature for the selected test case
- **(4)** Add an Data Files item containing test data used in the test
- **(5)** Data Files structure, where all the data files are stored. These data files can be created from external Excel files, CSV files, or from the result of a database query.
- **(6)** Variables and Data are binding
- **(7)** Choose the browser for executing the test suite

### Execute a test suite collection
![Execute a test suite collection](https://github.com/katalon-studio-samples/jira-ui-tests/blob/master/Tutorials/Figures/Execute%20a%20test%20suite%20collection.png?raw=true)
This example demonstrates how to execute a test suite collection.
- **(1)** Expand the Test Suites structure and select the test suite collection you want to execute
- **(2)** Test suite lists in the selected collection. 
- **(3)** A browser type is selected for each test suite in the collection
- **(4)** A execution profile is selected for each test suite in the collection
- **(5)** Execution mode. You can set to execute the test suite collection in Sequential or Parallel modes.
- **(6)** Execute the test suite collection with definied configuration.

## Test scenarios
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
