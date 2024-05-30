package org.selenium.basic;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class IframeAssignment {

	public void verifyIframe() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html#google_vignette");
		driver.manage().window().maximize();
		WebElement textField= driver.findElement(By.xpath("//input[@id='name']"));
		List<WebElement> lstFrame= driver.findElements(By.tagName("iframe"));
		System.out.println("No:of Iframes :"+lstFrame.size());
		WebElement iFrame= driver.findElement(By.id("frm1"));
		driver.switchTo().frame(iFrame);
		WebElement drpCourse= driver.findElement(By.id("course"));
		Select select=new Select(drpCourse);
		select.selectByIndex(3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IframeAssignment obj= new IframeAssignment();
		obj.verifyIframe();
	}

}
