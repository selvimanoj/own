package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBaseclass;

public class SelectHotel extends TestBaseclass {
	
	 
	public void title() {
	
	title.isDisplayed();
	}
		@FindBy(xpath ="//td[@class='login_title']")
	WebElement title;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	WebElement radio;

	@FindBy(xpath = "//input[@class='reg_button'][1]")
	WebElement continu;

	public SelectHotel() {
		PageFactory.initElements(driver, this);

	}

	public void getradio() {
		
				radio.click();
				continu.click();
		
	}
	
	
}
