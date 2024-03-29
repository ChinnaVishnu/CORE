package com.jocata.core.grid;

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
import com.jocata.core.basescripts.GetScreenshortAAAA;
import com.jocata.core.basescripts.Randomwords;
import com.jocata.core.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class ADDRolesModify extends mainbaseLatest {
	
	public String user = "Raghu";


	@Test(priority = 16)
	public void GridTest() {

		try {

			System.out.println("pass");

			sleep(5);

			

			ExtentTestManager.startTest(" Manage Role  :  Add, Edit Role ");

			// fluentWait(By.xpath(".//*[@id='flip']/img")).click();

			// fluentWait(By.xpath("//div[@id='panel']/fieldset/div")).click();

			sleep(5);

			fluentWait(By.xpath("//span[text()='Profiles']")).click();
			sleep(5);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//a[@id='addRoleLink']")).click();
			
			Randomwords h = new Randomwords();

			String raaaa = h.stp();

			fluentWait(By.xpath(".//*[@id='roleName']")).sendKeys(user + raaaa);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			sleep(4);
			fluentWait(By.xpath(".//*[@id='roleType-triggerWrap']")).click();
			sleep(4);
			fluentWait(By.xpath("//li[text()='CORE']")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			sleep(4);

			fluentWait(By.xpath(".//*[@id='landingPage-triggerWrap']")).click();
			sleep(4);
			fluentWait(By.xpath("//li[text()='CORE Dashboard']")).click();
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			sleep(4);
			fluentWait(By.xpath(".//*[@id='roleStatus-triggerWrap']")).click();

			sleep(4);
			fluentWait(By.xpath("//li[text()='Enabled']")).click();
			sleep(4);

			fluentWait(By.xpath("//div[@id='saveRoleButton']/a")).click();
			sleep(4);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a")).click();

			sleep(8);

			System.out.println("pass");
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath(".//*[@id='textRoleName-inputEl']")).sendKeys(user + raaaa);

			sleep(8);

			fluentWait(By.xpath(".//*[@id='textRoleName-inputEl']")).sendKeys(Keys.ENTER);

			sleep(8);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//a[@id='editRoleLink']")).click();

			sleep(8);
			fluentWait(By.xpath(".//*[@id='roleStatus-triggerWrap']")).click();

			sleep(8);
			fluentWait(By.xpath("//li[text()='Disabled']")).click();

			sleep(8);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[@id='updateRoleButton']/a")).click();

			sleep(8);
			fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a")).click();
			
			
			ExtentTestManager.getTest().log(LogStatus.INFO,"Role Added Updated Successfully");


			// ................................................................................................................................//
			/*
			 * sleep(8);
			 * 
			 * fluentWait(By.xpath(".//*[@id='flip']/div/img")).click();
			 * sleep(8);
			 * fluentWait(By.xpath(".//*[@id='panel']/fieldset/div[1]/a[1]/img")
			 * ).click();
			 * 
			 * sleep(8);
			 * 
			 * System.out.println("pass");
			 */

		} catch (Exception e) {

			sleep(19);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();

			System.out.println("referesh................");

			ExtentTestManager.getTest().log(LogStatus.FAIL, "Sorry Server could not the locate the page");

		}
	}
}
