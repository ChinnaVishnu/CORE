package com.jocata.core.existingfuctions;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.jocata.core.basescripts.ExtentTestManager;
import com.jocata.core.basescripts.GetScreenshort;
import com.jocata.core.basescripts.mainbaseLatest;
import com.jocata.core.screens.NewCreateRuleJocata;
import com.relevantcodes.extentreports.LogStatus;

public class AddBenchMark_01  extends mainbaseLatest{

	

	
	@Test(priority = 1)
	public void init() throws HeadlessException, AWTException, IOException {

		// ......................................AddBenchMarkChanges.......................................................................//

		ExtentTestManager.startTest("  Add Benchmark ");

		clickAddbench();
	}

	public void clickAddbench() throws HeadlessException, AWTException, IOException {
		sleep(3);
		fluentWait(By.xpath("//span[text()='Rules and Patterns']")).click();
		WebElement element = fluentWait(By.xpath("//a[text()='Rule Library']"));

		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		sleep(3);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		// .........................................Clicking the Search Button.......................................................//

		
	String names=	driver.findElement(By.cssSelector(".x-grid-cell-inner")).getText();
		
	System.out.println(names);
	
	driver.findElement(By.cssSelector("#rulesIdCombo-inputEl")).sendKeys(names);

	
	driver.findElement(By.xpath("//div[@id='searchRuleButton']/a")).click();
		
		
		
}
}