package com.leadrocket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogoutPage {
	WebDriver driver;
	 
	public LogoutPage (WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(how=How.XPATH,using="//a[@id='logout']") WebElement logout;
	
	public void logout(){
		logout.click();
	}
}
