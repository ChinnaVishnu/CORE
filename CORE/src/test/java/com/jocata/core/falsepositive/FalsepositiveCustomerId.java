package com.jocata.core.falsepositive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.core.basescripts.ExtentTestManager;
import com.jocata.core.basescripts.GetScreenshort;
import com.jocata.core.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;
 
public class FalsepositiveCustomerId extends mainbaseLatest {

	public WebElement fluentWait(final By locator){
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        .withTimeout(90, TimeUnit.SECONDS)
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
	
	 
	 
		
	 @Test (priority=27)
	public void testprofiles() throws InterruptedException{
		 
		 
		
		 ExtentTestManager.startTest("   False Positive Manager "); 
		 sleep(2);
	 
         fluentWait(By.xpath("//span[text()='Case Files']")).click();
         
         sleep(2);
         fluentWait(By.xpath("//a[text()='False Positives']")).click();
         
         
     	sleep(2);
     	
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
		
	fluentWait(By.xpath("//input[@id='textCustomerId-inputEl']")).sendKeys("JOCATA553");
	
	fluentWait(By.xpath("//input[@id='textCustomerId-inputEl']")).sendKeys(Keys.ENTER);

    	
    	
    	
}
	 
}
