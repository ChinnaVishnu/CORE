package com.jocata.core.dashboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.core.basescripts.mainbaseLatest;

public class DashboardLevelSelection extends mainbaseLatest {

	public WebElement fluentWait(final By locator){
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        .withTimeout(10, TimeUnit.SECONDS)
	        .pollingEvery(5, TimeUnit.SECONDS)
	        .ignoring(NoSuchElementException.class);

	    WebElement foo = wait.until(
	        new Function<WebDriver, WebElement>() {
	            public WebElement apply(WebDriver driver) {
	                return driver.findElement(locator);
	            }
	        }
	    );
	    return foo;
	};
	
	
	
	 public void sleep(int seconds){
		   
		   try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	
	
	
	
@Test	
	
public void test(){
	
	fluentWait(By.xpath("//span[text()='Dashboard']")).click();
	
	//fluentWait(By.xpath("//span/span[2]")).click();
	
	
	
	//..........................clicking View................................................................................//
	sleep(6);
	
	fluentWait(By.xpath("//td[2]/div")).click();
	sleep(6);
	fluentWait(By.xpath("//div[3]/div/ul/li")).click();
	sleep(6);
	fluentWait(By.xpath("//span/span[2]")).click();
	
	
	
	
}
	
	
	
}
