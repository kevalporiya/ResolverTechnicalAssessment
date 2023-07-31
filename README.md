# ResolverTechnicalAssessment

Instructions to run this project : 
#Prerequisite :
> Need Chrome browser and plugins to run these tests on chrome browser 
> Has to download index.html page and change the config.properties file  where URL has been given to run  all the tests on your local machine since it’s not hosted remotely
> Has given TestNG test assertions so need to have TestNG plugin and dependencies
> This is Maven project so has to have Maven dependencies and associated JAR files for successful run
> This is based on Java programming language so it’s using JDK and JRE to run the java libraries so has to have latest JDK and  JRE in the local machine
> This is using Selenium dependencies and JAR files . So has to have Selenium download added dependencies in the pom.xml file.
> This project has created and developed using EclipseIDE tool

Structure of the Project 
Project name - ResolverTechnicalAssessment - Maven Project which is created as Page Object Model Test Data Driven Framework which uses Java OOPS Concepts - Inheritance , method creation and object initialization , various data types , access modifiers , constructor , collection framework etc. 
It has different files - src/main/java , src/test/java , JRE Libraries , Maven dependencies , test-output where test result and report  has been stored under index.html and view it by copy the path and open it on any browser and pom.xml and testng.xml files where all the maven dependencies and suites and test files has been configured and given for test execution.
src/main/java - 
pageClass package has all the separate pages with driver invocation , page attributes , functionalities  and methods initialized
 Resources package has config.properties file which stores data about url , email , password and other static data which are used in test files for the execution
Utils package has ConfigReader class file which holds properties file invocation and methods to get the properties of fields
src/test/java -
testClass package has all the associated tests for each page class files including BaseTest
BaseTest is super test class file which holds driver initialization and invocation , browser related methods , implicit wait , explicit wait and tearDown method to close the browser on each test execution
 Other test classes inherits the BaseTest class for test execution 
Test classes has created object of page class file to invoke the methods presents in the page class file and also provided assertions on test execution to perform validation on tests
How to Run this Project 
To run this whole test suite  right click on testng.xml file and select run as “TestNG Suite” option and it will trigger test execution on chrome browser sequentially . 
Able to see the output of test cases in the console which as 6 tests 
In order to see the report go to the test-output folder and copy the path of index.html and paste it on any browser to see the formatted TestNG report to analyze the test case results. 


