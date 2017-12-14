package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

import junit.framework.Assert;

public class HomePageTest extends TestBase{
	
	LoginPage login;
	HomePage home;
	TestUtil util;
	ContactsPage contacts;
	
	
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception{
		driverInitialization();
		Thread.sleep(1000);
		login = new LoginPage();
		util = new TestUtil();
		contacts = new ContactsPage();
		home = login.userLogin(prop.getProperty("uname"),prop.getProperty("pwd"));
		}
		
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = home.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, prop.getProperty("HomePageTitle"));
		}
	@Test(priority=2)
	public void verifyLoggeduserTest(){
		util.switchToFrame(prop.getProperty("HomePageFname"));
		boolean flag = home.verifyLoggedUser();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void verifyContactsLinkClickTest(){
		util.switchToFrame(prop.getProperty("HomePageFname"));	
		contacts = home.contactsLinkClick();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

	

}
