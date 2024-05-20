package org.selenium.basic;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertPractice {
	
	
	public void verifyAlert() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement okButton= driver.findElement(By.xpath("//button[@id='alertButton']"));
		okButton.click();
		Alert alert= driver.switchTo().alert();
		alert.accept();
		
	}
	public void verifyTimerAlert() {
		WebDriver driver= new ChromeDriver();
		driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]")).click();
		Alert alert= driver.switchTo().alert();
		alert.accept(); 
	}
	public void verifyConfirmationAlert() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert alert= driver.switchTo().alert();
		String alertMsg= alert.getText();
		System.out.println("Message in Alert : "+alertMsg);
		alert.dismiss();
		WebElement spanField= driver.findElement(By.xpath("//span[@id='confirmResult']"));
		String msg= spanField.getText();
		System.out.println("Message : "+msg);
	}
	
	public void verifyPromptAlert() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement button= driver.findElement(By.xpath("//button[@id='promtButton']"));
		button.click();
		Alert alert= driver.switchTo().alert();
		alert.sendKeys("Test");
		String alertMsg=alert.getText();
		System.out.println("Message in Alert : "+alertMsg);
		alert.dismiss();
		//WebElement spanField= driver.findElement(By.xpath("//span[@id='promptResult']"));
		//String msg= spanField.getText();
		//System.out.println("Message : "+msg);
		driver.close();	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertPractice obj= new AlertPractice();
		//obj.verifyAlert();
		//obj.verifyTimerAlert();
		//obj.verifyConfirmationAlert();
		obj.verifyPromptAlert();
		
	}

}
