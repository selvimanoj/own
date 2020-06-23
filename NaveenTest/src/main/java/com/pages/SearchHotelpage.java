package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBaseclass;

public class SearchHotelpage extends TestBaseclass {

	@FindBy(name = "location")
	WebElement location;

	@FindBy(name = "room_nos")
	WebElement room_nos;

	@FindBy(name = "datepick_in")
	WebElement checkIn;

	@FindBy(name = "datepick_out")
	WebElement datepick_out;

	@FindBy(name = "adult_room")
	WebElement adult_room;

	@FindBy(name = "Submit")
	WebElement Submit;

	public SearchHotelpage() {
		PageFactory.initElements(driver, this);

	}

	public void getLocat() {
		Select sc = new Select(location);
		sc.selectByIndex(3);
	}
	
	public void getRoom() {
		Select sc = new Select(room_nos);
		sc.selectByIndex(3);
	}
	
	public void getdat(String in, String out) {
		checkIn.sendKeys(in);
		datepick_out.sendKeys(out);
	
	}
	public void adult() {
		Select sc = new Select(room_nos);
		sc.selectByVisibleText("2 - Two");

	}
	public void getSubmi() {
		Submit.click();
	}
}
