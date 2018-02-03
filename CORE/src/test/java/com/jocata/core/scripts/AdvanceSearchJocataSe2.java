package com.jocata.core.scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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






public class AdvanceSearchJocataSe2   extends  mainbaseLatest {


	
	//.................................................AdvanceSearch..............................................................//
	
	 @Test (priority=6)
	public void loginAdvance(){
			
		ExtentTestManager.startTest("  TaskBoard : Advanced Search "); 
			
	       /* driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("l3_user");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Star@1234");
			driver.findElement(By.xpath("//span[@id='loginButtonExt-btnIconEl']")).click();*/
			clickDashboardAdvance();
			}

	 public  void clickDashboardAdvance(){
		 
		 sleep(4);
		 
		 fluentWait(By.xpath("//span[text()='Case Files']")).click();
		 
		 sleep(4);
		 fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

			 
				sleep(10);
			
			
		fluentWait(By.xpath("//img[@class='x-tool-img x-tool-expand-bottom']")).click();

	//...........................................................Occupation.......................................................//
	sleep(10);

	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));


	driver.findElement(By.xpath("//input[@id='occupationsCombo-inputEl']")).click();

	WebElement elementall=  driver.findElement(By.cssSelector("span.x-combo-checker"));

		elementall.isSelected();
		elementall.click();


		    sleep(9);
		    
		    ExtentTestManager.getTest().log(LogStatus.PASS ," OCCUPATION ");    
		    
		    
		    
		
		    fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			

			 List<WebElement> jocata=driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));
				
				for (WebElement ele : jocata) {
					
					
			String text=ele.getText();
			
			ExtentTestManager.getTest().log(LogStatus.INFO, text);	

					
				}
			
			
				ExtentTestManager.getTest().log(LogStatus.INFO, "****************************************************************************************************");	
		
			
			fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
			

			fluentWait(By.xpath("//div[@class='resetButton']")).click();

			
			
			
			
	//............................................................................Nature of Business..................................//
			
			
			

			   WebElement elementToClick = driver.findElement(By.xpath("//input[@id='nobCombo-inputEl']"));
				// Scroll the browser to the element's Y position

				((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+elementToClick.getLocation().y+")");
				// Click the element
				elementToClick.click();
				
	/*
				
				
				JavascriptExecutor jse = (JavascriptExecutor)driver;

				jse.executeScript("scroll(0, 250)"); // if the element is on bottom.
	*/
				
				
				
				fluentWait(By.cssSelector(".x-boundlist:not([style*='display: none']) div span ")).click();
				
				//driver.findElement(By.xpath("//div[@id='boundlist-1380']//span")).click();
				
				/*WebElement elementnature=driver.findElement(By.xpath("//div[@id='boundlist-1015']//span"));
				
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementnature);*/

				
				
				
				
				//driver.findElement(By.xpath("//span[@class='x-combo-checker']//following::span[9]")).click();
				
			  //driver.findElement(By.xpath("//div[@id='ext-gen1794']//span")).click();
			  
			 // driver.findElement(By.xpath("//div[@style='right: auto; left: 323px; top: 225px; z-index: 19001; height: 292px; width: 220px;']//span")).click();
			  
			//  driver.findElement(By.xpath("//body[starts-with(@id,'ext-gen')]/div[5]//span")).click();
			  
				
			  
			  
			  
			  ExtentTestManager.getTest().log(LogStatus.PASS ," NATURE OF BUSINESS "); 
			  

			  fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();


			  sleep(8);

				 List<WebElement> jocatanature=driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));
					
					for (WebElement elenature : jocatanature) {
						
						sleep(1);
				String textnature=elenature.getText();
				
				ExtentTestManager.getTest().log(LogStatus.INFO, textnature);	

						
					}
				
					
					
					ExtentTestManager.getTest().log(LogStatus.INFO, "****************************************************************************************************");	
			
					
				
					fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
				

				fluentWait(By.xpath("//div[@class='resetButton']")).click();

	//...................................Amount Involved.........................................................................//
				
				
				

				fluentWait(By.xpath(".//*[@id='amountFrom']")).sendKeys("0");
				fluentWait(By.xpath(".//*[@id='amountTo']")).sendKeys("3,80,000");

				
				
				


				fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();


				
				
				ExtentTestManager.getTest().log(LogStatus.PASS ," AMOUNT INVOLVED ");

				
				sleep(12);
				
				/*
	            String Amount=driver.findElement(By.xpath("//div[text()='No Matching Records']")).getText();
				
				
	            ExtentTestManager.getTest().log(LogStatus.INFO, Amount);*/
				
				
				
	            ExtentTestManager.getTest().log(LogStatus.INFO, "****************************************************************************************************");	

				
	            fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
				

				fluentWait(By.xpath("//div[@class='resetButton']")).click();

	//........................................Product Type..............................................................//
				
				
				

				fluentWait(By.xpath("//input[@id='productTypeCombo-inputEl']")).click();

				sleep(13);

				JavascriptExecutor jsproduct = (JavascriptExecutor)driver;
				
				
				
		//WebElement elementproduct=	driver.findElement(By.xpath("//div[@id='boundlist-1382']//span"));
		WebElement elementproduct=	driver.findElement(By.cssSelector(".x-boundlist:not([style*='display: none']) div span "));
				
		jsproduct.executeScript("arguments[0].click();", elementproduct);  

				
				sleep(9);
				
				ExtentTestManager.getTest().log(LogStatus.PASS ," PRODUCT TYPE  ");	

				fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();


				


				

	           /* String Product=driver.findElement(By.xpath("//div[text()='No Matching Records']")).getText();
				
				
	            ExtentTestManager.getTest().log(LogStatus.INFO, Product);*/
				
			
	            ExtentTestManager.getTest().log(LogStatus.INFO, "****************************************************************************************************");	

	            sleep(8);
				
	            fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
				

	            sleep(8);
				fluentWait(By.xpath("//div[@class='resetButton']")).click();


				
				
				
	//...................................................UCIF...................................................................//



				

				sleep(8);

	fluentWait(By.xpath("//img[@id='searchUCICNum']")).click();

	sleep(8);

	fluentWait(By.xpath("//div[@id='ucicSearchWindow_header-innerCt']//img")).click();

	 

	 /*fluentWait(By.xpath("//div[starts-with(@id,'pagingtoolbar-')]//a[6]")).click();


	

	ExtentTestManager.getTest().log(LogStatus.PASS ," UCIC  ");	


	fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();


	
   sleep(10);

	String UCIC=driver.findElement(By.xpath("//div[text()='No Matching Records']")).getText();


	ExtentTestManager.getTest().log(LogStatus.INFO, UCIC);



	ExtentTestManager.getTest().log(LogStatus.INFO, "****************************************************************************************************");	



	fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
	

	fluentWait(By.xpath("//div[@class='resetButton']")).click();
*/
	sleep(8);
	//...............................Risk Rating...........................................................................//


	WebElement optionrisk=driver.findElement(By.xpath("//input[@id='riskRatingCombo-inputEl']"));

	Actions action=new Actions(driver);


	action.moveToElement(optionrisk).click().sendKeys(Keys.DOWN).perform();


	fluentWait(By.cssSelector(".x-boundlist:not([style*='display: none']) div span ")).click();


	ExtentTestManager.getTest().log(LogStatus.PASS ," RISK RATING  ");	


	fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();


	sleep(9);




	List<WebElement> jocataRisk=driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));
		
		for (WebElement eleRisk : jocataRisk) {
			
			
	String textRisk=eleRisk.getText();

	ExtentTestManager.getTest().log(LogStatus.INFO, textRisk);	

			
		}

		ExtentTestManager.getTest().log(LogStatus.INFO, "****************************************************************************************************");	


		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
	sleep(9);

	fluentWait(By.xpath("//div[@class='resetButton']")).click();





	//...............................Risk Rating...........................................................................//
	/*
	sleep(9);


	WebElement optionrisk=driver.findElement(By.xpath("//input[@id='riskRatingCombo-inputEl']"));

	Actions action=new Actions(driver);
	sleep(10);

	action.moveToElement(optionrisk).click().sendKeys(Keys.DOWN).perform();
	By byloc=By.xpath("//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box']//span");
	isElementVisible(byloc, 20);
	WebElement eleemntrisktrating=driver.findElement(By.xpath("//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box']//span"));
	//jsriskrating.executeScript("arguments[0].click();", eleemntrisktrating);

	eleemntrisktrating.click();

	sleep(10);
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box']//span")));
	//JavascriptExecutor jsriskrating = (JavascriptExecutor)driver; 
	WebElement eleemntrisktrating=driver.findElement(By.xpath("//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box']//span"));
	//jsriskrating.executeScript("arguments[0].click();", eleemntrisktrating);

	eleemntrisktrating.click();


	Actions actionrisk=new Actions(driver);

	WebElement elementriskrating= driver.findElement(By.xpath("//html/body/div[5]/div[1]/span"));

	actionrisk.moveToElement(elementriskrating).click().build().perform();



	sleep(15);

	WebDriverWait wait = new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div[5]/div[1]/span")));



	JavascriptExecutor jsrisk = (JavascriptExecutor)driver; 

	WebElement elementrisk=driver.findElement(By.xpath("//html/body/div[5]/div[1]/span"));

	jsrisk.executeScript("arguments[0].click();", elementrisk);  



	//driver.findElement(By.xpath("//div[@id='ext-gen1644']//span")).click();
	//sleep(9);


	driver.findElement(By.xpath("//div[@id='buttonSearch']/a")).click();


	sleep(9);


	driver.findElement(By.xpath("//div[@id='advSearch_header']//img")).click();
	sleep(9);

	driver.findElement(By.xpath("//div[@class='resetButton']")).click();*/

	//....................................................Customer Name ..........................................................///
	sleep(8);

	WebElement elementToClicksecond = driver.findElement(By.xpath("//input[@id='searchCusName']"));
		// Scroll the browser to the element's Y position

		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+elementToClicksecond.getLocation().y+")");
		// Click the element
		elementToClicksecond.sendKeys("rRLZvirv-G-p");
		sleep(9);

		
		//fluentWait(By.xpath("//div[@id='boundlist-1455']//span")).click();	
	


	ExtentTestManager.getTest().log(LogStatus.PASS ," Customer Name ");	


	fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();


		
	sleep(8);
		

	List<WebElement> RuleName=driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));
		
		for (WebElement eleRuleName : RuleName) {
			
			
	String textrulename=eleRuleName.getText();

	ExtentTestManager.getTest().log(LogStatus.INFO, textrulename);	

			
		}
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "****************************************************************************************************");	

		sleep(8);
		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
		
		sleep(8);

		fluentWait(By.xpath("//div[@class='resetButton']")).click();


	//....................................................Customer ID......................................................//
		sleep(8);
		

		fluentWait(By.xpath("//img[@id='searchCustomerId']")).click();

		

		WebElement Previous= driver.findElement(By.xpath("//div[@id='customergrid']//div//span"));

		Previous.isSelected();

		Previous.click();
		

		
		ExtentTestManager.getTest().log(LogStatus.PASS ," Customer ID  ");	


		fluentWait(By.xpath("//a[6]/span/span/span[2]")).click();
		
		driver.findElement(By.xpath("//div[@id='buttonSearch']/a")).click();


		

		sleep(8);

	List<WebElement> Previouslevel=driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));
		
		for (WebElement eleRuleNameprevious : Previouslevel) {
			
			
	String textprecious=eleRuleNameprevious.getText();

	ExtentTestManager.getTest().log(LogStatus.INFO, textprecious);	

			
		}
		
		
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "****************************************************************************************************");	


		sleep(8);
		
		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
		

		sleep(8);
		fluentWait(By.xpath("//div[@class='resetButton']")).click();

		
		sleep(9);
		
		//............................................Customer Type...........................................................//
		
		
		fluentWait(By.xpath(".//*[@id='customerTypeCombo-triggerWrap']")).click();
		
		driver.findElement(By.cssSelector(".x-boundlist:not([style*='display: none']) div span ")).click();
		
		
          driver.findElement(By.xpath("//div[@id='buttonSearch']/a")).click();


		

          sleep(8);

	List<WebElement> PreviType=driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));
		
		for (WebElement eleRulePreviType : PreviType) {
			
			
	String textpTypes=eleRulePreviType.getText();

	ExtentTestManager.getTest().log(LogStatus.INFO, textpTypes);	

			
		}
		
		
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "****************************************************************************************************");	


		sleep(8);
		
		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
		

		sleep(8);
		fluentWait(By.xpath("//div[@class='resetButton']")).click();

		
		sleep(9);
		
		
		
		
		
		
		
		//...................................................Account No......................................................//
		
		fluentWait(By.xpath("//img[@id='searchAccountNum']")).click();
		

		fluentWait(By.xpath("//div[@id='accountgrid-body']//td/div")).click();

		

		fluentWait(By.xpath("//div[starts-with(@id,'pagingtoolbar-')]//a[6]")).click();

		

		
		ExtentTestManager.getTest().log(LogStatus.PASS ," ACCOUNT NO  ");
		
		
		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();


		sleep(12);
		
		

		List<WebElement> PreviousAccoun=driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));
			
			for (WebElement eleRuleNameaccoun : PreviousAccoun) {
				
				
		String textpreciousacc=eleRuleNameaccoun.getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, textpreciousacc);	

				
			}
		
		
		
		/*String AccountNO=driver.findElement(By.xpath("//div[text()='No Matching Records']")).getText();


		ExtentTestManager.getTest().log(LogStatus.INFO, AccountNO);*/
		
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "****************************************************************************************************");	

		
		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
		
		fluentWait(By.xpath("//div[@class='resetButton']")).click();


		
		//...................................................Notes Containing..............................................//
		
		sleep(8);


		fluentWait(By.xpath("//input[@id='notesCntng']")).sendKeys("100");
		sleep(8);

		
		ExtentTestManager.getTest().log(LogStatus.PASS ," NOTES CONTAINING  ");
		
		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();


		sleep(8);
		
		
		String NotesContaining=driver.findElement(By.xpath("//div[text()='No Matching Records']")).getText();


		ExtentTestManager.getTest().log(LogStatus.INFO, NotesContaining);

		ExtentTestManager.getTest().log(LogStatus.INFO, "****************************************************************************************************");	

		
		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
		sleep(8);
		fluentWait(By.xpath("//div[@class='resetButton']")).click();

	//...................................Tag...............................................................................//
		
		sleep(8);


		fluentWait(By.xpath("//input[@id='tag']")).sendKeys("raghu");

		sleep(8);
		
		ExtentTestManager.getTest().log(LogStatus.PASS ," TAG  ");
		
		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();


		
		sleep(8);
		
		
		String NotesTag=driver.findElement(By.xpath("//div[text()='No Matching Records']")).getText();


		ExtentTestManager.getTest().log(LogStatus.INFO, NotesTag);
		
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "****************************************************************************************************");	

		
		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
		

		fluentWait(By.xpath("//div[@class='resetButton']")).click();


		//...................................PAN ID.........................................................................//
		
		
		sleep(8);

		fluentWait(By.xpath(".//*[@id='panId']")).sendKeys("qqlah3052u");

		
		
		
		ExtentTestManager.getTest().log(LogStatus.PASS ," PAN ID  ");
		
		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();


		
		sleep(8);
		
		/*String PAN=driver.findElement(By.xpath("//div[text()='No Matching Records']")).getText();


		ExtentTestManager.getTest().log(LogStatus.INFO, PAN);*/
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "****************************************************************************************************");	

		
		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
		
		fluentWait(By.xpath("//div[@class='resetButton']")).click();

	//.....................................................Account No.......................................................//
		
		sleep(8);
	fluentWait(By.xpath("//input[@id='searchAccountNumber']")).sendKeys("01:914010032374787");
	
	
	
	ExtentTestManager.getTest().log(LogStatus.PASS ," Account No  ");
	
	fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();


	sleep(8);
	
	

	List<WebElement> Account=driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));
		
		for (WebElement eleAccount : Account) {
			
			
	String teeleAccount=eleAccount.getText();

	ExtentTestManager.getTest().log(LogStatus.INFO, teeleAccount);	

			
		}
	
	
	
	/*String AccountNO=driver.findElement(By.xpath("//div[text()='No Matching Records']")).getText();


	ExtentTestManager.getTest().log(LogStatus.INFO, AccountNO);*/
	
	
	ExtentTestManager.getTest().log(LogStatus.INFO, "****************************************************************************************************");	

	
	fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
	
	fluentWait(By.xpath("//div[@class='resetButton']")).click();

	
	
		
		
		
		/*sleep(8);

		fluentWait(By.xpath(".//*[@id='sourceSystemCombo-inputEl']")).click();
		sleep(8);

		WebElement  Source=driver.findElement(By.xpath("//div[@id='boundlist-1484']//span"));
		 
		Source.isSelected();

		Source.click();
		sleep(8);

		
		WebElement sourcesystem=driver.findElement(By.xpath("//label[text()='Source System']"));

		sourcesystem.click();

		sleep(8);
		
		ExtentTestManager.getTest().log(LogStatus.PASS ," SOURCE SYSTEM  ");
		
		
		
		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();


		
		sleep(12);
		
		
	List<WebElement> SourceSystem=driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));
		
		for (WebElement eleSourceSystem : SourceSystem) {
			
			
	String textSourceSystem=eleSourceSystem.getText();

	ExtentTestManager.getTest().log(LogStatus.INFO, textSourceSystem);	

			
		}
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "****************************************************************************************************");	


		fluentWait(By.xpath("//div[@id='advSearch_header']//img")).click();
		sleep(8);
		
		fluentWait(By.xpath("//div[@class='resetButton']")).click();*/

			/*}catch(org.openqa.selenium.StaleElementReferenceException e){
				
				System.out.println("stale element");
				
				ExtentTestManager.getTest().log(LogStatus.INFO, "Trying to recover from a stale element :" + e.getMessage());	
			}
			 

		catch(Exception e){
			
			sleep(19);
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
			
					
				driver.navigate().refresh();
				
				System.out.println("referesh................");
		}*/
			
}
}