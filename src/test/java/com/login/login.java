package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class login {
	
	WebDriver driver;
	
	
	@Given("user is on loginPage")
	public void user_is_on_loginPage() {
		
		System.out.println("Step1: User is on LoginPage");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
	    
	}

	@When("user enters credentails")
	public void user_enters_credentails() {
		
		WebElement usernameField = driver.findElement(By.name("username"));
	    WebElement passwordField = driver.findElement(By.name("password"));

	    // Enter the username and password
	    usernameField.sendKeys("Admin");
	    passwordField.sendKeys("admin123");
	    
	}

	@And("click on login button")
	public void click_on_login_button() {
		
		WebElement loginButton = driver.findElement(By.className("orangehrm-login-button"));
	    loginButton.click();
	    
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	    String actualUrl = driver.getCurrentUrl();

	    if (actualUrl.equals(expectedUrl)) {
	        System.out.println("User successfully landed on the home page.");
	    } else {
	        System.out.println("User did not land on the home page.");
	    }
	    
	}


}
