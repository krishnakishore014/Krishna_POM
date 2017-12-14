package com.crm.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.crm.qa.base.TestBase;

public class WebEventListener extends TestBase implements WebDriverEventListener{

	
		 
		public void afterChangeValueOf(WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
	 
			System.out.println("inside method afterChangeValueOf on " + element.toString());
		}
	 
		public void afterClickOn(WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			System.out.println("inside method afterClickOn on " + element.toString());
		}
	 
		public void afterFindBy(By by, WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			System.out.println("Find happened on " + element.toString() 
					+ " Using method " + by.toString());
		}
	 
		public void afterNavigateBack(WebDriver driver) {
			// TODO Auto-generated method stub
	 
			System.out.println("Inside the after navigateback to " + driver.getCurrentUrl());
		}
	 
		public void afterNavigateForward(WebDriver driver) {
			// TODO Auto-generated method stub
			System.out.println("Inside the afterNavigateForward to " + driver.getCurrentUrl());
		}
	 
		public void afterNavigateTo(String url, WebDriver driver) {
			// TODO Auto-generated method stub
			System.out.println("Inside the afterNavigateTo to " + url);
		}
	 
		public void afterScript(String script, WebDriver driver) {
			// TODO Auto-generated method stub
			System.out.println("Inside the afterScript to, Script is " + script);
		}
	 
		public void beforeChangeValueOf(WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
	 
			System.out.println("Inside the beforeChangeValueOf method");
		}
	 
		public void beforeClickOn(WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			System.out.println("About to click on the " + element.toString());
	 
		}
	 
		public void beforeFindBy(By by, WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			System.out.println("Just before finding element " + element.toString());
	 
		}
	 
		public void beforeNavigateBack(WebDriver driver) {
			// TODO Auto-generated method stub
			System.out.println("Just before beforeNavigateBack " + driver.getCurrentUrl());
	 
		}
	 
		public void beforeNavigateForward(WebDriver driver) {
			// TODO Auto-generated method stub
			System.out.println("Just before beforeNavigateForward " + driver.getCurrentUrl());
	 
		}
	 
		public void beforeNavigateTo(String url, WebDriver driver) {
			// TODO Auto-generated method stub
			System.out.println("Just before beforeNavigateTo " + url);
		}
	 
		public void beforeScript(String string, WebDriver driver) {
			// TODO Auto-generated method stub
			System.out.println("Just before beforeScript " + string);
		}
	 
		public void onException(Throwable error, WebDriver driver) {
			// TODO Auto-generated method stub
			System.out.println("Exception occured at " + error.getMessage());
	 
		}
		
		// non overridden methods 	of Weblistener Class

		public void beforeAlertAccept(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterAlertAccept(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterAlertDismiss(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void beforeAlertDismiss(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void beforeNavigateRefresh(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterNavigateRefresh(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			// TODO Auto-generated method stub
			
		}

		public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			// TODO Auto-generated method stub
			
		}
	 
	}

