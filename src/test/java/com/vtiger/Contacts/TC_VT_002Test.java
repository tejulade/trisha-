package com.vtiger.Contacts;

import org.testng.annotations.Test;

import com.vtiger.ObjectRepository.CreateContactPage;

import Com.qspider.ObjectRepository.HomePage;
import Com.qspiders.genericUtility.BaseClass;

@Listerener(ListerenerUtility.class)

public class TC_VT_002Test  extends BaseClass{
	@Test
	public void CreatContact() {
		
		hp=new HomePage(driver);
		
		hp.getBooksLink().click();
			
		ContactsPage cp=new ContactsPage(driver);
		cp.getCreateIcon().click();
		
		CreateContactPage ccp=new  CreateContactPage(driver);
		
		ccp.getLastnameTextField().sendKeys(eUtil.getStringDataFromExcel("Contacts",1,1));
		
		ccp.getSaveButton().click();
		
		
		
		
		
		
		
	}
	
	
	
	

}
