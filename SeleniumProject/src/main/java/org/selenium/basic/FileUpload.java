package org.selenium.basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUpload {

	public void VerifyFileUpload() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement uploadField= driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		uploadField.sendKeys("C:\\Users\\hp\\git\\SeleniumTest\\SeleniumBasics\\SeleniumProject\\src\\main\\resources\\SeleniumClass.docx");
		WebElement checkBoxField= driver.findElement(By.xpath("//input[@id='terms']"));
		checkBoxField.click();
		driver.findElement(By.xpath("//input[@id='submitbutton']")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload obj=new FileUpload();
		obj.VerifyFileUpload();
		
	}

}
