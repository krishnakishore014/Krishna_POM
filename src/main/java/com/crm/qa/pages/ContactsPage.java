package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	private WebElement contactslabel;
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	private WebElement contactsLink;
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	private WebElement newContactLink;
	@FindBy(xpath="//select[@class='select' and @name='title']")
	private WebElement title;
	@FindBy(xpath="//input[@id='first_name' and @name='first_name']")
	private WebElement firstName;
	@FindBy(xpath="//input[@id='surname' and @name='surname']")
	private WebElement lastName;
	@FindBy(xpath="//input[@class='button' and @value='Save']")
	private WebElement saveButton;
	public ContactsPage(){
		PageFactory.initElements(driver,this);
		
	}
    public boolean verifyContactsLabel(){
	
		return contactslabel.isDisplayed();
		}
    public void newContactClick(){
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		
	}
    
    public void newContactCreation(String titlevalue,String fName, String lName){
    	Select select = new Select(title);
    	select.selectByValue(titlevalue);
    	firstName.clear();
    	firstName.sendKeys(fName);
    	lastName.clear();
    	lastName.sendKeys(lName);
    	saveButton.click();
    	
    }
    
}
