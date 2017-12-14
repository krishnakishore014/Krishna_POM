package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage login;
	HomePage home;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		driverInitialization();
		login = new LoginPage();
		
		}
	
	@Test(priority=1)
	public void verifyPageTitleTest(){
		String Title = login.getLoginTitle();
		Assert.assertEquals(Title, prop.getProperty("loginpagetitle"));
	}
		@Test(priority=2)
		public void verifylogoTest(){
			boolean flag = login.validateCRMLogo();
			Assert.assertTrue(flag);
		}
		@Test(priority=3)
		public void verifyLoginTest(){
			home = login.userLogin(prop.getProperty("uname"), prop.getProperty("pwd"));
			
		}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
