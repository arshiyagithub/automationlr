package com.leadrocket.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.leadrocket.pages.CampaignPage;
import com.leadrocket.pages.LoginPage;
import com.leadrocket.pages.LogoutPage;

import Utility.BrowserFactory;

public class CampaignTest {

	@BeforeClass()
	public void configBeforecls() {
		@SuppressWarnings("unused")
		WebDriver driver = BrowserFactory.startBrowser("firebox", "https://www.sgqaqa.com/account/login.php");
	}

	@BeforeMethod
	public void configBeforeMtd(WebDriver driver) {
		// step 1 : login to APP
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		login_page.login_leadrocket("qa.qa2@sgqastg.com", "genius123");
		// step 2: Navigate to Marketing and goto Campaign link
		CampaignPage campgn_page = PageFactory.initElements(driver, CampaignPage.class);
		campgn_page.navigateTocampaignPage();
	}

	@Test
	public void verifyCampaign(WebDriver driver) {
		CampaignPage campgn_page = PageFactory.initElements(driver, CampaignPage.class);
		// campgn_page.navigateTocampaignPage();
		// step 3: Create new campaign
		campgn_page.createNewCampaign("Campaign1");
	}

	// step 4: logout from app
	@AfterMethod
	public void configAfterMtd(WebDriver driver) {
		LogoutPage logout_page = PageFactory.initElements(driver, LogoutPage.class);
		logout_page.logout();
	}

	@AfterClass()
	public void configAftercls(WebDriver driver) {
		driver.quit();
	}

}
