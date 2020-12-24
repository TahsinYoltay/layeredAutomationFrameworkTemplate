 LayeredAutomationFrameworkTemplate --> BDD Cucumber & Selenium Webdriver & Rest-Assured Java Test Automation Framework
==================================================================================

Tools & libraries
=================

*Cucumber-JVM:- BDD Framework  
*Custom Page Object Pattern and utility functions  
*Selenium WebDriver: - Browser automation framework
*JAVA: - Programming language  
*JUnit: - JUnit Java testing framework  
*Maven: - Build tool  
*Lombok: - Java utility api  
*Guice: - Standard Dependency Injection     
*Rest-Assured : - Restful Api framework     

Compile Build or Run Tests
==========================

Command Line

cd to root ot automationFramework project directory

To clean and compile the build
-----------------------------
mvn clean install 


Getting Started
===========================


Feature Files
-------------------------------------------------------------------
These files contains the acceptance criteria which are written in Gherkin Language and contains various scenarios.  
The feature files are tagged with "@tagname" to group common feature files 

File Extension:  *.feature    
Location: "features/GetUsers.feature"      
Directory:  Same directories for GUI and API tests, Group common features files in a 
single directory    
Example:   
  @Non-UI
  Scenario: When I get users, I verify user with response code 200
    Given : I get perform GET operation for "/users"
    When I get user list
    Then I verify response code "200"
    
Page Objects
-------------------------------------------------------------------
PageObjects are used to store the WebElements for a Web Page.
A good practice is to have a separate class for every single WebPage.
To avoid duplication for multiple pages which have common web page elements a Parent class can be created 
and the child class can then inherit.  
Every Page  class extends "BasePage.class" to make use of the WebDriver Object and utility functions.  
In case of Parent and Child Class, Parent class extends PageObject class and child class extends Parent class      
   
Location: src/test/java/page

Step Definitions
--------------------------------------------------------------------
Every steps defined in Feature file needs to be implemented in Step Definitions Class

Location: src/test/java/steps 
Directory structure: Same directories for GUI and API tests, Group common step definition files in a 
                     single directory    

Example:  

    @Given("^: I get perform GET operation for \"([^\"]*)\"$")
    public void i_get_perform_get_operation_for(String PATH) {
        Response response = RestAssuredUtil.sendGetRequest(HOST, PATH);
        getUserContex.setHttpResponse(response);

    }
    


