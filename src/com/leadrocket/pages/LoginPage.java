package com.leadrocket.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//This class has locators and methods of login page

public class LoginPage {
	
	WebDriver driver;
 
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}

 @FindBy(id="login") 
 @CacheLookup
 WebElement email;
@FindBy(how=How.ID,using="password") WebElement password;
@FindBy(how=How.XPATH,using=".//*[@id='login_form']/button") WebElement login;
//@FindBy(how=How.LINK_TEXT,using="")WebElement LostYourPassword;

public void login_leadrocket(String uid, String pwd)
{
	email.sendKeys(uid);
	password.sendKeys(pwd);
	login.click();
	
}
}
