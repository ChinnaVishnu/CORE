package com.jocata.core.misreports;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class AddReportDashboard extends mainbaseLatest {

	public void clickComboItem(WebElement input, String target) {
		input.click(); // click input to pop up the combo list
		List<WebElement> comboItems = driver.findElements(By.xpath(
				"//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box']//li"));
		for (int i = 0; i <= comboItems.size(); i++) {

			WebElement item = comboItems.get(i);
			if (item.getText().equals(target)) {
				item.click();
				break;
			}
		}
	}

	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS)
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

	@Test(priority = 19)
	public void addReport() throws InterruptedException, IOException {

		ExtentTestManager.startTest("  MIS Report :  Dashboard Investigation Summary Report ");

		sleep(2);

		try {

			fluentWait(By.xpath("//span[text()='CENTRA']")).click();

			sleep(2);

			fluentWait(By.xpath("//a[text()='MIS Reports']")).click();

			sleep(2);

			fluentWait(By.xpath("//a[@id='addReportLink']")).click();

			WebElement input = driver.findElement(By.xpath(".//*[@id='reportType-inputEl']"));

			sleep(2);

			String target = " Dashboard Investigation Summa...";
			clickComboItem(input, target);

			sleep(4);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.findElement(By.xpath(".//*[@id='addRepFeildsLeft']/table/tbody/tr[3]/td[1]/b")).click();

			fluentWait(By.xpath("//input[@id='reportName']")).sendKeys("DashboardInvestigation");

			fluentWait(By.xpath(".//*[@id='reportDesc']")).sendKeys("RaghuRamYdadv");

			fluentWait(By.xpath(".//*[@id='reportFormat-inputEl']")).click();

			// fluentWait(By.xpath(".//*[@id='reportPageLayout-inputEl']")).click();

			// sleep(4);
			fluentWait(By.xpath("//div[contains(@id,'container-')]/a[2]")).click();

			sleep(8);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//span[@id='button-1179-btnIconEl']")).click();

			sleep(8);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[contains(@id,'messagebox-')]/a")).click();

			sleep(5);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(8);
			ExtentTestManager.getTest().log(LogStatus.INFO,
					"Dashboard Investigation Summary Report  Added SucessFully");

			/*
			 * sleep(8);
			 * 
			 * 
			 * fluentWait(By.xpath("//div[@id='misReportGrid-body']//tr/td/div")
			 * ).click();
			 * 
			 * 
			 * 
			 * // fluentWait(By.xpath(".//*[@id='deleteReportLink']")).click();
			 * 
			 * //
			 * fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a[2]")).
			 * click();
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO,
			 * "Screenshortbelow :"
			 * +ExtentTestManager.getTest().addScreenCapture(GetScreenshort.
			 * capture(driver, "ScreenshortForExtentReport")));
			 * 
			 * 
			 * fluentWait(By.xpath("(//img[@title='VIEW'])[3]")).click();
			 * 
			 * 
			 * Thread.sleep(40000);
			 * 
			 * 
			 * 
			 * 
			 * Runtime.getRuntime().exec(
			 * "D:\\WebDriverdownloads\\batch12_upload.exe");
			 * 
			 * sleep(10);
			 * 
			 * 
			 * System.out.println("DashBoardDetailsReport");
			 */

		} catch (Exception e) {

			sleep(19);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();

			System.out.println("referesh................");

			ExtentTestManager.getTest().log(LogStatus.FAIL,
					"pageloading it will wait for 5 min and after it will   Skiping");

		}

	}

}
