package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBaseclass;

public class LoginPage extends TestBaseclass {

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "login")
	WebElement login;

	@FindBy(xpath = "//img[@class='logo']")
	WebElement logo;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean getlogo() {
		return logo.isDisplayed();

	}
	
	public SearchHotelpage getUser(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		return new SearchHotelpage();
		
		
	}

}
