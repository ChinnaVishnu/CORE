package com.jocata.core.Newenchantment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.jocata.core.basescripts.mainbaseLatest;

public class Dashboard extends mainbaseLatest {

	
	@Test
	public void clickingdash() throws InterruptedException{
	
		
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
		
		driver.findElement(By.xpath("//td[2]/div")).click();
		
		driver.findElement(By.xpath("//li[3]/div")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='investigationActivityPeriodRange']")).clear();

		driver.findElement(By.xpath(".//*[@id='investigationActivityPeriodRange']")).sendKeys("03 Aug 17 - 10 Oct 17");
		
		driver.findElement(By.xpath("//span/span[2]")).click();
		
		Thread.sleep(5000);
		
		
		 WebElement ToolTip = driver.findElement(By.xpath("//div[contains(@id,'_tooltip')]"));

		 //CLICK EACH SECTION OF PIE CHART AND GET THE TEXT OVER IT**

		// ViolettePart.click();
		 System.out.println("Violette Part:"+ToolTip.getText());

		 Thread.sleep(5000);
		String tece=	driver.findElement(By.xpath("//*[name()='svg']/*[name()='rect'][5]")).getText();
		System.out.println("Rabvjhc "+tece);

/*String tee=	driver.findElement(By.cssSelector("#ext-sprite-1094")).getAttribute("fill");
System.out.println("SYYYY"+tee);*/

String te=driver.findElement(By.xpath("//*[name()='svg']/*[name()='rect'][5]")).getAttribute("stroke");

System.out.println("SYYYY"+te);

driver.findElement(By.xpath("//*[name()='svg']/*[name()='rect'][5]")).click();
 
Thread.sleep(5000);


		/*driver.findElement(By.xpath("//*[name()='svg']/*[name()='rect'][5]")).click();
		
		Thread.sleep(5000);*/

System.out.println("pass");		
		
		
	}
	
	
}
