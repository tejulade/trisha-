package com.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

@FindBy(name="user_name")
private WebElement usernameTextField;

@FindBy(name="user_password")
private WebElement  passwordTextField;

@FindBy(id="submitButton")
private WebElement submitButton;

public LoginPage1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getUsernameTextField() {
	return usernameTextField;
}

public WebElement getPasswordTextField() {
	return passwordTextField;
}

public WebElement getSubmitButton() {
	return submitButton;
}




}


