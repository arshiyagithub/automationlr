package com.leadrocket.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.leadrocket.pages.LoginPage;
import Utility.BrowserFactory;

//check valid login user
public class VerifyLogin {
	@Test
	public void checkValidUser()
	{
		WebDriver driver=BrowserFactory.startBrowser("firebox", "https://www.sgqaqa.com/account/login.php");
		LoginPage login_page =PageFactory.initElements(driver, LoginPage.class);
		login_page.login_leadrocket("qa.qa2@sgqastg.com", "genius123");
	}

}
