package org.testNGcommands;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserLaunch {

	WebDriver driver;
	public void initialiseBrowser(String browser) {
		if(browser.equals("Chrome"))
		{
	driver=new ChromeDriver();
	
		}
else if(browser.equals("Edge"))
{
	driver=new EdgeDriver();
}

else if(browser.equals("Firefox"))
{
	driver=new FirefoxDriver();
}
else
{
	throw new RuntimeException("INVALID BROWSER");
}
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
}
	@BeforeMethod
	public void setUp()
	 {
		 initialiseBrowser("Chrome");
	 }
	@AfterMethod
	public void closeBrowser(ITestResult result) throws IOException
	 {
		 if(result.getStatus()==ITestResult.FAILURE) {
			 takeScreenShot(result);
		 }
		 driver.close();
	 }
	
	public void takeScreenShot(ITestResult result) throws IOException {
		TakesScreenshot takescreenShot= (TakesScreenshot)driver; 
		File screenShot= takescreenShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot,new File("./Screenshot/"+result.getName()+".png"));
	}
}
