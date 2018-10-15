package com.plivo.automationTest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.plivo.automationTest.pageObjects.FillDetails;
import com.plivo.automationTest.utils.PlivoUtil;

public class PlumFuse {
	
	protected static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		startDrivers(driver);
		
	}
	
	public static void startDrivers(WebDriver driver) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/automationTest/Drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://quickfuseapps.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		createApp(driver);
		
	}
	
	public static void createApp(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("link-create")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"intro-dialog-cont\"]/div[2]/button")).click();
		driver.findElement(By.id("add-page")).click();
		driver.findElement(By.xpath("//*[@id=\"create-dialog\"]/form/p/input")).click();
		driver.findElement(By.xpath("//*[@id=\"create-dialog\"]/form/p/input")).sendKeys("Test");
		driver.findElement(By.xpath("/html/body/div[20]/div[3]/button[1]")).click();
		driver.findElement(By.partialLinkText("Messaging")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[4]/ul/li[3]/a/span")).click();
		

	
		//PlivoUtil.dragDrop(driver ,driver.findElement(By.xpath("(//*[@class=\"syn-node ui-draggable syn-node-active\"])[last()]")),
		//		driver.findElement(By.xpath("//*[@class=\"syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable\"]")));
		//
		WebElement p = driver.findElement(By.name("phone_constant"));
		p.click();p.sendKeys("123456789");
		
		p = driver.findElement(By.name("message_phrase[]"));
		p.click();p.sendKeys("test");
		
		
//		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[4]/ul/li[2]/a/span")).click();
		Thread.sleep(3000);
		
		
		
		PlivoUtil.dragDroptoPosition(driver, driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[4]/ul/li[2]")),1100,234);
		
		Thread.sleep(3000);
		FillDetails.fillDetails(driver);
		
		
		PlivoUtil.dragDrop(driver, driver.findElement(By.xpath("//*[@class=\"syn-node syn-node-attached-e ui-draggable syn-node-active\"]")), 
				driver.findElement(By.xpath("(//*[@class=\"syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable\"])[last()]")));
		
		Thread.sleep(3000);
		
		PlivoUtil.dragDroptoPosition(driver, driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/ul/li[1]")), 500,234);
		
		Thread.sleep(3000);
		
		PlivoUtil.dragDrop(driver, driver.findElement(By.xpath("//*[@class='syn-node syn-node-attached-w ui-draggable syn-node-active']")), 
				driver.findElement(By.xpath("(//*[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[last()]")));
		Thread.sleep(3000);
		
		PlivoUtil.dragDroptoPosition(driver, driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/ul/li[1]")), 800,550);
		
		Thread.sleep(3000);
		
		PlivoUtil.dragDrop(driver, driver.findElement(By.xpath("(//*[@class='syn-node syn-node-attached-w ui-draggable syn-node-active'])[last()]")),
				driver.findElement(By.xpath("(//*[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[last()]")));
		Thread.sleep(3000);

		PlivoUtil.dragDroptoPosition(driver, driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/ul/li[1]")), 1400,550);
		
		Thread.sleep(3000);
		
		PlivoUtil.dragDrop(driver, driver.findElement(By.xpath("(//*[@class='syn-node syn-node-attached-e ui-draggable syn-node-active'])[last()]")),
				driver.findElement(By.xpath("(//*[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[last()]")));
		
		
		driver.close();
		
	}
	}


