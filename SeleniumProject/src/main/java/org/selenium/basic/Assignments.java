package org.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignments {
	WebDriver driver= new ChromeDriver();
    public void verifySingleSelectField() {
    	driver.get("https://selenium.qabible.in/select-input.php");
    	driver.manage().window().maximize();
    	WebElement colorDrpdown= driver.findElement(By.xpath("//select[@id='single-input-field']"));
    	boolean isSelected= colorDrpdown.isSelected();
    	if(!isSelected) {
    		System.out.println("Not selected");
    		Select select= new Select(colorDrpdown); 
    		select.selectByValue("Red");
    		isSelected= colorDrpdown.isSelected();
    		System.out.println("Color Selected: "+isSelected);		
    	}    	
    }
    public void verifyMultiSelectField() {
    	driver.get("https://selenium.qabible.in/select-input.php");
    	driver.manage().window().maximize();
    	WebElement colorDrpdown= driver.findElement(By.xpath("//select[@id='multi-select-field']"));
    	boolean isSelected= colorDrpdown.isSelected();
    	if(!isSelected) {
    		System.out.println("Not selected");
    		Select select= new Select(colorDrpdown); 
    		select.selectByValue("Red");
    		select.selectByValue("Yellow");
    		isSelected= colorDrpdown.isSelected();
    		System.out.println("Color Selected: "+isSelected);		
    	}    	
    }
    public void verifySingleInputField() {
    	WebElement txtmessage= driver.findElement(By.xpath("//input[@id=\"single-input-field\"]"));
    	String message= txtmessage.getText();
    	if(message.isEmpty()) {
    		txtmessage.sendKeys("Hello");
    		driver.findElement(By.id("button-one")).click();
    	}
    }
    public void Verifytwoinputfields() {
    	WebElement txtno1= driver.findElement(By.cssSelector("input#value-a"));
    	WebElement txtno2= driver.findElement(By.cssSelector("input#value-b"));
    	String num1= txtno1.getText();
    	String num2=txtno2.getText();
    	if(num1.isEmpty() || num2.isEmpty()) {
    		txtno1.sendKeys("1");
    		txtno2.sendKeys("2");
    	}
    	driver.findElement(By.id("button-two")).click();
    }
    public void verifySingleCheckbox() {
    	WebElement checkboxField= driver.findElement(By.xpath("//input[@id=\"gridCheck\"]"));
    	boolean isChecked= checkboxField.isSelected();
    	System.out.println("Checkbox : "+isChecked);
    	if(!isChecked) {
    		checkboxField.click();
    	}
    	driver.findElement(By.xpath("//input[@id=\"check-box-one\"]")).click();
    	driver.findElement(By.xpath("//input[@id=\"check-box-two\"]")).click();
    	driver.findElement(By.xpath("//input[@id=\"button-two\"]")).click();
    }
    public void verifyRadioButton() {
    	driver.findElement(By.xpath("//input[@id=\"inlineRadio1\"]")).click();
    	driver.findElement(By.xpath("//input[@id=\"inlineRadio21\"]")).click();
    	driver.findElement(By.xpath("//input[@id=\"inlineRadio23\"]")).click();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignments obj=new Assignments();
		obj.verifySingleSelectField();
		obj.verifyMultiSelectField();
		obj.driver.findElement(By.xpath("//a[@href=\"simple-form-demo.php\"]")).click();
		obj.verifySingleInputField();
		obj.Verifytwoinputfields();
		obj.driver.findElement(By.xpath("//a[@href=\"check-box-demo.php\"]")).click();
		obj.verifySingleCheckbox();
		obj.driver.findElement(By.xpath("//a[@href=\"radio-button-demo.php\"]")).click();
		obj.verifyRadioButton();
		//obj.driver.close();
	}

}
