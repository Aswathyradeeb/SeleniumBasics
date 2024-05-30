package org.selenium.basic;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames {

	public void verifyFrames() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		List<WebElement> iframeLst= driver.findElements(By.tagName("iframe"));
		int size= iframeLst.size();
		System.out.println("Number of Iframes " +size);
		//driver.switchTo().frame(5);
		WebElement frame=driver.findElement(By.xpath("//iframe[@id=\"frame2\"]"));
		driver.switchTo().frame(frame);
		System.out.println("Message :"+driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]")).getText());
		driver.switchTo().defaultContent();
		driver.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frames obj= new Frames();
		obj.verifyFrames();
	}

}
