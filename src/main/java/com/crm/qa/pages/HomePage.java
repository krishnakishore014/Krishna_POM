package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'User: Krishna Kishore')]")
	private WebElement loggedUser;
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	private WebElement contactsLink;
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	private WebElement dealsLink;
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	private WebElement tasksLink;
		
	public HomePage(){
		PageFactory.initElements(driver,this );
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyLoggedUser(){
		return loggedUser.isDisplayed();
		 	}
	
	public ContactsPage contactsLinkClick(){
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage dealsLinkClick(){
		dealsLink.click();
		return new DealsPage();
	}
	
			
}
