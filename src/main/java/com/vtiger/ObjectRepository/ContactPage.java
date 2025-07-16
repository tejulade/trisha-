package com.vtiger.ObjectRepository;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	@FindBy(xpath ="//img[@title=\"Create Contact...\"]")
	private  WebElement createIcon;
	
	
	public ContactPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}


	public WebElement getCreateIcon() {
		return createIcon;
	}


	}


