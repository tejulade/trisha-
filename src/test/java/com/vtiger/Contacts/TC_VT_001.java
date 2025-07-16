package com.vtiger.Contacts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.util.Assert;

import Com.qspider.ObjectRepository.HomePage;
import Com.qspiders.genericUtility.BaseClass;
import Com.qspiders.genericUtility.ListernerUtility;

@Listerner(ListernerUtility.class)


public class TC_VT_001 extends BaseClass {
	@Test
	
	
	public void clickOnContacts() {
		
		
		hp=new HomePage(driver);
		
		hp.getContactsLink().click();
		
		
		String actTitle = driver.getTitle();
		
		String expTitle=eUtil.getStringDataFromExcel("Contacts",1,0);
		
		Assert.assertEquals(actTitle,expTitle,"Contacts page is not displayed");
		
		test.log(Status.PASS,"Contacts page is displayed");
	}
		
		}


