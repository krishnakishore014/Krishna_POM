package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//PageFactory
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//input[@class='btn btn-small' and @value='Login']")
	private WebElement login;
	@FindBy(xpath="//img[@class='img-responsive' and @src='https://d19rqa8v8yb76c.cloudfront.net/img/freecrm.jpg']")
	private WebElement crmLogo;
	// Initializing the page objects
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	//Actions
	public String getLoginTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMLogo(){
		return crmLogo.isDisplayed();
	}
	
	public HomePage userLogin(String un, String pwd){
		username.clear();
		username.sendKeys(un);
		password.clear();
		password.sendKeys(pwd);
		login.click();
		return new HomePage();
	}

}
