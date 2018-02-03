package com.jocata.core.grid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.core.basescripts.ExtentTestManager;
import com.jocata.core.basescripts.GetScreenshort;
import com.jocata.core.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class AccountTrunover extends mainbaseLatest {

	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return foo;
	};

	public void sleep(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 13)

	public void clickcaseid() {

		sleep(6);

		try {
			ExtentTestManager.startTest(" TaskBoard : Account Turnover  Search between dates ");
			sleep(6);

			fluentWait(By.xpath("//span[text()='Case Files']")).click();

			fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

			// ..........................................................Case
			// Type............................................................//

			sleep(6);
			
			//sleep(8);

			

			/*WebElement element=	driver.findElement(By.xpath("//td[2]/div"));
			Actions action=new Actions(driver);
			
			action.moveToElement(element).build().perform();
			
			action.click().build().perform();
			
			sleep(6);
			driver.findElement(By.xpath("//td[2]/div")).click();

			sleep(6);	

			//driver.findElement(By.xpath("//li[text()='Other Cases']")).click();

		   driver.findElement(By.xpath("//li[3]/span")).click();*/
			
			
			/*fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();

			fluentWait(By.xpath("//li[text()='Other Cases']")).click();
*/
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			// .................................................................Search.......................................................//

			sleep(6);
			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();
			sleep(9);

			fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();

			sleep(6);

			fluentWait(By.xpath("//div[contains(@id,'graphActivity')]/a")).click();

			sleep(6);
			fluentWait(By.xpath(".//*[@id='startDate-inputEl']")).sendKeys("16 Jul 2012");
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
			sleep(6);
			fluentWait(By.xpath(".//*[@id='endDate-inputEl']")).sendKeys("25 Nov 2017");
			sleep(6);
			fluentWait(By.xpath("//tr[3]/td/div/a")).click();
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
			.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
			sleep(9);
			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']//following::img[1]")).click();
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		} catch (Exception e) {
			System.out.println(e.getMessage());

			ExtentTestManager.getTest().log(LogStatus.FAIL,
					"TaskBoard Sort on last updated date  Fail because No Matching Records ");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();

		}
	}
}