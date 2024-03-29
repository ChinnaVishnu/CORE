package com.jocata.core.basescripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Utills {

	public static WebDriver driver;
	public static FirefoxProfile firefoxProfile;

	/**
	 * This method initialize browser object
	 * 
	 * @param browser
	 * @return browser driver
	 */
	public static WebDriver selectBrowser(String browser) {

		if (browser.equals("firefox") || browser.equals("FIREFOX")) {

			/*
			 * DesiredCapabilities dc = new DesiredCapabilities();
			 * dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
			 * UnexpectedAlertBehaviour.IGNORE); driver = new FirefoxDriver(dc);
			 */

			firefoxProfile = new FirefoxProfile();
			firefoxProfile.setAcceptUntrustedCertificates(true);
			firefoxProfile.setPreference("app.update.enabled", false);
			firefoxProfile.setPreference("browser.download.folderList", 2);
			firefoxProfile.setPreference("browser.download.manager.showWhenStarting", false);
			firefoxProfile.setPreference("browser.download.dir", getDownloadLocation());
			firefoxProfile.setPreference("browser.helperApps.neverAsk.openFile",
					"application/pdf, application/x-pdf, application/acrobat, applications/vnd.pdf, text/pdf, text/x-pdf, application/octet-stream, application/vnd.openxmlformats-officedocument.wordprocessingml.document, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/x-rar-compressed, application/zip");
			firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk",
					"application/pdf, application/x-pdf, application/acrobat, applications/vnd.pdf, text/pdf, text/x-pdf, application/octet-stream, application/vnd.openxmlformats-officedocument.wordprocessingml.document, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/x-rar-compressed, application/zip");
			firefoxProfile.setPreference("browser.helperApps.alwaysAsk.force", false);
			firefoxProfile.setPreference("browser.download.manager.showAlertOnComplete", false);

			driver = new FirefoxDriver(firefoxProfile);

			//driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		} else if (browser.equals("chrome") || browser.equals("CHROME")) {
			System.out.println("chrome browser");
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		} else if (browser.equals("ie") || browser.equals("IE")) {
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
		}
		return null;
	}

	/**
	 *
	 * @param timeInsec
	 */
	public void impliciteWait(int timeInsec) {
		Reporter.log("waiting for page to load...");
		try {
			driver.manage().timeouts().implicitlyWait(timeInsec, TimeUnit.SECONDS);
			Reporter.log("Page is loaded");
		} catch (Throwable error) {
			Reporter.log("Timeout for Page Load Request to complete after " + timeInsec + " seconds");
			Assert.assertTrue(false, "Timeout for page load request after " + timeInsec + " second");
		}
	}

	/**
	 *
	 * @param element
	 * @param dropDownValue
	 */
	public void seleteDropDownValue(WebElement element, String dropDownValue) {
		Select select = new Select(element);
		Reporter.log("selecting " + dropDownValue + " value in dropdown");
		select.selectByVisibleText(dropDownValue);
	}

	public void driverwait(int timeToWaitInSec) throws InterruptedException {
		Reporter.log("waiting for " + timeToWaitInSec + " seconds...");
		Thread.sleep(timeToWaitInSec * 1000);
	}

	public static void expliciteWait(WebElement element, int timeToWaitInSec) {
		WebDriverWait wait = new WebDriverWait(driver, timeToWaitInSec);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static String getDownloadLocation() {
		// String DownloadPath=
		// System.getProperty("user.dir")+fileSeperator+"Downloaded Files";
		String DownloadPath = "D:\\AUTOMATION REQUIRED DOCS\\MisReportsDownloads";
		return DownloadPath;
	}

}
