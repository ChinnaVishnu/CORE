package com.jocata.core.AddManualEvent;

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

public class AddManualEventCustomerid extends mainbaseLatest {

	public WebElement fluentWait(final By locator){
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        .withTimeout(20, TimeUnit.SECONDS)
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
	public void clickmanualevent(){
	
		 
		 
		 fluentWait(By.xpath("//span[text()='Case Files']")).click();
		 fluentWait(By.xpath("//a[text()='Add Manual Event']")).click();
		 
		 
		 
		 //..................................Customer ID ................................//

		 fluentWait(By.xpath("//img[@id='searchEventCustomerId']")).click();
		 fluentWait(By.xpath("//div[2]/div/table/tbody/tr/td/div/div")).click();
		 
		 
		 //................................. Rule Name...............................//

		 
		 fluentWait(By.xpath("//a[6]/span/span/span[2]")).click();
		 fluentWait(By.xpath("//input[@id='mruleId-inputEl']")).click();
		 
		 fluentWait(By.xpath("//li[text()='Customer match with watchlist']")).click();
		 
		 
		 
		 //.............................period.......................................//

		 fluentWait(By.xpath("//img[@class='calendar']")).click();
		 fluentWait(By.xpath("//li[text()='Today']")).click();
		 
		 
		 //..................................... Total Amount..........................//

		 fluentWait(By.xpath("//input[@id='totalamount']")).sendKeys("3000");
         fluentWait(By.xpath("//div[@id='addEventButton']/a")).click();
         
         
         fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();
         
         
        
		
		
		
	}
	 
	
}
