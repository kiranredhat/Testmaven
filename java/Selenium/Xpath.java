 package Selenium;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Xpath {
@FindBy (xpath="//input[@id='txtUsername' and @id='txtUsername']") WebElement elmUsername1;
@FindBy (xpath="//input[@id='txtUsername' or @id='txtUsername']") WebElement elmUsername2;
@FindBy (xpath="//input[contains(@id,'Username')]") WebElement elmUsername3;
@FindBy (xpath="//input[starts-with(@id,'txtUser')]") WebElement elmUsername4;
@FindBy (xpath="//input[ends-with(@id,'txtUser')]") WebElement elmUsername5;
@FindBy (xpath="//input[@id='txtPassword'])[last()]") WebElement elmPassword6;

	
@FindBy (xpath="//*[text()='LOGIN Panell']") WebElement elmUsername;//elmUsername.isDisplayed();
	
//By naveen
	@FindBy (xpath="//a[text()='Features']") WebElement elmButton1;
	@FindBy (xpath="//a[contains(text(),'Features')]") WebElement elmButton2;
//Parent
	@FindBy (xpath="//div[@class='dropdown']//button[@type='button' and @class='btn btn-secondary dropdown-toggle' and @id='dropdownMenuButton']") WebElement elmButton3;
////Preceding-Sibling
	@FindBy (xpath="//a[text()='test2 test2']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']") WebElement elmButton4;

//CSS
	@FindBy (className="button") WebElement elmSubmit;

//LinkText
	@FindBy (partialLinkText="OrangeHRM, Inc") WebElement elmLink;

}
