package Selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class Locators {
//id
	@FindBy (id="txtUsername") WebElement elmUserName;
	
	
	
//xpath
	@FindBy (xpath="//img[@alt='LinkedIn OrangeHRM group']") WebElement elmLinkin;

//FindBys
	@FindBys 
	({
		@FindBy(xpath="//table[@id='table-1']/tbody/tr"),

	})	
	
//CSS
	@FindBy (css="input[id='username'][class='form-control']") WebElement elmUsername;// Findby Attribute
	@FindBy (css="input#username") WebElement elmUsername1;// Findby id
	@FindBy (css="input.form-control") WebElement elmUsername2; // FindBy Class
	
//tagName
	@FindBy (tagName="a") List<WebElement> elmUrl;
	
//linkText
	@FindBy (linkText="http://www.linkedin.com/groups?home=&amp;gid=891077") WebElement elmLogin2;
	
//PartialLinkText
	@FindBy (partialLinkText="http://www.linkedin.com/groups") WebElement elmLogin3;
	
//name
	@FindBy (name="Submit") WebElement elmLogin4;

//using+How
	@FindBy(how=How.ID, using="btnLogin") WebElement elmLogin5;
	@FindBy(how=How.CLASS_NAME, using="button") WebElement elmLogin6;


}
