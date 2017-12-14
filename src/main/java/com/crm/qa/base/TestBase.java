package com.crm.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	private static EventFiringWebDriver e_driver;
	private static WebEventListener eventListener;
	
	public TestBase(){
		
		try {
			File src = new File("C:/Krishna/FreeCRMTest/src/main/java/com/crm/qa"
					+ "/config/config.properties");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		}
			 
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e) {
				e.printStackTrace();
			}
			}
	public static void driverInitialization(){
		String BrowserName = prop.getProperty("browser");
		if(BrowserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Krishna\\Lib\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
			else if(BrowserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Krishna\\Lib\\geckodriver.exe");
			driver = new FirefoxDriver();
			}
		
		    e_driver = new EventFiringWebDriver(driver);
		    //Now create object of EnventListener Handle to register it with EventFiringWebDriver
		    eventListener = new WebEventListener();
		    e_driver.register(eventListener);
		    driver = e_driver;
			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
		
	}

