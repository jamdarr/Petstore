package com.testerstories;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginSteps {
	
	WebDriver driver;
	
	@Given("^the petstore home page$")
	  public void the_petstore_home_page(){
		System.setProperty("webdriver.chrome.driver","/Users/naveenkhunteta/Downloads/chromedriver");
		 driver = new ChromeDriver();
	     driver.get("https://petstore.com");
	     assertEquals("petstore", driver.getTitle());
	     driver.quit();
	  }
	 
	  @When("^logging in as an admin$")
	  public void logging_in_as_an_admin(){
	      WebElement open = driver.findElement(By.id("open"));
	      open.click();
	 
	      WebElement username = driver.findElement(By.id("username"));
	      username.sendKeys("admin");
	 
	      WebElement password = driver.findElement(By.id("password"));
	      password.sendKeys("admin");
	 
	      WebElement login = driver.findElement(By.id("login-button"));
	      login.submit();
	  }
	 
	  @Then("^the home page navigation is available$")
	  public void the_home_page_navigation_is_available(){
		  WebElement navList = (new WebDriverWait(driver, 10))
			      .until(ExpectedConditions.visibilityOfElementLocated(By.id("navlist")));
	  }
}
