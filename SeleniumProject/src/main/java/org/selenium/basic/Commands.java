package org.selenium.basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Commands {

	public void verifySwagLabsLogin() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement userNameField= driver.findElement(By.id("user-name"));
		userNameField.sendKeys("standard_user");
		WebElement passwordField= driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");
		WebElement loginButton= driver.findElement(By.id("login-button"));
		loginButton.click();
		driver.close();		
	}
	public void verifyDemowebshopRegister() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement registerButton= driver.findElement(By.className("ico-register"));
		registerButton.click();
		WebElement genderField= driver.findElement(By.id("gender-female"));
		genderField.click();
		WebElement firstNameField= driver.findElement(By.id("FirstName"));
		firstNameField.sendKeys("Tom");
		WebElement lastNameField=driver.findElement(By.id("LastName"));
		lastNameField.sendKeys("Jacob");
		WebElement emailField=driver.findElement(By.id("Email"));
		emailField.sendKeys("aswathyradeeb@gmail.com");
		WebElement passwordField=driver.findElement(By.id("Password"));
		passwordField.sendKeys("Qa123456789!");
		WebElement confirmPasswordField=driver.findElement(By.id("ConfirmPassword"));
		confirmPasswordField.sendKeys("Qa123456789!");
		WebElement regButton= driver.findElement(By.id("register-button"));
		regButton.click();	
	}
	public void verifyDemowebshopLogin() {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demowebshop.tricentis.com/login");
		//driver.manage().window().maximize();
		WebElement loginButton= driver.findElement(By.className("ico-login"));
		loginButton.click();
		WebElement emailField=driver.findElement(By.id("Email"));
		emailField.sendKeys("tom@gmail.com");
		WebElement passwordField=driver.findElement(By.id("Password"));
		passwordField.sendKeys("Qa123456789!");
		WebElement loginButton1= driver.findElement(By.className("button-1 login-button"));
		loginButton1.click();	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commands obj=new Commands();
		obj.verifyDemowebshopRegister();
		obj.verifyDemowebshopLogin();
		//obj.verifySwagLabsLogin();
		
	}

}
