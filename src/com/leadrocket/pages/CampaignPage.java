package com.leadrocket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//This class has locators and methods of Campaign Page
public class CampaignPage {
	WebDriver driver;
	 
	public CampaignPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-block btn-primary' and @type='button']") WebElement addNewCampaignBtn;
	@FindBy(how=How.XPATH,using="//a[@class='btn edit_campaign' and @data-campaign='edit']") WebElement editCampaignBtn;
	@FindBy(how=How.XPATH,using="//a[@class='btn edit_campaign' and @data-action='delete']") WebElement deleteCampaignBtn;
	@FindBy(how=How.XPATH,using="//a[@class='btn dropdown-toggle' and @data-toggle='dropdown']") WebElement addItemsBtn;
	@FindBy(how=How.XPATH,using="//input[@type='text' and @placeholder='SearchCamps']") WebElement searchCamps;
	@FindBy(how=How.XPATH,using="//a[@href='https://www.sgqaqa.com/marketing/campaigns.php']") WebElement campaignLnk;
	@FindBy(how=How.XPATH,using="//input[@id='campaign-name']")WebElement campaignName;
	@FindBy(how=How.XPATH,using="//input[@id='campaign-ending-date']") WebElement campaignEndDate;
	@FindBy(how=How.XPATH,using="//textarea[@id='campaign-description']") WebElement campaignDescription;
	@FindBy(how=How.XPATH,using="//button[@id='create-campaign-btn']") WebElement createCampaignBtn;
		
	public void navigateTocampaignPage(){
		campaignLnk.click();
		
	}
	public void createNewCampaign(String campgnName){
		addNewCampaignBtn.click();
		campaignName.sendKeys("campgnName");
		createCampaignBtn.click();
		
	}
}
