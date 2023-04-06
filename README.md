# SpurQLabsProject
A)Description:

This project provides an automated testing framework for a web application "Calculator.net".
It includes TestNG test cases that use Selenium WebDriver to interact with the application and validate its functionality of Addition,Multiplication,Division and Subtraction.

B)Prerequisites:

To run this project, you will need:
Java 8 or later
Maven 3.0 or later
TestNG 6.14.3 or later
Selenium WebDriver 3.141.59 or later

C)Configuration and Running Project:
To configure the project, We just need to check the Latest Chrome Version and according to that Chromedriver needs to be updated inside the project.
For Running Project we just have to check if the path of the test file with pacakge name is correct in the testng.xml file, then we can run as testng.xml file as
testng test.

D)Test Cases with Annotations:
The following test cases are included "calculatorOperationsTest.java" file in the project:

@BeforeTest: For logging Extent Report for each Test Case.
@BeforeMethod: Initialize Chrome browser and getting Desried URL.
@Test: a)Multiplication : Verifies if the multiplication functionality is working as expected
       b)Division:Verifies if the Division functionality is working as expected
       c)Addition : Verifies if the addition functionality is working as expected
       d)Subtraction : Verifies if the Subtraction functionality is working as expected
@AfterTest:For displaying extent report inside given directory

E)Troubleshooting:
If you encounter any issues when running the tests, try the following:
Make sure all required dependencies are installed and configured correctly.
Check the application logs for any error messages.
Use the TestNG -debug option to get more detailed output.

F)Contributor:
Prasad Khawale (QA Automation Engineer)
       

