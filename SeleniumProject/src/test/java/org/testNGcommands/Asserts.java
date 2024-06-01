package org.testNGcommands;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserts extends BrowserLaunch{
@Test

	public void verifyCheckboxes() {
		driver.get("https://demowebshop.tricentis.com/register");
		Boolean isSelected=driver.findElement(By.id("gender-male")).isSelected();
		Assert.assertTrue(isSelected, "Passed:Not Selected");
		Assert.assertFalse(isSelected, "Failed: Selected");
	}
}
