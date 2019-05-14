# Backbase QA Assignment
Project to automate computer info application

**** Requirement *******
1. Windows 7/ Windows 10 machine 
2. Gradle to be installed and configure GRADLE_HOME in path variable

Automation
----------------------------------------------------------------------------------------------------------------------------------
To run both the UI Selenium automation suite and REST Assured Automation suite just run below command after pulling the repositiory:


    gradle build

To run the UI Selenium automation suite only,  run the following command :

    gradle clean test --tests automation.selenium.tests.*

To run the REST assured test only,  run the following command :

    gradle clean test --tests automation.restassured.htmlresponses.*
   
----------------------------------------------------------------------------------------------------------------------------------

Manual Testing & Documentation

Please find the details of Test Scenarios, Steps, Test results in the below excel file:

    \manueltest\TestCases.xls

Test information is provided in 2 worksheets - 

    Excel worksheet 1 - Backbase QA Test - Detailed Test Execution steps & Results
    Excel worksheet 2 - Test Summary - Summary results of test cases executed
 
 The screenshots of Issues found are placed in MS word document
    
    \manueltest\Issues found.docx


  
