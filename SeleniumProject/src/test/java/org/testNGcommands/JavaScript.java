package org.testNGcommands;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JavaScript extends BrowserLaunch{

	@Test
	public void verifyJsLogin() {
		driver.get("https://demowebshop.tricentis.com/login");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.getElementById(\"Email\").value=\"aswathyradeeb@gmail.com\"");
		js.executeScript("document.getElementById(\"Password\").value=\"Qa123456789!\"");
		js.executeScript("document.querySelector('.login-button').click()");
	}
}
