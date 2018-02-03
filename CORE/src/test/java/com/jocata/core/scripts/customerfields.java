package com.jocata.core.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.jocata.core.basescripts.ExtentTestManager;
import com.jocata.core.basescripts.GetScreenshort;
import com.jocata.core.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class customerfields extends mainbaseLatest {

	@Test(priority=8)
	public void checkcustomerfields() {

		ExtentTestManager.startTest("  Case Expand :  Actions  ");

		fluentWait(By.xpath("//span[text()='Case Files']")).click();

		fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

		// ..........................................................Case
		// Type............................................................//
		sleep(6);
		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

		// ...............................................................Alerts
		// 13276.....................................................//

		// driver.findElement(By.xpath("//div[text()='13276']")).click();

		// driver.findElement(By.xpath("//div[text()='24156']")).click();

		sleep(9);
		
		fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath("//div[contains(@id,'-placeholder')]//img")).click();

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		

		List<WebElement> Loginbox = driver.findElements(By.xpath("//div[@class='row title']//div"));

		for (WebElement elerlogin : Loginbox) {

			String textlogin = elerlogin.getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, textlogin);

		}

		// String OpenCase=driver.findElement(By.xpath("//div[text()='Open
		// Case']")).getText();

		// test.log(LogStatus.INFO, OpenCase);

		sleep(2);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		List<WebElement> photename = driver.findElements(By.xpath("//div[@class='row']/div/div/div"));

		for (WebElement eledisgnat : photename) {

			String textdesigna = eledisgnat.getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, textdesigna);

		}

		// ..............................................logout.......................................................................//
		// driver.findElement(By.xpath("//img[@id='tool-1391-toolEl']")).click();

		

		fluentWait(By.xpath("//div[starts-with(@id,'caseLog')]//div[contains(@id,'_header-body')]//img")).click();

		// ........................................comments and
		// Evidence..............................................................//

		fluentWait(By.xpath("//div[starts-with(@id,'commentsandevidences')]//img")).click();

		sleep(9);

		String Evidences = driver.findElement(By.xpath("//span[text()='Evidences']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, Evidences);

		String document = driver.findElement(By.xpath("//div[@class='evidences-table']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, document);

		String Links = driver.findElement(By.xpath("//span[text()='Links']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, Links);

		String Tags = driver.findElement(By.xpath("//span[text()=' Tags ']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, Tags);
		// .....................................Evidence...........................//

		fluentWait(By.xpath("//div[@id='panelRight']//a")).click();

		sleep(12);

		// .....................................close
		// Evidence..................................//

		fluentWait(By
				.xpath("//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box x-resizable x-window-resizable x-window-default-resizable']//img"))
						.click();

		fluentWait(By.xpath("//div[@id='panelRight']//a[contains(@id,'upload_lnk')]")).click();

		sleep(9);

		fluentWait(By
				.xpath("//div[@class='x-window x-layer x-window-default x-plain x-window-plain x-window-default-plain x-closable x-window-closable x-window-default-closable x-border-box']//img"))
						.click();

		sleep(5);

		fluentWait(By.xpath("//input[starts-with(@id,'addTag')]")).sendKeys("RaghuRam");

		/*
		 * JavascriptExecutor jseframe = (JavascriptExecutor)driver;
		 * jseframe.executeScript("window.scrollBy(0,600)", "");
		 */
		

		// WebElement
		// elementframe=driver.findElement(By.xpath("//iframe[@class='x-htmleditor-iframe']"));
		// driver.switchTo().frame("");
		// elementframe.sendKeys("Hi Raghu");

		driver.findElement(By.xpath("//div[starts-with(@id,'form-')]//table//div[@id='commentpanl-inputCmp']"))
				.sendKeys("hi ram");

		// driver.switchTo().defaultContent();

		

		fluentWait(By.xpath("//img[@class='x-tool-img x-tool-collapse-right']")).click();

		// .......................................closeing the Evidence and
		// coomments...............................................//

		// ..................................clicking the
		// name..........................................................................//
		fluentWait(By.xpath("//a[@class='title']")).click();

		sleep(9);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
		// .........................................clicling the closeover
		// Lay.........................................................//
		// driver.findElement(By.xpath("//div[@id='tool-1408']/img")).click();
		fluentWait(By
				.xpath("//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//div[contains(@id,'_header-body')]//img[@class='x-tool-img x-tool-close']"))
						.click();

		sleep(9);

		
		

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
		
		WebElement elementnumber = driver
				.findElement(By.xpath("//tr[starts-with(@id,'ruleTable')]//a[@class='linksStyle']"));

		JavascriptExecutor jsrrr = (JavascriptExecutor) driver;
		jsrrr.executeScript("arguments[0].click();", elementnumber);

		// driver.findElement(By.xpath("//tr[starts-with(@id,'ruleTable')]//a[@class='linksStyle']")).click();
		

		fluentWait(By
				.xpath("//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box x-resizable x-window-resizable x-window-default-resizable']//div//img"))
						.click();
		// driver.findElement(By.xpath("//div[@id='tool-2321']//img")).click();

		sleep(9);

		// ............................................clicking the Activity
		// Graph................................

		// driver.findElement(By.xpath("//img[@id='tool-1382-toolEl']")).click();

		
			fluentWait(By.xpath("//div[starts-with(@id,'graphActivity')]//div[3]")).click();

	}

}
