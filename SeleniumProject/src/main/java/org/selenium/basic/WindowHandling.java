package org.selenium.basic;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandling {

	public void verifyMultipleWindowHandling() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		String firstHandleId=driver.getWindowHandle();
		System.out.println(firstHandleId);
		WebElement clickField= driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickField.click();
		Set<String> lstHandleId= driver.getWindowHandles();
		System.out.println(lstHandleId);
		Iterator<String> values=lstHandleId.iterator(); 
		while(values.hasNext()) {
			String handleId= values.next();
			if (!handleId.equals(firstHandleId)) {
				driver.switchTo().window(handleId);
				WebElement emailField= driver.findElement(By.xpath("//input[@name='emailid']"));
				emailField.sendKeys("test@gmail.com");
				driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
				//driver.close();
				
			}
			driver.switchTo().defaultContent();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowHandling obj= new WindowHandling();
		obj.verifyMultipleWindowHandling();
	}

}
