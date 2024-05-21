package org.selenium.basic;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseActions {

	public void verifyMouseClick() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClickField= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	    Actions action= new Actions(driver);
	    action.contextClick(rightClickField).build().perform();
	}
	
	public void verifyDoubleClick() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleClickField= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action= new Actions(driver);
		action.doubleClick(doubleClickField).build().perform();
		Alert alert= driver.switchTo().alert(); 
		String msg= alert.getText();
		System.out.println("Message : "+msg);
		alert.accept();
	}
	
	public void verifyDragandDrop() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		WebElement dragField= driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropField= driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		Actions action= new Actions(driver);
		action.dragAndDrop(dragField, dropField).build().perform();
	}
	
	public void verifyDragAndDropOffset() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/dragabble");
		driver.manage().window().maximize();
		WebElement dragfield= driver.findElement(By.xpath("//div[@id='dragBox']"));
		Actions action= new Actions(driver);
		action.dragAndDropBy(dragfield, 50, 100).build().perform();
	}
	
	public void verifyMouseOver() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/menu/#");
		driver.manage().window().maximize();
		WebElement menuField= driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		Actions action= new Actions(driver);
		action.moveToElement(menuField).build().perform();
		WebElement subMenuField= driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		action.moveToElement(subMenuField);
		WebElement subSubMenuField= driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));
		action.moveToElement(subSubMenuField);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseActions obj= new MouseActions();
		//obj.verifyMouseClick();
		//obj.verifyDoubleClick();
		//obj.verifyDragandDrop();
		//obj.verifyDragAndDropOffset();
		obj.verifyMouseOver();
	}

}
