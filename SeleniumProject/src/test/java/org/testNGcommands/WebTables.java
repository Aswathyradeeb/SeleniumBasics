package org.testNGcommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebTables extends BrowserLaunch{

	@Test
	public void verifyDynamicWebTable() {
		driver.get("https://money.rediff.com/indices/nse");
		driver.findElement(By.xpath("//a[@id=\"showMoreLess\"]")).click();
		WebElement dataTable= driver.findElement(By.xpath("//table[@id=\"dataTable\"]"));
		//System.out.println(dataTable.getText());
		WebElement dataRow= driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[1]"));
		System.out.println(dataRow.getText());
		List<WebElement> rows= dataTable.findElements(By.tagName("tr"));
		int rowSize= rows.size();
		
		for(int i=0;i<rowSize;i++) {
			List<WebElement> dataColumn=rows.get(i).findElements(By.tagName("td"));
			 int columnSize=dataColumn.size();
			for(int j=0;j<columnSize;j++) {
				String cellType= dataColumn.get(j).getText();
				if(cellType.equals("NIFTY NEXT 50")) {
					System.out.println("Previous close value : "+dataColumn.get(1).getText());
				}
			}
		}
	}
}
