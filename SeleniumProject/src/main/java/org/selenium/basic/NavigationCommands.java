package org.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.seleniumeasy.com/");
      driver.manage().window().maximize();
      driver.navigate().back();
      driver.navigate().forward();
      driver.navigate().refresh();
      driver.navigate().to("https://www.browserstack.com/");
	}

}
