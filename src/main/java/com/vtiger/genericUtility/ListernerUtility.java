package com.vtiger.genericUtility;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.devtools.v119.cast.Cast;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListernerUtility extends BaseClass implements ITestListener {
	private ExtentTest test;
	
	@Override
	public void onStart(ITestContext context) {
		
		test=extReport.createTest(result.getName());
		ITestListener.super.onTestStart(result);

	}
	
	
	 @Override
	public void onTestFailure(ITestResult result) {
			 
			 test.log(Status.FAIL,result.getName()+"is failed");
			 TakesScreenshot ts=(TakesScreenshot) driver;
			 
			 String screenshot=ts.getScreenshotAs(OutputType.BASE64);
			 test.addScreenCaptureFromBase64String(screenshot);
		
			
				try {
					wUtil.ToTakeScreenshot(driver);
				} catch (IOException e) {
								e.printStackTrace();
				}
				
				}
			}
