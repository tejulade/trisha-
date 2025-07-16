package com.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
	@FindBy(name="accountname")
	private WebElement accountnameTextField;
	
	@FindBy(name="button")
	private WebElement saveButton;
	
	public CreateOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAccountnameTextField() {
		return accountnameTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

		
	

}


