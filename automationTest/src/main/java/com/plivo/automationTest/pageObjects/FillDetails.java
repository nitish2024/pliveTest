package com.plivo.automationTest.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FillDetails {
	
	//static WebDriver driver;
	
	public static void fillDetails(WebDriver driver) {
		
		driver.findElement(By.name("smtp_url")).sendKeys("smtp.gmail.com");
		
		driver.findElement(By.name("port")).sendKeys("465");
		
		driver.findElement(By.name("username")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Test1234");
		
		driver.findElement(By.name("from_constant")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.name("to_constant")).sendKeys("xyz@gmail.com");
		
		driver.findElement(By.name("subject_constant")).sendKeys("SMS Not Sent");
		
		driver.findElement(By.xpath("//*[@id=\"module-3\"]/div[1]/div[3]/div/div[3]/div/div/table/tbody/tr/td[1]/div/textarea")).sendKeys("SMS to 1234567890 not sent");
		
		driver.findElement(By.partialLinkText("Basic")).click();
		
		
	}

}
