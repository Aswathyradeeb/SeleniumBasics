package org.selenium.basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FireFoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.seleniumeasy.com/");
	     driver.manage().window().maximize();
	     String title=driver.getTitle();
	     System.out.println(title);
	     System.out.println(driver.getCurrentUrl());
	     System.out.println(driver.getWindowHandle());
	     String source=driver.getPageSource();
	     System.out.println(source);
	}

}
