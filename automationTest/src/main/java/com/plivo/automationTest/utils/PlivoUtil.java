package com.plivo.automationTest.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.plivo.automationTest.PlumFuse;



public class PlivoUtil extends PlumFuse{
	
	
	public static void dragDrop(WebDriver driver,WebElement from , WebElement to) {
		
	Actions act = new Actions(driver);
	act.dragAndDrop(from, to).build().perform();
		
	}
	
	public static void dragDroptoPosition(WebDriver driver,WebElement from , int x ,int y) {
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(from, x,y).build().perform();
			
		}

}
