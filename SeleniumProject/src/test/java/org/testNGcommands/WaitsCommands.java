package org.testNGcommands;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsCommands extends BrowserLaunch {

	@Test
	
	public void verifyWaitCommands() {
		driver.get("https://demoqa.com/alerts");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timerAlertButton")));
		WebElement clickButton= driver.findElement(By.id("timerAlertButton"));
		clickButton.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert= driver.switchTo().alert();
		alert.accept();
	}
	
	@Test
	
	public void verifyFluentWait() {
		driver.get("https://demoqa.com/alerts");
		WebElement clickButton= driver.findElement(By.id("timerAlertButton"));
		FluentWait wait= new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(NoSuchElementException.class);
		clickButton.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert= driver.switchTo().alert();
		alert.accept();
		
		}
}
