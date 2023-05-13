# Login_Test_With_BDD

## Introduction

In this project, I have developed a Java code using the Eclipse IDE to test an authentication interface by applying the Agile BDD (Behavior-Driven Development) method with framework like Cucumber.

#### To test any authentication interface with this code, you can follow the steps below:

## Testing Steps

#### Step 1️⃣


- Create your MAVEN Project with Eclipse IDE or any other IDE, or import the project into your Eclipse IDE.



#### Step 2️⃣


- Ensure that all the required dependencies and libraries are properly configured.

![dependencies](https://github.com/hajer-zaga/Login_Test_With_BDD/assets/113891001/d9674f9e-9358-4498-a11d-d317ae87cf21)




#### Step 3️⃣


- Identify the authentication interface you want to test.

- For this code, we are testing the login interface of the OrangeHRM Free App. However, you can use any other login interface if the provided one doesn't work for you. 


OrangeHRM Login page 
![LoginInterface](https://github.com/hajer-zaga/Login_Test_With_BDD/assets/113891001/55d227b8-b4ba-41e7-b9ca-95daba5c0d36)
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


- Modify the URL to match the URL of your desired login interface.


![UrlGiven](https://github.com/hajer-zaga/Login_Test_With_BDD/assets/113891001/e01a9be3-3157-4a5b-89a7-40f49723297e)


- Locate the username and password fields + replace 'Admin' and 'admin123' with the actual credentials for your login interface. 
 
 
![WhenMethod](https://github.com/hajer-zaga/Login_Test_With_BDD/assets/113891001/4ee9473e-8c75-4630-9cf7-e85de3dbd0a9)


- Make sure to replace 'orangehrm-login-button' with the actual class name specific to the login button in your interface.


![AndMethod](https://github.com/hajer-zaga/Login_Test_With_BDD/assets/113891001/30415d02-81b5-43a5-bbd3-53a8b718c007)


- Modify the URL to match the URL of your desired login interface.



![ThenMethod](https://github.com/hajer-zaga/Login_Test_With_BDD/assets/113891001/3a8ccf9f-a628-461b-ba8b-efef325fa0d2)



#### Step 6️⃣


- In the runner class, execute the code with JUnit test and observe the results.

- As depicted in the screenshot, the feature file containing our scenario and the corresponding tests were executed successfully. ✅👏


![Run](https://github.com/hajer-zaga/Login_Test_With_BDD/assets/113891001/2579d8c5-d959-49ed-a1fa-898f7484b07f)


