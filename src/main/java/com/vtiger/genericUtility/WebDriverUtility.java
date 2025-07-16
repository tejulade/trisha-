package com.vtiger.genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility { 
	
	private String frameFile;
	private String[] allWindowIds;
		public void mouseHover(WebDriver driver,WebElement element) {
		Actions act=new  Actions(driver);
		
		act.moveToElement(element).perform();
			}
		public void doubleClick(WebDriver driver,WebElement element) {
		Actions act=new  Actions(driver);
		
		act.doubleClick(element).perform();
		
		}
	public void dragAndDrop(WebDriver driver,WebElement element) {
		Actions act=new  Actions(driver);
		act.dragAndDrop(element, element).perform();
	}
	
	public void cllickAndHold(WebDriver driver,WebElement element) {
		Actions act=new  Actions(driver);
		act.clickAndHold(element).perform();
		}

	public void selectByINdex(WebElement DropdownFile,int index){
		Select sel=new Select(DropdownFile);
		
		sel.selectByIndex(index);
		
	}
	public void selectByValue(WebElement DropdownFile,String visibleText) {
		Select sel=new Select(DropdownFile);
		sel.selectByValue(visibleText);
		
	}
	public void selectByVisible(WebElement DropdownFile,String visibleText) {
		Select sel=new Select(DropdownFile);
		sel.selectByVisibleText(visibleText);
	}
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
		
	}
	public void switchToFrame(WebDriver driver,String nameorId) {
		driver.switchTo().frame(nameorId);
		}
	public void switchToFrame(WebDriver driver,WebElement frameEle) {
		driver.switchTo().frame(frameFile);
	}
	
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	
	}
	public void switchToAlertAndAccept(WebDriver driver) {
		
		driver.switchTo().alert().accept();
		
	}
	public void switchToAlertAndCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
		
	}
		public Timeouts ImplicitelyWait(WebDriver driver) {
			
			
			return driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		
		}
		public  WebDriverWait explicitWait(WebDriver  driver) {
			
			WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(20));
			return wait;
		}
		
		public void switchToWindow(WebDriver driver,String expUrl) {
			
			Set<String> allWindows= driver.getWindowHandles();
			for(String id:allWindowIds) {
				
				driver.switchTo().window(id);
				String actUrl=driver.getCurrentUrl();
				
				if(actUrl.contains(expUrl)) {
					break;
					
				}
				}
			
			}
			public void ToTakeScreenshot(WebDriver driver) throws IOException {
				JavaUtility Jutil=new JavaUtility();
			
				
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			
			 File temp = ts.getScreenshotAs(OutputType.FILE);
			
			   File dest = new File("./Screenshots/"+Jutil.getSystemTime()+".png");
			  
			 FileHandler.copy(temp, dest);

			
			
		}
		}
		
		
		
		
	
		
		
	
		
		
	
		
		
		
		



