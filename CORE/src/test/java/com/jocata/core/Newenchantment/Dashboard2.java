package com.jocata.core.Newenchantment;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.jocata.core.basescripts.mainbaseLatest;

public class Dashboard2 extends mainbaseLatest {

	
	
	public String getToolTipLine(int lineNo) throws NoSuchElementException {
        List<String> lines = new ArrayList<String>();
        List<WebElement> toolTipLines = driver.findElements(By.cssSelector("text tspan"));
        for (WebElement toolTipLine : toolTipLines) {
            lines.add(toolTipLine.getText());
        }
        if (lineNo > lines.size()) {
            throw new NoSuchElementException("There is no line " + lineNo + "! There are only " + lines.size() + " lines in the tool tip");
        }
        //We return line - 1 because the lines Array starts a 0 not 1
        return lines.get(lineNo - 1);
    }
	
	@Test
	public void clickingdash() throws InterruptedException {

		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();

		driver.findElement(By.xpath("//td[2]/div")).click();

		driver.findElement(By.xpath("//li[3]/div")).click();

		driver.findElement(By.xpath(".//*[@id='investigationActivityPeriodRange']")).clear();

		driver.findElement(By.xpath(".//*[@id='investigationActivityPeriodRange']")).sendKeys("03 Aug 17 - 10 Oct 17");

		driver.findElement(By.xpath("//span/span[2]")).click();

		Thread.sleep(5000);

		WebElement element = driver.findElement(By.xpath("//*[name()='svg']/*[name()='rect'][5]"));

		Actions builder = new Actions(driver);

		builder.moveToElement(element).build().perform();
		 Thread.sleep(3000);
		 
		 
		// getToolTipLine(14);
		 
	        List<WebElement> toolTipLines = driver.findElements(By.cssSelector("text tspan"));
	        List<String> lines = new ArrayList<String>();

	        for (WebElement toolTipLine : toolTipLines) {
	            lines.add(toolTipLine.getText());
	               
	    String pp=        toolTipLine.getText();
	    
	    System.out.println("BAAAA"+pp);
	        }

		 
		 
/*		 WebElement ToolTip = driver.findElement(By.xpath("//rect[contains(@id,'ext-sprite')]"));

		 //CLICK EACH SECTION OF PIE CHART AND GET THE TEXT OVER IT**

		// ViolettePart.click();
		 System.out.println("Violette Part:"+ToolTip.getText());

*/		 Thread.sleep(5000);
		 
		String tece = driver.findElement(By.xpath("//*[name()='svg']/*[name()='rect'][5]")).getText();
		System.out.println("Rabvjhc " + tece);

		/*
		 * String tee=
		 * driver.findElement(By.cssSelector("#ext-sprite-1094")).getAttribute(
		 * "fill"); System.out.println("SYYYY"+tee);
		 */
		 Thread.sleep(3000);
		String te = driver.findElement(By.xpath("//*[name()='svg']/*[name()='rect'][5]")).getAttribute("fill");

		System.out.println("SYYYY" + te);

		driver.findElement(By.xpath("//*[name()='svg']/*[name()='rect'][5]")).click();

		Thread.sleep(5000);

		/*
		 * driver.findElement(By.xpath("//*[name()='svg']/*[name()='rect'][5]"))
		 * .click();
		 * 
		 * Thread.sleep(5000);
		 */

		System.out.println("pass");

	}

}
