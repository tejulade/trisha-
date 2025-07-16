package com.vtiger.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(linkText="Contacts")
	private WebElement ContactLink;
	
	@FindBy(xpath ="//img[contains@src,'user')]")
	 private WebElement profileIcon;
	 
	 @FindBy(linkText="Sign Out")
	private WebElement signOUtLink;

	public WebElement getContactLink() {
		return ContactLink;
	}

	public WebElement getProfileIcon() {
		return profileIcon;
	}

	public WebElement getSignOutLink() {
		return signOUtLink;
	}
	 

}
