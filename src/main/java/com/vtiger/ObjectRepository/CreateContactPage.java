package com.vtiger.ObjectRepository;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	
	@FindBy(name="lastname")
	private WebElement lastnameTextField;
	
	@FindBy(name="button")
	private WebElement saveButton;
	@FindBy(="")
	private WebElement lastNmaeTextField;
	public CreateContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	

}
