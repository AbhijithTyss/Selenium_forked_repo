package com.tyss.ec.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {
    
	public Actions act;
	
	public WebDriverUtility(WebDriver driver) {
		act=new Actions(driver);
	}
	
	public void doubleClick(WebElement element) {
	  act.doubleClick(element).perform();
	}
	
	public void dragAndDrop(WebElement from,WebElement to) {
		act.dragAndDrop(from, to).perform();
	}
}
