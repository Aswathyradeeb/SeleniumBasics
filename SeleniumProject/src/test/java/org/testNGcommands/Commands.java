package org.testNGcommands;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Commands extends BrowserLaunch {
 @Test
 public void VerifyHomePageTitle() {
	    driver.get("https://demowebshop.tricentis.com/");
		String actualTitle=driver.getTitle();
		System.out.println("WEB PAGE TITLE :"+actualTitle);
		String ExpectedTitle="Demo Web Shop";
		Assert.assertEquals(actualTitle, ExpectedTitle,"Failed : Title Mismatch");
		
 }
 @Test
 public void VerifyDemoWebShop() {
	 driver.get("https://demowebshop.tricentis.com/login");
	 WebElement mailId=driver.findElement(By.id("Email"));
	 mailId.sendKeys("aswathyradeeb@gmail.com");
	 WebElement passwordField= driver.findElement(By.id("Password"));
	 passwordField.sendKeys("Qa123456789!");
	 driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	 String loggedInEmail=driver.findElement(By.xpath("//a[@class='account' and text()='aswathyradeeb@gmail.com']")).getText();
	 String mail="aswathyradeeb@gmail.com";
	 Assert.assertEquals(loggedInEmail, mail,"Failed: Mismatch");
 }
 
 @Test
 
 public void verifySendKeysJsExecutor() {
	 driver.get("https://demowebshop.tricentis.com/");
	 JavascriptExecutor js= (JavascriptExecutor)driver;
	 js.executeScript("document.getElementById(\"newsletter-email\").value='test@test.com'");
	 js.executeScript("document.getElementById(\"newsletter-subscribe-button\").click()");
 }
 
 @Test
 
 public void verifyHorizontalScroll() {
	 driver.get("https://demowebshop.tricentis.com/");
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 
 }
@Test
 
 public void verifyKeyBoardEvents() throws AWTException {
	driver.get("https://demowebshop.tricentis.com/");
	Robot robot= new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_T);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_T);
}
}
