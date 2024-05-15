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
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		WebElement loginButton= driver.findElement(By.cssSelector("#Email"));
		loginButton.click();
		WebElement emailField=driver.findElement(By.id("Email"));
		emailField.sendKeys("tom@gmail.com");
		WebElement passwordField=driver.findElement(By.id("Password"));
		passwordField.sendKeys("Qa123456789!");
		WebElement loginButton1= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		loginButton1.click();	
	}
	public void verifyDemowebshopIsSelected() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		WebElement genderField=driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		boolean isSelected=genderField.isSelected();
		System.out.println("Before selected: "+isSelected);
	    genderField.click();
	    isSelected=genderField.isSelected();
	    System.out.println("After selected: "+isSelected);
	}
	public void verifyDemowebshopIsEnabled() {
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    WebElement subscribeButton= driver.findElement(By.id("newsletter-subscribe-button"));
	    Boolean isEnabled= subscribeButton.isEnabled();
	    System.out.println("Enabled :"+isEnabled);
	    if(!isEnabled) {
	    	subscribeButton.click();
	    	isEnabled= subscribeButton.isEnabled();
		    System.out.println("Enabled :"+isEnabled);
	    }    
	}
	
	public void verifyDemowebshopIsDisplayed() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement voteButton=driver.findElement(By.id("vote-poll-1"));
		Boolean isDisplayed=voteButton.isDisplayed();
		System.out.println("Displayed :"+isDisplayed);
		driver.close();
	}
	public static void main(String[] args) {
		Commands obj=new Commands();
		//obj.verifyDemowebshopRegister();
		//obj.verifyDemowebshopLogin();
		//obj.verifySwagLabsLogin();
		//obj.verifyDemowebshopIsSelected();
		//obj.verifyDemowebshopIsEnabled();
		obj.verifyDemowebshopIsDisplayed();
	}

}
