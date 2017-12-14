package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

import junit.framework.Assert;

public class ContactsPageTest extends TestBase{
	LoginPage login;
	HomePage home;
	TestUtil util;
	ContactsPage contacts;
	String sheetName = "contacts";
	
	public ContactsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		util = new TestUtil();
		driverInitialization();
		login = new LoginPage();
		contacts = new ContactsPage();
		home = login.userLogin(prop.getProperty("uname"),prop.getProperty("pwd"));
		util.switchToFrame(prop.getProperty("HomePageFname"));
		contacts = home.contactsLinkClick();
	}
	
	@Test(priority=1)
	public void verifyContactsLabelTest(){
		boolean flag = contacts.verifyContactsLabel();
		Assert.assertTrue(flag);
	}
	
	@DataProvider
	public Object[][] getNewContactTestData(){
		Object data[][] = TestUtil.getTestData(sheetName); 
		return data;
	}
	
	@Test(priority=2, dataProvider = "getNewContactTestData")
	public void verifyNewContactCreation(String titlevalue,String fName,String lName){
		contacts.newContactClick();
		contacts.newContactCreation(titlevalue,fName,lName);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
