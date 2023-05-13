# Login_Test_With_BDD

## Introduction

In this project, I have developed a Java code using the Eclipse IDE to test an authentication interface by applying the Agile BDD (Behavior-Driven Development) method with framework like Cucumber.

#### To test any authentication interface with this code, you can follow the instructions below:

## Testing Steps

#### Step 1️⃣


- Create your MAVEN Project with Eclipse IDE or any other IDE, or import the project into your Eclipse IDE.



#### Step 2️⃣


- Ensure that all the required dependencies and libraries are properly configured.


![Reference Image](/screenshots/dependencies.png)



#### Step 3️⃣


- Identify the authentication interface you want to test.

- For this code, we are testing the login interface of the OrangeHRM Free App. However, you can use any other login interface if the provided one doesn't work for you. 


OrangeHRM Login page ![Reference Image](/screenshots/LoginInterface.png)
Link : <https://opensource-demo.orangehrmlive.com/web/index.php/auth/login>



#### Step 4️⃣


- Write test scenarios in a BDD format using a testing framework like Cucumber. (This scenario already exists in the code)

The scenario used in our code:
```
Feature: Test the login functionality

  Scenario: Test the valid login
    Given user is on loginPage
    When user enters credentails
    And click on login button
    Then user should land on home page
```


#### Step 5️⃣


- Locate the necessary elements in the JAVA code, such as username field, password field, and login button using appropriate methods like class name, ID, or XPath.

- Modify the URL to match the URL of your desired login interface.


![Reference Image](/screenshots/UrlGiven.png)


 - Locate the username and password fields + replace 'Admin' and 'admin123' with the actual credentials for your login interface. 
 
 
![Reference Image](/screenshots/WhenMethod.png)


- Make sure to replace 'orangehrm-login-button' with the actual class name specific to the login button in your interface.


![Reference Image](/screenshots/AndMethod.png)



- Modify the URL to match the URL of your desired login interface.



![Reference Image](/screenshots/ThenMethod.png)



#### Step 6️⃣


- In the runner class, execute the code with JUnit test and observe the results.

- As depicted in the screenshot, the feature file containing our scenario and the corresponding tests were executed successfully. ✅👏


![Reference Image](/screenshots/Run.png)


