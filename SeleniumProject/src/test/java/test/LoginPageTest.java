package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import automationCore.Base;

public class LoginPageTest extends Base {
    public void VerifyLoginPageTitle() {
    	String actualTitle= driver.getTitle();
		String expectedTitle="Demo Web Shop";
		Assert.assertEquals(actualTitle, expectedTitle,"Failed: Title different");
	}
    public void VerifyUserLogin() {
		//assertion - after login check the email displayed is the userId
    	//invalid login and email
    	WebElement loginButton= driver.findElement(By.cssSelector("#Email"));
		loginButton.click();
		WebElement emailField=driver.findElement(By.id("Email"));
		emailField.sendKeys("tom@gmail.com");
		WebElement passwordField=driver.findElement(By.id("Password"));
		passwordField.sendKeys("Qa123456789!");
		WebElement loginButton1= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		loginButton1.click();	
	}
    public void VerifyUserLoginPageWithInvalidCredentials() {
		//assertion
    	WebElement loginButton= driver.findElement(By.cssSelector("#Email"));
		loginButton.click();
		WebElement emailField=driver.findElement(By.id("Email"));
		emailField.sendKeys("tom@gmail.com");
		WebElement passwordField=driver.findElement(By.id("Password"));
		passwordField.sendKeys("123456789!");
		WebElement loginButton1= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		loginButton1.click();
		
	}
   
}
